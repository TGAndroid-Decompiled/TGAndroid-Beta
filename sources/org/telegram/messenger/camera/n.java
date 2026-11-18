package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f23312a;
    public final CameraView f23313b;
    public final CameraView.CameraGLThread f23314c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23312a = i7;
        this.f23313b = cameraView;
        this.f23314c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23312a) {
            case 0:
                this.f23313b.lambda$createCamera$10(this.f23314c);
                return;
            default:
                this.f23313b.lambda$createCamera$8(this.f23314c);
                return;
        }
    }
}
