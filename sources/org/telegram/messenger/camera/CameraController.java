package org.telegram.messenger.camera;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import cg.u0;
import gg.j0;
import j3.n1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lh.r5;
import nh.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.t1;
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
            return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
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

    public static Size chooseOptimalSize(List<Size> list, int i10, int i11, Size size, boolean z4) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        int width = size.getWidth();
        int height = size.getHeight();
        for (int i12 = 0; i12 < list.size(); i12++) {
            Size size2 = list.get(i12);
            if (!z4 || (size2.getHeight() <= i11 && size2.getWidth() <= i10)) {
                if (size2.getHeight() == (size2.getWidth() * height) / width && size2.getWidth() >= i10 && size2.getHeight() >= i11) {
                    arrayList.add(size2);
                } else {
                    if (size2.getWidth() * size2.getHeight() <= i10 * i11 * 4) {
                        arrayList2.add(size2);
                    }
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

    public void lambda$recordVideo$11(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraController.lambda$recordVideo$11(boolean):void");
    }

    public static CameraController getInstance() {
        CameraController cameraController;
        CameraController cameraController2 = Instance;
        if (cameraController2 == null) {
            synchronized (CameraController.class) {
                try {
                    cameraController = Instance;
                    if (cameraController == null) {
                        cameraController = new CameraController();
                        Instance = cameraController;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return cameraController;
        }
        return cameraController2;
    }

    private static int getOrientation(byte[] bArr) {
        int i10;
        int pack;
        boolean z4;
        if (bArr == null) {
            return -1;
        }
        int i11 = 0;
        while (i11 + 3 < bArr.length) {
            int i12 = i11 + 1;
            if ((bArr[i11] & 255) == 255) {
                int i13 = bArr[i12] & 255;
                if (i13 != 255) {
                    i12 = i11 + 2;
                    if (i13 != 216 && i13 != 1) {
                        if (i13 != 217 && i13 != 218) {
                            int pack2 = pack(bArr, i12, 2, false);
                            if (pack2 < 2 || (i12 = i12 + pack2) > bArr.length) {
                                return -1;
                            }
                            if (i13 == 225 && pack2 >= 8 && pack(bArr, i11 + 4, 4, false) == 1165519206 && pack(bArr, i11 + 8, 2, false) == 0) {
                                i11 += 10;
                                i10 = pack2 - 8;
                                break;
                            }
                        }
                    }
                }
                i11 = i12;
            }
            i11 = i12;
        }
        i10 = 0;
        if (i10 <= 8 || ((pack = pack(bArr, i11, 4, false)) != 1229531648 && pack != 1296891946)) {
            return -1;
        }
        if (pack == 1229531648) {
            z4 = true;
        } else {
            z4 = false;
        }
        int pack3 = pack(bArr, i11 + 4, 4, z4) + 2;
        if (pack3 >= 10 && pack3 <= i10) {
            int i14 = i11 + pack3;
            int i15 = i10 - pack3;
            int pack4 = pack(bArr, i14 - 2, 2, z4);
            while (true) {
                int i16 = pack4 - 1;
                if (pack4 <= 0 || i15 < 12) {
                    break;
                } else if (pack(bArr, i14, 2, z4) == 274) {
                    int pack5 = pack(bArr, i14 + 8, 2, z4);
                    if (pack5 == 1) {
                        return 0;
                    }
                    if (pack5 != 3) {
                        if (pack5 != 6) {
                            if (pack5 != 8) {
                                return -1;
                            }
                            return 270;
                        }
                        return 90;
                    }
                    return 180;
                } else {
                    i14 += 12;
                    i15 -= 12;
                    pack4 = i16;
                }
            }
        }
        return -1;
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
            } catch (Exception e6) {
                FileLog.e(e6);
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
        String str;
        if (this.onVideoTakeCallback != null) {
            if (file != null) {
                str = file.getAbsolutePath();
                if (bitmap != null) {
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), Utilities.MD5(str), false);
                }
            } else {
                str = null;
            }
            this.onVideoTakeCallback.onFinishVideoRecording(str, j10);
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
        if (i12 > i13) {
            return -1;
        }
        return 0;
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

    public void lambda$initCamera$3(boolean z4, Exception exc, Runnable runnable) {
        this.onFinishCameraInitRunnables.clear();
        this.loadingCameras = false;
        this.cameraInitied = false;
        if (!z4 && "APP_PAUSED".equals(exc.getMessage()) && runnable != null) {
            AndroidUtilities.runOnUIThread(new s(2, this, runnable), 1000L);
        }
    }

    public void lambda$initCamera$4(boolean z4, Runnable runnable) {
        SharedPreferences sharedPreferences;
        Camera camera;
        Camera.Parameters parameters;
        try {
            if (this.cameraInfos == null) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                String string = globalMainSettings.getString("cameraCache", null);
                e4 e4Var = new e4(3);
                ArrayList<CameraInfo> arrayList = new ArrayList<>();
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                    int readInt32 = serializedData.readInt32(false);
                    for (int i10 = 0; i10 < readInt32; i10++) {
                        CameraInfo cameraInfo = new CameraInfo(serializedData.readInt32(false), serializedData.readInt32(false));
                        int readInt322 = serializedData.readInt32(false);
                        for (int i11 = 0; i11 < readInt322; i11++) {
                            cameraInfo.previewSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        int readInt323 = serializedData.readInt32(false);
                        for (int i12 = 0; i12 < readInt323; i12++) {
                            cameraInfo.pictureSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        arrayList.add(cameraInfo);
                        Collections.sort(cameraInfo.previewSizes, e4Var);
                        Collections.sort(cameraInfo.pictureSizes, e4Var);
                    }
                    serializedData.cleanup();
                } else {
                    int numberOfCameras = Camera.getNumberOfCameras();
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    int i13 = 4;
                    int i14 = 0;
                    while (i14 < numberOfCameras) {
                        Camera.getCameraInfo(i14, cameraInfo2);
                        CameraInfo cameraInfo3 = new CameraInfo(i14, cameraInfo2.facing);
                        if (ApplicationLoader.mainInterfacePaused && ApplicationLoader.externalInterfacePaused) {
                            throw new RuntimeException("APP_PAUSED");
                        }
                        Camera open = Camera.open(cameraInfo3.getCameraId());
                        Camera.Parameters parameters2 = open.getParameters();
                        List<Camera.Size> supportedPreviewSizes = parameters2.getSupportedPreviewSizes();
                        int i15 = 0;
                        while (true) {
                            sharedPreferences = globalMainSettings;
                            if (i15 >= supportedPreviewSizes.size()) {
                                break;
                            }
                            Camera.Size size = supportedPreviewSizes.get(i15);
                            Camera.CameraInfo cameraInfo4 = cameraInfo2;
                            int i16 = size.height;
                            int i17 = i14;
                            if (i16 < 2160) {
                                camera = open;
                                int i18 = size.width;
                                if (i18 < 2160) {
                                    parameters = parameters2;
                                    cameraInfo3.previewSizes.add(new Size(i18, i16));
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("preview size = " + size.width + " " + size.height);
                                    }
                                    i15++;
                                    globalMainSettings = sharedPreferences;
                                    cameraInfo2 = cameraInfo4;
                                    i14 = i17;
                                    open = camera;
                                    parameters2 = parameters;
                                }
                            } else {
                                camera = open;
                            }
                            parameters = parameters2;
                            i15++;
                            globalMainSettings = sharedPreferences;
                            cameraInfo2 = cameraInfo4;
                            i14 = i17;
                            open = camera;
                            parameters2 = parameters;
                        }
                        Camera.CameraInfo cameraInfo5 = cameraInfo2;
                        int i19 = i14;
                        Camera camera2 = open;
                        List<Camera.Size> supportedPictureSizes = parameters2.getSupportedPictureSizes();
                        for (int i20 = 0; i20 < supportedPictureSizes.size(); i20++) {
                            Camera.Size size2 = supportedPictureSizes.get(i20);
                            if (!"samsung".equals(Build.MANUFACTURER) || !"jflteuc".equals(Build.PRODUCT) || size2.width < 2048) {
                                cameraInfo3.pictureSizes.add(new Size(size2.width, size2.height));
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("picture size = " + size2.width + " " + size2.height);
                                }
                            }
                        }
                        camera2.release();
                        arrayList.add(cameraInfo3);
                        Collections.sort(cameraInfo3.previewSizes, e4Var);
                        Collections.sort(cameraInfo3.pictureSizes, e4Var);
                        i13 += ((cameraInfo3.previewSizes.size() + cameraInfo3.pictureSizes.size()) * 8) + 8;
                        i14 = i19 + 1;
                        globalMainSettings = sharedPreferences;
                        cameraInfo2 = cameraInfo5;
                    }
                    SharedPreferences sharedPreferences2 = globalMainSettings;
                    SerializedData serializedData2 = new SerializedData(i13);
                    serializedData2.writeInt32(arrayList.size());
                    for (int i21 = 0; i21 < numberOfCameras; i21++) {
                        CameraInfo cameraInfo6 = arrayList.get(i21);
                        serializedData2.writeInt32(cameraInfo6.cameraId);
                        serializedData2.writeInt32(cameraInfo6.frontCamera);
                        int size3 = cameraInfo6.previewSizes.size();
                        serializedData2.writeInt32(size3);
                        for (int i22 = 0; i22 < size3; i22++) {
                            Size size4 = cameraInfo6.previewSizes.get(i22);
                            serializedData2.writeInt32(size4.mWidth);
                            serializedData2.writeInt32(size4.mHeight);
                        }
                        int size5 = cameraInfo6.pictureSizes.size();
                        serializedData2.writeInt32(size5);
                        for (int i23 = 0; i23 < size5; i23++) {
                            Size size6 = cameraInfo6.pictureSizes.get(i23);
                            serializedData2.writeInt32(size6.mWidth);
                            serializedData2.writeInt32(size6.mHeight);
                        }
                    }
                    sharedPreferences2.edit().putString("cameraCache", Base64.encodeToString(serializedData2.toByteArray(), 0)).commit();
                    serializedData2.cleanup();
                }
                this.cameraInfos = arrayList;
            }
            AndroidUtilities.runOnUIThread(new c(this, 2));
        } catch (Exception e) {
            FileLog.e(e, !"APP_PAUSED".equals(e.getMessage()));
            AndroidUtilities.runOnUIThread(new u0(this, z4, e, runnable, 4));
        }
    }

    public void lambda$open$10(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                Camera open = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = open;
                camera = open;
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
            for (int i10 = 0; i10 < supportedFlashModes.size(); i10++) {
                String str = supportedFlashModes.get(i10);
                if (str.equals("off") || str.equals("on") || str.equals("auto")) {
                    cameraSession.availableFlashModes.add(str);
                }
            }
            if (TextUtils.equals(cameraSession.getCurrentFlashMode(), parameters.getFlashMode()) && cameraSession.availableFlashModes.contains(cameraSession.getCurrentFlashMode())) {
                cameraSession.checkFlashMode(cameraSession.getCurrentFlashMode());
            }
            cameraSession.checkFlashMode(cameraSession.availableFlashModes.get(0));
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
                Camera open = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = open;
                camera = open;
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
                }
                cameraSession.checkFlashMode(cameraSession.availableFlashModes.get(0));
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

    public void lambda$recordVideo$12(ICameraView iCameraView, File file, boolean z4, Runnable runnable) {
        iCameraView.startRecording(file, new jh.f(12, this, z4));
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$recordVideo$13(Object obj, ICameraView iCameraView, File file, boolean z4, Runnable runnable) {
        String str;
        try {
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                Camera camera = cameraSession.cameraInfo.camera;
                if (camera != null) {
                    try {
                        Camera.Parameters parameters = camera.getParameters();
                        if (cameraSession.getCurrentFlashMode().equals("on")) {
                            str = "torch";
                        } else {
                            str = "off";
                        }
                        parameters.setFlashMode(str);
                        camera.setParameters(parameters);
                        cameraSession.onStartRecord();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(true);
            }
            AndroidUtilities.runOnUIThread(new gg.j(this, iCameraView, file, z4, runnable, 9));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public void lambda$recordVideo$14(Camera camera, CameraSession cameraSession, boolean z4, File file, CameraInfo cameraInfo, VideoTakeCallback videoTakeCallback, Runnable runnable) {
        int i10;
        String str;
        if (camera != null) {
            try {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    if (cameraSession.getCurrentFlashMode().equals("on")) {
                        str = "torch";
                    } else {
                        str = "off";
                    }
                    parameters.setFlashMode(str);
                    camera.setParameters(parameters);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                camera.unlock();
                try {
                    this.mirrorRecorderVideo = z4;
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
                    Size chooseOptimalSize = chooseOptimalSize(cameraInfo.getPictureSizes(), 720, 480, new Size(16, 9), false);
                    if (Math.min(chooseOptimalSize.mHeight, chooseOptimalSize.mWidth) >= 720) {
                        i10 = 3500000;
                    } else {
                        i10 = 1800000;
                    }
                    this.recorder.setVideoEncodingBitRate(i10);
                    this.recorder.setVideoSize(chooseOptimalSize.getWidth(), chooseOptimalSize.getHeight());
                    this.recorder.setOnInfoListener(this);
                    this.recorder.prepare();
                    this.recorder.start();
                    this.onVideoTakeCallback = videoTakeCallback;
                    this.recordedFile = file.getAbsolutePath();
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable);
                    }
                } catch (Exception e6) {
                    this.recorder.release();
                    this.recorder = null;
                    FileLog.e(e6);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public void lambda$startPreview$7(CameraSession cameraSession) {
        Camera open;
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                open = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = open;
            } catch (Exception e) {
                e = e;
            }
            try {
                open.setErrorCallback(getErrorListener(cameraSession));
                camera = open;
            } catch (Exception e6) {
                e = e6;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                FileLog.e(e);
                return;
            }
        }
        camera.startPreview();
    }

    public void lambda$stopPreview$8(CameraSession cameraSession) {
        Camera open;
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                open = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = open;
            } catch (Exception e) {
                e = e;
            }
            try {
                open.setErrorCallback(getErrorListener(cameraSession));
                camera = open;
            } catch (Exception e6) {
                e = e6;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                FileLog.e(e);
                return;
            }
        }
        camera.stopPreview();
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

    public void lambda$stopVideoRecording$17(Object obj, boolean z4, boolean z10) {
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
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                Camera camera = cameraSession.cameraInfo.camera;
                if (camera != null) {
                    try {
                        camera.reconnect();
                        camera.startPreview();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    try {
                        cameraSession.stopVideoRecording();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode("off");
                    camera.setParameters(parameters);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                this.threadPool.execute(new s(3, camera, cameraSession));
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(false);
            }
            if (!z4 && this.onVideoTakeCallback != null) {
                lambda$recordVideo$11(z10);
            } else {
                this.onVideoTakeCallback = null;
            }
        } catch (Exception unused) {
        }
    }

    public static void lambda$takePicture$6(java.io.File r9, org.telegram.messenger.camera.CameraInfo r10, boolean r11, boolean r12, org.telegram.messenger.Utilities.Callback r13, byte[] r14, android.hardware.Camera r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraController.lambda$takePicture$6(java.io.File, org.telegram.messenger.camera.CameraInfo, boolean, boolean, org.telegram.messenger.Utilities$Callback, byte[], android.hardware.Camera):void");
    }

    private static int pack(byte[] bArr, int i10, int i11, boolean z4) {
        int i12;
        if (z4) {
            i10 += i11 - 1;
            i12 = -1;
        } else {
            i12 = 1;
        }
        int i13 = 0;
        while (true) {
            int i14 = i11 - 1;
            if (i11 > 0) {
                i13 = (bArr[i10] & 255) | (i13 << 8);
                i10 += i12;
                i11 = i14;
            } else {
                return i13;
            }
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
                CameraController.this.lambda$getErrorListener$18(cameraSession, i10, camera);
            }
        };
    }

    public void initCamera(Runnable runnable) {
        initCamera(runnable, false);
    }

    public boolean isCameraInitied() {
        if (this.cameraInitied && this.cameraInfos != null && !this.cameraInfos.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public void onInfo(MediaRecorder mediaRecorder, int i10, int i11) {
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
        if (cameraSession != null && surfaceTexture != null) {
            this.threadPool.execute(new j0(this, cameraSession, runnable2, surfaceTexture, runnable, 17));
        }
    }

    public void openRound(CameraSession cameraSession, SurfaceTexture surfaceTexture, Runnable runnable, Runnable runnable2) {
        if (cameraSession != null && surfaceTexture != null) {
            this.threadPool.execute(new androidx.car.app.utils.c(cameraSession, runnable2, surfaceTexture, runnable, 17));
        } else if (BuildVars.LOGS_ENABLED) {
            FileLog.d("failed to open round " + cameraSession + " tex = " + surfaceTexture);
        }
    }

    public void recordVideo(Object obj, File file, boolean z4, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView) {
        recordVideo(obj, file, z4, videoTakeCallback, runnable, iCameraView, true);
    }

    public void removeOnErrorListener(ErrorCallback errorCallback) {
        ArrayList<ErrorCallback> arrayList = this.errorCallbacks;
        if (arrayList != null) {
            arrayList.remove(errorCallback);
        }
    }

    public void startPreview(Object obj) {
        if (obj != null && (obj instanceof CameraSession)) {
            this.threadPool.execute(new h(this, (CameraSession) obj, 1));
        }
    }

    public void stopPreview(Object obj) {
        if (obj != null && (obj instanceof CameraSession)) {
            this.threadPool.execute(new h(this, (CameraSession) obj, 0));
        }
    }

    public void stopVideoRecording(Object obj, boolean z4) {
        stopVideoRecording(obj, z4, true);
    }

    public boolean takePicture(final File file, final boolean z4, Object obj, final Utilities.Callback<Integer> callback) {
        if (obj != null) {
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                final CameraInfo cameraInfo = cameraSession.cameraInfo;
                final boolean isFlipFront = cameraSession.isFlipFront();
                try {
                    cameraInfo.camera.takePicture(null, null, new Camera.PictureCallback() {
                        @Override
                        public final void onPictureTaken(byte[] bArr, Camera camera) {
                            CameraController.lambda$takePicture$6(file, cameraInfo, isFlipFront, z4, callback, bArr, camera);
                        }
                    });
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            } else if (obj instanceof Camera2Session) {
                return ((Camera2Session) obj).takePicture(file, callback);
            }
        }
        return false;
    }

    private void initCamera(Runnable runnable, boolean z4) {
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
        this.threadPool.execute(new r5(this, z4, runnable, 3));
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable, Runnable runnable2) {
        cameraSession.destroy();
        this.threadPool.execute(new androidx.car.app.utils.c(runnable, cameraSession, countDownLatch, runnable2, 18));
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void recordVideo(Object obj, File file, boolean z4, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView, boolean z10) {
        if (obj == null) {
            return;
        }
        if (iCameraView != null) {
            this.recordingCurrentCameraView = iCameraView;
            this.onVideoTakeCallback = videoTakeCallback;
            this.recordedFile = file.getAbsolutePath();
            this.threadPool.execute(new n1(this, obj, iCameraView, file, z10, runnable, 6));
        } else if (obj instanceof CameraSession) {
            CameraSession cameraSession = (CameraSession) obj;
            CameraInfo cameraInfo = cameraSession.cameraInfo;
            this.threadPool.execute(new t1(this, cameraInfo.camera, cameraSession, z4, file, cameraInfo, videoTakeCallback, runnable));
        }
    }

    public void stopVideoRecording(Object obj, boolean z4, boolean z10) {
        ICameraView iCameraView = this.recordingCurrentCameraView;
        if (iCameraView != null) {
            iCameraView.stopRecording();
            this.recordingCurrentCameraView = null;
            return;
        }
        this.threadPool.execute(new i(this, obj, z4, z10));
    }
}
