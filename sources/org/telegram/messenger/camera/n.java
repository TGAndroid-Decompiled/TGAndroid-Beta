package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17549a;
    public final CameraView f17550b;
    public final CameraView.CameraGLThread f17551c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17549a = i10;
        this.f17550b = cameraView;
        this.f17551c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17549a) {
            case 0:
                this.f17550b.lambda$createCamera$10(this.f17551c);
                return;
            default:
                this.f17550b.lambda$createCamera$8(this.f17551c);
                return;
        }
    }
}
