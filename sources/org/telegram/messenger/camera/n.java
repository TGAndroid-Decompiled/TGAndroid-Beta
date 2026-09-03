package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f16941a;
    public final CameraView f16942b;
    public final CameraView.CameraGLThread f16943c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16941a = i10;
        this.f16942b = cameraView;
        this.f16943c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16941a) {
            case 0:
                this.f16942b.lambda$createCamera$10(this.f16943c);
                return;
            default:
                this.f16942b.lambda$createCamera$8(this.f16943c);
                return;
        }
    }
}
