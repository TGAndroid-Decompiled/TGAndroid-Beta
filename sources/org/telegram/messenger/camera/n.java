package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f23309a;
    public final CameraView f23310b;
    public final CameraView.CameraGLThread f23311c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23309a = i7;
        this.f23310b = cameraView;
        this.f23311c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23309a) {
            case 0:
                this.f23310b.lambda$createCamera$10(this.f23311c);
                return;
            default:
                this.f23310b.lambda$createCamera$8(this.f23311c);
                return;
        }
    }
}
