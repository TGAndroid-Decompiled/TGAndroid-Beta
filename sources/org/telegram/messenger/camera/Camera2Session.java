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
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.view.Surface;
import android.view.WindowManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
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

    public float getMinZoom() {
        return 1.0f;
    }

    public static Camera2Session create(boolean z, int i, int i2) {
        Camera2Session camera2Session;
        String str;
        android.util.Size size;
        Context context = ApplicationLoader.applicationContext;
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            str = null;
            size = null;
            float f = 0.0f;
            for (String str2 : cameraManager.getCameraIdList()) {
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                    if (cameraCharacteristics != null) {
                        camera2Session = null;
                        if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == (!z)) {
                            try {
                                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                                android.util.Size size2 = (android.util.Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
                                float width = size2 == null ? 0.0f : size2.getWidth() / size2.getHeight();
                                float f2 = i / i2;
                                if ((f2 >= 1.0f) != (width >= 1.0f)) {
                                    width = 1.0f / width;
                                }
                                if (f <= 0.0f || Math.abs(f2 - f) > Math.abs(f2 - width)) {
                                    if (streamConfigurationMap != null && Build.VERSION.SDK_INT >= 23) {
                                        android.util.Size sizeChooseOptimalSize = chooseOptimalSize(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), i, i2, false);
                                        if (sizeChooseOptimalSize != null) {
                                            size = sizeChooseOptimalSize;
                                            str = str2;
                                            f = width;
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                FileLog.e(e);
                                if (str != null) {
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    camera2Session = null;
                }
            }
            camera2Session = null;
        } catch (Exception e3) {
            e = e3;
            camera2Session = null;
            str = null;
            size = null;
        }
        return (str != null || size == null) ? camera2Session : new Camera2Session(context, z, str, size);
    }

    private Camera2Session(Context context, boolean z, String str, android.util.Size size) {
        float fFloatValue = 1.0f;
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
        this.imageReader = ImageReader.newInstance(size.getWidth(), size.getHeight(), 256, 1);
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.cameraManager = cameraManager;
        try {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            this.cameraCharacteristics = cameraCharacteristics;
            this.sensorSize = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            Float f = (Float) this.cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f != null && f.floatValue() >= 1.0f) {
                fFloatValue = f.floatValue();
            }
            this.maxZoom = fFloatValue;
            cameraManager.openCamera(str, anonymousClass1, this.handler);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.isError = true;
                }
            });
        }
    }

    class AnonymousClass1 extends CameraDevice.StateCallback {
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
                    Camera2Session.this.isError = true;
                }
            });
        }
    }

    class AnonymousClass2 extends CameraCaptureSession.StateCallback {
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
                        Camera2Session.AnonymousClass2.$r8$lambda$nwjxHiGomPSPXJIpYCIMnSMskdo(this.f$0);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static void $r8$lambda$nwjxHiGomPSPXJIpYCIMnSMskdo(AnonymousClass2 anonymousClass2) {
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
                    Camera2Session.this.isError = true;
                }
            });
        }
    }

    public void whenDone(Runnable runnable) {
        if (isInitiated()) {
            runnable.run();
            this.doneCallback = null;
        } else {
            this.doneCallback = runnable;
        }
    }

    public void open(final SurfaceTexture surfaceTexture) {
        this.handler.post(new Runnable() {
            @Override
            public final void run() {
                Camera2Session.m1095$r8$lambda$9XvuwtWfJlNKuRGR6prp1HeyQ(this.f$0, surfaceTexture);
            }
        });
    }

    public static void m1095$r8$lambda$9XvuwtWfJlNKuRGR6prp1HeyQ(Camera2Session camera2Session, SurfaceTexture surfaceTexture) {
        camera2Session.surfaceTexture = surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(camera2Session.getPreviewWidth(), camera2Session.getPreviewHeight());
        }
        camera2Session.checkOpen();
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
                    this.f$0.isError = true;
                }
            });
        }
    }

    public boolean isInitiated() {
        return (this.isError || !this.isSuccess || this.isClosed) ? false : true;
    }

    public int getDisplayOrientation() {
        int i;
        try {
            Context context = ApplicationLoader.applicationContext;
            if (context == null) {
                return 0;
            }
            int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
            if (rotation == 0) {
                i = 0;
            } else if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation != 3) {
                i = 0;
            } else {
                i = 270;
            }
            Integer num = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            if (this.isFront) {
                return (360 - ((num.intValue() + i) % 360)) % 360;
            }
            return ((num.intValue() - i) + 360) % 360;
        } catch (Exception e) {
            FileLog.e(e);
            return 0;
        }
    }

    private int getJpegOrientation() {
        int i;
        try {
            Context context = ApplicationLoader.applicationContext;
            if (context == null) {
                return 0;
            }
            int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
            if (rotation == 0) {
                i = 0;
            } else if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation != 3) {
                i = 0;
            } else {
                i = 270;
            }
            Integer num = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            if (this.isFront) {
                return (360 - ((num.intValue() + i) % 360)) % 360;
            }
            return ((num.intValue() - i) + 360) % 360;
        } catch (Exception e) {
            FileLog.e(e);
            return 0;
        }
    }

    public int getWorldAngle() {
        int jpegOrientation = getJpegOrientation() - getDisplayOrientation();
        return jpegOrientation < 0 ? jpegOrientation + 360 : jpegOrientation;
    }

    public int getCurrentOrientation() {
        return getJpegOrientation();
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
                    Camera2Session.$r8$lambda$rlsvOa_i09a9BhBZVJLhgISAAYM(this.f$0, runnable);
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

    public static void $r8$lambda$rlsvOa_i09a9BhBZVJLhgISAAYM(final Camera2Session camera2Session, final Runnable runnable) {
        CameraCaptureSession cameraCaptureSession = camera2Session.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            camera2Session.captureSession = null;
        }
        CameraDevice cameraDevice = camera2Session.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            camera2Session.cameraDevice = null;
        }
        ImageReader imageReader = camera2Session.imageReader;
        if (imageReader != null) {
            imageReader.close();
            camera2Session.imageReader = null;
        }
        camera2Session.thread.quitSafely();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Camera2Session.$r8$lambda$RQeESMtgykQCBrnxVH9Q0FUcf_M(this.f$0, runnable);
            }
        });
    }

    public static void $r8$lambda$RQeESMtgykQCBrnxVH9Q0FUcf_M(Camera2Session camera2Session, Runnable runnable) {
        camera2Session.getClass();
        try {
            camera2Session.thread.join();
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
            int i2 = 1;
            if (this.recordingVideo) {
                i = 3;
            } else {
                i = this.scanningBarcode ? 2 : 1;
            }
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
            this.captureRequestBuilder = builderCreateCaptureRequest;
            if (this.scanningBarcode) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, 16);
            } else if (this.nightMode) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(this.isFront ? 6 : 5));
            }
            CaptureRequest.Builder builder = this.captureRequestBuilder;
            CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
            if (!this.flashing) {
                i2 = 0;
            } else if (this.recordingVideo) {
                i2 = 2;
            }
            builder.set(key, Integer.valueOf(i2));
            if (this.recordingVideo) {
                this.captureRequestBuilder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(30, 60));
                this.captureRequestBuilder.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
            }
            if (this.sensorSize != null && Math.abs(this.currentZoom - 1.0f) >= 0.01f) {
                int iWidth = this.sensorSize.width() / 2;
                int iHeight = this.sensorSize.height() / 2;
                int iWidth2 = (int) ((this.sensorSize.width() * 0.5f) / this.currentZoom);
                int iHeight2 = (int) ((this.sensorSize.height() * 0.5f) / this.currentZoom);
                this.cropRegion.set(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
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
                CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(2);
                int jpegOrientation = getJpegOrientation();
                builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(jpegOrientation));
                this.imageReader.setOnImageAvailableListener(new AnonymousClass3(file, callback, jpegOrientation), null);
                if (this.scanningBarcode) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, 16);
                }
                builderCreateCaptureRequest.addTarget(this.imageReader.getSurface());
                this.captureSession.capture(builderCreateCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() {
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
        public void onImageAvailable(ImageReader imageReader) throws Throwable {
            FileOutputStream fileOutputStream;
            Throwable th;
            IOException e;
            Image imageAcquireLatestImage = imageReader.acquireLatestImage();
            ByteBuffer buffer = imageAcquireLatestImage.getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            try {
                try {
                    fileOutputStream = new FileOutputStream(this.val$file);
                    try {
                        fileOutputStream.write(bArr);
                        imageAcquireLatestImage.close();
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        imageAcquireLatestImage.close();
                        if (fileOutputStream != null) {
                        }
                        final Utilities.Callback callback = this.val$whenDone;
                        final int i = this.val$orientation;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                Camera2Session.AnonymousClass3.$r8$lambda$C8GruD4YcNmICIAfGZxauIzKYfU(callback, i);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    th = th2;
                    imageAcquireLatestImage.close();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                fileOutputStream = null;
                e = e4;
            } catch (Throwable th3) {
                fileOutputStream = null;
                th = th3;
                imageAcquireLatestImage.close();
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
            try {
                fileOutputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            final Utilities.Callback callback2 = this.val$whenDone;
            final int i2 = this.val$orientation;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Camera2Session.AnonymousClass3.$r8$lambda$C8GruD4YcNmICIAfGZxauIzKYfU(callback2, i2);
                }
            });
        }

        public static void $r8$lambda$C8GruD4YcNmICIAfGZxauIzKYfU(Utilities.Callback callback, int i) {
            if (callback != null) {
                callback.run(Integer.valueOf(i));
            }
        }
    }

    public static android.util.Size chooseOptimalSize(android.util.Size[] sizeArr, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(sizeArr.length);
        ArrayList arrayList2 = new ArrayList(sizeArr.length);
        for (android.util.Size size : sizeArr) {
            if (!z || (size.getHeight() <= i2 && size.getWidth() <= i)) {
                if (size.getHeight() == (size.getWidth() * i2) / i && size.getWidth() >= i && size.getHeight() >= i2) {
                    arrayList.add(size);
                } else if (size.getHeight() * size.getWidth() <= i * i2 * 4 && size.getWidth() >= i && size.getHeight() >= i2) {
                    arrayList2.add(size);
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

    static class CompareSizesByArea implements Comparator<android.util.Size> {
        CompareSizesByArea() {
        }

        @Override
        public int compare(android.util.Size size, android.util.Size size2) {
            return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        }
    }
}
