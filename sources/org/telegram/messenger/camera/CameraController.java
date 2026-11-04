package org.telegram.messenger.camera;

import ai.t6;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import ci.e1;
import ci.u8;
import ci.v3;
import ci.v6;
import g2.p0;
import gi.q1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o4.b1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.tq;
import org.telegram.messenger.u10;
import org.telegram.messenger.zb;
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
        void onError(int i3, Camera camera, CameraSessionWrapper cameraSessionWrapper);
    }

    public interface ICameraView {
        boolean startRecording(File file, Runnable runnable);

        void stopRecording();
    }

    public interface VideoTakeCallback {
        void onFinishVideoRecording(String str, long j10);
    }

    public static Size chooseOptimalSize(List<Size> list, int i3, int i10, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        int width = size.getWidth();
        int height = size.getHeight();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Size size2 = list.get(i11);
            if (!z10 || (size2.getHeight() <= i10 && size2.getWidth() <= i3)) {
                if (size2.getHeight() == (size2.getWidth() * height) / width && size2.getWidth() >= i3 && size2.getHeight() >= i10) {
                    arrayList.add(size2);
                } else {
                    if (size2.getWidth() * size2.getHeight() <= i3 * i10 * 4) {
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

    public void lambda$recordVideo$11(boolean r13) {
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

    private static int getOrientation(byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraController.getOrientation(byte[]):int");
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
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                cameraSession.cameraInfo.camera.release();
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            cameraSession.cameraInfo.camera = null;
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (runnable2 != null) {
            g0.h3(runnable2);
        }
    }

    public void lambda$finishRecordingVideo$15(File file, Bitmap bitmap, long j10) {
        String str;
        if (this.onVideoTakeCallback != null) {
            if (file != null) {
                str = file.getAbsolutePath();
                if (bitmap != null) {
                    zb.D().O(new BitmapDrawable(bitmap), Utilities.a(str), false);
                }
            } else {
                str = null;
            }
            this.onVideoTakeCallback.onFinishVideoRecording(str, j10);
            this.onVideoTakeCallback = null;
        }
    }

    public void lambda$getErrorListener$18(CameraSession cameraSession, int i3, Camera camera) {
        if (this.errorCallbacks != null) {
            for (int i10 = 0; i10 < this.errorCallbacks.size(); i10++) {
                ErrorCallback errorCallback = this.errorCallbacks.get(i10);
                if (errorCallback != null) {
                    errorCallback.onError(i3, camera, CameraSessionWrapper.of(cameraSession));
                }
            }
        }
    }

    public static int lambda$initCamera$0(Size size, Size size2) {
        int i3 = size.mWidth;
        int i10 = size2.mWidth;
        if (i3 < i10) {
            return 1;
        }
        if (i3 > i10) {
            return -1;
        }
        int i11 = size.mHeight;
        int i12 = size2.mHeight;
        if (i11 < i12) {
            return 1;
        }
        if (i11 > i12) {
            return -1;
        }
        return 0;
    }

    public void lambda$initCamera$1() {
        this.loadingCameras = false;
        this.cameraInitied = true;
        if (!this.onFinishCameraInitRunnables.isEmpty()) {
            for (int i3 = 0; i3 < this.onFinishCameraInitRunnables.size(); i3++) {
                this.onFinishCameraInitRunnables.get(i3).run();
            }
            this.onFinishCameraInitRunnables.clear();
        }
        hs.e().k(hs.f23263l4, new Object[0]);
    }

    public void lambda$initCamera$2(Runnable runnable) {
        initCamera(runnable, true);
    }

    public void lambda$initCamera$3(boolean z10, Exception exc, Runnable runnable) {
        this.onFinishCameraInitRunnables.clear();
        this.loadingCameras = false;
        this.cameraInitied = false;
        if (!z10 && "APP_PAUSED".equals(exc.getMessage()) && runnable != null) {
            g0.i3(new s(2, this, runnable), 1000L);
        }
    }

    public void lambda$initCamera$4(boolean z10, Runnable runnable) {
        SharedPreferences sharedPreferences;
        Camera camera;
        Camera.Parameters parameters;
        try {
            if (this.cameraInfos == null) {
                SharedPreferences e12 = hp.e1();
                String string = e12.getString("cameraCache", null);
                tq tqVar = new tq(12);
                ArrayList<CameraInfo> arrayList = new ArrayList<>();
                int i3 = 0;
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
                        Collections.sort(cameraInfo.previewSizes, tqVar);
                        Collections.sort(cameraInfo.pictureSizes, tqVar);
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
                        if (t0.f25465x && t0.E) {
                            throw new RuntimeException("APP_PAUSED");
                        }
                        Camera open = Camera.open(cameraInfo3.getCameraId());
                        Camera.Parameters parameters2 = open.getParameters();
                        List<Camera.Size> supportedPreviewSizes = parameters2.getSupportedPreviewSizes();
                        int i15 = i3;
                        while (true) {
                            sharedPreferences = e12;
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
                                    if (r2.f25040a) {
                                        a8.b("preview size = " + size.width + " " + size.height);
                                    }
                                    i15++;
                                    e12 = sharedPreferences;
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
                            e12 = sharedPreferences;
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
                                if (r2.f25040a) {
                                    a8.b("picture size = " + size2.width + " " + size2.height);
                                }
                            }
                        }
                        camera2.release();
                        arrayList.add(cameraInfo3);
                        Collections.sort(cameraInfo3.previewSizes, tqVar);
                        Collections.sort(cameraInfo3.pictureSizes, tqVar);
                        i13 += ((cameraInfo3.previewSizes.size() + cameraInfo3.pictureSizes.size()) * 8) + 8;
                        i14 = i19 + 1;
                        e12 = sharedPreferences;
                        cameraInfo2 = cameraInfo5;
                        i3 = 0;
                    }
                    SharedPreferences sharedPreferences2 = e12;
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
            g0.h3(new c(this, 2));
        } catch (Exception e10) {
            a8.g(e10, !"APP_PAUSED".equals(e10.getMessage()));
            g0.h3(new u8(this, z10, e10, runnable, 24));
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
            } catch (Exception e10) {
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                a8.g(e10, true);
                return;
            }
        }
        camera.setErrorCallback(getErrorListener(cameraSession));
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        cameraSession.availableFlashModes.clear();
        if (supportedFlashModes != null) {
            for (int i3 = 0; i3 < supportedFlashModes.size(); i3++) {
                String str = supportedFlashModes.get(i3);
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
            g0.h3(runnable2);
        }
    }

    public static void lambda$openRound$9(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        Camera camera = cameraSession.cameraInfo.camera;
        try {
            if (r2.f25040a) {
                a8.b("start creating round camera session");
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
                for (int i3 = 0; i3 < supportedFlashModes.size(); i3++) {
                    String str = supportedFlashModes.get(i3);
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
                g0.h3(runnable2);
            }
            if (r2.f25040a) {
                a8.b("round camera session created");
            }
        } catch (Exception e10) {
            cameraSession.cameraInfo.camera = null;
            if (camera != null) {
                camera.release();
            }
            a8.g(e10, true);
        }
    }

    public void lambda$recordVideo$12(ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        iCameraView.startRecording(file, new e1(13, this, z10));
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$recordVideo$13(Object obj, ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
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
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(true);
            }
            g0.h3(new q1(this, iCameraView, file, z10, runnable));
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public void lambda$recordVideo$14(Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, VideoTakeCallback videoTakeCallback, Runnable runnable) {
        int i3;
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
                } catch (Exception e10) {
                    a8.g(e10, true);
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
                    Size chooseOptimalSize = chooseOptimalSize(cameraInfo.getPictureSizes(), 720, 480, new Size(16, 9), false);
                    if (Math.min(chooseOptimalSize.mHeight, chooseOptimalSize.mWidth) >= 720) {
                        i3 = 3500000;
                    } else {
                        i3 = 1800000;
                    }
                    this.recorder.setVideoEncodingBitRate(i3);
                    this.recorder.setVideoSize(chooseOptimalSize.getWidth(), chooseOptimalSize.getHeight());
                    this.recorder.setOnInfoListener(this);
                    this.recorder.prepare();
                    this.recorder.start();
                    this.onVideoTakeCallback = videoTakeCallback;
                    this.recordedFile = file.getAbsolutePath();
                    if (runnable != null) {
                        g0.h3(runnable);
                    }
                } catch (Exception e11) {
                    this.recorder.release();
                    this.recorder = null;
                    a8.g(e11, true);
                }
            } catch (Exception e12) {
                a8.g(e12, true);
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
            } catch (Exception e10) {
                e = e10;
            }
            try {
                open.setErrorCallback(getErrorListener(cameraSession));
                camera = open;
            } catch (Exception e11) {
                e = e11;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                a8.g(e, true);
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
            } catch (Exception e10) {
                e = e10;
            }
            try {
                open.setErrorCallback(getErrorListener(cameraSession));
                camera = open;
            } catch (Exception e11) {
                e = e11;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                a8.g(e, true);
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
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public void lambda$stopVideoRecording$17(Object obj, boolean z10, boolean z11) {
        try {
            MediaRecorder mediaRecorder = this.recorder;
            if (mediaRecorder != null) {
                this.recorder = null;
                try {
                    mediaRecorder.stop();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                try {
                    mediaRecorder.release();
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                Camera camera = cameraSession.cameraInfo.camera;
                if (camera != null) {
                    try {
                        camera.reconnect();
                        camera.startPreview();
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    try {
                        cameraSession.stopVideoRecording();
                    } catch (Exception e13) {
                        a8.g(e13, true);
                    }
                }
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode("off");
                    camera.setParameters(parameters);
                } catch (Exception e14) {
                    a8.g(e14, true);
                }
                this.threadPool.execute(new s(3, camera, cameraSession));
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(false);
            }
            if (!z10 && this.onVideoTakeCallback != null) {
                lambda$recordVideo$11(z11);
            } else {
                this.onVideoTakeCallback = null;
            }
        } catch (Exception unused) {
        }
    }

    public static void lambda$takePicture$6(java.io.File r13, org.telegram.messenger.camera.CameraInfo r14, boolean r15, boolean r16, org.telegram.messenger.u10 r17, byte[] r18, android.hardware.Camera r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraController.lambda$takePicture$6(java.io.File, org.telegram.messenger.camera.CameraInfo, boolean, boolean, org.telegram.messenger.u10, byte[], android.hardware.Camera):void");
    }

    private static int pack(byte[] bArr, int i3, int i10, boolean z10) {
        int i11;
        if (z10) {
            i3 += i10 - 1;
            i11 = -1;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            int i13 = i10 - 1;
            if (i10 > 0) {
                i12 = (bArr[i3] & 255) | (i12 << 8);
                i3 += i11;
                i10 = i13;
            } else {
                return i12;
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
            public final void onError(int i3, Camera camera) {
                CameraController.this.lambda$getErrorListener$18(cameraSession, i3, camera);
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
    public void onInfo(MediaRecorder mediaRecorder, int i3, int i10) {
        if (i3 == 800 || i3 == 801 || i3 == 1) {
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
            this.threadPool.execute(new t6(this, cameraSession, runnable2, surfaceTexture, runnable, 20));
        }
    }

    public void openRound(CameraSession cameraSession, SurfaceTexture surfaceTexture, Runnable runnable, Runnable runnable2) {
        if (cameraSession != null && surfaceTexture != null) {
            this.threadPool.execute(new b1(cameraSession, runnable2, surfaceTexture, runnable, 1));
        } else if (r2.f25040a) {
            a8.b("failed to open round " + cameraSession + " tex = " + surfaceTexture);
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
        if (obj != null && (obj instanceof CameraSession)) {
            this.threadPool.execute(new h(this, (CameraSession) obj, 1));
        }
    }

    public void stopPreview(Object obj) {
        if (obj != null && (obj instanceof CameraSession)) {
            this.threadPool.execute(new h(this, (CameraSession) obj, 0));
        }
    }

    public void stopVideoRecording(Object obj, boolean z10) {
        stopVideoRecording(obj, z10, true);
    }

    public boolean takePicture(final File file, final boolean z10, Object obj, final u10 u10Var) {
        if (obj != null) {
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                final CameraInfo cameraInfo = cameraSession.cameraInfo;
                final boolean isFlipFront = cameraSession.isFlipFront();
                try {
                    cameraInfo.camera.takePicture(null, null, new Camera.PictureCallback() {
                        @Override
                        public final void onPictureTaken(byte[] bArr, Camera camera) {
                            CameraController.lambda$takePicture$6(file, cameraInfo, isFlipFront, z10, u10Var, bArr, camera);
                        }
                    });
                    return true;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return false;
                }
            } else if (obj instanceof Camera2Session) {
                return ((Camera2Session) obj).takePicture(file, u10Var);
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
        this.threadPool.execute(new v6(this, z10, runnable, 10));
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable, Runnable runnable2) {
        cameraSession.destroy();
        this.threadPool.execute(new b1(runnable, cameraSession, countDownLatch, runnable2, 2));
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                a8.g(e10, true);
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
            this.threadPool.execute(new v3(2, this, obj, iCameraView, file, runnable, z11));
        } else if (obj instanceof CameraSession) {
            CameraSession cameraSession = (CameraSession) obj;
            CameraInfo cameraInfo = cameraSession.cameraInfo;
            this.threadPool.execute(new kg.t0(this, cameraInfo.camera, cameraSession, z10, file, cameraInfo, videoTakeCallback, runnable));
        }
    }

    public void stopVideoRecording(Object obj, boolean z10, boolean z11) {
        ICameraView iCameraView = this.recordingCurrentCameraView;
        if (iCameraView != null) {
            iCameraView.stopRecording();
            this.recordingCurrentCameraView = null;
            return;
        }
        this.threadPool.execute(new p0(this, obj, z10, z11, 2));
    }
}
