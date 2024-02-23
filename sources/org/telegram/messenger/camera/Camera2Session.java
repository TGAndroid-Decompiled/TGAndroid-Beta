package org.telegram.messenger.camera;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.Camera2Session;
@TargetApi(21)
public class Camera2Session {
    private CameraCharacteristics cameraCharacteristics;
    private CameraDevice cameraDevice;
    public final String cameraId;
    private final CameraManager cameraManager;
    private final CameraDevice.StateCallback cameraStateCallback;
    private CaptureRequest.Builder captureRequestBuilder;
    private CameraCaptureSession captureSession;
    private final CameraCaptureSession.StateCallback captureStateCallback;
    private Runnable doneCallback;
    private Handler handler;
    private ImageReader imageReader;
    private boolean isClosed;
    private boolean isError;
    private final boolean isFront;
    private boolean isSuccess;
    private long lastTime;
    private float maxZoom;
    private boolean nightMode;
    private final android.util.Size previewSize;
    private boolean recordingVideo;
    private boolean scanningBarcode;
    private Rect sensorSize;
    private Surface surface;
    private SurfaceTexture surfaceTexture;
    private HandlerThread thread;
    private float currentZoom = 1.0f;
    private boolean opened = false;
    private final Rect cropRegion = new Rect();

    public int getCurrentOrientation() {
        return 0;
    }

    public int getDisplayOrientation() {
        return 0;
    }

    public float getMinZoom() {
        return 1.0f;
    }

    public int getWorldAngle() {
        return 0;
    }

    public static Camera2Session create(boolean z, boolean z2, int i, int i2) {
        android.util.Size size;
        String str;
        CameraManager cameraManager;
        Context context = ApplicationLoader.applicationContext;
        CameraManager cameraManager2 = (CameraManager) context.getSystemService("camera");
        try {
            String[] cameraIdList = cameraManager2.getCameraIdList();
            float f = 0.0f;
            int i3 = 0;
            size = null;
            str = null;
            float f2 = 0.0f;
            while (i3 < cameraIdList.length) {
                try {
                    String str2 = cameraIdList[i3];
                    CameraCharacteristics cameraCharacteristics = cameraManager2.getCameraCharacteristics(str2);
                    if (cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == (!z2)) {
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        android.util.Size size2 = (android.util.Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
                        float width = size2 == null ? 0.0f : size2.getWidth() / size2.getHeight();
                        android.util.Size size3 = z ? new android.util.Size(1, 1) : new android.util.Size(9, 16);
                        int i4 = z ? MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize : i;
                        int i5 = z ? MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize : i2;
                        if (f2 > f) {
                            cameraManager = cameraManager2;
                            if (Math.abs((size3.getWidth() / size3.getHeight()) - f2) > Math.abs((size3.getWidth() / size3.getHeight()) - width)) {
                            }
                            i3++;
                            cameraManager2 = cameraManager;
                            f = 0.0f;
                        } else {
                            cameraManager = cameraManager2;
                        }
                        if (streamConfigurationMap != null && Build.VERSION.SDK_INT >= 23) {
                            android.util.Size chooseOptimalSize = chooseOptimalSize(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), i4, i5, size3, false);
                            if (chooseOptimalSize != null) {
                                size = chooseOptimalSize;
                                str = str2;
                                f2 = width;
                            }
                            i3++;
                            cameraManager2 = cameraManager;
                            f = 0.0f;
                        }
                        i3++;
                        cameraManager2 = cameraManager;
                        f = 0.0f;
                    }
                    cameraManager = cameraManager2;
                    i3++;
                    cameraManager2 = cameraManager;
                    f = 0.0f;
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    return str == null ? null : null;
                }
            }
        } catch (Exception e2) {
            e = e2;
            size = null;
            str = null;
        }
        if (str == null && size != null) {
            return new Camera2Session(context, z2, str, size);
        }
    }

