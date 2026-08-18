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
        CameraController cameraController = Instance;
        if (cameraController == null) {
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
        }
        return cameraController;
    }

    public void cancelOnInitRunnable(Runnable runnable) {
        this.onFinishCameraInitRunnables.remove(runnable);
    }

    public void initCamera(Runnable runnable) {
        initCamera(runnable, false);
    }

    private void initCamera(final Runnable runnable, final boolean z) {
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
                this.f$0.lambda$initCamera$4(z, runnable);
            }
        });
    }

    public void lambda$initCamera$4(final boolean z, final Runnable runnable) {
        String str;
        Camera.CameraInfo cameraInfo;
        String str2;
        final CameraController cameraController = this;
        String str3 = "APP_PAUSED";
        String str4 = "cameraCache";
        try {
            if (cameraController.cameraInfos == null) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                String string = globalMainSettings.getString("cameraCache", null);
                Comparator comparator = new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                    }
                };
                ArrayList<CameraInfo> arrayList = new ArrayList<>();
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                    int int32 = serializedData.readInt32(false);
                    for (int i = 0; i < int32; i++) {
                        CameraInfo cameraInfo2 = new CameraInfo(serializedData.readInt32(false), serializedData.readInt32(false));
                        int int33 = serializedData.readInt32(false);
                        for (int i2 = 0; i2 < int33; i2++) {
                            cameraInfo2.previewSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        int int34 = serializedData.readInt32(false);
                        for (int i3 = 0; i3 < int34; i3++) {
                            cameraInfo2.pictureSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        arrayList.add(cameraInfo2);
                        Collections.sort(cameraInfo2.previewSizes, comparator);
                        Collections.sort(cameraInfo2.pictureSizes, comparator);
                    }
                    serializedData.cleanup();
                    str = "APP_PAUSED";
                } else {
                    int numberOfCameras = Camera.getNumberOfCameras();
                    Camera.CameraInfo cameraInfo3 = new Camera.CameraInfo();
                    int size = 4;
                    int i4 = 0;
                    while (i4 < numberOfCameras) {
                        try {
                            Camera.getCameraInfo(i4, cameraInfo3);
                            CameraInfo cameraInfo4 = new CameraInfo(i4, cameraInfo3.facing);
                            if (ApplicationLoader.mainInterfacePaused && ApplicationLoader.externalInterfacePaused) {
                                throw new RuntimeException(str3);
                            }
                            Camera cameraOpen = Camera.open(cameraInfo4.getCameraId());
                            Camera.Parameters parameters = cameraOpen.getParameters();
                            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                            int i5 = 0;
                            while (true) {
                                cameraInfo = cameraInfo3;
                                if (i5 >= supportedPreviewSizes.size()) {
                                    break;
                                }
                                Camera.Size size2 = supportedPreviewSizes.get(i5);
                                List<Camera.Size> list = supportedPreviewSizes;
                                int i6 = size2.height;
                                str = str3;
                                if (i6 < 2160) {
                                    try {
                                        int i7 = size2.width;
                                        if (i7 < 2160) {
                                            str2 = str4;
                                            cameraInfo4.previewSizes.add(new Size(i7, i6));
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.d("preview size = " + size2.width + " " + size2.height);
                                            }
                                        } else {
                                            str2 = str4;
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        cameraController = this;
                                        FileLog.e(e, !str.equals(e.getMessage()));
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                this.f$0.lambda$initCamera$3(z, e, runnable);
                                            }
                                        });
                                        return;
                                    }
                                } else {
                                    str2 = str4;
                                }
                                i5++;
                                cameraInfo3 = cameraInfo;
                                supportedPreviewSizes = list;
                                str3 = str;
                                str4 = str2;
                            }
                            String str5 = str4;
                            String str6 = str3;
                            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
                            for (int i8 = 0; i8 < supportedPictureSizes.size(); i8++) {
                                Camera.Size size3 = supportedPictureSizes.get(i8);
                                if (!"samsung".equals(Build.MANUFACTURER) || !"jflteuc".equals(Build.PRODUCT) || size3.width < 2048) {
                                    cameraInfo4.pictureSizes.add(new Size(size3.width, size3.height));
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("picture size = " + size3.width + " " + size3.height);
                                    }
                                }
                            }
                            cameraOpen.release();
                            arrayList.add(cameraInfo4);
                            Collections.sort(cameraInfo4.previewSizes, comparator);
                            Collections.sort(cameraInfo4.pictureSizes, comparator);
                            size += ((cameraInfo4.previewSizes.size() + cameraInfo4.pictureSizes.size()) * 8) + 8;
                            i4++;
                            cameraInfo3 = cameraInfo;
                            str3 = str6;
                            str4 = str5;
                        } catch (Exception e2) {
                            e = e2;
                            str = str3;
                            cameraController = this;
                            FileLog.e(e, !str.equals(e.getMessage()));
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$initCamera$3(z, e, runnable);
                                }
                            });
                            return;
                        }
                    }
                    String str7 = str4;
                    str = str3;
                    SerializedData serializedData2 = new SerializedData(size);
                    serializedData2.writeInt32(arrayList.size());
                    for (int i9 = 0; i9 < numberOfCameras; i9++) {
                        CameraInfo cameraInfo5 = arrayList.get(i9);
                        serializedData2.writeInt32(cameraInfo5.cameraId);
                        serializedData2.writeInt32(cameraInfo5.frontCamera);
                        int size4 = cameraInfo5.previewSizes.size();
                        serializedData2.writeInt32(size4);
                        for (int i10 = 0; i10 < size4; i10++) {
                            Size size5 = cameraInfo5.previewSizes.get(i10);
                            serializedData2.writeInt32(size5.mWidth);
                            serializedData2.writeInt32(size5.mHeight);
                        }
                        int size6 = cameraInfo5.pictureSizes.size();
                        serializedData2.writeInt32(size6);
                        for (int i11 = 0; i11 < size6; i11++) {
                            Size size7 = cameraInfo5.pictureSizes.get(i11);
                            serializedData2.writeInt32(size7.mWidth);
                            serializedData2.writeInt32(size7.mHeight);
                        }
                    }
                    globalMainSettings.edit().putString(str7, Base64.encodeToString(serializedData2.toByteArray(), 0)).commit();
                    serializedData2.cleanup();
                    cameraController = this;
                }
                try {
                    cameraController.cameraInfos = arrayList;
                } catch (Exception e3) {
                    e = e3;
                    FileLog.e(e, !str.equals(e.getMessage()));
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$initCamera$3(z, e, runnable);
                        }
                    });
                    return;
                }
            } else {
                str = "APP_PAUSED";
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$initCamera$1();
                }
            });
        } catch (Exception e4) {
            e = e4;
            str = "APP_PAUSED";
        }
    }

    public static int lambda$initCamera$0(Size size, Size size2) {
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

    public void lambda$initCamera$1() {
        this.loadingCameras = false;
        this.cameraInitied = true;
        if (!this.onFinishCameraInitRunnables.isEmpty()) {
            for (int i = 0; i < this.onFinishCameraInitRunnables.size(); i++) {
                this.onFinishCameraInitRunnables.get(i).run();
            }
            this.onFinishCameraInitRunnables.clear();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.cameraInitied, new Object[0]);
    }

    public void lambda$initCamera$3(boolean z, Exception exc, final Runnable runnable) {
        this.onFinishCameraInitRunnables.clear();
        this.loadingCameras = false;
        this.cameraInitied = false;
        if (z || !"APP_PAUSED".equals(exc.getMessage()) || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$initCamera$2(runnable);
            }
        }, 1000L);
    }

    public void lambda$initCamera$2(Runnable runnable) {
        initCamera(runnable, true);
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
                CameraController.lambda$close$5(runnable, cameraSession, countDownLatch, runnable2);
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

    public static void lambda$close$5(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
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
                        CameraController.lambda$takePicture$6(file, cameraInfo, zIsFlipFront, z, callback, bArr, camera);
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

    public static void lambda$takePicture$6(File file, CameraInfo cameraInfo, boolean z, boolean z2, Utilities.Callback callback, byte[] bArr, Camera camera) {
        Bitmap bitmapDecodeByteArray;
        int orientation;
        int photoSize = (int) (AndroidUtilities.getPhotoSize() / AndroidUtilities.density);
        int i = 0;
        String str = String.format(Locale.US, "%s@%d_%d", Utilities.MD5(file.getAbsolutePath()), Integer.valueOf(photoSize), Integer.valueOf(photoSize));
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inJustDecodeBounds = false;
            options.inPurgeable = true;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (Throwable th) {
            FileLog.e(th);
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
                        } catch (Throwable th2) {
                            th = th2;
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
                    } catch (Throwable th3) {
                        th = th3;
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
                e = e;
                i = orientation;
                FileLog.e(e);
                orientation = i;
            }
        } catch (Exception e2) {
            e = e2;
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
                this.f$0.lambda$startPreview$7(cameraSession);
            }
        });
    }

    public void lambda$startPreview$7(CameraSession cameraSession) {
        Camera cameraOpen;
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                cameraOpen = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = cameraOpen;
                try {
                    cameraOpen.setErrorCallback(getErrorListener(cameraSession));
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
                this.f$0.lambda$stopPreview$8(cameraSession);
            }
        });
    }

    public void lambda$stopPreview$8(CameraSession cameraSession) {
        Camera cameraOpen;
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                cameraOpen = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = cameraOpen;
                try {
                    cameraOpen.setErrorCallback(getErrorListener(cameraSession));
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
                CameraController.lambda$openRound$9(cameraSession, runnable2, surfaceTexture, runnable);
            }
        });
    }

    public static void lambda$openRound$9(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
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
                this.f$0.lambda$open$10(cameraSession, runnable2, surfaceTexture, runnable);
            }
        });
    }

    public void lambda$open$10(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
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
        camera.setErrorCallback(getErrorListener(cameraSession));
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
                    this.f$0.lambda$recordVideo$13(obj, iCameraView, file, z2, runnable);
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
                    this.f$0.lambda$recordVideo$14(camera, cameraSession, z, file, cameraInfo, videoTakeCallback, runnable);
                }
            });
        }
    }

    public void lambda$recordVideo$13(Object obj, final ICameraView iCameraView, final File file, final boolean z, final Runnable runnable) {
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
                    this.f$0.lambda$recordVideo$12(iCameraView, file, z, runnable);
                }
            });
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void lambda$recordVideo$12(ICameraView iCameraView, File file, final boolean z, Runnable runnable) {
        iCameraView.startRecording(file, new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$recordVideo$11(z);
            }
        });
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$recordVideo$14(Camera camera, CameraSession cameraSession, boolean z, File file, CameraInfo cameraInfo, VideoTakeCallback videoTakeCallback, Runnable runnable) {
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
                    this.mirrorRecorderVideo = z;
                    MediaRecorder mediaRecorder = new MediaRecorder();
                    this.recorder = mediaRecorder;
                    mediaRecorder.setCamera(camera);
                    this.recorder.setVideoSource(1);
                    this.recorder.setAudioSource(5);
                    cameraSession.configureRecorder(1, this.recorder);
                    this.recorder.setOutputFile(file.getAbsolutePath());
                    this.recorder.setMaxFileSize(1073741824L);
                    this.recorder.setVideoFrameRate(30);
                    this.recorder.setMaxDuration(0);
                    Size sizeChooseOptimalSize = chooseOptimalSize(cameraInfo.getPictureSizes(), 720, 480, new Size(16, 9), false);
                    this.recorder.setVideoEncodingBitRate(Math.min(sizeChooseOptimalSize.mHeight, sizeChooseOptimalSize.mWidth) >= 720 ? 3500000 : 1800000);
                    this.recorder.setVideoSize(sizeChooseOptimalSize.getWidth(), sizeChooseOptimalSize.getHeight());
                    this.recorder.setOnInfoListener(this);
                    this.recorder.prepare();
                    this.recorder.start();
                    this.onVideoTakeCallback = videoTakeCallback;
                    this.recordedFile = file.getAbsolutePath();
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    this.recorder.release();
                    this.recorder = null;
                    FileLog.e(e2);
                    return;
                }
            } catch (Exception e3) {
                FileLog.e(e3);
            }
            FileLog.e(e3);
        }
    }

    public void lambda$recordVideo$11(boolean z) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        final File file;
        final Bitmap bitmap;
        Bitmap bitmapCreateVideoThumbnail;
        FileOutputStream fileOutputStream;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
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
                            fileOutputStream = new FileOutputStream(file2);
                            try {
                                bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    FileLog.e(th);
                                    if (fileOutputStream != null) {
                                    }
                                    bitmap = bitmapCreateVideoThumbnail;
                                    file = file2;
                                    SharedConfig.saveConfig();
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            this.f$0.lambda$finishRecordingVideo$15(file, bitmap, j2);
                                        }
                                    });
                                } catch (Throwable th3) {
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            fileOutputStream = null;
                            th = th4;
                        }
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused2) {
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
                            this.f$0.lambda$finishRecordingVideo$15(file, bitmap, j2);
                        }
                    });
                } catch (Throwable th5) {
                    th = th5;
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
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
                this.f$0.lambda$finishRecordingVideo$15(file, bitmap, j3);
            }
        });
    }

    public void lambda$finishRecordingVideo$15(File file, Bitmap bitmap, long j) {
        String absolutePath;
        if (this.onVideoTakeCallback != null) {
            if (file != null) {
                absolutePath = file.getAbsolutePath();
                if (bitmap != null) {
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), Utilities.MD5(absolutePath), false);
                }
            } else {
                absolutePath = null;
            }
            this.onVideoTakeCallback.onFinishVideoRecording(absolutePath, j);
            this.onVideoTakeCallback = null;
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
                lambda$recordVideo$11(true);
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
                    this.f$0.lambda$stopVideoRecording$17(obj, z, z2);
                }
            });
        }
    }

    public void lambda$stopVideoRecording$17(Object obj, boolean z, boolean z2) throws Throwable {
        try {
            MediaRecorder mediaRecorder = this.recorder;
            if (mediaRecorder != null) {
                this.recorder = null;
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
                this.threadPool.execute(new Runnable() {
                    @Override
                    public final void run() {
                        CameraController.lambda$stopVideoRecording$16(camera, cameraSession);
                    }
                });
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(false);
            }
            if (!z && this.onVideoTakeCallback != null) {
                lambda$recordVideo$11(z2);
            } else {
                this.onVideoTakeCallback = null;
            }
        } catch (Exception unused) {
        }
    }

    public static void lambda$stopVideoRecording$16(Camera camera, CameraSession cameraSession) {
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
                this.f$0.lambda$getErrorListener$18(cameraSession, i, camera);
            }
        };
    }

    public void lambda$getErrorListener$18(CameraSession cameraSession, int i, Camera camera) {
        if (this.errorCallbacks != null) {
            for (int i2 = 0; i2 < this.errorCallbacks.size(); i2++) {
                ErrorCallback errorCallback = this.errorCallbacks.get(i2);
                if (errorCallback != null) {
                    errorCallback.onError(i, camera, CameraSessionWrapper.of(cameraSession));
                }
            }
        }
    }
}
