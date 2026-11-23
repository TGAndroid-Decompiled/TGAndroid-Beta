package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f23242a;
    public final CameraView f23243b;
    public final CameraView.CameraGLThread f23244c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23242a = i7;
        this.f23243b = cameraView;
        this.f23244c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23242a) {
            case 0:
                this.f23243b.lambda$createCamera$10(this.f23244c);
                return;
            default:
                this.f23243b.lambda$createCamera$8(this.f23244c);
                return;
        }
    }
}
