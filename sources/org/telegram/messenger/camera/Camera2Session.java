package org.telegram.messenger.camera;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.view.Surface;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
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
    private boolean flashing;
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

    public class AnonymousClass1 extends CameraDevice.StateCallback {
        final String val$cameraId;

        public AnonymousClass1(String str) {
            Camera2Session.this = r1;
            this.val$cameraId = str;
        }

        public void lambda$onError$0() {
            Camera2Session.this.isError = true;
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2Session.this.cameraDevice = cameraDevice;
            FileLog.d("Camera2Session camera #" + this.val$cameraId + " disconnected");
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i9) {
            Camera2Session.this.cameraDevice = cameraDevice;
            FileLog.e("Camera2Session camera #" + this.val$cameraId + " received " + i9 + " error");
            AndroidUtilities.runOnUIThread(new c(this, 0));
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
            Camera2Session.this.cameraDevice = cameraDevice;
            Camera2Session.this.lastTime = System.currentTimeMillis();
            FileLog.d("Camera2Session camera #" + this.val$cameraId + " opened");
            Camera2Session.this.checkOpen();
        }
    }

    public class AnonymousClass2 extends CameraCaptureSession.StateCallback {
        final String val$cameraId;

        public AnonymousClass2(String str) {
            Camera2Session.this = r1;
            this.val$cameraId = str;
        }

        public void lambda$onConfigureFailed$1() {
            Camera2Session.this.isError = true;
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
            AndroidUtilities.runOnUIThread(new d(this, 1));
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.captureSession = cameraCaptureSession;
            FileLog.e("Camera2Session camera #" + this.val$cameraId + " capture session configured");
            Camera2Session.this.lastTime = System.currentTimeMillis();
            try {
                Camera2Session.this.updateCaptureRequest();
                AndroidUtilities.runOnUIThread(new d(this, 0));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public class AnonymousClass3 implements ImageReader.OnImageAvailableListener {
        final File val$file;
        final int val$orientation;
        final Utilities.Callback val$whenDone;

        public AnonymousClass3(File file, Utilities.Callback callback, int i9) {
            Camera2Session.this = r1;
            this.val$file = file;
            this.val$whenDone = callback;
            this.val$orientation = i9;
        }

        public static void lambda$onImageAvailable$0(Utilities.Callback callback, int i9) {
            if (callback != null) {
                callback.run(Integer.valueOf(i9));
            }
        }

        @Override
        public void onImageAvailable(android.media.ImageReader r5) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.Camera2Session.AnonymousClass3.onImageAvailable(android.media.ImageReader):void");
        }
    }

    public static class CompareSizesByArea implements Comparator<android.util.Size> {
        @Override
        public int compare(android.util.Size size, android.util.Size size2) {
            return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }

    private Camera2Session(Context context, boolean z10, String str, android.util.Size size) {
        float f10 = 1.0f;
        this.maxZoom = 1.0f;
        HandlerThread handlerThread = new HandlerThread("tg_camera2");
        this.thread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.thread.getLooper());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(str);
        this.cameraStateCallback = anonymousClass1;
        this.captureStateCallback = new AnonymousClass2(str);
        this.isFront = z10;
        this.cameraId = str;
        this.previewSize = size;
        this.lastTime = System.currentTimeMillis();
        this.imageReader = ImageReader.newInstance(size.getWidth(), size.getHeight(), 256, 1);
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.cameraManager = cameraManager;
        try {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            this.cameraCharacteristics = cameraCharacteristics;
            this.sensorSize = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            Float f11 = (Float) this.cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f11 != null && f11.floatValue() >= 1.0f) {
                f10 = f11.floatValue();
            }
            this.maxZoom = f10;
            cameraManager.openCamera(str, anonymousClass1, this.handler);
        } catch (Exception e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new a(this, 0));
        }
    }

    public void checkOpen() {
        if (!this.opened && this.surfaceTexture != null && this.cameraDevice != null) {
            this.opened = true;
            this.surface = new Surface(this.surfaceTexture);
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.surface);
                arrayList.add(this.imageReader.getSurface());
                this.cameraDevice.createCaptureSession(arrayList, this.captureStateCallback, null);
            } catch (Exception e10) {
                FileLog.e(e10);
                AndroidUtilities.runOnUIThread(new a(this, 1));
            }
        }
    }

    public static android.util.Size chooseOptimalSize(android.util.Size[] sizeArr, int i9, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(sizeArr.length);
        ArrayList arrayList2 = new ArrayList(sizeArr.length);
        for (android.util.Size size : sizeArr) {
            if (!z10 || (size.getHeight() <= i10 && size.getWidth() <= i9)) {
                if (size.getHeight() == (size.getWidth() * i10) / i9 && size.getWidth() >= i9 && size.getHeight() >= i10) {
                    arrayList.add(size);
                } else {
                    if (size.getWidth() * size.getHeight() <= i9 * i10 * 4 && size.getWidth() >= i9 && size.getHeight() >= i10) {
                        arrayList2.add(size);
                    }
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

    public static Camera2Session create(boolean z10, int i9, int i10) {
        Camera2Session camera2Session;
        android.util.Size size;
        String str;
        String[] cameraIdList;
        android.util.Size size2;
        float width;
        boolean z11;
        boolean z12;
        Context context = ApplicationLoader.applicationContext;
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            size = null;
            str = null;
            float f10 = 0.0f;
            for (String str2 : cameraManager.getCameraIdList()) {
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                    if (cameraCharacteristics != null) {
                        camera2Session = null;
                        if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == (!z10)) {
                            try {
                                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                                if (((android.util.Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE)) == null) {
                                    width = 0.0f;
                                } else {
                                    width = size2.getWidth() / size2.getHeight();
                                }
                                float f11 = i9 / i10;
                                if (f11 >= 1.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (width >= 1.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z11 != z12) {
                                    width = 1.0f / width;
                                }
                                if (f10 > 0.0f) {
                                    if (Math.abs(f11 - f10) > Math.abs(f11 - width)) {
                                    }
                                }
                                if (streamConfigurationMap != null && Build.VERSION.SDK_INT >= 23) {
                                    android.util.Size chooseOptimalSize = chooseOptimalSize(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), i9, i10, false);
                                    if (chooseOptimalSize != null) {
                                        size = chooseOptimalSize;
                                        str = str2;
                                        f10 = width;
                                    }
                                }
                            } catch (Exception e10) {
                                e = e10;
                                FileLog.e(e);
                                if (str == null) {
                                }
                                return camera2Session;
                            }
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    camera2Session = null;
                }
            }
            camera2Session = null;
        } catch (Exception e12) {
            e = e12;
            camera2Session = null;
            size = null;
            str = null;
        }
        if (str == null && size != null) {
            return new Camera2Session(context, z10, str, size);
        }
        return camera2Session;
    }

    private int getJpegOrientation() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.Camera2Session.getJpegOrientation():int");
    }

    public void lambda$checkOpen$2() {
        this.isError = true;
    }

    public void lambda$destroy$3(Runnable runnable) {
        try {
            this.thread.join();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$destroy$4(Runnable runnable) {
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
        AndroidUtilities.runOnUIThread(new b(this, runnable, 1));
    }

    public void lambda$new$0() {
        this.isError = true;
    }

    public void lambda$open$1(SurfaceTexture surfaceTexture) {
        this.surfaceTexture = surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(getPreviewWidth(), getPreviewHeight());
        }
        checkOpen();
    }

    public void updateCaptureRequest() {
        int i9;
        int i10;
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null && this.surface != null && this.captureSession != null) {
            try {
                int i11 = 1;
                if (this.recordingVideo) {
                    i9 = 3;
                } else if (this.scanningBarcode) {
                    i9 = 2;
                } else {
                    i9 = 1;
                }
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(i9);
                this.captureRequestBuilder = createCaptureRequest;
                if (this.scanningBarcode) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, 16);
                } else if (this.nightMode) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_SCENE_MODE;
                    if (this.isFront) {
                        i10 = 6;
                    } else {
                        i10 = 5;
                    }
                    createCaptureRequest.set(key, Integer.valueOf(i10));
                }
                CaptureRequest.Builder builder = this.captureRequestBuilder;
                CaptureRequest.Key key2 = CaptureRequest.FLASH_MODE;
                if (this.flashing) {
                    if (this.recordingVideo) {
                        i11 = 2;
                    }
                } else {
                    i11 = 0;
                }
                builder.set(key2, Integer.valueOf(i11));
                if (this.recordingVideo) {
                    this.captureRequestBuilder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(30, 60));
                    this.captureRequestBuilder.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
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
            } catch (Exception e10) {
                FileLog.e("Camera2Sessions setRepeatingRequest error in updateCaptureRequest", e10);
            }
        }
    }

    public void destroy(boolean z10) {
        destroy(z10, null);
    }

    public int getCurrentOrientation() {
        return getJpegOrientation();
    }

    public int getDisplayOrientation() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.Camera2Session.getDisplayOrientation():int");
    }

    public boolean getFlash() {
        return this.flashing;
    }

    public float getMaxZoom() {
        return this.maxZoom;
    }

    public float getMinZoom() {
        return 1.0f;
    }

    public int getPreviewHeight() {
        return this.previewSize.getHeight();
    }

    public int getPreviewWidth() {
        return this.previewSize.getWidth();
    }

    public int getWorldAngle() {
        int jpegOrientation = getJpegOrientation() - getDisplayOrientation();
        if (jpegOrientation < 0) {
            return jpegOrientation + 360;
        }
        return jpegOrientation;
    }

    public float getZoom() {
        return this.currentZoom;
    }

    public boolean isInitiated() {
        if (!this.isError && this.isSuccess && !this.isClosed) {
            return true;
        }
        return false;
    }

    public void open(SurfaceTexture surfaceTexture) {
        this.handler.post(new s(1, this, surfaceTexture));
    }

    public void setFlash(boolean z10) {
        if (this.flashing != z10) {
            this.flashing = z10;
            updateCaptureRequest();
        }
    }

    public void setNightMode(boolean z10) {
        if (this.nightMode != z10) {
            this.nightMode = z10;
            updateCaptureRequest();
        }
    }

    public void setRecordingVideo(boolean z10) {
        if (this.recordingVideo != z10) {
            this.recordingVideo = z10;
            updateCaptureRequest();
        }
    }

    public void setScanningBarcode(boolean z10) {
        if (this.scanningBarcode != z10) {
            this.scanningBarcode = z10;
            updateCaptureRequest();
        }
    }

    public void setZoom(float f10) {
        if (isInitiated() && this.captureRequestBuilder != null && this.cameraDevice != null && this.sensorSize != null) {
            this.currentZoom = Utilities.clamp(f10, this.maxZoom, 1.0f);
            updateCaptureRequest();
            try {
                this.captureSession.setRepeatingRequest(this.captureRequestBuilder.build(), null, this.handler);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public boolean takePicture(File file, Utilities.Callback<Integer> callback) {
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null && this.captureSession != null) {
            try {
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
                int jpegOrientation = getJpegOrientation();
                createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(jpegOrientation));
                this.imageReader.setOnImageAvailableListener(new AnonymousClass3(file, callback, jpegOrientation), null);
                if (this.scanningBarcode) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, 16);
                }
                createCaptureRequest.addTarget(this.imageReader.getSurface());
                this.captureSession.capture(createCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() {
                    {
                        Camera2Session.this = this;
                    }
                }, null);
                return true;
            } catch (Exception e10) {
                FileLog.e("Camera2Sessions takePicture error", e10);
            }
        }
        return false;
    }

    public void whenDone(Runnable runnable) {
        if (isInitiated()) {
            runnable.run();
            this.doneCallback = null;
            return;
        }
        this.doneCallback = runnable;
    }

    public void destroy(boolean z10, Runnable runnable) {
        this.isClosed = true;
        if (z10) {
            this.handler.post(new b(this, runnable, 0));
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }
}
