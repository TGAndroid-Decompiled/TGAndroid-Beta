package org.telegram.messenger.camera;

import android.graphics.Rect;
import java.util.concurrent.CountDownLatch;
public class CameraSessionWrapper {
    public CameraSession camera1Session;

    public static CameraSessionWrapper of(CameraSession cameraSession) {
        CameraSessionWrapper cameraSessionWrapper = new CameraSessionWrapper();
        cameraSessionWrapper.camera1Session = cameraSession;
        return cameraSessionWrapper;
    }

    public void destroy(boolean z, Runnable runnable, Runnable runnable2) {
        CountDownLatch countDownLatch;
        if (this.camera1Session != null) {
            CameraController cameraController = CameraController.getInstance();
            CameraSession cameraSession = this.camera1Session;
            if (!z) {
                countDownLatch = new CountDownLatch(1);
            } else {
                countDownLatch = null;
            }
            cameraController.close(cameraSession, countDownLatch, runnable, runnable2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof CameraSession) {
            if (obj == this.camera1Session) {
                return true;
            }
            return false;
        } else if (!(obj instanceof CameraSessionWrapper)) {
            return false;
        } else {
            CameraSessionWrapper cameraSessionWrapper = (CameraSessionWrapper) obj;
            if (cameraSessionWrapper == this || cameraSessionWrapper.camera1Session == this.camera1Session) {
                return true;
            }
            return false;
        }
    }

    public void focusToRect(Rect rect, Rect rect2) {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.focusToRect(rect, rect2);
        }
    }

    @Deprecated
    public int getCameraId() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.cameraInfo.cameraId;
        }
        return 0;
    }

    public String getCurrentFlashMode() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.getCurrentFlashMode();
        }
        return null;
    }

    public int getCurrentOrientation() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.getCurrentOrientation();
        }
        return 0;
    }

    public int getDisplayOrientation() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.getDisplayOrientation();
        }
        return 0;
    }

    public String getNextFlashMode() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.getNextFlashMode();
        }
        return null;
    }

    public Object getObject() {
        return this.camera1Session;
    }

    public int getWorldAngle() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.getWorldAngle();
        }
        return 0;
    }

    public boolean hasFlashModes() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null && !cameraSession.availableFlashModes.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isInitiated() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null && cameraSession.isInitied()) {
            return true;
        }
        return false;
    }

    public boolean isSameTakePictureOrientation() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null && !cameraSession.isSameTakePictureOrientation()) {
            return false;
        }
        return true;
    }

    public void setCurrentFlashMode(String str) {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.setCurrentFlashMode(str);
        }
    }

    public void setFlipFront(boolean z) {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.setFlipFront(z);
        }
    }

    public void setOptimizeForBarcode(boolean z) {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.setOptimizeForBarcode(z);
        }
    }

    public void setZoom(float f) {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.setZoom(f);
        }
    }

    public void stopVideoRecording() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.stopVideoRecording();
        }
    }

    public void updateRotation() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.updateRotation();
        }
    }
}
