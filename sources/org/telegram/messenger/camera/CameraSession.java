package org.telegram.messenger.camera;

import android.graphics.Rect;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public class CameraSession {
    public static final int ORIENTATION_HYSTERESIS = 5;
    public CameraInfo cameraInfo;
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
    public ArrayList<String> availableFlashModes = new ArrayList<>();
    private int infoCameraId = -1;
    Camera.CameraInfo info = new Camera.CameraInfo();
    private Camera.AutoFocusCallback autoFocusCallback = new k();

    public CameraSession(CameraInfo cameraInfo, Size size, Size size2, int i10, boolean z10) {
        this.previewSize = size;
        this.pictureSize = size2;
        this.pictureFormat = i10;
        this.cameraInfo = cameraInfo;
        this.isRound = z10;
        this.currentFlashMode = ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).getString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", "off");
        OrientationEventListener orientationEventListener = new OrientationEventListener(ApplicationLoader.applicationContext) {
            @Override
            public void onOrientationChanged(int i11) {
                if (CameraSession.this.orientationEventListener == null || !CameraSession.this.initied || i11 == -1) {
                    return;
                }
                CameraSession cameraSession = CameraSession.this;
                cameraSession.jpegOrientation = cameraSession.roundOrientation(i11, cameraSession.jpegOrientation);
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
        } else {
            this.orientationEventListener.disable();
            this.orientationEventListener = null;
        }
    }

    private int getDisplayOrientation(Camera.CameraInfo cameraInfo, boolean z10) {
        int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        int i10 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i10 = 90;
            } else if (rotation == 2) {
                i10 = 180;
            } else if (rotation == 3) {
                i10 = 270;
            }
        }
        if (cameraInfo.facing != 1) {
            return ((cameraInfo.orientation - i10) + 360) % 360;
        }
        int i11 = (360 - ((cameraInfo.orientation + i10) % 360)) % 360;
        if (!z10 && i11 == 90) {
            i11 = 270;
        }
        if (!z10 && "Huawei".equals(Build.MANUFACTURER) && "angler".equals(Build.PRODUCT) && i11 == 270) {
            return 90;
        }
        return i11;
    }

    private int getHigh() {
        return ("LGE".equals(Build.MANUFACTURER) && "g3_tmo_us".equals(Build.PRODUCT)) ? 4 : 1;
    }

    public int roundOrientation(int i10, int i11) {
        if (i11 != -1) {
            int iAbs = Math.abs(i10 - i11);
            if (Math.min(iAbs, 360 - iAbs) < 50) {
                return i11;
            }
        }
        return (((i10 + 45) / 90) * 90) % 360;
    }

    private void updateCameraInfo() {
        if (this.infoCameraId != this.cameraInfo.getCameraId()) {
            int cameraId = this.cameraInfo.getCameraId();
            this.infoCameraId = cameraId;
            Camera.getCameraInfo(cameraId, this.info);
        }
    }

    public void checkFlashMode(String str) {
        if (this.availableFlashModes.contains(this.currentFlashMode)) {
            return;
        }
        this.currentFlashMode = str;
        if (this.isRound) {
            configureRoundCamera(false);
        } else {
            configurePhotoCamera();
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", str).commit();
        }
    }

    public void configurePhotoCamera() {
        Camera.Parameters parameters;
        int i10;
        try {
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                try {
                    parameters = camera.getParameters();
                } catch (Exception e9) {
                    FileLog.e(e9);
                    parameters = null;
                }
                updateCameraInfo();
                updateRotation();
                int i11 = this.currentOrientation - this.displayOrientation;
                this.diffOrientation = i11;
                if (i11 < 0) {
                    this.diffOrientation = i11 + 360;
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
                    int i12 = this.jpegOrientation;
                    if (i12 != -1) {
                        Camera.CameraInfo cameraInfo = this.info;
                        i10 = cameraInfo.facing == 1 ? ((cameraInfo.orientation - i12) + 360) % 360 : (cameraInfo.orientation + i12) % 360;
                    } else {
                        i10 = 0;
                    }
                    try {
                        parameters.setRotation(i10);
                        if (this.info.facing == 1) {
                            this.sameTakePictureOrientation = (360 - this.displayOrientation) % 360 == i10;
                        } else {
                            this.sameTakePictureOrientation = this.displayOrientation == i10;
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
            FileLog.e(th);
        }
    }

    public void configureRecorder(int i10, MediaRecorder mediaRecorder) {
        int i11;
        updateCameraInfo();
        int i12 = this.jpegOrientation;
        if (i12 != -1) {
            Camera.CameraInfo cameraInfo = this.info;
            i11 = cameraInfo.facing == 1 ? ((cameraInfo.orientation - i12) + 360) % 360 : (cameraInfo.orientation + i12) % 360;
        } else {
            i11 = 0;
        }
        mediaRecorder.setOrientationHint(i11);
        int high = getHigh();
        boolean zHasProfile = CamcorderProfile.hasProfile(this.cameraInfo.cameraId, high);
        boolean zHasProfile2 = CamcorderProfile.hasProfile(this.cameraInfo.cameraId, 0);
        if (zHasProfile && (i10 == 1 || !zHasProfile2)) {
            mediaRecorder.setProfile(CamcorderProfile.get(this.cameraInfo.cameraId, high));
        } else {
            if (!zHasProfile2) {
                throw new IllegalStateException("cannot find valid CamcorderProfile");
            }
            mediaRecorder.setProfile(CamcorderProfile.get(this.cameraInfo.cameraId, 0));
        }
        this.isVideo = true;
    }

    public boolean configureRoundCamera(boolean z10) {
        Camera.Parameters parameters;
        int i10;
        try {
            this.isVideo = true;
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                try {
                    parameters = camera.getParameters();
                } catch (Exception e9) {
                    FileLog.e(e9);
                    parameters = null;
                }
                updateCameraInfo();
                updateRotation();
                if (parameters != null) {
                    if (z10 && BuildVars.LOGS_ENABLED) {
                        FileLog.d("set preview size = " + this.previewSize.getWidth() + " " + this.previewSize.getHeight());
                    }
                    parameters.setPreviewSize(this.previewSize.getWidth(), this.previewSize.getHeight());
                    if (z10 && BuildVars.LOGS_ENABLED) {
                        FileLog.d("set picture size = " + this.pictureSize.getWidth() + " " + this.pictureSize.getHeight());
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
                    int i11 = this.jpegOrientation;
                    if (i11 != -1) {
                        Camera.CameraInfo cameraInfo = this.info;
                        i10 = cameraInfo.facing == 1 ? ((cameraInfo.orientation - i11) + 360) % 360 : (cameraInfo.orientation + i11) % 360;
                    } else {
                        i10 = 0;
                    }
                    try {
                        parameters.setRotation(i10);
                        if (this.info.facing == 1) {
                            this.sameTakePictureOrientation = (360 - this.displayOrientation) % 360 == i10;
                        } else {
                            this.sameTakePictureOrientation = this.displayOrientation == i10;
                        }
                    } catch (Exception unused) {
                    }
                    parameters.setFlashMode(this.currentFlashMode);
                    parameters.setZoom((int) (this.currentZoom * this.maxZoom));
                    try {
                        camera.setParameters(parameters);
                        if (parameters.getMaxNumMeteringAreas() > 0) {
                            this.meteringAreaSupported = true;
                        }
                    } catch (Exception e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            FileLog.e(th);
            return false;
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

    public void focusToRect(Rect rect, Rect rect2) {
        Camera.Parameters parameters;
        try {
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                camera.cancelAutoFocus();
                try {
                    parameters = camera.getParameters();
                } catch (Exception e9) {
                    FileLog.e(e9);
                    parameters = null;
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public String getCurrentFlashMode() {
        return this.currentFlashMode;
    }

    public int getCurrentOrientation() {
        return this.currentOrientation;
    }

    public Camera.Size getCurrentPictureSize() {
        return this.cameraInfo.camera.getParameters().getPictureSize();
    }

    public Camera.Size getCurrentPreviewSize() {
        return this.cameraInfo.camera.getParameters().getPreviewSize();
    }

    public int getMaxZoom() {
        return this.maxZoom;
    }

    public String getNextFlashMode() {
        ArrayList<String> arrayList = this.availableFlashModes;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (arrayList.get(i10).equals(this.currentFlashMode)) {
                return i10 < arrayList.size() + (-1) ? arrayList.get(i10 + 1) : arrayList.get(0);
            }
            i10++;
        }
        return this.currentFlashMode;
    }

    public int getWorldAngle() {
        return this.diffOrientation;
    }

    public boolean isFlipFront() {
        return this.flipFront;
    }

    public boolean isInitied() {
        return this.initied;
    }

    public boolean isSameTakePictureOrientation() {
        return this.sameTakePictureOrientation;
    }

    public void onStartRecord() {
        this.isVideo = true;
    }

    public void setCurrentFlashMode(String str) {
        this.currentFlashMode = str;
        if (this.isRound) {
            configureRoundCamera(false);
        } else {
            configurePhotoCamera();
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", str).commit();
        }
    }

    public void setFlipFront(boolean z10) {
        this.flipFront = z10;
    }

    public void setInitied() {
        this.initied = true;
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

    public void setOptimizeForBarcode(boolean z10) {
        this.optimizeForBarcode = z10;
        configurePhotoCamera();
    }

    public void setPreviewCallback(Camera.PreviewCallback previewCallback) {
        this.cameraInfo.camera.setPreviewCallback(previewCallback);
    }

    public void setTorchEnabled(boolean z10) {
        try {
            String str = this.currentFlashMode;
            String str2 = z10 ? "torch" : "off";
            this.currentFlashMode = str2;
            if (TextUtils.equals(str, str2)) {
                return;
            }
            if (this.isRound) {
                configureRoundCamera(false);
            } else {
                configurePhotoCamera();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void setZoom(float f10) {
        this.currentZoom = f10;
        if (this.isVideo && "on".equals(this.currentFlashMode)) {
            this.useTorch = true;
        }
        if (this.isRound) {
            configureRoundCamera(false);
        } else {
            configurePhotoCamera();
        }
    }

    public void stopVideoRecording() {
        this.isVideo = false;
        this.useTorch = false;
        configurePhotoCamera();
    }

    public void updateRotation() {
        int i10;
        if (this.cameraInfo == null) {
            return;
        }
        try {
            updateCameraInfo();
            Camera camera = this.destroyed ? null : this.cameraInfo.camera;
            this.displayOrientation = getDisplayOrientation(this.info, true);
            int i11 = 0;
            if (!"samsung".equals(Build.MANUFACTURER) || !"sf2wifixx".equals(Build.PRODUCT)) {
                int i12 = this.displayOrientation;
                if (i12 == 0) {
                    i10 = 0;
                } else if (i12 == 1) {
                    i10 = 90;
                } else if (i12 == 2) {
                    i10 = 180;
                } else if (i12 != 3) {
                    i10 = 0;
                } else {
                    i10 = 270;
                }
                Camera.CameraInfo cameraInfo = this.info;
                if (cameraInfo.orientation % 90 != 0) {
                    cameraInfo.orientation = 0;
                }
                i11 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i10) % 360)) % 360 : ((cameraInfo.orientation - i10) + 360) % 360;
            }
            this.currentOrientation = i11;
            if (camera != null) {
                try {
                    camera.setDisplayOrientation(i11);
                } catch (Throwable unused) {
                }
            }
            int i13 = this.currentOrientation - this.displayOrientation;
            this.diffOrientation = i13;
            if (i13 < 0) {
                this.diffOrientation = i13 + 360;
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public int getDisplayOrientation() {
        try {
            updateCameraInfo();
            return getDisplayOrientation(this.info, true);
        } catch (Exception e9) {
            FileLog.e(e9);
            return 0;
        }
    }

    public static void lambda$new$0(boolean z10, Camera camera) {
    }
}
