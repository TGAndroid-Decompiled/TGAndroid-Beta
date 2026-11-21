package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f23337a;
    public final CameraView f23338b;
    public final CameraView.CameraGLThread f23339c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23337a = i7;
        this.f23338b = cameraView;
        this.f23339c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23337a) {
            case 0:
                this.f23338b.lambda$createCamera$10(this.f23339c);
                return;
            default:
                this.f23338b.lambda$createCamera$8(this.f23339c);
                return;
        }
    }
}
