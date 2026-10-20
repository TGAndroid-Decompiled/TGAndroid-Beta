package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f18066a;
    public final CameraView f18067b;
    public final CameraView.CameraGLThread f18068c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18066a = i10;
        this.f18067b = cameraView;
        this.f18068c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18066a) {
            case 0:
                this.f18067b.lambda$createCamera$10(this.f18068c);
                return;
            default:
                this.f18067b.lambda$createCamera$8(this.f18068c);
                return;
        }
    }
}
