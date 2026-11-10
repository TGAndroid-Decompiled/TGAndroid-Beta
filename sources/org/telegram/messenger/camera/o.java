package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class o implements Runnable {
    public final int f21826a;
    public final CameraView.CameraGLThread f21827b;

    public o(CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f21826a = i7;
        this.f21827b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21826a) {
            case 0:
                this.f21827b.lambda$onDraw$4();
                return;
            case 1:
                this.f21827b.lambda$onDraw$5();
                return;
            case 2:
                this.f21827b.lambda$new$0();
                return;
            case 3:
                this.f21827b.lambda$new$1();
                return;
            case 4:
                this.f21827b.lambda$new$2();
                return;
            default:
                this.f21827b.lambda$new$3();
                return;
        }
    }
}
