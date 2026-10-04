package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17552a;
    public final CameraView f17553b;
    public final CameraView.CameraGLThread f17554c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17552a = i10;
        this.f17553b = cameraView;
        this.f17554c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17552a) {
            case 0:
                this.f17553b.lambda$createCamera$10(this.f17554c);
                return;
            default:
                this.f17553b.lambda$createCamera$8(this.f17554c);
                return;
        }
    }
}
