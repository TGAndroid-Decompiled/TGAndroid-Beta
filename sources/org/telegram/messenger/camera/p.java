package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f17545a;
    public final CameraView.CameraGLThread f17546b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17545a = i10;
        this.f17546b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17545a) {
            case 0:
                this.f17546b.lambda$onDraw$4();
                return;
            case 1:
                this.f17546b.lambda$onDraw$5();
                return;
            case 2:
                this.f17546b.lambda$new$0();
                return;
            case 3:
                this.f17546b.lambda$new$1();
                return;
            case 4:
                this.f17546b.lambda$new$2();
                return;
            default:
                this.f17546b.lambda$new$3();
                return;
        }
    }
}
