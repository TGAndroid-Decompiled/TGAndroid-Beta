package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class o implements Runnable {
    public final int f16677a;
    public final CameraView.CameraGLThread f16678b;

    public o(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16677a = i10;
        this.f16678b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16677a) {
            case 0:
                this.f16678b.lambda$onDraw$4();
                return;
            case 1:
                this.f16678b.lambda$onDraw$5();
                return;
            case 2:
                this.f16678b.lambda$new$0();
                return;
            case 3:
                this.f16678b.lambda$new$1();
                return;
            case 4:
                this.f16678b.lambda$new$2();
                return;
            default:
                this.f16678b.lambda$new$3();
                return;
        }
    }
}
