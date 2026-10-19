package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f18065a;
    public final CameraView f18066b;
    public final CameraView.CameraGLThread f18067c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18065a = i10;
        this.f18066b = cameraView;
        this.f18067c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18065a) {
            case 0:
                this.f18066b.lambda$createCamera$10(this.f18067c);
                return;
            default:
                this.f18066b.lambda$createCamera$8(this.f18067c);
                return;
        }
    }
}
