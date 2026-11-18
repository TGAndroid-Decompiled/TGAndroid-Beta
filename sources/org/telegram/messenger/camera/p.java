package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f23313a;
    public final CameraView.CameraGLThread f23314b;

    public p(CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23313a = i7;
        this.f23314b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23313a) {
            case 0:
                this.f23314b.lambda$onDraw$4();
                return;
            case 1:
                this.f23314b.lambda$onDraw$5();
                return;
            case 2:
                this.f23314b.lambda$new$0();
                return;
            case 3:
                this.f23314b.lambda$new$1();
                return;
            case 4:
                this.f23314b.lambda$new$2();
                return;
            default:
                this.f23314b.lambda$new$3();
                return;
        }
    }
}
