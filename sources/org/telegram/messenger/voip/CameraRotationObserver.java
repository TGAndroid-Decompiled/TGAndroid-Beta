package org.telegram.messenger.voip;

import android.view.WindowManager;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;
public final class CameraRotationObserver implements CapturerObserver {
    private volatile boolean frontFacing;
    private OrientationHelper orientationHelper;
    private final CapturerObserver target;

    public CameraRotationObserver(CapturerObserver capturerObserver, boolean z) {
        this.target = capturerObserver;
        this.frontFacing = z;
    }

    private static int getDisplayRotation() {
        int rotation = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return 270;
            }
            return 180;
        }
        return 90;
    }

    @Override
    public void onCapturerStarted(boolean z) {
        if (z) {
            synchronized (this) {
                if (this.orientationHelper == null) {
                    OrientationHelper orientationHelper = new OrientationHelper();
                    this.orientationHelper = orientationHelper;
                    orientationHelper.start();
                }
            }
        }
        this.target.onCapturerStarted(z);
    }

    @Override
    public void onCapturerStopped() {
        synchronized (this) {
            OrientationHelper orientationHelper = this.orientationHelper;
            if (orientationHelper != null) {
                orientationHelper.stop();
                this.orientationHelper = null;
            }
        }
        this.target.onCapturerStopped();
    }

    @Override
    public void onFrameCaptured(VideoFrame videoFrame) {
        int i;
        OrientationHelper orientationHelper;
        boolean z = this.frontFacing;
        int displayRotation = getDisplayRotation();
        if (!z) {
            displayRotation = (360 - displayRotation) % 360;
        }
        synchronized (this) {
            if (w96.N == null && (orientationHelper = this.orientationHelper) != null) {
                i = orientationHelper.getOrientation();
            } else {
                i = 0;
            }
        }
        OrientationHelper.cameraOrientation = i;
        if (z) {
            i = (360 - i) % 360;
        }
        OrientationHelper.cameraRotation = i;
        int rotation = ((((videoFrame.getRotation() - displayRotation) + i) % 360) + 360) % 360;
        int rotation2 = videoFrame.getRotation();
        CapturerObserver capturerObserver = this.target;
        if (rotation == rotation2) {
            capturerObserver.onFrameCaptured(videoFrame);
        } else {
            capturerObserver.onFrameCaptured(new VideoFrame(videoFrame.getBuffer(), rotation, videoFrame.getTimestampNs()));
        }
    }

    public void setFrontFacing(boolean z) {
        this.frontFacing = z;
    }
}
