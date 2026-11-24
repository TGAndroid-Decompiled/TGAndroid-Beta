package org.telegram.messenger.camera;

import android.content.SharedPreferences;
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
    private Camera.AutoFocusCallback autoFocusCallback = new Object();

    public CameraSession(CameraInfo cameraInfo, Size size, Size size2, int i, boolean z) {
        String str;
        this.previewSize = size;
        this.pictureSize = size2;
        this.pictureFormat = i;
        this.cameraInfo = cameraInfo;
        this.isRound = z;
        SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("camera", 0);
        if (this.cameraInfo.frontCamera != 0) {
            str = "flashMode_front";
        } else {
            str = "flashMode";
        }
        this.currentFlashMode = sharedPreferences.getString(str, "off");
        OrientationEventListener orientationEventListener = new OrientationEventListener(org.telegram.messenger.a.b) {
            @Override
            public void onOrientationChanged(int i2) {
                if (CameraSession.this.orientationEventListener != null && CameraSession.this.initied && i2 != -1) {
                    CameraSession cameraSession = CameraSession.this;
                    cameraSession.jpegOrientation = cameraSession.roundOrientation(i2, cameraSession.jpegOrientation);
                    int rotation = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (CameraSession.this.lastOrientation != CameraSession.this.jpegOrientation || rotation != CameraSession.this.lastDisplayOrientation) {
                        if (!CameraSession.this.isVideo) {
                            CameraSession.this.configurePhotoCamera();
                        }
                        CameraSession.this.lastDisplayOrientation = rotation;
                        CameraSession cameraSession2 = CameraSession.this;
                        cameraSession2.lastOrientation = cameraSession2.jpegOrientation;
                    }
                }
            }
        };
        this.orientationEventListener = orientationEventListener;
        boolean canDetectOrientation = orientationEventListener.canDetectOrientation();
        OrientationEventListener orientationEventListener2 = this.orientationEventListener;
        if (canDetectOrientation) {
            orientationEventListener2.enable();
            return;
        }
        orientationEventListener2.disable();
        this.orientationEventListener = null;
    }

    private int getDisplayOrientation(Camera.CameraInfo cameraInfo, boolean z) {
        int rotation = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = 0;
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation == 3) {
                        i = 270;
                    }
                } else {
                    i = 180;
                }
            } else {
                i = 90;
            }
        }
        int i2 = cameraInfo.facing;
        int i3 = cameraInfo.orientation;
        if (i2 == 1) {
            int i4 = (360 - ((i3 + i) % 360)) % 360;
            if (!z && i4 == 90) {
                i4 = 270;
            }
            if (!z && "Huawei".equals(Build.MANUFACTURER) && "angler".equals(Build.PRODUCT) && i4 == 270) {
                return 90;
            }
            return i4;
        }
        return ((i3 - i) + 360) % 360;
    }

    private int getHigh() {
        if ("LGE".equals(Build.MANUFACTURER) && "g3_tmo_us".equals(Build.PRODUCT)) {
            return 4;
        }
        return 1;
    }

    public int roundOrientation(int i, int i2) {
        if (i2 != -1) {
            int abs = Math.abs(i - i2);
            if (Math.min(abs, 360 - abs) < 50) {
                return i2;
            }
        }
        return (((i + 45) / 90) * 90) % 360;
    }

    private void updateCameraInfo() {
        if (this.infoCameraId != this.cameraInfo.getCameraId()) {
            int cameraId = this.cameraInfo.getCameraId();
            this.infoCameraId = cameraId;
            Camera.getCameraInfo(cameraId, this.info);
        }
    }

    public void checkFlashMode(String str) {
        String str2;
        if (this.availableFlashModes.contains(this.currentFlashMode)) {
            return;
        }
        this.currentFlashMode = str;
        if (this.isRound) {
            configureRoundCamera(false);
            return;
        }
        configurePhotoCamera();
        SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("camera", 0).edit();
        if (this.cameraInfo.frontCamera != 0) {
            str2 = "flashMode_front";
        } else {
            str2 = "flashMode";
        }
        edit.putString(str2, str).commit();
    }

    public void configurePhotoCamera() {
        Camera.Parameters parameters;
        int i;
        String str;
        try {
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                try {
                    parameters = camera.getParameters();
                } catch (Exception e) {
                    fa4.g(e, true);
                    parameters = null;
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
                    boolean z = false;
                    if (i3 != -1) {
                        Camera.CameraInfo cameraInfo = this.info;
                        int i4 = cameraInfo.facing;
                        int i5 = cameraInfo.orientation;
                        if (i4 == 1) {
                            i = ((i5 - i3) + 360) % 360;
                        } else {
                            i = (i5 + i3) % 360;
                        }
                    } else {
                        i = 0;
                    }
                    try {
                        parameters.setRotation(i);
                        int i6 = this.info.facing;
                        int i7 = this.displayOrientation;
                        if (i6 == 1) {
                            if ((360 - i7) % 360 == i) {
                                z = true;
                            }
                            this.sameTakePictureOrientation = z;
                        } else {
                            if (i7 == i) {
                                z = true;
                            }
                            this.sameTakePictureOrientation = z;
                        }
                    } catch (Exception unused) {
                    }
                    if (this.useTorch) {
                        str = "torch";
                    } else {
                        str = this.currentFlashMode;
                    }
                    parameters.setFlashMode(str);
                    try {
                        camera.setParameters(parameters);
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Throwable th) {
            fa4.g(th, true);
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
            sc8.j("cannot find valid CamcorderProfile");
            return;
        }
        this.isVideo = true;
    }

    public boolean configureRoundCamera(boolean z) {
        Camera.Parameters parameters;
        int i;
        boolean z2;
        boolean z3;
        try {
            this.isVideo = true;
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                try {
                    parameters = camera.getParameters();
                } catch (Exception e) {
                    fa4.g(e, true);
                    parameters = null;
                }
                updateCameraInfo();
                updateRotation();
                if (parameters != null) {
                    if (z && w01.a) {
                        fa4.b("set preview size = " + this.previewSize.getWidth() + " " + this.previewSize.getHeight());
                    }
                    parameters.setPreviewSize(this.previewSize.getWidth(), this.previewSize.getHeight());
                    if (z && w01.a) {
                        fa4.b("set picture size = " + this.pictureSize.getWidth() + " " + this.pictureSize.getHeight());
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
                        int i3 = cameraInfo.facing;
                        int i4 = cameraInfo.orientation;
                        if (i3 == 1) {
                            i = ((i4 - i2) + 360) % 360;
                        } else {
                            i = (i4 + i2) % 360;
                        }
                    } else {
                        i = 0;
                    }
                    try {
                        parameters.setRotation(i);
                        int i5 = this.info.facing;
                        int i6 = this.displayOrientation;
                        if (i5 == 1) {
                            if ((360 - i6) % 360 == i) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.sameTakePictureOrientation = z3;
                        } else {
                            if (i6 == i) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.sameTakePictureOrientation = z2;
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
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            fa4.g(th, true);
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
                } catch (Exception e) {
                    fa4.g(e, true);
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
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
            }
        } catch (Exception e3) {
            fa4.g(e3, true);
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
        String str2;
        this.currentFlashMode = str;
        if (this.isRound) {
            configureRoundCamera(false);
            return;
        }
        configurePhotoCamera();
        SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("camera", 0).edit();
        if (this.cameraInfo.frontCamera != 0) {
            str2 = "flashMode_front";
        } else {
            str2 = "flashMode";
        }
        edit.putString(str2, str).commit();
    }

    public void setFlipFront(boolean z) {
        this.flipFront = z;
    }

    public void setInitied() {
        this.initied = true;
    }

    public void setOneShotPreviewCallback(Camera.PreviewCallback previewCallback) {
        Camera camera;
        CameraInfo cameraInfo = this.cameraInfo;
        if (cameraInfo != null && (camera = cameraInfo.camera) != null) {
            try {
                camera.setOneShotPreviewCallback(previewCallback);
            } catch (Exception unused) {
            }
        }
    }

    public void setOptimizeForBarcode(boolean z) {
        this.optimizeForBarcode = z;
        configurePhotoCamera();
    }

    public void setPreviewCallback(Camera.PreviewCallback previewCallback) {
        this.cameraInfo.camera.setPreviewCallback(previewCallback);
    }

    public void setTorchEnabled(boolean z) {
        String str;
        try {
            String str2 = this.currentFlashMode;
            if (z) {
                str = "torch";
            } else {
                str = "off";
            }
            this.currentFlashMode = str;
            if (!TextUtils.equals(str2, str)) {
                if (this.isRound) {
                    configureRoundCamera(false);
                } else {
                    configurePhotoCamera();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
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

    public void stopVideoRecording() {
        this.isVideo = false;
        this.useTorch = false;
        configurePhotoCamera();
    }

    public void updateRotation() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraSession.updateRotation():void");
    }

    public static void lambda$new$0(boolean z, Camera camera) {
    }

    public int getDisplayOrientation() {
        try {
            updateCameraInfo();
            return getDisplayOrientation(this.info, true);
        } catch (Exception e) {
            fa4.g(e, true);
            return 0;
        }
    }
}
