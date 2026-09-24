package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f16095a;
    public final CameraView.CameraGLThread f16096b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16095a = i10;
        this.f16096b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16095a) {
            case 0:
                this.f16096b.lambda$onDraw$4();
                return;
            case 1:
                this.f16096b.lambda$onDraw$5();
                return;
            case 2:
                this.f16096b.lambda$new$0();
                return;
            case 3:
                this.f16096b.lambda$new$1();
                return;
            case 4:
                this.f16096b.lambda$new$2();
                return;
            default:
                this.f16096b.lambda$new$3();
                return;
        }
    }
}
