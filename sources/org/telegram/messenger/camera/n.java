package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f23278a;
    public final CameraView f23279b;
    public final CameraView.CameraGLThread f23280c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23278a = i7;
        this.f23279b = cameraView;
        this.f23280c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23278a) {
            case 0:
                this.f23279b.lambda$createCamera$10(this.f23280c);
                return;
            default:
                this.f23279b.lambda$createCamera$8(this.f23280c);
                return;
        }
    }
}
