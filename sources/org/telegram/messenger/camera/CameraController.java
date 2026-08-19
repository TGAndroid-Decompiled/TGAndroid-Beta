package org.telegram.messenger.camera;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Camera;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

public class CameraController implements MediaRecorder.OnInfoListener {
    private static final int CORE_POOL_SIZE = 1;
    private static volatile CameraController Instance = null;
    private static final int KEEP_ALIVE_SECONDS = 60;
    private static final int MAX_POOL_SIZE = 1;
    protected volatile ArrayList<CameraInfo> cameraInfos;
    private boolean cameraInitied;
    private ArrayList<ErrorCallback> errorCallbacks;
    private boolean loadingCameras;
    private boolean mirrorRecorderVideo;
    private VideoTakeCallback onVideoTakeCallback;
    private String recordedFile;
    private MediaRecorder recorder;
    ICameraView recordingCurrentCameraView;
    private ArrayList<Runnable> onFinishCameraInitRunnables = new ArrayList<>();
    protected ThreadPoolExecutor threadPool = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public interface ErrorCallback {

        public abstract class CC {
            public static void $default$onError(ErrorCallback errorCallback, int i, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
            }
        }

        void onError(int i, Camera camera, CameraSessionWrapper cameraSessionWrapper);
    }

    public interface ICameraView {
        boolean startRecording(File file, Runnable runnable);

        void stopRecording();
    }

    public interface VideoTakeCallback {
        void onFinishVideoRecording(String str, long j);
    }

