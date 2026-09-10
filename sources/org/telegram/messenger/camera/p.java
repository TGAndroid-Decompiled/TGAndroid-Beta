package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f14894a;
    public final CameraView.CameraGLThread f14895b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f14894a = i10;
        this.f14895b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f14894a) {
            case 0:
                this.f14895b.lambda$onDraw$4();
                return;
            case 1:
                this.f14895b.lambda$onDraw$5();
                return;
            case 2:
                this.f14895b.lambda$new$0();
                return;
            case 3:
                this.f14895b.lambda$new$1();
                return;
            case 4:
                this.f14895b.lambda$new$2();
                return;
            default:
                this.f14895b.lambda$new$3();
                return;
        }
    }
}
