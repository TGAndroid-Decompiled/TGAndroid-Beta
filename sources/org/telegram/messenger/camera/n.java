package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17554a;
    public final CameraView f17555b;
    public final CameraView.CameraGLThread f17556c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17554a = i10;
        this.f17555b = cameraView;
        this.f17556c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17554a) {
            case 0:
                this.f17555b.lambda$createCamera$10(this.f17556c);
                return;
            default:
                this.f17555b.lambda$createCamera$8(this.f17556c);
                return;
        }
    }
}