    public static CameraController getInstance() {
        CameraController cameraController;
        CameraController cameraController2 = Instance;
        if (cameraController2 != null) {
            return cameraController2;
        }
        synchronized (CameraController.class) {
            try {
                cameraController = Instance;
                if (cameraController == null) {
                    cameraController = new CameraController();
                    Instance = cameraController;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cameraController;
    }

    public void cancelOnInitRunnable(Runnable runnable) {
        this.onFinishCameraInitRunnables.remove(runnable);
    }

    public void initCamera(Runnable runnable) {
        initCamera(runnable, false);
    }

    public void initCamera(final Runnable runnable, final boolean z) {
        if (this.cameraInitied) {
            return;
        }
        if (runnable != null && !this.onFinishCameraInitRunnables.contains(runnable)) {
            this.onFinishCameraInitRunnables.add(runnable);
        }
        if (this.loadingCameras || this.cameraInitied) {
            return;
        }
        this.loadingCameras = true;
        this.threadPool.execute(new Runnable() {
            @Override
            public final void run() {
                CameraController.$r8$lambda$z8f43VlsXhU_Ff2L5QFf3_0ao8o(this.f$0, z, runnable);
            }
        });
    }

    public static void $r8$lambda$z8f43VlsXhU_Ff2L5QFf3_0ao8o(final CameraController cameraController, final boolean z, final Runnable runnable) {
        SharedPreferences sharedPreferences;
        Camera camera;
        Camera.Parameters parameters;
        cameraController.getClass();
        try {
            if (cameraController.cameraInfos == null) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                String string = globalMainSettings.getString("cameraCache", null);
                Comparator comparator = new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return CameraController.$r8$lambda$MOi9syO4BMDvrHgWxMTZxUyd6mU((Size) obj, (Size) obj2);
                    }
                };
                ArrayList<CameraInfo> arrayList = new ArrayList<>();
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                    int int32 = serializedData.readInt32(false);
                    for (int i = 0; i < int32; i++) {
                        CameraInfo cameraInfo = new CameraInfo(serializedData.readInt32(false), serializedData.readInt32(false));
                        int int33 = serializedData.readInt32(false);
                        for (int i2 = 0; i2 < int33; i2++) {
                            cameraInfo.previewSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        int int34 = serializedData.readInt32(false);
                        for (int i3 = 0; i3 < int34; i3++) {
                            cameraInfo.pictureSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        arrayList.add(cameraInfo);
                        Collections.sort(cameraInfo.previewSizes, comparator);
                        Collections.sort(cameraInfo.pictureSizes, comparator);
                    }
                    serializedData.cleanup();
                } else {
                    int numberOfCameras = Camera.getNumberOfCameras();
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    int size = 4;
                    int i4 = 0;
                    while (i4 < numberOfCameras) {
                        Camera.getCameraInfo(i4, cameraInfo2);
                        CameraInfo cameraInfo3 = new CameraInfo(i4, cameraInfo2.facing);
                        if (ApplicationLoader.mainInterfacePaused && ApplicationLoader.externalInterfacePaused) {
                            throw new RuntimeException("APP_PAUSED");
                        }
                        Camera cameraOpen = Camera.open(cameraInfo3.getCameraId());
                        Camera.Parameters parameters2 = cameraOpen.getParameters();
                        List<Camera.Size> supportedPreviewSizes = parameters2.getSupportedPreviewSizes();
                        int i5 = 0;
                        while (true) {
                            sharedPreferences = globalMainSettings;
                            if (i5 >= supportedPreviewSizes.size()) {
                                break;
                            }
                            Camera.Size size2 = supportedPreviewSizes.get(i5);
                            Camera.CameraInfo cameraInfo4 = cameraInfo2;
                            int i6 = size2.height;
                            int i7 = i4;
                            if (i6 < 2160) {
                                camera = cameraOpen;
                                int i8 = size2.width;
                                if (i8 < 2160) {
                                    parameters = parameters2;
                                    cameraInfo3.previewSizes.add(new Size(i8, i6));
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("preview size = " + size2.width + " " + size2.height);
                                    }
                                }
                                i5++;
                                globalMainSettings = sharedPreferences;
                                cameraInfo2 = cameraInfo4;
                                i4 = i7;
                                cameraOpen = camera;
                                parameters2 = parameters;
                            } else {
                                camera = cameraOpen;
                            }
                            parameters = parameters2;
                            i5++;
                            globalMainSettings = sharedPreferences;
                            cameraInfo2 = cameraInfo4;
                            i4 = i7;
                            cameraOpen = camera;
                            parameters2 = parameters;
                        }
                        Camera.CameraInfo cameraInfo5 = cameraInfo2;
                        int i9 = i4;
                        Camera camera2 = cameraOpen;
                        List<Camera.Size> supportedPictureSizes = parameters2.getSupportedPictureSizes();
                        for (int i10 = 0; i10 < supportedPictureSizes.size(); i10++) {
                            Camera.Size size3 = supportedPictureSizes.get(i10);
                            if (!"samsung".equals(Build.MANUFACTURER) || !"jflteuc".equals(Build.PRODUCT) || size3.width < 2048) {
                                cameraInfo3.pictureSizes.add(new Size(size3.width, size3.height));
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("picture size = " + size3.width + " " + size3.height);
                                }
                            }
                        }
                        camera2.release();
                        arrayList.add(cameraInfo3);
                        Collections.sort(cameraInfo3.previewSizes, comparator);
                        Collections.sort(cameraInfo3.pictureSizes, comparator);
                        size += ((cameraInfo3.previewSizes.size() + cameraInfo3.pictureSizes.size()) * 8) + 8;
                        i4 = i9 + 1;
                        globalMainSettings = sharedPreferences;
                        cameraInfo2 = cameraInfo5;
                    }
                    SharedPreferences sharedPreferences2 = globalMainSettings;
                    SerializedData serializedData2 = new SerializedData(size);
                    serializedData2.writeInt32(arrayList.size());
                    for (int i11 = 0; i11 < numberOfCameras; i11++) {
                        CameraInfo cameraInfo6 = arrayList.get(i11);
                        serializedData2.writeInt32(cameraInfo6.cameraId);
                        serializedData2.writeInt32(cameraInfo6.frontCamera);
                        int size4 = cameraInfo6.previewSizes.size();
                        serializedData2.writeInt32(size4);
                        for (int i12 = 0; i12 < size4; i12++) {
                            Size size5 = cameraInfo6.previewSizes.get(i12);
                            serializedData2.writeInt32(size5.mWidth);
                            serializedData2.writeInt32(size5.mHeight);
                        }
                        int size6 = cameraInfo6.pictureSizes.size();
                        serializedData2.writeInt32(size6);
                        for (int i13 = 0; i13 < size6; i13++) {
                            Size size7 = cameraInfo6.pictureSizes.get(i13);
                            serializedData2.writeInt32(size7.mWidth);
                            serializedData2.writeInt32(size7.mHeight);
                        }
                    }
                    sharedPreferences2.edit().putString("cameraCache", Base64.encodeToString(serializedData2.toByteArray(), 0)).commit();
                    serializedData2.cleanup();
                }
                cameraController.cameraInfos = arrayList;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CameraController.$r8$lambda$5WdX6rcnmR4Ln69sS98DfKQz4AI(this.f$0);
                }
            });
        } catch (Exception e) {
            FileLog.e(e, !"APP_PAUSED".equals(e.getMessage()));
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CameraController.m1106$r8$lambda$qg5BQMvbtkVb51CBefrAaGWnbk(this.f$0, z, e, runnable);
                }
            });
        }
    }

    public static int $r8$lambda$MOi9syO4BMDvrHgWxMTZxUyd6mU(Size size, Size size2) {
        int i = size.mWidth;
        int i2 = size2.mWidth;
        if (i < i2) {
            return 1;
        }
        if (i > i2) {
            return -1;
        }
        int i3 = size.mHeight;
        int i4 = size2.mHeight;
        if (i3 < i4) {
            return 1;
        }
        return i3 > i4 ? -1 : 0;
    }

    public static void $r8$lambda$5WdX6rcnmR4Ln69sS98DfKQz4AI(CameraController cameraController) {
        cameraController.loadingCameras = false;
        cameraController.cameraInitied = true;
        if (!cameraController.onFinishCameraInitRunnables.isEmpty()) {
            for (int i = 0; i < cameraController.onFinishCameraInitRunnables.size(); i++) {
                cameraController.onFinishCameraInitRunnables.get(i).run();
            }
            cameraController.onFinishCameraInitRunnables.clear();
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.cameraInitied, new Object[0]);
    }

    public static void m1106$r8$lambda$qg5BQMvbtkVb51CBefrAaGWnbk(final CameraController cameraController, boolean z, Exception exc, final Runnable runnable) {
        cameraController.onFinishCameraInitRunnables.clear();
        cameraController.loadingCameras = false;
        cameraController.cameraInitied = false;
        if (z || !"APP_PAUSED".equals(exc.getMessage()) || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.initCamera(runnable, true);
            }
        }, 1000L);
    }

    public boolean isCameraInitied() {
        return (!this.cameraInitied || this.cameraInfos == null || this.cameraInfos.isEmpty()) ? false : true;
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable) {
        close(cameraSession, countDownLatch, runnable, null);
    }

    public void close(final CameraSession cameraSession, final CountDownLatch countDownLatch, final Runnable runnable, final Runnable runnable2) {
        cameraSession.destroy();
        this.threadPool.execute(new Runnable() {
            @Override
            public final void run() {
                CameraController.$r8$lambda$XODWAWSQ9G_8VfVA1G31_hllnYo(runnable, cameraSession, countDownLatch, runnable2);
            }
        });
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void $r8$lambda$XODWAWSQ9G_8VfVA1G31_hllnYo(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        }
        Camera camera = cameraSession.cameraInfo.camera;
        if (camera != null) {
            try {
                camera.stopPreview();
                cameraSession.cameraInfo.camera.setPreviewCallbackWithBuffer(null);
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                cameraSession.cameraInfo.camera.release();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            cameraSession.cameraInfo.camera = null;
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2);
        }
    }

    public ArrayList<CameraInfo> getCameras() {
        return this.cameraInfos;
    }

    private static int getOrientation(byte[] bArr) {
        int i;
        int iPack;
        if (bArr == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            if (i2 + 3 < bArr.length) {
                int i3 = i2 + 1;
                if ((bArr[i2] & 255) == 255) {
                    int i4 = bArr[i3] & 255;
                    if (i4 != 255) {
                        i3 = i2 + 2;
                        if (i4 != 216 && i4 != 1) {
                            if (i4 != 217 && i4 != 218) {
                                int iPack2 = pack(bArr, i3, 2, false);
                                if (iPack2 < 2 || (i3 = i3 + iPack2) > bArr.length) {
                                    return -1;
                                }
                                if (i4 == 225 && iPack2 >= 8 && pack(bArr, i2 + 4, 4, false) == 1165519206 && pack(bArr, i2 + 8, 2, false) == 0) {
                                    i2 += 10;
                                    i = iPack2 - 8;
                                }
                            }
                            if (i > 8 || !((iPack = pack(bArr, i2, 4, false)) == 1229531648 || iPack == 1296891946)) {
                                return -1;
                            }
                            boolean z = iPack == 1229531648;
                            int iPack3 = pack(bArr, i2 + 4, 4, z) + 2;
                            if (iPack3 >= 10 && iPack3 <= i) {
                                int i5 = i2 + iPack3;
                                int i6 = i - iPack3;
                                int iPack4 = pack(bArr, i5 - 2, 2, z);
                                while (true) {
                                    int i7 = iPack4 - 1;
                                    if (iPack4 <= 0 || i6 < 12) {
                                        break;
                                    }
                                    if (pack(bArr, i5, 2, z) == 274) {
                                        int iPack5 = pack(bArr, i5 + 8, 2, z);
                                        if (iPack5 == 1) {
                                            return 0;
                                        }
                                        if (iPack5 == 3) {
                                            return 180;
                                        }
                                        if (iPack5 != 6) {
                                            return iPack5 != 8 ? -1 : 270;
                                        }
                                        return 90;
                                    }
                                    i5 += 12;
                                    i6 -= 12;
                                    iPack4 = i7;
                                }
                            }
                            return -1;
                        }
                    }
                    i2 = i3;
                }
                i2 = i3;
            }
            i = 0;
            if (i > 8) {
                return -1;
            }
            return -1;
        }
    }

    private static int pack(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (bArr[i] & 255) | (i4 << 8);
            i += i3;
            i2 = i5;
        }
    }

    public boolean takePicture(final File file, final boolean z, Object obj, final Utilities.Callback<Integer> callback) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof CameraSession) {
            CameraSession cameraSession = (CameraSession) obj;
            final CameraInfo cameraInfo = cameraSession.cameraInfo;
            final boolean zIsFlipFront = cameraSession.isFlipFront();
            try {
                cameraInfo.camera.takePicture(null, null, new Camera.PictureCallback() {
                    @Override
                    public final void onPictureTaken(byte[] bArr, Camera camera) {
                        CameraController.$r8$lambda$9kHymWf0mUGY67vDhLE1WCXqQDM(file, cameraInfo, zIsFlipFront, z, callback, bArr, camera);
                    }
                });
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }
        if (obj instanceof Camera2Session) {
            return ((Camera2Session) obj).takePicture(file, callback);
        }
        return false;
    }

    public static void $r8$lambda$9kHymWf0mUGY67vDhLE1WCXqQDM(File file, CameraInfo cameraInfo, boolean z, boolean z2, Utilities.Callback callback, byte[] bArr, Camera camera) {
        Bitmap bitmapDecodeByteArray;
        Exception exc;
        int orientation;
        Throwable th;
        int i = 0;
        int photoSize = (int) (AndroidUtilities.getPhotoSize() / AndroidUtilities.density);
        String str = String.format(Locale.US, "%s@%d_%d", Utilities.MD5(file.getAbsolutePath()), Integer.valueOf(photoSize), Integer.valueOf(photoSize));
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inJustDecodeBounds = false;
            options.inPurgeable = true;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (Throwable th2) {
            FileLog.e(th2);
            bitmapDecodeByteArray = null;
        }
        Bitmap bitmap = bitmapDecodeByteArray;
        try {
            orientation = getOrientation(bArr);
            try {
                if (cameraInfo.frontCamera != 0 && z) {
                    try {
                        Matrix matrix = new Matrix();
                        if (!z2 && orientation != -1) {
                            matrix.setRotate(orientation);
                        }
                        try {
                            matrix.postScale(-1.0f, 1.0f);
                            Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                            if (bitmapCreateBitmap != bitmap) {
                                bitmap.recycle();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapCreateBitmap), str, false);
                            if (callback != null) {
                                callback.run(0);
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            orientation = 0;
                            FileLog.e(th);
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            fileOutputStream2.write(bArr);
                            fileOutputStream2.flush();
                            fileOutputStream2.getFD().sync();
                            fileOutputStream2.close();
                            if (bitmap != null) {
                                ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), str, false);
                            }
                            if (callback != null) {
                                callback.run(Integer.valueOf(orientation));
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                fileOutputStream3.write(bArr);
                fileOutputStream3.flush();
                fileOutputStream3.getFD().sync();
                fileOutputStream3.close();
                if (bitmap != null) {
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), str, false);
                }
            } catch (Exception e) {
                exc = e;
                i = orientation;
                FileLog.e(exc);
                orientation = i;
            }
        } catch (Exception e2) {
            exc = e2;
        }
        if (callback != null) {
            callback.run(Integer.valueOf(orientation));
        }
    }

    public void startPreview(Object obj) {
        if (obj == null || !(obj instanceof CameraSession)) {
            return;
        }
        final CameraSession cameraSession = (CameraSession) obj;
        this.threadPool.execute(new Runnable() {
            @Override
            public final void run() {
                CameraController.$r8$lambda$WGXVBN7IgutuWCcrm7cwcqQDX2U(this.f$0, cameraSession);
            }
        });
    }

    public static void $r8$lambda$WGXVBN7IgutuWCcrm7cwcqQDX2U(CameraController cameraController, CameraSession cameraSession) {
        Camera cameraOpen;
        cameraController.getClass();
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                cameraOpen = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = cameraOpen;
                try {
                    cameraOpen.setErrorCallback(cameraController.getErrorListener(cameraSession));
                    camera = cameraOpen;
                } catch (Exception e) {
                    e = e;
                    cameraSession.cameraInfo.camera = null;
                    if (cameraOpen != null) {
                        cameraOpen.release();
                    }
                    FileLog.e(e);
                    return;
                }
            } catch (Exception e2) {
                e = e2;
                cameraOpen = camera;
            }
        }
        camera.startPreview();
    }

    public void stopPreview(Object obj) {
        if (obj == null || !(obj instanceof CameraSession)) {
            return;
        }
        final CameraSession cameraSession = (CameraSession) obj;
        this.threadPool.execute(new Runnable() {
            @Override
            public final void run() {
                CameraController.m1104$r8$lambda$c11EIZgps2Ar8HFB03Ow4Twjrc(this.f$0, cameraSession);
            }
        });
    }

    public static void m1104$r8$lambda$c11EIZgps2Ar8HFB03Ow4Twjrc(CameraController cameraController, CameraSession cameraSession) {
        Camera cameraOpen;
        cameraController.getClass();
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                cameraOpen = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = cameraOpen;
                try {
                    cameraOpen.setErrorCallback(cameraController.getErrorListener(cameraSession));
                    camera = cameraOpen;
                } catch (Exception e) {
                    e = e;
                    cameraSession.cameraInfo.camera = null;
                    if (cameraOpen != null) {
                        cameraOpen.release();
                    }
                    FileLog.e(e);
                    return;
                }
            } catch (Exception e2) {
                e = e2;
                cameraOpen = camera;
            }
        }
        camera.stopPreview();
    }

    public void openRound(final CameraSession cameraSession, final SurfaceTexture surfaceTexture, final Runnable runnable, final Runnable runnable2) {
        if (cameraSession == null || surfaceTexture == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("failed to open round " + cameraSession + " tex = " + surfaceTexture);
                return;
            }
            return;
        }
        this.threadPool.execute(new Runnable() {
            @Override
            public final void run() {
                CameraController.$r8$lambda$dLLxaCjfZdsrLvpEN4LZ9BSVMr4(cameraSession, runnable2, surfaceTexture, runnable);
            }
        });
    }

    public static void $r8$lambda$dLLxaCjfZdsrLvpEN4LZ9BSVMr4(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        Camera camera = cameraSession.cameraInfo.camera;
        try {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("start creating round camera session");
            }
            if (camera == null) {
                CameraInfo cameraInfo = cameraSession.cameraInfo;
                Camera cameraOpen = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = cameraOpen;
                camera = cameraOpen;
            }
            Camera.Parameters parameters = camera.getParameters();
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            cameraSession.availableFlashModes.clear();
            if (supportedFlashModes != null) {
                for (int i = 0; i < supportedFlashModes.size(); i++) {
                    String str = supportedFlashModes.get(i);
                    if (str.equals("off") || str.equals("on") || str.equals("auto")) {
                        cameraSession.availableFlashModes.add(str);
                    }
                }
                if (!TextUtils.equals(cameraSession.getCurrentFlashMode(), parameters.getFlashMode()) || !cameraSession.availableFlashModes.contains(cameraSession.getCurrentFlashMode())) {
                    cameraSession.checkFlashMode(cameraSession.availableFlashModes.get(0));
                } else {
                    cameraSession.checkFlashMode(cameraSession.getCurrentFlashMode());
                }
            }
            cameraSession.configureRoundCamera(true);
            if (runnable != null) {
                runnable.run();
            }
            camera.setPreviewTexture(surfaceTexture);
            camera.startPreview();
            if (runnable2 != null) {
                AndroidUtilities.runOnUIThread(runnable2);
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("round camera session created");
            }
        } catch (Exception e) {
            cameraSession.cameraInfo.camera = null;
            if (camera != null) {
                camera.release();
            }
            FileLog.e(e);
        }
    }

    public void open(final CameraSession cameraSession, final SurfaceTexture surfaceTexture, final Runnable runnable, final Runnable runnable2) {
        if (cameraSession == null || surfaceTexture == null) {
            return;
        }
        this.threadPool.execute(new Runnable() {
            @Override
            public final void run() {
                CameraController.m1105$r8$lambda$o3zou9RKBDhH_ExdjeZcDN08ao(this.f$0, cameraSession, runnable2, surfaceTexture, runnable);
            }
        });
    }

    public static void m1105$r8$lambda$o3zou9RKBDhH_ExdjeZcDN08ao(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        cameraController.getClass();
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                Camera cameraOpen = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = cameraOpen;
                camera = cameraOpen;
            } catch (Exception e) {
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                FileLog.e(e);
                return;
            }
        }
        camera.setErrorCallback(cameraController.getErrorListener(cameraSession));
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        cameraSession.availableFlashModes.clear();
        if (supportedFlashModes != null) {
            for (int i = 0; i < supportedFlashModes.size(); i++) {
                String str = supportedFlashModes.get(i);
                if (str.equals("off") || str.equals("on") || str.equals("auto")) {
                    cameraSession.availableFlashModes.add(str);
                }
            }
            if (!TextUtils.equals(cameraSession.getCurrentFlashMode(), parameters.getFlashMode()) || !cameraSession.availableFlashModes.contains(cameraSession.getCurrentFlashMode())) {
                cameraSession.checkFlashMode(cameraSession.availableFlashModes.get(0));
            } else {
                cameraSession.checkFlashMode(cameraSession.getCurrentFlashMode());
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        cameraSession.configurePhotoCamera();
        camera.setPreviewTexture(surfaceTexture);
        camera.startPreview();
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2);
        }
    }

    public void recordVideo(Object obj, File file, boolean z, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView) {
        recordVideo(obj, file, z, videoTakeCallback, runnable, iCameraView, true);
    }

    public void recordVideo(final Object obj, final File file, final boolean z, final VideoTakeCallback videoTakeCallback, final Runnable runnable, final ICameraView iCameraView, final boolean z2) {
        if (obj == null) {
            return;
        }
        if (iCameraView != null) {
            this.recordingCurrentCameraView = iCameraView;
            this.onVideoTakeCallback = videoTakeCallback;
            this.recordedFile = file.getAbsolutePath();
            this.threadPool.execute(new Runnable() {
                @Override
                public final void run() {
                    CameraController.m1099$r8$lambda$95kzzmdFuY9H2wnGr4XIxxytAw(this.f$0, obj, iCameraView, file, z2, runnable);
                }
            });
            return;
        }
        if (obj instanceof CameraSession) {
            final CameraSession cameraSession = (CameraSession) obj;
            final CameraInfo cameraInfo = cameraSession.cameraInfo;
            final Camera camera = cameraInfo.camera;
            this.threadPool.execute(new Runnable() {
                @Override
                public final void run() {
                    CameraController.m1103$r8$lambda$ai2_buMDK0lHMHZYI8FKWDX6uo(this.f$0, camera, cameraSession, z, file, cameraInfo, videoTakeCallback, runnable);
                }
            });
        }
    }

    public static void m1099$r8$lambda$95kzzmdFuY9H2wnGr4XIxxytAw(final CameraController cameraController, Object obj, final ICameraView iCameraView, final File file, final boolean z, final Runnable runnable) {
        cameraController.getClass();
        try {
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                Camera camera = cameraSession.cameraInfo.camera;
                if (camera != null) {
                    try {
                        Camera.Parameters parameters = camera.getParameters();
                        parameters.setFlashMode(cameraSession.getCurrentFlashMode().equals("on") ? "torch" : "off");
                        camera.setParameters(parameters);
                        cameraSession.onStartRecord();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(true);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CameraController.$r8$lambda$2LB1L0nJjKtafqdc5rGWH__pwe8(this.f$0, iCameraView, file, z, runnable);
                }
            });
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static void $r8$lambda$2LB1L0nJjKtafqdc5rGWH__pwe8(final CameraController cameraController, ICameraView iCameraView, File file, final boolean z, Runnable runnable) {
        cameraController.getClass();
        iCameraView.startRecording(file, new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.finishRecordingVideo(z);
            }
        });
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void m1103$r8$lambda$ai2_buMDK0lHMHZYI8FKWDX6uo(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z, File file, CameraInfo cameraInfo, VideoTakeCallback videoTakeCallback, Runnable runnable) {
        cameraController.getClass();
        if (camera != null) {
            try {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode(cameraSession.getCurrentFlashMode().equals("on") ? "torch" : "off");
                    camera.setParameters(parameters);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                camera.unlock();
                try {
                    cameraController.mirrorRecorderVideo = z;
                    MediaRecorder mediaRecorder = new MediaRecorder();
                    cameraController.recorder = mediaRecorder;
                    mediaRecorder.setCamera(camera);
                    cameraController.recorder.setVideoSource(1);
                    cameraController.recorder.setAudioSource(5);
                    cameraSession.configureRecorder(1, cameraController.recorder);
                    cameraController.recorder.setOutputFile(file.getAbsolutePath());
                    cameraController.recorder.setMaxFileSize(1073741824L);
                    cameraController.recorder.setVideoFrameRate(30);
                    cameraController.recorder.setMaxDuration(0);
                    Size sizeChooseOptimalSize = chooseOptimalSize(cameraInfo.getPictureSizes(), 720, 480, new Size(16, 9), false);
                    cameraController.recorder.setVideoEncodingBitRate(Math.min(sizeChooseOptimalSize.mHeight, sizeChooseOptimalSize.mWidth) >= 720 ? 3500000 : 1800000);
                    cameraController.recorder.setVideoSize(sizeChooseOptimalSize.getWidth(), sizeChooseOptimalSize.getHeight());
                    cameraController.recorder.setOnInfoListener(cameraController);
                    cameraController.recorder.prepare();
                    cameraController.recorder.start();
                    cameraController.onVideoTakeCallback = videoTakeCallback;
                    cameraController.recordedFile = file.getAbsolutePath();
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    cameraController.recorder.release();
                    cameraController.recorder = null;
                    FileLog.e(e2);
                    return;
                }
            } catch (Exception e3) {
                FileLog.e(e3);
            }
            FileLog.e(e3);
        }
    }

    public void finishRecordingVideo(boolean z) throws Throwable {
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        final File file;
        final Bitmap bitmap;
        Bitmap bitmapCreateVideoThumbnail;
        FileOutputStream fileOutputStream;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        FileOutputStream fileOutputStream2 = null;
        long j = 0;
        try {
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.recordedFile);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                if (strExtractMetadata != null) {
                    j = Long.parseLong(strExtractMetadata);
                }
            } catch (Exception e) {
                e = e;
                try {
                    FileLog.e(e);
                    if (mediaMetadataRetriever != null) {
                    }
                    final long j2 = j;
                    if (z) {
                        bitmapCreateVideoThumbnail = SendMessagesHelper.createVideoThumbnail(this.recordedFile, 1);
                        if (this.mirrorRecorderVideo) {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            canvas.scale(-1.0f, 1.0f, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight() / 2);
                            canvas.drawBitmap(bitmapCreateVideoThumbnail, 0.0f, 0.0f, (Paint) null);
                            bitmapCreateVideoThumbnail.recycle();
                            bitmapCreateVideoThumbnail = bitmapCreateBitmap;
                        }
                        File file2 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(file2);
                                try {
                                    bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream2 = fileOutputStream;
                                    try {
                                        FileLog.e(th);
                                        if (fileOutputStream2 != null) {
                                            fileOutputStream2.close();
                                        }
                                        bitmap = bitmapCreateVideoThumbnail;
                                        file = file2;
                                        SharedConfig.saveConfig();
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                CameraController.$r8$lambda$zdtpoN9tXBqkkltWl9Z9tQ926yo(this.f$0, file, bitmap, j2);
                                            }
                                        });
                                    } catch (Throwable th3) {
                                        if (fileOutputStream2 != null) {
                                            try {
                                                fileOutputStream2.close();
                                                throw th3;
                                            } catch (Throwable unused) {
                                                throw th3;
                                            }
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        bitmap = bitmapCreateVideoThumbnail;
                        file = file2;
                    } else {
                        file = null;
                        bitmap = null;
                    }
                    SharedConfig.saveConfig();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            CameraController.$r8$lambda$zdtpoN9tXBqkkltWl9Z9tQ926yo(this.f$0, file, bitmap, j2);
                        }
                    });
                } catch (Throwable th5) {
                    th = th5;
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                            throw th;
                        } catch (Exception e2) {
                            FileLog.e(e2);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            mediaMetadataRetriever = null;
        } catch (Throwable th7) {
            th = th7;
            mediaMetadataRetriever = mediaMetadataRetriever2;
            if (mediaMetadataRetriever != null) {
                mediaMetadataRetriever.release();
                throw th;
            }
            throw th;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Exception e4) {
            FileLog.e(e4);
        }
        final long j3 = j;
        if (z) {
            bitmapCreateVideoThumbnail = SendMessagesHelper.createVideoThumbnail(this.recordedFile, 1);
            if (this.mirrorRecorderVideo) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                canvas2.scale(-1.0f, 1.0f, bitmapCreateBitmap2.getWidth() / 2, bitmapCreateBitmap2.getHeight() / 2);
                canvas2.drawBitmap(bitmapCreateVideoThumbnail, 0.0f, 0.0f, (Paint) null);
                bitmapCreateVideoThumbnail.recycle();
                bitmapCreateVideoThumbnail = bitmapCreateBitmap2;
            }
            File file3 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
            fileOutputStream = new FileOutputStream(file3);
            bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
            fileOutputStream.close();
            bitmap = bitmapCreateVideoThumbnail;
            file = file3;
        } else {
            file = null;
            bitmap = null;
        }
        SharedConfig.saveConfig();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CameraController.$r8$lambda$zdtpoN9tXBqkkltWl9Z9tQ926yo(this.f$0, file, bitmap, j3);
            }
        });
    }

    public static void $r8$lambda$zdtpoN9tXBqkkltWl9Z9tQ926yo(CameraController cameraController, File file, Bitmap bitmap, long j) {
        String absolutePath;
        if (cameraController.onVideoTakeCallback != null) {
            if (file != null) {
                absolutePath = file.getAbsolutePath();
                if (bitmap != null) {
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), Utilities.MD5(absolutePath), false);
                }
            } else {
                absolutePath = null;
            }
            cameraController.onVideoTakeCallback.onFinishVideoRecording(absolutePath, j);
            cameraController.onVideoTakeCallback = null;
        }
    }

    @Override
    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) throws Throwable {
        if (i == 800 || i == 801 || i == 1) {
            MediaRecorder mediaRecorder2 = this.recorder;
            this.recorder = null;
            if (mediaRecorder2 != null) {
                mediaRecorder2.stop();
                mediaRecorder2.release();
            }
            if (this.onVideoTakeCallback != null) {
                finishRecordingVideo(true);
            }
        }
    }

    public void stopVideoRecording(Object obj, boolean z) {
        stopVideoRecording(obj, z, true);
    }

    public void stopVideoRecording(final Object obj, final boolean z, final boolean z2) {
        ICameraView iCameraView = this.recordingCurrentCameraView;
        if (iCameraView != null) {
            iCameraView.stopRecording();
            this.recordingCurrentCameraView = null;
        } else {
            this.threadPool.execute(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    CameraController.m1102$r8$lambda$Tu8odydgQJpd1yYZUXXEuNvA4(this.f$0, obj, z, z2);
                }
            });
        }
    }

    public static void m1102$r8$lambda$Tu8odydgQJpd1yYZUXXEuNvA4(CameraController cameraController, Object obj, boolean z, boolean z2) throws Throwable {
        cameraController.getClass();
        try {
            MediaRecorder mediaRecorder = cameraController.recorder;
            if (mediaRecorder != null) {
                cameraController.recorder = null;
                try {
                    mediaRecorder.stop();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                try {
                    mediaRecorder.release();
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            if (obj instanceof CameraSession) {
                final CameraSession cameraSession = (CameraSession) obj;
                final Camera camera = cameraSession.cameraInfo.camera;
                if (camera != null) {
                    try {
                        camera.reconnect();
                        camera.startPreview();
                    } catch (Exception e3) {
                        FileLog.e(e3);
                    }
                    try {
                        cameraSession.stopVideoRecording();
                    } catch (Exception e4) {
                        FileLog.e(e4);
                    }
                }
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode("off");
                    camera.setParameters(parameters);
                } catch (Exception e5) {
                    FileLog.e(e5);
                }
                cameraController.threadPool.execute(new Runnable() {
                    @Override
                    public final void run() {
                        CameraController.$r8$lambda$X7Tnq1xluvV3PgXwVBGovGNiTns(camera, cameraSession);
                    }
                });
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(false);
            }
            if (!z && cameraController.onVideoTakeCallback != null) {
                cameraController.finishRecordingVideo(z2);
            } else {
                cameraController.onVideoTakeCallback = null;
            }
        } catch (Exception unused) {
        }
    }

    public static void $r8$lambda$X7Tnq1xluvV3PgXwVBGovGNiTns(Camera camera, CameraSession cameraSession) {
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(cameraSession.getCurrentFlashMode());
            camera.setParameters(parameters);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static Size chooseOptimalSize(List<Size> list, int i, int i2, Size size, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        int width = size.getWidth();
        int height = size.getHeight();
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size2 = list.get(i3);
            if (!z || (size2.getHeight() <= i2 && size2.getWidth() <= i)) {
                if (size2.getHeight() == (size2.getWidth() * height) / width && size2.getWidth() >= i && size2.getHeight() >= i2) {
                    arrayList.add(size2);
                } else if (size2.getHeight() * size2.getWidth() <= i * i2 * 4) {
                    arrayList2.add(size2);
                }
            }
        }
        if (arrayList.size() > 0) {
            return (Size) Collections.min(arrayList, new CompareSizesByArea());
        }
        if (arrayList2.size() > 0) {
            return (Size) Collections.min(arrayList2, new CompareSizesByArea());
        }
        return (Size) Collections.max(list, new CompareSizesByArea());
    }

    static class CompareSizesByArea implements Comparator<Size> {
        CompareSizesByArea() {
        }

        @Override
        public int compare(Size size, Size size2) {
            return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        }
    }

    public void addOnErrorListener(ErrorCallback errorCallback) {
        if (this.errorCallbacks == null) {
            this.errorCallbacks = new ArrayList<>();
        }
        this.errorCallbacks.remove(errorCallback);
        this.errorCallbacks.add(errorCallback);
    }

    public void removeOnErrorListener(ErrorCallback errorCallback) {
        ArrayList<ErrorCallback> arrayList = this.errorCallbacks;
        if (arrayList != null) {
            arrayList.remove(errorCallback);
        }
    }

    public Camera.ErrorCallback getErrorListener(final CameraSession cameraSession) {
        return new Camera.ErrorCallback() {
            @Override
            public final void onError(int i, Camera camera) {
                CameraController.m1098$r8$lambda$0_yRrb1FBaLfsnrx3EIxNIBRQQ(this.f$0, cameraSession, i, camera);
            }
        };
    }

    public static void m1098$r8$lambda$0_yRrb1FBaLfsnrx3EIxNIBRQQ(CameraController cameraController, CameraSession cameraSession, int i, Camera camera) {
        if (cameraController.errorCallbacks != null) {
            for (int i2 = 0; i2 < cameraController.errorCallbacks.size(); i2++) {
                ErrorCallback errorCallback = cameraController.errorCallbacks.get(i2);
                if (errorCallback != null) {
                    errorCallback.onError(i, camera, CameraSessionWrapper.of(cameraSession));
                }
            }
        }
    }
}
