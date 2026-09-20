package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f16083a;
    public final CameraView.CameraGLThread f16084b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16083a = i10;
        this.f16084b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16083a) {
            case 0:
                this.f16084b.lambda$onDraw$4();
                return;
            case 1:
                this.f16084b.lambda$onDraw$5();
                return;
            case 2:
                this.f16084b.lambda$new$0();
                return;
            case 3:
                this.f16084b.lambda$new$1();
                return;
            case 4:
                this.f16084b.lambda$new$2();
                return;
            default:
                this.f16084b.lambda$new$3();
                return;
        }
    }
}
