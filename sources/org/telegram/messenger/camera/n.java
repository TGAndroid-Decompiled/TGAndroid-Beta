package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17404a;
    public final CameraView f17405b;
    public final CameraView.CameraGLThread f17406c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17404a = i10;
        this.f17405b = cameraView;
        this.f17406c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17404a) {
            case 0:
                this.f17405b.lambda$createCamera$10(this.f17406c);
                return;
            default:
                this.f17405b.lambda$createCamera$8(this.f17406c);
                return;
        }
    }
}
