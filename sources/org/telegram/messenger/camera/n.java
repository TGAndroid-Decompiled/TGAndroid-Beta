package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17551a;
    public final CameraView f17552b;
    public final CameraView.CameraGLThread f17553c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17551a = i10;
        this.f17552b = cameraView;
        this.f17553c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17551a) {
            case 0:
                this.f17552b.lambda$createCamera$10(this.f17553c);
                return;
            default:
                this.f17552b.lambda$createCamera$8(this.f17553c);
                return;
        }
    }
}
