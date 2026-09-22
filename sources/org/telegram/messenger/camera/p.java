package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f15858a;
    public final CameraView.CameraGLThread f15859b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15858a = i10;
        this.f15859b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15858a) {
            case 0:
                this.f15859b.lambda$onDraw$4();
                return;
            case 1:
                this.f15859b.lambda$onDraw$5();
                return;
            case 2:
                this.f15859b.lambda$new$0();
                return;
            case 3:
                this.f15859b.lambda$new$1();
                return;
            case 4:
                this.f15859b.lambda$new$2();
                return;
            default:
                this.f15859b.lambda$new$3();
                return;
        }
    }
}
