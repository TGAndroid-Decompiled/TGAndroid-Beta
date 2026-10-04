package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f17556a;
    public final CameraView.CameraGLThread f17557b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17556a = i10;
        this.f17557b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17556a) {
            case 0:
                this.f17557b.lambda$onDraw$4();
                return;
            case 1:
                this.f17557b.lambda$onDraw$5();
                return;
            case 2:
                this.f17557b.lambda$new$0();
                return;
            case 3:
                this.f17557b.lambda$new$1();
                return;
            case 4:
                this.f17557b.lambda$new$2();
                return;
            default:
                this.f17557b.lambda$new$3();
                return;
        }
    }
}
