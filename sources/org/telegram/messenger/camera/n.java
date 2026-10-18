package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f18075a;
    public final CameraView f18076b;
    public final CameraView.CameraGLThread f18077c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18075a = i10;
        this.f18076b = cameraView;
        this.f18077c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18075a) {
            case 0:
                this.f18076b.lambda$createCamera$10(this.f18077c);
                return;
            default:
                this.f18076b.lambda$createCamera$8(this.f18077c);
                return;
        }
    }
}
