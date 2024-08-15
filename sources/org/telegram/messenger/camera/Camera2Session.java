package org.telegram.messenger.camera;

import android.annotation.TargetApi;
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

    public float getMinZoom() {
        return 1.0f;
    }

    public static Camera2Session create(boolean z, int i, int i2) {
        android.util.Size size;
        String str;
        String[] cameraIdList;
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Object obj;
        CameraCharacteristics.Key key2;
        Object obj2;
        CameraCharacteristics.Key key3;
        Object obj3;
        int width;
        int height;
        float f;
        CameraManager cameraManager;
        android.util.Size[] outputSizes;
        Context context = ApplicationLoader.applicationContext;
        CameraManager cameraManager2 = (CameraManager) context.getSystemService("camera");
        try {
            cameraIdList = cameraManager2.getCameraIdList();
            int i3 = 0;
            size = null;
            str = null;
            float f2 = 0.0f;
            while (i3 < cameraIdList.length) {
                try {
                    String str2 = cameraIdList[i3];
                    cameraCharacteristics = cameraManager2.getCameraCharacteristics(str2);
                    if (cameraCharacteristics != null) {
                        key = CameraCharacteristics.LENS_FACING;
                        obj = cameraCharacteristics.get(key);
                        if (((Integer) obj).intValue() == (!z)) {
                            key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                            obj2 = cameraCharacteristics.get(key2);
                            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) obj2;
                            key3 = CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE;
                            obj3 = cameraCharacteristics.get(key3);
                            android.util.Size size2 = (android.util.Size) obj3;
                            if (size2 == null) {
                                f = 0.0f;
                            } else {
                                width = size2.getWidth();
                                height = size2.getHeight();
                                f = width / height;
                            }
                            float f3 = i / i2;
                            cameraManager = cameraManager2;
                            if ((f3 >= 1.0f) != (f >= 1.0f)) {
                                f = 1.0f / f;
                            }
                            if ((f2 <= 0.0f || Math.abs(f3 - f2) > Math.abs(f3 - f)) && streamConfigurationMap != null && Build.VERSION.SDK_INT >= 23) {
                                outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                                android.util.Size chooseOptimalSize = chooseOptimalSize(outputSizes, i, i2, false);
                                if (chooseOptimalSize != null) {
                                    size = chooseOptimalSize;
                                    str = str2;
                                    f2 = f;
                                }
                                i3++;
                                cameraManager2 = cameraManager;
                            }
                            i3++;
                            cameraManager2 = cameraManager;
                        }
                    }
                    cameraManager = cameraManager2;
                    i3++;
                    cameraManager2 = cameraManager;
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
            return new Camera2Session(context, z, str, size);
        }
    }

    private Camera2Session(Context context, boolean z, String str, android.util.Size size) {
        int width;
        int height;
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Object obj;
        CameraCharacteristics.Key key2;
        Object obj2;
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
        width = size.getWidth();
        height = size.getHeight();
        this.imageReader = ImageReader.newInstance(width, height, 256, 1);
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.cameraManager = cameraManager;
        try {
            cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            this.cameraCharacteristics = cameraCharacteristics;
            key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
            obj = cameraCharacteristics.get(key);
            this.sensorSize = (Rect) obj;
            CameraCharacteristics cameraCharacteristics2 = this.cameraCharacteristics;
            key2 = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
            obj2 = cameraCharacteristics2.get(key2);
            Float f2 = (Float) obj2;
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

    public int getDisplayOrientation() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.Camera2Session.getDisplayOrientation():int");
    }

    private int getJpegOrientation() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.Camera2Session.getJpegOrientation():int");
    }

    public int getWorldAngle() {
        int jpegOrientation = getJpegOrientation() - getDisplayOrientation();
        return jpegOrientation < 0 ? jpegOrientation + 360 : jpegOrientation;
    }

    public int getCurrentOrientation() {
        return getJpegOrientation();
    }

    public void setZoom(float f) {
        CaptureRequest build;
        if (!isInitiated() || this.captureRequestBuilder == null || this.cameraDevice == null || this.sensorSize == null) {
            return;
        }
        this.currentZoom = Utilities.clamp(f, this.maxZoom, 1.0f);
        updateCaptureRequest();
        try {
            CameraCaptureSession cameraCaptureSession = this.captureSession;
            build = this.captureRequestBuilder.build();
            cameraCaptureSession.setRepeatingRequest(build, null, this.handler);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setFlash(boolean z) {
        if (this.flashing != z) {
            this.flashing = z;
            updateCaptureRequest();
        }
    }

    public boolean getFlash() {
        return this.flashing;
    }

    public float getZoom() {
        return this.currentZoom;
    }

    public float getMaxZoom() {
        return this.maxZoom;
    }

    public int getPreviewWidth() {
        int width;
        width = this.previewSize.getWidth();
        return width;
    }

    public int getPreviewHeight() {
        int height;
        height = this.previewSize.getHeight();
        return height;
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
        this.thread.quitSafely();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Camera2Session.this.lambda$destroy$3(runnable);
            }
        });
    }

    public void lambda$destroy$3(Runnable runnable) {
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
        CaptureRequest.Builder createCaptureRequest;
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        CaptureRequest build;
        CaptureRequest.Key key3;
        CaptureRequest.Key key4;
        CaptureRequest.Key key5;
        CaptureRequest.Key key6;
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice == null || this.surface == null || this.captureSession == null) {
            return;
        }
        try {
            int i2 = 1;
            if (this.recordingVideo) {
                i = 3;
            } else {
                i = this.scanningBarcode ? 2 : 1;
            }
            createCaptureRequest = cameraDevice.createCaptureRequest(i);
            this.captureRequestBuilder = createCaptureRequest;
            if (this.scanningBarcode) {
                key6 = CaptureRequest.CONTROL_SCENE_MODE;
                createCaptureRequest.set(key6, 16);
            } else if (this.nightMode) {
                key = CaptureRequest.CONTROL_SCENE_MODE;
                createCaptureRequest.set(key, Integer.valueOf(this.isFront ? 6 : 5));
            }
            CaptureRequest.Builder builder = this.captureRequestBuilder;
            key2 = CaptureRequest.FLASH_MODE;
            if (!this.flashing) {
                i2 = 0;
            } else if (this.recordingVideo) {
                i2 = 2;
            }
            builder.set(key2, Integer.valueOf(i2));
            if (this.recordingVideo) {
                CaptureRequest.Builder builder2 = this.captureRequestBuilder;
                key4 = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                builder2.set(key4, new Range(30, 60));
                CaptureRequest.Builder builder3 = this.captureRequestBuilder;
                key5 = CaptureRequest.CONTROL_CAPTURE_INTENT;
                builder3.set(key5, 3);
            }
            if (this.sensorSize != null && Math.abs(this.currentZoom - 1.0f) >= 0.01f) {
                int width = this.sensorSize.width() / 2;
                int height = this.sensorSize.height() / 2;
                int width2 = (int) ((this.sensorSize.width() * 0.5f) / this.currentZoom);
                int height2 = (int) ((this.sensorSize.height() * 0.5f) / this.currentZoom);
                this.cropRegion.set(width - width2, height - height2, width + width2, height + height2);
                CaptureRequest.Builder builder4 = this.captureRequestBuilder;
                key3 = CaptureRequest.SCALER_CROP_REGION;
                builder4.set(key3, this.cropRegion);
            }
            this.captureRequestBuilder.addTarget(this.surface);
            CameraCaptureSession cameraCaptureSession = this.captureSession;
            build = this.captureRequestBuilder.build();
            cameraCaptureSession.setRepeatingRequest(build, null, this.handler);
        } catch (Exception e) {
            FileLog.e("Camera2Sessions setRepeatingRequest error in updateCaptureRequest", e);
        }
    }

    public boolean takePicture(File file, Utilities.Callback<Integer> callback) {
        CaptureRequest.Builder createCaptureRequest;
        CaptureRequest.Key key;
        CaptureRequest build;
        CaptureRequest.Key key2;
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null && this.captureSession != null) {
            try {
                createCaptureRequest = cameraDevice.createCaptureRequest(2);
                int jpegOrientation = getJpegOrientation();
                key = CaptureRequest.JPEG_ORIENTATION;
                createCaptureRequest.set(key, Integer.valueOf(jpegOrientation));
                this.imageReader.setOnImageAvailableListener(new AnonymousClass3(file, callback, jpegOrientation), null);
                if (this.scanningBarcode) {
                    key2 = CaptureRequest.CONTROL_SCENE_MODE;
                    createCaptureRequest.set(key2, 16);
                }
                createCaptureRequest.addTarget(this.imageReader.getSurface());
                CameraCaptureSession cameraCaptureSession = this.captureSession;
                build = createCaptureRequest.build();
                cameraCaptureSession.capture(build, new CameraCaptureSession.CaptureCallback() {
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
        final int val$orientation;
        final Utilities.Callback val$whenDone;

        AnonymousClass3(File file, Utilities.Callback callback, int i) {
            this.val$file = file;
            this.val$whenDone = callback;
            this.val$orientation = i;
        }

        @Override
        public void onImageAvailable(android.media.ImageReader r5) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.Camera2Session.AnonymousClass3.onImageAvailable(android.media.ImageReader):void");
        }

        public static void lambda$onImageAvailable$0(Utilities.Callback callback, int i) {
            if (callback != null) {
                callback.run(Integer.valueOf(i));
            }
        }
    }

    public static android.util.Size chooseOptimalSize(android.util.Size[] sizeArr, int i, int i2, boolean z) {
        int height;
        int width;
        int height2;
        int width2;
        int width3;
        int height3;
        int width4;
        int height4;
        int height5;
        int width5;
        ArrayList arrayList = new ArrayList(sizeArr.length);
        ArrayList arrayList2 = new ArrayList(sizeArr.length);
        for (android.util.Size size : sizeArr) {
            if (z) {
                height5 = size.getHeight();
                if (height5 <= i2) {
                    width5 = size.getWidth();
                    if (width5 > i) {
                    }
                }
            }
            height = size.getHeight();
            width = size.getWidth();
            if (height == (width * i2) / i) {
                width4 = size.getWidth();
                if (width4 >= i) {
                    height4 = size.getHeight();
                    if (height4 >= i2) {
                        arrayList.add(size);
                    }
                }
            }
            height2 = size.getHeight();
            width2 = size.getWidth();
            if (height2 * width2 <= i * i2 * 4) {
                width3 = size.getWidth();
                if (width3 >= i) {
                    height3 = size.getHeight();
                    if (height3 >= i2) {
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

    public static class CompareSizesByArea implements Comparator<android.util.Size> {
        CompareSizesByArea() {
        }

        @Override
        public int compare(android.util.Size size, android.util.Size size2) {
            int width;
            int height;
            int width2;
            int height2;
            width = size.getWidth();
            height = size.getHeight();
            long j = width * height;
            width2 = size2.getWidth();
            long j2 = width2;
            height2 = size2.getHeight();
            return Long.signum(j - (j2 * height2));
        }
    }
}
