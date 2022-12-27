package org.telegram.messenger.camera;

import android.graphics.Rect;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public class CameraSession {
    public static final int ORIENTATION_HYSTERESIS = 5;
    protected CameraInfo cameraInfo;
    private String currentFlashMode;
    private int currentOrientation;
    private float currentZoom;
    private boolean destroyed;
    private int diffOrientation;
    private int displayOrientation;
    private boolean initied;
    private boolean isRound;
    private boolean isVideo;
    private int jpegOrientation;
    private int maxZoom;
    private boolean meteringAreaSupported;
    private boolean optimizeForBarcode;
    private OrientationEventListener orientationEventListener;
    private final int pictureFormat;
    private final Size pictureSize;
    private final Size previewSize;
    private boolean sameTakePictureOrientation;
    private boolean useTorch;
    private int lastOrientation = -1;
    private int lastDisplayOrientation = -1;
    private boolean flipFront = true;
    private int infoCameraId = -1;
    Camera.CameraInfo info = new Camera.CameraInfo();
    private Camera.AutoFocusCallback autoFocusCallback = CameraSession$$ExternalSyntheticLambda0.INSTANCE;

    public static void lambda$new$0(boolean z, Camera camera) {
    }

    public CameraSession(CameraInfo cameraInfo, Size size, Size size2, int i, boolean z) {
        this.previewSize = size;
        this.pictureSize = size2;
        this.pictureFormat = i;
        this.cameraInfo = cameraInfo;
        this.isRound = z;
        this.currentFlashMode = ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).getString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", "off");
        OrientationEventListener orientationEventListener = new OrientationEventListener(ApplicationLoader.applicationContext) {
            @Override
            public void onOrientationChanged(int i2) {
                if (CameraSession.this.orientationEventListener == null || !CameraSession.this.initied || i2 == -1) {
                    return;
                }
                CameraSession cameraSession = CameraSession.this;
                cameraSession.jpegOrientation = cameraSession.roundOrientation(i2, cameraSession.jpegOrientation);
                int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                if (CameraSession.this.lastOrientation == CameraSession.this.jpegOrientation && rotation == CameraSession.this.lastDisplayOrientation) {
                    return;
                }
                if (!CameraSession.this.isVideo) {
                    CameraSession.this.configurePhotoCamera();
                }
                CameraSession.this.lastDisplayOrientation = rotation;
                CameraSession cameraSession2 = CameraSession.this;
                cameraSession2.lastOrientation = cameraSession2.jpegOrientation;
            }
        };
        this.orientationEventListener = orientationEventListener;
        if (orientationEventListener.canDetectOrientation()) {
            this.orientationEventListener.enable();
            return;
        }
        this.orientationEventListener.disable();
        this.orientationEventListener = null;
    }

    private void updateCameraInfo() {
        if (this.infoCameraId != this.cameraInfo.getCameraId()) {
            int cameraId = this.cameraInfo.getCameraId();
            this.infoCameraId = cameraId;
            Camera.getCameraInfo(cameraId, this.info);
        }
    }

    public int roundOrientation(int i, int i2) {
        boolean z = true;
        if (i2 != -1) {
            int abs = Math.abs(i - i2);
            if (Math.min(abs, 360 - abs) < 50) {
                z = false;
            }
        }
        return z ? (((i + 45) / 90) * 90) % 360 : i2;
    }

    public void setOptimizeForBarcode(boolean z) {
        this.optimizeForBarcode = z;
        configurePhotoCamera();
    }

    public void checkFlashMode(String str) {
        if (CameraController.getInstance().availableFlashModes.contains(this.currentFlashMode)) {
            return;
        }
        this.currentFlashMode = str;
        configurePhotoCamera();
        ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", str).commit();
    }

    public void setCurrentFlashMode(String str) {
        this.currentFlashMode = str;
        configurePhotoCamera();
        ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", str).commit();
    }

    public void setTorchEnabled(boolean z) {
        try {
            this.currentFlashMode = z ? "torch" : "off";
            configurePhotoCamera();
        } catch (Exception e) {
            FileLog.m32e(e);
        }
    }

    public String getCurrentFlashMode() {
        return this.currentFlashMode;
    }

    public String getNextFlashMode() {
        ArrayList<String> arrayList = CameraController.getInstance().availableFlashModes;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(this.currentFlashMode)) {
                if (i < arrayList.size() - 1) {
                    return arrayList.get(i + 1);
                }
                return arrayList.get(0);
            }
        }
        return this.currentFlashMode;
    }

    public void setInitied() {
        this.initied = true;
    }

    public boolean isInitied() {
        return this.initied;
    }

    public int getCurrentOrientation() {
        return this.currentOrientation;
    }

    public boolean isFlipFront() {
        return this.flipFront;
    }

    public void setFlipFront(boolean z) {
        this.flipFront = z;
    }

    public int getWorldAngle() {
        return this.diffOrientation;
    }

    public boolean isSameTakePictureOrientation() {
        return this.sameTakePictureOrientation;
    }

    public boolean configureRoundCamera(boolean z) {
        int i;
        try {
            this.isVideo = true;
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                Camera.Parameters parameters = null;
                try {
                    parameters = camera.getParameters();
                } catch (Exception e) {
                    FileLog.m32e(e);
                }
                updateCameraInfo();
                updateRotation();
                if (parameters != null) {
                    if (z && BuildVars.LOGS_ENABLED) {
                        FileLog.m35d("set preview size = " + this.previewSize.getWidth() + " " + this.previewSize.getHeight());
                    }
                    parameters.setPreviewSize(this.previewSize.getWidth(), this.previewSize.getHeight());
                    if (z && BuildVars.LOGS_ENABLED) {
                        FileLog.m35d("set picture size = " + this.pictureSize.getWidth() + " " + this.pictureSize.getHeight());
                    }
                    parameters.setPictureSize(this.pictureSize.getWidth(), this.pictureSize.getHeight());
                    parameters.setPictureFormat(this.pictureFormat);
                    parameters.setRecordingHint(true);
                    this.maxZoom = parameters.getMaxZoom();
                    if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                        parameters.setFocusMode("continuous-video");
                    } else if (parameters.getSupportedFocusModes().contains("auto")) {
                        parameters.setFocusMode("auto");
                    }
                    int i2 = this.jpegOrientation;
                    if (i2 != -1) {
                        Camera.CameraInfo cameraInfo = this.info;
                        if (cameraInfo.facing == 1) {
                            i = ((cameraInfo.orientation - i2) + 360) % 360;
                        } else {
                            i = (cameraInfo.orientation + i2) % 360;
                        }
                    } else {
                        i = 0;
                    }
                    try {
                        parameters.setRotation(i);
                        if (this.info.facing == 1) {
                            this.sameTakePictureOrientation = (360 - this.displayOrientation) % 360 == i;
                        } else {
                            this.sameTakePictureOrientation = this.displayOrientation == i;
                        }
                    } catch (Exception unused) {
                    }
                    parameters.setFlashMode("off");
                    parameters.setZoom((int) (this.currentZoom * this.maxZoom));
                    try {
                        camera.setParameters(parameters);
                        if (parameters.getMaxNumMeteringAreas() > 0) {
                            this.meteringAreaSupported = true;
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            FileLog.m32e(th);
            return false;
        }
    }

    public void updateRotation() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraSession.updateRotation():void");
    }

    public void configurePhotoCamera() {
        int i;
        try {
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                Camera.Parameters parameters = null;
                try {
                    parameters = camera.getParameters();
                } catch (Exception e) {
                    FileLog.m32e(e);
                }
                updateCameraInfo();
                updateRotation();
                int i2 = this.currentOrientation - this.displayOrientation;
                this.diffOrientation = i2;
                if (i2 < 0) {
                    this.diffOrientation = i2 + 360;
                }
                if (parameters != null) {
                    parameters.setPreviewSize(this.previewSize.getWidth(), this.previewSize.getHeight());
                    parameters.setPictureSize(this.pictureSize.getWidth(), this.pictureSize.getHeight());
                    parameters.setPictureFormat(this.pictureFormat);
                    parameters.setJpegQuality(100);
                    parameters.setJpegThumbnailQuality(100);
                    int maxZoom = parameters.getMaxZoom();
                    this.maxZoom = maxZoom;
                    parameters.setZoom((int) (this.currentZoom * maxZoom));
                    if (this.optimizeForBarcode) {
                        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
                        if (supportedSceneModes != null && supportedSceneModes.contains("barcode")) {
                            parameters.setSceneMode("barcode");
                        }
                        if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                            parameters.setFocusMode("continuous-video");
                        }
                    } else if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
                        parameters.setFocusMode("continuous-picture");
                    }
                    int i3 = this.jpegOrientation;
                    if (i3 != -1) {
                        Camera.CameraInfo cameraInfo = this.info;
                        if (cameraInfo.facing == 1) {
                            i = ((cameraInfo.orientation - i3) + 360) % 360;
                        } else {
                            i = (cameraInfo.orientation + i3) % 360;
                        }
                    } else {
                        i = 0;
                    }
                    try {
                        parameters.setRotation(i);
                        if (this.info.facing == 1) {
                            this.sameTakePictureOrientation = (360 - this.displayOrientation) % 360 == i;
                        } else {
                            this.sameTakePictureOrientation = this.displayOrientation == i;
                        }
                    } catch (Exception unused) {
                    }
                    parameters.setFlashMode(this.useTorch ? "torch" : this.currentFlashMode);
                    try {
                        camera.setParameters(parameters);
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Throwable th) {
            FileLog.m32e(th);
        }
    }

    public void focusToRect(Rect rect, Rect rect2) {
        try {
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                camera.cancelAutoFocus();
                Camera.Parameters parameters = null;
                try {
                    parameters = camera.getParameters();
                } catch (Exception e) {
                    FileLog.m32e(e);
                }
                if (parameters != null) {
                    parameters.setFocusMode("auto");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(rect, 1000));
                    parameters.setFocusAreas(arrayList);
                    if (this.meteringAreaSupported) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new Camera.Area(rect2, 1000));
                        parameters.setMeteringAreas(arrayList2);
                    }
                    try {
                        camera.setParameters(parameters);
                        camera.autoFocus(this.autoFocusCallback);
                    } catch (Exception e2) {
                        FileLog.m32e(e2);
                    }
                }
            }
        } catch (Exception e3) {
            FileLog.m32e(e3);
        }
    }

    protected int getMaxZoom() {
        return this.maxZoom;
    }

    public void onStartRecord() {
        this.isVideo = true;
    }

    public void setZoom(float f) {
        this.currentZoom = f;
        if (this.isVideo && "on".equals(this.currentFlashMode)) {
            this.useTorch = true;
        }
        if (this.isRound) {
            configureRoundCamera(false);
        } else {
            configurePhotoCamera();
        }
    }

    public void configureRecorder(int i, MediaRecorder mediaRecorder) {
        int i2;
        updateCameraInfo();
        int i3 = this.jpegOrientation;
        if (i3 != -1) {
            Camera.CameraInfo cameraInfo = this.info;
            if (cameraInfo.facing == 1) {
                i2 = ((cameraInfo.orientation - i3) + 360) % 360;
            } else {
                i2 = (cameraInfo.orientation + i3) % 360;
            }
        } else {
            i2 = 0;
        }
        mediaRecorder.setOrientationHint(i2);
        int high = getHigh();
        boolean hasProfile = CamcorderProfile.hasProfile(this.cameraInfo.cameraId, high);
        boolean hasProfile2 = CamcorderProfile.hasProfile(this.cameraInfo.cameraId, 0);
        if (hasProfile && (i == 1 || !hasProfile2)) {
            mediaRecorder.setProfile(CamcorderProfile.get(this.cameraInfo.cameraId, high));
        } else if (hasProfile2) {
            mediaRecorder.setProfile(CamcorderProfile.get(this.cameraInfo.cameraId, 0));
        } else {
            throw new IllegalStateException("cannot find valid CamcorderProfile");
        }
        this.isVideo = true;
    }

    public void stopVideoRecording() {
        this.isVideo = false;
        this.useTorch = false;
        configurePhotoCamera();
    }

    private int getHigh() {
        return ("LGE".equals(Build.MANUFACTURER) && "g3_tmo_us".equals(Build.PRODUCT)) ? 4 : 1;
    }

    private int getDisplayOrientation(Camera.CameraInfo cameraInfo, boolean z) {
        int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            int i2 = (360 - ((cameraInfo.orientation + i) % 360)) % 360;
            if (!z && i2 == 90) {
                i2 = 270;
            }
            if (!z && "Huawei".equals(Build.MANUFACTURER) && "angler".equals(Build.PRODUCT) && i2 == 270) {
                return 90;
            }
            return i2;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }

    public int getDisplayOrientation() {
        try {
            updateCameraInfo();
            return getDisplayOrientation(this.info, true);
        } catch (Exception e) {
            FileLog.m32e(e);
            return 0;
        }
    }

    public void setPreviewCallback(Camera.PreviewCallback previewCallback) {
        this.cameraInfo.camera.setPreviewCallback(previewCallback);
    }

    public void setOneShotPreviewCallback(Camera.PreviewCallback previewCallback) {
        Camera camera;
        CameraInfo cameraInfo = this.cameraInfo;
        if (cameraInfo == null || (camera = cameraInfo.camera) == null) {
            return;
        }
        try {
            camera.setOneShotPreviewCallback(previewCallback);
        } catch (Exception unused) {
        }
    }

    public void destroy() {
        this.initied = false;
        this.destroyed = true;
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.orientationEventListener = null;
        }
    }

    public Camera.Size getCurrentPreviewSize() {
        return this.cameraInfo.camera.getParameters().getPreviewSize();
    }

    public Camera.Size getCurrentPictureSize() {
        return this.cameraInfo.camera.getParameters().getPictureSize();
    }
}
