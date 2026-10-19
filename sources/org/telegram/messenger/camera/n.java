package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f18072a;
    public final CameraView f18073b;
    public final CameraView.CameraGLThread f18074c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18072a = i10;
        this.f18073b = cameraView;
        this.f18074c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18072a) {
            case 0:
                this.f18073b.lambda$createCamera$10(this.f18074c);
                return;
            default:
                this.f18073b.lambda$createCamera$8(this.f18074c);
                return;
        }
    }
}
