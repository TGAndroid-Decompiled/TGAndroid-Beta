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
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
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
        void onError(int i, Camera camera, CameraSessionWrapper cameraSessionWrapper);
    }

    public interface ICameraView {
        boolean startRecording(File file, Runnable runnable);

        void stopRecording();
    }

    public interface VideoTakeCallback {
        void onFinishVideoRecording(String str, long j);
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
                } else {
                    if (size2.getWidth() * size2.getHeight() <= ((i * i2) << 2)) {
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
                cameraController = Instance;
                if (cameraController == null) {
                    cameraController = new CameraController();
                    Instance = cameraController;
                }
            }
            return cameraController;
        }
        return cameraController2;
    }

    private static int getOrientation(byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraController.getOrientation(byte[]):int");
    }

    private void initCamera(Runnable runnable, boolean z) {
        if (!this.cameraInitied) {
            if (runnable != null && !this.onFinishCameraInitRunnables.contains(runnable)) {
                this.onFinishCameraInitRunnables.add(runnable);
            }
            if (!this.loadingCameras && !this.cameraInitied) {
                this.loadingCameras = true;
                this.threadPool.execute(new mn6(this, z, runnable, (byte) 8));
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
                fa4.g(e, true);
            }
            try {
                cameraSession.cameraInfo.camera.release();
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            cameraSession.cameraInfo.camera = null;
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (runnable2 != null) {
            gl.c3(runnable2);
        }
    }

    public void lambda$finishRecordingVideo$15(File file, Bitmap bitmap, long j) {
        String str;
        if (this.onVideoTakeCallback != null) {
            if (file != null) {
                str = file.getAbsolutePath();
                if (bitmap != null) {
                    fl5.z().K(new BitmapDrawable(bitmap), Utilities.a(str), false);
                }
            } else {
                str = null;
            }
            this.onVideoTakeCallback.onFinishVideoRecording(str, j);
            this.onVideoTakeCallback = null;
        }
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
        if (i3 > i4) {
            return -1;
        }
        return 0;
    }

    public void lambda$initCamera$1() {
        ArrayList<Runnable> arrayList;
        this.loadingCameras = false;
        this.cameraInitied = true;
        if (!this.onFinishCameraInitRunnables.isEmpty()) {
            int i = 0;
            while (true) {
                int size = this.onFinishCameraInitRunnables.size();
                arrayList = this.onFinishCameraInitRunnables;
                if (i >= size) {
                    break;
                }
                arrayList.get(i).run();
                i++;
            }
            arrayList.clear();
        }
        kk7.e().k(kk7.n4, new Object[0]);
    }

    public void lambda$initCamera$2(Runnable runnable) {
        initCamera(runnable, true);
    }

    public void lambda$initCamera$3(boolean z, Exception exc, Runnable runnable) {
        this.onFinishCameraInitRunnables.clear();
        this.loadingCameras = false;
        this.cameraInitied = false;
        if (!z && "APP_PAUSED".equals(exc.getMessage()) && runnable != null) {
            gl.d3(new q21(this, runnable, (byte) 7), 1000L);
        }
    }

    public void lambda$initCamera$4(boolean z, Runnable runnable) {
        SharedPreferences sharedPreferences;
        Camera camera;
        Camera.Parameters parameters;
        try {
            if (this.cameraInfos == null) {
                SharedPreferences c1 = na7.c1();
                String string = c1.getString("cameraCache", null);
                sa saVar = new sa((byte) 17);
                ArrayList<CameraInfo> arrayList = new ArrayList<>();
                int i = 0;
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                    int readInt32 = serializedData.readInt32(false);
                    for (int i2 = 0; i2 < readInt32; i2++) {
                        CameraInfo cameraInfo = new CameraInfo(serializedData.readInt32(false), serializedData.readInt32(false));
                        int readInt322 = serializedData.readInt32(false);
                        for (int i3 = 0; i3 < readInt322; i3++) {
                            cameraInfo.previewSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        int readInt323 = serializedData.readInt32(false);
                        for (int i4 = 0; i4 < readInt323; i4++) {
                            cameraInfo.pictureSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        arrayList.add(cameraInfo);
                        Collections.sort(cameraInfo.previewSizes, saVar);
                        Collections.sort(cameraInfo.pictureSizes, saVar);
                    }
                    serializedData.cleanup();
                } else {
                    int numberOfCameras = Camera.getNumberOfCameras();
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    int i5 = 4;
                    int i6 = 0;
                    while (i6 < numberOfCameras) {
                        Camera.getCameraInfo(i6, cameraInfo2);
                        CameraInfo cameraInfo3 = new CameraInfo(i6, cameraInfo2.facing);
                        if (org.telegram.messenger.a.x && org.telegram.messenger.a.E) {
                            throw new RuntimeException("APP_PAUSED");
                        }
                        Camera open = Camera.open(cameraInfo3.getCameraId());
                        Camera.Parameters parameters2 = open.getParameters();
                        List<Camera.Size> supportedPreviewSizes = parameters2.getSupportedPreviewSizes();
                        int i7 = i;
                        while (true) {
                            sharedPreferences = c1;
                            if (i7 >= supportedPreviewSizes.size()) {
                                break;
                            }
                            Camera.Size size = supportedPreviewSizes.get(i7);
                            Camera.CameraInfo cameraInfo4 = cameraInfo2;
                            int i8 = size.height;
                            int i9 = i6;
                            if (i8 < 2160) {
                                camera = open;
                                int i10 = size.width;
                                if (i10 < 2160) {
                                    parameters = parameters2;
                                    cameraInfo3.previewSizes.add(new Size(i10, i8));
                                    if (w01.a) {
                                        fa4.b("preview size = " + size.width + " " + size.height);
                                    }
                                    i7++;
                                    c1 = sharedPreferences;
                                    cameraInfo2 = cameraInfo4;
                                    i6 = i9;
                                    open = camera;
                                    parameters2 = parameters;
                                }
                            } else {
                                camera = open;
                            }
                            parameters = parameters2;
                            i7++;
                            c1 = sharedPreferences;
                            cameraInfo2 = cameraInfo4;
                            i6 = i9;
                            open = camera;
                            parameters2 = parameters;
                        }
                        Camera.CameraInfo cameraInfo5 = cameraInfo2;
                        int i11 = i6;
                        Camera camera2 = open;
                        List<Camera.Size> supportedPictureSizes = parameters2.getSupportedPictureSizes();
                        for (int i12 = 0; i12 < supportedPictureSizes.size(); i12++) {
                            Camera.Size size2 = supportedPictureSizes.get(i12);
                            if (!"samsung".equals(Build.MANUFACTURER) || !"jflteuc".equals(Build.PRODUCT) || size2.width < 2048) {
                                cameraInfo3.pictureSizes.add(new Size(size2.width, size2.height));
                                if (w01.a) {
                                    fa4.b("picture size = " + size2.width + " " + size2.height);
                                }
                            }
                        }
                        camera2.release();
                        arrayList.add(cameraInfo3);
                        Collections.sort(cameraInfo3.previewSizes, saVar);
                        Collections.sort(cameraInfo3.pictureSizes, saVar);
                        i5 += ((cameraInfo3.previewSizes.size() + cameraInfo3.pictureSizes.size()) << 3) + 8;
                        i6 = i11 + 1;
                        c1 = sharedPreferences;
                        cameraInfo2 = cameraInfo5;
                        i = 0;
                    }
                    SharedPreferences sharedPreferences2 = c1;
                    SerializedData serializedData2 = new SerializedData(i5);
                    serializedData2.writeInt32(arrayList.size());
                    for (int i13 = 0; i13 < numberOfCameras; i13++) {
                        CameraInfo cameraInfo6 = arrayList.get(i13);
                        serializedData2.writeInt32(cameraInfo6.cameraId);
                        serializedData2.writeInt32(cameraInfo6.frontCamera);
                        int size3 = cameraInfo6.previewSizes.size();
                        serializedData2.writeInt32(size3);
                        for (int i14 = 0; i14 < size3; i14++) {
                            Size size4 = cameraInfo6.previewSizes.get(i14);
                            serializedData2.writeInt32(size4.mWidth);
                            serializedData2.writeInt32(size4.mHeight);
                        }
                        int size5 = cameraInfo6.pictureSizes.size();
                        serializedData2.writeInt32(size5);
                        for (int i15 = 0; i15 < size5; i15++) {
                            Size size6 = cameraInfo6.pictureSizes.get(i15);
                            serializedData2.writeInt32(size6.mWidth);
                            serializedData2.writeInt32(size6.mHeight);
                        }
                    }
                    sharedPreferences2.edit().putString("cameraCache", Base64.encodeToString(serializedData2.toByteArray(), 0)).commit();
                    serializedData2.cleanup();
                }
                this.cameraInfos = arrayList;
            }
            gl.c3(new nv0(this, (byte) 12));
        } catch (Exception e) {
            fa4.g(e, !"APP_PAUSED".equals(e.getMessage()));
            gl.c3(new rg(this, z, e, runnable, (byte) 3));
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
                fa4.g(e, true);
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
            gl.c3(runnable2);
        }
    }

    public static void lambda$openRound$9(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        Camera camera = cameraSession.cameraInfo.camera;
        try {
            if (w01.a) {
                fa4.b("start creating round camera session");
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
                for (int i = 0; i < supportedFlashModes.size(); i++) {
                    String str = supportedFlashModes.get(i);
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
                gl.c3(runnable2);
            }
            if (w01.a) {
                fa4.b("round camera session created");
            }
        } catch (Exception e) {
            cameraSession.cameraInfo.camera = null;
            if (camera != null) {
                camera.release();
            }
            fa4.g(e, true);
        }
    }

    public void lambda$recordVideo$12(ICameraView iCameraView, File file, boolean z, Runnable runnable) {
        iCameraView.startRecording(file, new x6c((byte) 7, this, z));
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$recordVideo$13(Object obj, ICameraView iCameraView, File file, boolean z, Runnable runnable) {
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
                        fa4.g(e, true);
                    }
                }
            }
            gl.c3(new z77(this, iCameraView, file, z, runnable, (byte) 5));
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public void lambda$recordVideo$14(Camera camera, CameraSession cameraSession, boolean z, File file, CameraInfo cameraInfo, VideoTakeCallback videoTakeCallback, Runnable runnable) {
        int i;
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
                    fa4.g(e, true);
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
                    Size chooseOptimalSize = chooseOptimalSize(cameraInfo.getPictureSizes(), 720, 480, new Size(16, 9), false);
                    if (Math.min(chooseOptimalSize.mHeight, chooseOptimalSize.mWidth) >= 720) {
                        i = 3500000;
                    } else {
                        i = 1800000;
                    }
                    this.recorder.setVideoEncodingBitRate(i);
                    this.recorder.setVideoSize(chooseOptimalSize.getWidth(), chooseOptimalSize.getHeight());
                    this.recorder.setOnInfoListener(this);
                    this.recorder.prepare();
                    this.recorder.start();
                    this.onVideoTakeCallback = videoTakeCallback;
                    this.recordedFile = file.getAbsolutePath();
                    if (runnable != null) {
                        gl.c3(runnable);
                    }
                } catch (Exception e2) {
                    this.recorder.release();
                    this.recorder = null;
                    fa4.g(e2, true);
                }
            } catch (Exception e3) {
                fa4.g(e3, true);
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
            } catch (Exception e2) {
                e = e2;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                fa4.g(e, true);
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
            } catch (Exception e2) {
                e = e2;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                fa4.g(e, true);
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
            fa4.g(e, true);
        }
    }

    public void lambda$stopVideoRecording$17(Object obj, boolean z, boolean z2) {
        try {
            MediaRecorder mediaRecorder = this.recorder;
            if (mediaRecorder != null) {
                this.recorder = null;
                try {
                    mediaRecorder.stop();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                try {
                    mediaRecorder.release();
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                Camera camera = cameraSession.cameraInfo.camera;
                if (camera != null) {
                    try {
                        camera.reconnect();
                        camera.startPreview();
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                    }
                    try {
                        cameraSession.stopVideoRecording();
                    } catch (Exception e4) {
                        fa4.g(e4, true);
                    }
                }
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode("off");
                    camera.setParameters(parameters);
                } catch (Exception e5) {
                    fa4.g(e5, true);
                }
                this.threadPool.execute(new q21(camera, cameraSession, (byte) 8));
            }
            if (!z && this.onVideoTakeCallback != null) {
                lambda$recordVideo$11(z2);
            } else {
                this.onVideoTakeCallback = null;
            }
        } catch (Exception unused) {
        }
    }

    public static void lambda$takePicture$6(java.io.File r13, org.telegram.messenger.camera.CameraInfo r14, boolean r15, boolean r16, defpackage.p8c r17, byte[] r18, android.hardware.Camera r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraController.lambda$takePicture$6(java.io.File, org.telegram.messenger.camera.CameraInfo, boolean, boolean, p8c, byte[], android.hardware.Camera):void");
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
            if (i2 > 0) {
                i4 = (i4 << 8) | (bArr[i] & 255);
                i += i3;
                i2 = i5;
            } else {
                return i4;
            }
        }
    }

    public static void r(CameraController cameraController, boolean z, Runnable runnable) {
        cameraController.lambda$initCamera$4(z, runnable);
    }

    public void addOnErrorListener(ErrorCallback errorCallback) {
        ArrayList<ErrorCallback> arrayList = this.errorCallbacks;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.errorCallbacks = arrayList;
        }
        arrayList.remove(errorCallback);
        this.errorCallbacks.add(errorCallback);
    }

    public void cancelOnInitRunnable(Runnable runnable) {
        this.onFinishCameraInitRunnables.remove(runnable);
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable, Runnable runnable2) {
        cameraSession.destroy();
        this.threadPool.execute(new s67(runnable, cameraSession, countDownLatch, runnable2, (byte) 21));
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public ArrayList<CameraInfo> getCameras() {
        return this.cameraInfos;
    }

    public Camera.ErrorCallback getErrorListener(final CameraSession cameraSession) {
        return new Camera.ErrorCallback() {
            @Override
            public final void onError(int i, Camera camera) {
                CameraController.this.lambda$getErrorListener$18(cameraSession, i, camera);
            }
        };
    }

    public boolean isCameraInitied() {
        if (this.cameraInitied && this.cameraInfos != null && !this.cameraInfos.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
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

    public void open(CameraSession cameraSession, SurfaceTexture surfaceTexture, Runnable runnable, Runnable runnable2) {
        if (cameraSession != null && surfaceTexture != null) {
            this.threadPool.execute(new b87(this, cameraSession, runnable2, surfaceTexture, runnable, (byte) 12));
        }
    }

    public void openRound(CameraSession cameraSession, SurfaceTexture surfaceTexture, Runnable runnable, Runnable runnable2) {
        if (cameraSession != null && surfaceTexture != null) {
            this.threadPool.execute(new s67(cameraSession, runnable2, surfaceTexture, runnable, (byte) 20));
        } else if (w01.a) {
            fa4.b("failed to open round " + cameraSession + " tex = " + surfaceTexture);
        }
    }

    public void recordVideo(Object obj, File file, boolean z, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView, boolean z2) {
        if (obj != null) {
            if (iCameraView != null) {
                this.recordingCurrentCameraView = iCameraView;
                this.onVideoTakeCallback = videoTakeCallback;
                this.recordedFile = file.getAbsolutePath();
                this.threadPool.execute(new z2a(this, obj, iCameraView, file, z2, runnable, (byte) 1));
            } else if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                CameraInfo cameraInfo = cameraSession.cameraInfo;
                this.threadPool.execute(new oo6(this, cameraInfo.camera, cameraSession, z, file, cameraInfo, videoTakeCallback, runnable));
            }
        }
    }

    public void removeOnErrorListener(ErrorCallback errorCallback) {
        ArrayList<ErrorCallback> arrayList = this.errorCallbacks;
        if (arrayList != null) {
            arrayList.remove(errorCallback);
        }
    }

    public void startPreview(Object obj) {
        if (obj != null && (obj instanceof CameraSession)) {
            this.threadPool.execute(new r91(this, (CameraSession) obj, (byte) 1));
        }
    }

    public void stopPreview(Object obj) {
        if (obj != null && (obj instanceof CameraSession)) {
            this.threadPool.execute(new r91(this, (CameraSession) obj, (byte) 0));
        }
    }

    public void stopVideoRecording(Object obj, boolean z, boolean z2) {
        ICameraView iCameraView = this.recordingCurrentCameraView;
        if (iCameraView != null) {
            iCameraView.stopRecording();
            this.recordingCurrentCameraView = null;
            return;
        }
        this.threadPool.execute(new s91(this, obj, z, z2, (byte) 0));
    }

    public boolean takePicture(final File file, final boolean z, Object obj, final p8c p8cVar) {
        if (obj != null && (obj instanceof CameraSession)) {
            CameraSession cameraSession = (CameraSession) obj;
            final CameraInfo cameraInfo = cameraSession.cameraInfo;
            final boolean isFlipFront = cameraSession.isFlipFront();
            try {
                cameraInfo.camera.takePicture(null, null, new Camera.PictureCallback() {
                    @Override
                    public final void onPictureTaken(byte[] bArr, Camera camera) {
                        CameraController.lambda$takePicture$6(file, cameraInfo, isFlipFront, z, p8cVar, bArr, camera);
                    }
                });
                return true;
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        return false;
    }

    public void stopVideoRecording(Object obj, boolean z) {
        stopVideoRecording(obj, z, true);
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable) {
        close(cameraSession, countDownLatch, runnable, null);
    }

    public void initCamera(Runnable runnable) {
        initCamera(runnable, false);
    }

    public void recordVideo(Object obj, File file, boolean z, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView) {
        recordVideo(obj, file, z, videoTakeCallback, runnable, iCameraView, true);
    }
}
