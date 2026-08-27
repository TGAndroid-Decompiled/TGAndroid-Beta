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
import cg.k0;
import h3.p1;
import hh.t5;
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
import org.telegram.messenger.pg;
import org.telegram.messenger.s1;
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

    public static class CompareSizesByArea implements Comparator<Size> {
        @Override
        public int compare(Size size, Size size2) {
            return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        }
    }

    public interface ErrorCallback {
        void onError(int i10, Camera camera, CameraSessionWrapper cameraSessionWrapper);
    }

    public interface ICameraView {
        boolean startRecording(File file, Runnable runnable);

        void stopRecording();
    }

    public interface VideoTakeCallback {
        void onFinishVideoRecording(String str, long j10);
    }

    public static Size chooseOptimalSize(List<Size> list, int i10, int i11, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        int width = size.getWidth();
        int height = size.getHeight();
        for (int i12 = 0; i12 < list.size(); i12++) {
            Size size2 = list.get(i12);
            if (!z10 || (size2.getHeight() <= i11 && size2.getWidth() <= i10)) {
                if (size2.getHeight() == (size2.getWidth() * height) / width && size2.getWidth() >= i10 && size2.getHeight() >= i11) {
                    arrayList.add(size2);
                } else if (size2.getWidth() * size2.getHeight() <= i10 * i11 * 4) {
                    arrayList2.add(size2);
                }
            }
        }
        if (arrayList.size() > 0) {
            return (Size) Collections.min(arrayList, new CompareSizesByArea());
        }
        return arrayList2.size() > 0 ? (Size) Collections.min(arrayList2, new CompareSizesByArea()) : (Size) Collections.max(list, new CompareSizesByArea());
    }

    public void lambda$recordVideo$11(boolean z10) throws Throwable {
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        File file;
        Bitmap bitmap;
        Bitmap bitmapCreateVideoThumbnail;
        FileOutputStream fileOutputStream;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        FileOutputStream fileOutputStream2 = null;
        long j10 = 0;
        try {
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(this.recordedFile);
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (strExtractMetadata != null) {
                        j10 = Long.parseLong(strExtractMetadata);
                    }
                } catch (Exception e9) {
                    e = e9;
                    FileLog.e(e);
                    if (mediaMetadataRetriever != null) {
                    }
                    long j11 = j10;
                    if (z10) {
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
                                        AndroidUtilities.runOnUIThread(new pg(this, file, bitmap, j11, 3));
                                    } catch (Throwable th3) {
                                        if (fileOutputStream2 == null) {
                                            throw th3;
                                        }
                                        try {
                                            fileOutputStream2.close();
                                            throw th3;
                                        } catch (Throwable unused) {
                                            throw th3;
                                        }
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
                    AndroidUtilities.runOnUIThread(new pg(this, file, bitmap, j11, 3));
                }
            } catch (Throwable th5) {
                th = th5;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    throw th;
                }
                try {
                    mediaMetadataRetriever2.release();
                    throw th;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    throw th;
                }
            }
        } catch (Exception e11) {
            e = e11;
            mediaMetadataRetriever = null;
        } catch (Throwable th6) {
            th = th6;
            if (mediaMetadataRetriever2 != null) {
                throw th;
            }
            mediaMetadataRetriever2.release();
            throw th;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        long j12 = j10;
        if (z10) {
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
        AndroidUtilities.runOnUIThread(new pg(this, file, bitmap, j12, 3));
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

    private static int getOrientation(byte[] bArr) {
        int i10;
        int iPack;
        if (bArr == null) {
            return -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 + 3 < bArr.length) {
                int i12 = i11 + 1;
                if ((bArr[i11] & 255) == 255) {
                    int i13 = bArr[i12] & 255;
                    if (i13 != 255) {
                        i12 = i11 + 2;
                        if (i13 != 216 && i13 != 1) {
                            if (i13 != 217 && i13 != 218) {
                                int iPack2 = pack(bArr, i12, 2, false);
                                if (iPack2 < 2 || (i12 = i12 + iPack2) > bArr.length) {
                                    return -1;
                                }
                                if (i13 == 225 && iPack2 >= 8 && pack(bArr, i11 + 4, 4, false) == 1165519206 && pack(bArr, i11 + 8, 2, false) == 0) {
                                    i11 += 10;
                                    i10 = iPack2 - 8;
                                }
                            }
                            if (i10 > 8 || !((iPack = pack(bArr, i11, 4, false)) == 1229531648 || iPack == 1296891946)) {
                                return -1;
                            }
                            boolean z10 = iPack == 1229531648;
                            int iPack3 = pack(bArr, i11 + 4, 4, z10) + 2;
                            if (iPack3 >= 10 && iPack3 <= i10) {
                                int i14 = i11 + iPack3;
                                int i15 = i10 - iPack3;
                                int iPack4 = pack(bArr, i14 - 2, 2, z10);
                                while (true) {
                                    int i16 = iPack4 - 1;
                                    if (iPack4 <= 0 || i15 < 12) {
                                        break;
                                    }
                                    if (pack(bArr, i14, 2, z10) == 274) {
                                        int iPack5 = pack(bArr, i14 + 8, 2, z10);
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
                                    i14 += 12;
                                    i15 -= 12;
                                    iPack4 = i16;
                                }
                            }
                            return -1;
                        }
                    }
                    i11 = i12;
                }
                i11 = i12;
            }
            i10 = 0;
            if (i10 > 8) {
                return -1;
            }
            return -1;
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
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            try {
                cameraSession.cameraInfo.camera.release();
            } catch (Exception e10) {
                FileLog.e(e10);
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

    public void lambda$finishRecordingVideo$15(File file, Bitmap bitmap, long j10) {
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
            this.onVideoTakeCallback.onFinishVideoRecording(absolutePath, j10);
            this.onVideoTakeCallback = null;
        }
    }

    public void lambda$getErrorListener$18(CameraSession cameraSession, int i10, Camera camera) {
        if (this.errorCallbacks != null) {
            for (int i11 = 0; i11 < this.errorCallbacks.size(); i11++) {
                ErrorCallback errorCallback = this.errorCallbacks.get(i11);
                if (errorCallback != null) {
                    errorCallback.onError(i10, camera, CameraSessionWrapper.of(cameraSession));
                }
            }
        }
    }

    public static int lambda$initCamera$0(Size size, Size size2) {
        int i10 = size.mWidth;
        int i11 = size2.mWidth;
        if (i10 < i11) {
            return 1;
        }
        if (i10 > i11) {
            return -1;
        }
        int i12 = size.mHeight;
        int i13 = size2.mHeight;
        if (i12 < i13) {
            return 1;
        }
        return i12 > i13 ? -1 : 0;
    }

    public void lambda$initCamera$1() {
        this.loadingCameras = false;
        this.cameraInitied = true;
        if (!this.onFinishCameraInitRunnables.isEmpty()) {
            for (int i10 = 0; i10 < this.onFinishCameraInitRunnables.size(); i10++) {
                this.onFinishCameraInitRunnables.get(i10).run();
            }
            this.onFinishCameraInitRunnables.clear();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.cameraInitied, new Object[0]);
    }

    public void lambda$initCamera$2(Runnable runnable) {
        initCamera(runnable, true);
    }

    public void lambda$initCamera$3(boolean z10, Exception exc, Runnable runnable) {
        this.onFinishCameraInitRunnables.clear();
        this.loadingCameras = false;
        this.cameraInitied = false;
        if (z10 || !"APP_PAUSED".equals(exc.getMessage()) || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new s(2, this, runnable), 1000L);
    }

    public void lambda$initCamera$4(boolean z10, Runnable runnable) {
        SharedPreferences sharedPreferences;
        Camera camera;
        Camera.Parameters parameters;
        try {
            if (this.cameraInfos == null) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                String string = globalMainSettings.getString("cameraCache", null);
                k9.a aVar = new k9.a(6);
                ArrayList<CameraInfo> arrayList = new ArrayList<>();
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                    int int32 = serializedData.readInt32(false);
                    for (int i10 = 0; i10 < int32; i10++) {
                        CameraInfo cameraInfo = new CameraInfo(serializedData.readInt32(false), serializedData.readInt32(false));
                        int int33 = serializedData.readInt32(false);
                        for (int i11 = 0; i11 < int33; i11++) {
                            cameraInfo.previewSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        int int34 = serializedData.readInt32(false);
                        for (int i12 = 0; i12 < int34; i12++) {
                            cameraInfo.pictureSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        arrayList.add(cameraInfo);
                        Collections.sort(cameraInfo.previewSizes, aVar);
                        Collections.sort(cameraInfo.pictureSizes, aVar);
                    }
                    serializedData.cleanup();
                } else {
                    int numberOfCameras = Camera.getNumberOfCameras();
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    int size = 4;
                    int i13 = 0;
                    while (i13 < numberOfCameras) {
                        Camera.getCameraInfo(i13, cameraInfo2);
                        CameraInfo cameraInfo3 = new CameraInfo(i13, cameraInfo2.facing);
                        if (ApplicationLoader.mainInterfacePaused && ApplicationLoader.externalInterfacePaused) {
                            throw new RuntimeException("APP_PAUSED");
                        }
                        Camera cameraOpen = Camera.open(cameraInfo3.getCameraId());
                        Camera.Parameters parameters2 = cameraOpen.getParameters();
                        List<Camera.Size> supportedPreviewSizes = parameters2.getSupportedPreviewSizes();
                        int i14 = 0;
                        while (true) {
                            sharedPreferences = globalMainSettings;
                            if (i14 >= supportedPreviewSizes.size()) {
                                break;
                            }
                            Camera.Size size2 = supportedPreviewSizes.get(i14);
                            Camera.CameraInfo cameraInfo4 = cameraInfo2;
                            int i15 = size2.height;
                            int i16 = i13;
                            if (i15 < 2160) {
                                camera = cameraOpen;
                                int i17 = size2.width;
                                if (i17 < 2160) {
                                    parameters = parameters2;
                                    cameraInfo3.previewSizes.add(new Size(i17, i15));
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("preview size = " + size2.width + " " + size2.height);
                                    }
                                }
                                i14++;
                                globalMainSettings = sharedPreferences;
                                cameraInfo2 = cameraInfo4;
                                i13 = i16;
                                cameraOpen = camera;
                                parameters2 = parameters;
                            } else {
                                camera = cameraOpen;
                            }
                            parameters = parameters2;
                            i14++;
                            globalMainSettings = sharedPreferences;
                            cameraInfo2 = cameraInfo4;
                            i13 = i16;
                            cameraOpen = camera;
                            parameters2 = parameters;
                        }
                        Camera.CameraInfo cameraInfo5 = cameraInfo2;
                        int i18 = i13;
                        Camera camera2 = cameraOpen;
                        List<Camera.Size> supportedPictureSizes = parameters2.getSupportedPictureSizes();
                        for (int i19 = 0; i19 < supportedPictureSizes.size(); i19++) {
                            Camera.Size size3 = supportedPictureSizes.get(i19);
                            if (!"samsung".equals(Build.MANUFACTURER) || !"jflteuc".equals(Build.PRODUCT) || size3.width < 2048) {
                                cameraInfo3.pictureSizes.add(new Size(size3.width, size3.height));
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("picture size = " + size3.width + " " + size3.height);
                                }
                            }
                        }
                        camera2.release();
                        arrayList.add(cameraInfo3);
                        Collections.sort(cameraInfo3.previewSizes, aVar);
                        Collections.sort(cameraInfo3.pictureSizes, aVar);
                        size += ((cameraInfo3.previewSizes.size() + cameraInfo3.pictureSizes.size()) * 8) + 8;
                        i13 = i18 + 1;
                        globalMainSettings = sharedPreferences;
                        cameraInfo2 = cameraInfo5;
                    }
                    SharedPreferences sharedPreferences2 = globalMainSettings;
                    SerializedData serializedData2 = new SerializedData(size);
                    serializedData2.writeInt32(arrayList.size());
                    for (int i20 = 0; i20 < numberOfCameras; i20++) {
                        CameraInfo cameraInfo6 = arrayList.get(i20);
                        serializedData2.writeInt32(cameraInfo6.cameraId);
                        serializedData2.writeInt32(cameraInfo6.frontCamera);
                        int size4 = cameraInfo6.previewSizes.size();
                        serializedData2.writeInt32(size4);
                        for (int i21 = 0; i21 < size4; i21++) {
                            Size size5 = cameraInfo6.previewSizes.get(i21);
                            serializedData2.writeInt32(size5.mWidth);
                            serializedData2.writeInt32(size5.mHeight);
                        }
                        int size6 = cameraInfo6.pictureSizes.size();
                        serializedData2.writeInt32(size6);
                        for (int i22 = 0; i22 < size6; i22++) {
                            Size size7 = cameraInfo6.pictureSizes.get(i22);
                            serializedData2.writeInt32(size7.mWidth);
                            serializedData2.writeInt32(size7.mHeight);
                        }
                    }
                    sharedPreferences2.edit().putString("cameraCache", Base64.encodeToString(serializedData2.toByteArray(), 0)).commit();
                    serializedData2.cleanup();
                }
                this.cameraInfos = arrayList;
            }
            AndroidUtilities.runOnUIThread(new c(this, 2));
        } catch (Exception e9) {
            FileLog.e(e9, !"APP_PAUSED".equals(e9.getMessage()));
            AndroidUtilities.runOnUIThread(new cg.c(this, z10, e9, runnable, 5));
        }
    }

    public void lambda$open$10(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                Camera cameraOpen = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = cameraOpen;
                camera = cameraOpen;
            } catch (Exception e9) {
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                FileLog.e(e9);
                return;
            }
        }
        camera.setErrorCallback(getErrorListener(cameraSession));
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        cameraSession.availableFlashModes.clear();
        if (supportedFlashModes != null) {
            for (int i10 = 0; i10 < supportedFlashModes.size(); i10++) {
                String str = supportedFlashModes.get(i10);
                if (str.equals("off") || str.equals("on") || str.equals("auto")) {
                    cameraSession.availableFlashModes.add(str);
                }
            }
            if (TextUtils.equals(cameraSession.getCurrentFlashMode(), parameters.getFlashMode()) && cameraSession.availableFlashModes.contains(cameraSession.getCurrentFlashMode())) {
                cameraSession.checkFlashMode(cameraSession.getCurrentFlashMode());
            } else {
                cameraSession.checkFlashMode(cameraSession.availableFlashModes.get(0));
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
                for (int i10 = 0; i10 < supportedFlashModes.size(); i10++) {
                    String str = supportedFlashModes.get(i10);
                    if (str.equals("off") || str.equals("on") || str.equals("auto")) {
                        cameraSession.availableFlashModes.add(str);
                    }
                }
                if (TextUtils.equals(cameraSession.getCurrentFlashMode(), parameters.getFlashMode()) && cameraSession.availableFlashModes.contains(cameraSession.getCurrentFlashMode())) {
                    cameraSession.checkFlashMode(cameraSession.getCurrentFlashMode());
                } else {
                    cameraSession.checkFlashMode(cameraSession.availableFlashModes.get(0));
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
        } catch (Exception e9) {
            cameraSession.cameraInfo.camera = null;
            if (camera != null) {
                camera.release();
            }
            FileLog.e(e9);
        }
    }

    public void lambda$recordVideo$12(ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        iCameraView.startRecording(file, new fh.f(18, this, z10));
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$recordVideo$13(Object obj, ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
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
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(true);
            }
            AndroidUtilities.runOnUIThread(new cg.j(this, iCameraView, file, z10, runnable, 11));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$recordVideo$14(Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, VideoTakeCallback videoTakeCallback, Runnable runnable) {
        if (camera != null) {
            try {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode(cameraSession.getCurrentFlashMode().equals("on") ? "torch" : "off");
                    camera.setParameters(parameters);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                camera.unlock();
                try {
                    this.mirrorRecorderVideo = z10;
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
                } catch (Exception e10) {
                    this.recorder.release();
                    this.recorder = null;
                    FileLog.e(e10);
                    return;
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            FileLog.e(e11);
        }
    }

    public void lambda$startPreview$7(CameraSession cameraSession) {
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                Camera cameraOpen = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = cameraOpen;
                try {
                    cameraOpen.setErrorCallback(getErrorListener(cameraSession));
                    camera = cameraOpen;
                } catch (Exception e9) {
                    e = e9;
                    camera = cameraOpen;
                    cameraSession.cameraInfo.camera = null;
                    if (camera != null) {
                        camera.release();
                    }
                    FileLog.e(e);
                    return;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        camera.startPreview();
    }

    public void lambda$stopPreview$8(CameraSession cameraSession) {
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                Camera cameraOpen = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = cameraOpen;
                try {
                    cameraOpen.setErrorCallback(getErrorListener(cameraSession));
                    camera = cameraOpen;
                } catch (Exception e9) {
                    e = e9;
                    camera = cameraOpen;
                    cameraSession.cameraInfo.camera = null;
                    if (camera != null) {
                        camera.release();
                    }
                    FileLog.e(e);
                    return;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        camera.stopPreview();
    }

    public static void lambda$stopVideoRecording$16(Camera camera, CameraSession cameraSession) {
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(cameraSession.getCurrentFlashMode());
            camera.setParameters(parameters);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$stopVideoRecording$17(Object obj, boolean z10, boolean z11) throws Throwable {
        try {
            MediaRecorder mediaRecorder = this.recorder;
            if (mediaRecorder != null) {
                this.recorder = null;
                try {
                    mediaRecorder.stop();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                try {
                    mediaRecorder.release();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                Camera camera = cameraSession.cameraInfo.camera;
                if (camera != null) {
                    try {
                        camera.reconnect();
                        camera.startPreview();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    try {
                        cameraSession.stopVideoRecording();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode("off");
                    camera.setParameters(parameters);
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                this.threadPool.execute(new s(3, camera, cameraSession));
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(false);
            }
            if (z10 || this.onVideoTakeCallback == null) {
                this.onVideoTakeCallback = null;
            } else {
                lambda$recordVideo$11(z11);
            }
        } catch (Exception unused) {
        }
    }

    public static void lambda$takePicture$6(File file, CameraInfo cameraInfo, boolean z10, boolean z11, Utilities.Callback callback, byte[] bArr, Camera camera) {
        Bitmap bitmapDecodeByteArray;
        Exception exc;
        int orientation;
        Throwable th;
        int photoSize = (int) (AndroidUtilities.getPhotoSize() / AndroidUtilities.density);
        Locale locale = Locale.US;
        String str = Utilities.MD5(file.getAbsolutePath()) + "@" + photoSize + "_" + photoSize;
        int i10 = 0;
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
                if (cameraInfo.frontCamera != 0 && z10) {
                    try {
                        Matrix matrix = new Matrix();
                        if (!z11 && orientation != -1) {
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
            } catch (Exception e9) {
                exc = e9;
                i10 = orientation;
                FileLog.e(exc);
                orientation = i10;
            }
        } catch (Exception e10) {
            exc = e10;
        }
        if (callback != null) {
            callback.run(Integer.valueOf(orientation));
        }
    }

    private static int pack(byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i10 += i11 - 1;
            i12 = -1;
        } else {
            i12 = 1;
        }
        int i13 = 0;
        while (true) {
            int i14 = i11 - 1;
            if (i11 <= 0) {
                return i13;
            }
            i13 = (bArr[i10] & 255) | (i13 << 8);
            i10 += i12;
            i11 = i14;
        }
    }

    public void addOnErrorListener(ErrorCallback errorCallback) {
        if (this.errorCallbacks == null) {
            this.errorCallbacks = new ArrayList<>();
        }
        this.errorCallbacks.remove(errorCallback);
        this.errorCallbacks.add(errorCallback);
    }

    public void cancelOnInitRunnable(Runnable runnable) {
        this.onFinishCameraInitRunnables.remove(runnable);
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable) {
        close(cameraSession, countDownLatch, runnable, null);
    }

    public ArrayList<CameraInfo> getCameras() {
        return this.cameraInfos;
    }

    public Camera.ErrorCallback getErrorListener(final CameraSession cameraSession) {
        return new Camera.ErrorCallback() {
            @Override
            public final void onError(int i10, Camera camera) {
                this.f19918a.lambda$getErrorListener$18(cameraSession, i10, camera);
            }
        };
    }

    public void initCamera(Runnable runnable) {
        initCamera(runnable, false);
    }

    public boolean isCameraInitied() {
        return (!this.cameraInitied || this.cameraInfos == null || this.cameraInfos.isEmpty()) ? false : true;
    }

    @Override
    public void onInfo(MediaRecorder mediaRecorder, int i10, int i11) throws Throwable {
        if (i10 == 800 || i10 == 801 || i10 == 1) {
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

    public void open(CameraSession cameraSession, SurfaceTexture surfaceTexture, Runnable runnable, Runnable runnable2) {
        if (cameraSession == null || surfaceTexture == null) {
            return;
        }
        this.threadPool.execute(new k0(this, cameraSession, runnable2, surfaceTexture, runnable, 19));
    }

    public void openRound(CameraSession cameraSession, SurfaceTexture surfaceTexture, Runnable runnable, Runnable runnable2) {
        if (cameraSession != null && surfaceTexture != null) {
            this.threadPool.execute(new androidx.car.app.utils.b(cameraSession, runnable2, surfaceTexture, runnable, 21));
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("failed to open round " + cameraSession + " tex = " + surfaceTexture);
        }
    }

    public void recordVideo(Object obj, File file, boolean z10, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView) {
        recordVideo(obj, file, z10, videoTakeCallback, runnable, iCameraView, true);
    }

    public void removeOnErrorListener(ErrorCallback errorCallback) {
        ArrayList<ErrorCallback> arrayList = this.errorCallbacks;
        if (arrayList != null) {
            arrayList.remove(errorCallback);
        }
    }

    public void startPreview(Object obj) {
        if (obj == null || !(obj instanceof CameraSession)) {
            return;
        }
        this.threadPool.execute(new h(this, (CameraSession) obj, 1));
    }

    public void stopPreview(Object obj) {
        if (obj == null || !(obj instanceof CameraSession)) {
            return;
        }
        this.threadPool.execute(new h(this, (CameraSession) obj, 0));
    }

    public void stopVideoRecording(Object obj, boolean z10) {
        stopVideoRecording(obj, z10, true);
    }

    public boolean takePicture(final File file, final boolean z10, Object obj, final Utilities.Callback<Integer> callback) {
        if (obj != null) {
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                final CameraInfo cameraInfo = cameraSession.cameraInfo;
                final boolean zIsFlipFront = cameraSession.isFlipFront();
                try {
                    cameraInfo.camera.takePicture(null, null, new Camera.PictureCallback() {
                        @Override
                        public final void onPictureTaken(byte[] bArr, Camera camera) {
                            CameraController.lambda$takePicture$6(file, cameraInfo, zIsFlipFront, z10, callback, bArr, camera);
                        }
                    });
                    return true;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return false;
                }
            }
            if (obj instanceof Camera2Session) {
                return ((Camera2Session) obj).takePicture(file, callback);
            }
        }
        return false;
    }

    private void initCamera(Runnable runnable, boolean z10) {
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
        this.threadPool.execute(new t5(this, z10, runnable, 5));
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable, Runnable runnable2) {
        cameraSession.destroy();
        this.threadPool.execute(new androidx.car.app.utils.b(runnable, cameraSession, countDownLatch, runnable2, 22));
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public void recordVideo(Object obj, File file, boolean z10, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView, boolean z11) {
        if (obj == null) {
            return;
        }
        if (iCameraView != null) {
            this.recordingCurrentCameraView = iCameraView;
            this.onVideoTakeCallback = videoTakeCallback;
            this.recordedFile = file.getAbsolutePath();
            this.threadPool.execute(new p1(this, obj, iCameraView, file, z11, runnable, 6));
            return;
        }
        if (obj instanceof CameraSession) {
            CameraSession cameraSession = (CameraSession) obj;
            CameraInfo cameraInfo = cameraSession.cameraInfo;
            this.threadPool.execute(new s1(this, cameraInfo.camera, cameraSession, z10, file, cameraInfo, videoTakeCallback, runnable));
        }
    }

    public void stopVideoRecording(Object obj, boolean z10, boolean z11) {
        ICameraView iCameraView = this.recordingCurrentCameraView;
        if (iCameraView == null) {
            this.threadPool.execute(new i(this, obj, z10, z11));
        } else {
            iCameraView.stopRecording();
            this.recordingCurrentCameraView = null;
        }
    }
}