    private Camera2Session(Context context, boolean z, String str, android.util.Size size) {
        float f = 1.0f;
        this.maxZoom = 1.0f;
        HandlerThread handlerThread = new HandlerThread("tg_camera2");
        this.thread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.thread.getLooper());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(str);
        this.cameraStateCallback = anonymousClass1;
        this.captureStateCallback = new AnonymousClass2(str);
        this.isFront = z;
        this.cameraId = str;
        this.previewSize = size;
        this.lastTime = System.currentTimeMillis();
        this.imageReader = ImageReader.newInstance(size.getWidth(), size.getHeight(), LiteMode.FLAG_CHAT_BLUR, 1);
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.cameraManager = cameraManager;
        try {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            this.cameraCharacteristics = cameraCharacteristics;
            this.sensorSize = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            Float f2 = (Float) this.cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f2 != null && f2.floatValue() >= 1.0f) {
                f = f2.floatValue();
            }
            this.maxZoom = f;
            cameraManager.openCamera(str, anonymousClass1, this.handler);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Camera2Session.this.lambda$new$0();
                }
            });
        }
    }

    public class AnonymousClass1 extends CameraDevice.StateCallback {
        final String val$cameraId;

        AnonymousClass1(String str) {
            this.val$cameraId = str;
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
            Camera2Session.this.cameraDevice = cameraDevice;
            Camera2Session.this.lastTime = System.currentTimeMillis();
            FileLog.d("Camera2Session camera #" + this.val$cameraId + " opened");
            Camera2Session.this.checkOpen();
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2Session.this.cameraDevice = cameraDevice;
            FileLog.d("Camera2Session camera #" + this.val$cameraId + " disconnected");
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i) {
            Camera2Session.this.cameraDevice = cameraDevice;
            FileLog.e("Camera2Session camera #" + this.val$cameraId + " received " + i + " error");
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Camera2Session.AnonymousClass1.this.lambda$onError$0();
                }
            });
        }

        public void lambda$onError$0() {
            Camera2Session.this.isError = true;
        }
    }

    public class AnonymousClass2 extends CameraCaptureSession.StateCallback {
        final String val$cameraId;

        AnonymousClass2(String str) {
            this.val$cameraId = str;
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.captureSession = cameraCaptureSession;
            FileLog.e("Camera2Session camera #" + this.val$cameraId + " capture session configured");
            Camera2Session.this.lastTime = System.currentTimeMillis();
            try {
                Camera2Session.this.updateCaptureRequest();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Camera2Session.AnonymousClass2.this.lambda$onConfigured$0();
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$onConfigured$0() {
            Camera2Session.this.isSuccess = true;
            if (Camera2Session.this.doneCallback != null) {
                Camera2Session.this.doneCallback.run();
                Camera2Session.this.doneCallback = null;
            }
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.captureSession = cameraCaptureSession;
            FileLog.e("Camera2Session camera #" + this.val$cameraId + " capture session failed to configure");
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Camera2Session.AnonymousClass2.this.lambda$onConfigureFailed$1();
                }
            });
        }

        public void lambda$onConfigureFailed$1() {
            Camera2Session.this.isError = true;
        }
    }

    public void lambda$new$0() {
        this.isError = true;
    }

    public void whenDone(Runnable runnable) {
        if (isInitiated()) {
            runnable.run();
            this.doneCallback = null;
            return;
        }
        this.doneCallback = runnable;
    }

    public void open(final SurfaceTexture surfaceTexture) {
        this.handler.post(new Runnable() {
            @Override
            public final void run() {
                Camera2Session.this.lambda$open$1(surfaceTexture);
            }
        });
    }

    public void lambda$open$1(SurfaceTexture surfaceTexture) {
        this.surfaceTexture = surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(getPreviewWidth(), getPreviewHeight());
        }
        checkOpen();
    }

    public void checkOpen() {
        if (this.opened || this.surfaceTexture == null || this.cameraDevice == null) {
            return;
        }
        this.opened = true;
        this.surface = new Surface(this.surfaceTexture);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.surface);
            arrayList.add(this.imageReader.getSurface());
            this.cameraDevice.createCaptureSession(arrayList, this.captureStateCallback, null);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Camera2Session.this.lambda$checkOpen$2();
                }
            });
        }
    }

    public void lambda$checkOpen$2() {
        this.isError = true;
    }

    public boolean isInitiated() {
        return (this.isError || !this.isSuccess || this.isClosed) ? false : true;
    }

    public void setZoom(float f) {
        if (!isInitiated() || this.captureRequestBuilder == null || this.cameraDevice == null || this.sensorSize == null) {
            return;
        }
        this.currentZoom = Utilities.clamp(f, this.maxZoom, 1.0f);
        updateCaptureRequest();
        try {
            this.captureSession.setRepeatingRequest(this.captureRequestBuilder.build(), null, this.handler);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public float getZoom() {
        return this.currentZoom;
    }

    public float getMaxZoom() {
        return this.maxZoom;
    }

    public int getPreviewWidth() {
        return this.previewSize.getWidth();
    }

    public int getPreviewHeight() {
        return this.previewSize.getHeight();
    }

    public void destroy(boolean z) {
        destroy(z, null);
    }

    public void destroy(boolean z, final Runnable runnable) {
        this.isClosed = true;
        if (z) {
            this.handler.post(new Runnable() {
                @Override
                public final void run() {
                    Camera2Session.this.lambda$destroy$4(runnable);
                }
            });
            return;
        }
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            imageReader.close();
            this.imageReader = null;
        }
        this.thread.quitSafely();
        try {
            this.thread.join();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$destroy$4(final Runnable runnable) {
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            imageReader.close();
            this.imageReader = null;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Camera2Session.this.lambda$destroy$3(runnable);
            }
        });
    }

    public void lambda$destroy$3(Runnable runnable) {
        this.thread.quitSafely();
        try {
            this.thread.join();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setRecordingVideo(boolean z) {
        if (this.recordingVideo != z) {
            this.recordingVideo = z;
            updateCaptureRequest();
        }
    }

    public void setScanningBarcode(boolean z) {
        if (this.scanningBarcode != z) {
            this.scanningBarcode = z;
            updateCaptureRequest();
        }
    }

    public void setNightMode(boolean z) {
        if (this.nightMode != z) {
            this.nightMode = z;
            updateCaptureRequest();
        }
    }

    public void updateCaptureRequest() {
        int i;
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice == null || this.surface == null || this.captureSession == null) {
            return;
        }
        try {
            if (this.recordingVideo) {
                i = 3;
            } else {
                i = this.scanningBarcode ? 2 : 1;
            }
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(i);
            this.captureRequestBuilder = createCaptureRequest;
            if (this.scanningBarcode) {
                createCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, 16);
            } else if (this.nightMode) {
                createCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(this.isFront ? 6 : 5));
            }
            if (this.sensorSize != null && Math.abs(this.currentZoom - 1.0f) >= 0.01f) {
                int width = this.sensorSize.width() / 2;
                int height = this.sensorSize.height() / 2;
                int width2 = (int) ((this.sensorSize.width() * 0.5f) / this.currentZoom);
                int height2 = (int) ((this.sensorSize.height() * 0.5f) / this.currentZoom);
                this.cropRegion.set(width - width2, height - height2, width + width2, height + height2);
                this.captureRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, this.cropRegion);
            }
            this.captureRequestBuilder.addTarget(this.surface);
            this.captureSession.setRepeatingRequest(this.captureRequestBuilder.build(), null, this.handler);
        } catch (Exception e) {
            FileLog.e("Camera2Sessions setRepeatingRequest error in updateCaptureRequest", e);
        }
    }

    public boolean takePicture(File file, Utilities.Callback<Integer> callback) {
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null && this.captureSession != null) {
            try {
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
                this.imageReader.setOnImageAvailableListener(new AnonymousClass3(file, callback), null);
                if (this.scanningBarcode) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, 16);
                }
                createCaptureRequest.addTarget(this.imageReader.getSurface());
                this.captureSession.capture(createCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() {
                    @Override
                    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                    }

                    @Override
                    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                        super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                    }

                    @Override
                    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                    }

                    @Override
                    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    }

                    @Override
                    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                        super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    }

                    @Override
                    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                        super.onCaptureSequenceAborted(cameraCaptureSession, i);
                    }

                    @Override
                    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                        super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                    }
                }, null);
                return true;
            } catch (Exception e) {
                FileLog.e("Camera2Sessions takePicture error", e);
            }
        }
        return false;
    }

    class AnonymousClass3 implements ImageReader.OnImageAvailableListener {
        final File val$file;
        final Utilities.Callback val$whenDone;

        AnonymousClass3(File file, Utilities.Callback callback) {
            this.val$file = file;
            this.val$whenDone = callback;
        }

        @Override
        public void onImageAvailable(android.media.ImageReader r5) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.Camera2Session.AnonymousClass3.onImageAvailable(android.media.ImageReader):void");
        }

        public static void lambda$onImageAvailable$0(Utilities.Callback callback) {
            if (callback != null) {
                callback.run(0);
            }
        }
    }

    public static android.util.Size chooseOptimalSize(android.util.Size[] sizeArr, int i, int i2, android.util.Size size, boolean z) {
        ArrayList arrayList = new ArrayList(sizeArr.length);
        ArrayList arrayList2 = new ArrayList(sizeArr.length);
        int width = size.getWidth();
        int height = size.getHeight();
        for (android.util.Size size2 : sizeArr) {
            if (!z || (size2.getHeight() <= i2 && size2.getWidth() <= i)) {
                if (size2.getHeight() == (size2.getWidth() * height) / width && size2.getWidth() >= i && size2.getHeight() >= i2) {
                    arrayList.add(size2);
                } else if (size2.getHeight() * size2.getWidth() <= i * i2 * 4 && size2.getWidth() >= i && size2.getHeight() >= i2) {
                    arrayList2.add(size2);
                }
            }
        }
        if (arrayList.size() > 0) {
            return (android.util.Size) Collections.min(arrayList, new CompareSizesByArea());
        }
        if (arrayList2.size() > 0) {
            return (android.util.Size) Collections.min(arrayList2, new CompareSizesByArea());
        }
        return (android.util.Size) Collections.max(Arrays.asList(sizeArr), new CompareSizesByArea());
    }

    public static class CompareSizesByArea implements Comparator<android.util.Size> {
        CompareSizesByArea() {
        }

        @Override
        public int compare(android.util.Size size, android.util.Size size2) {
            return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }
}
