package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17289a;
    public final CameraView f17290b;
    public final CameraView.CameraGLThread f17291c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17289a = i10;
        this.f17290b = cameraView;
        this.f17291c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17289a) {
            case 0:
                this.f17290b.lambda$createCamera$10(this.f17291c);
                return;
            default:
                this.f17290b.lambda$createCamera$8(this.f17291c);
                return;
        }
    }
}
