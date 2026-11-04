package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class o implements Runnable {
    public final int f21983a;
    public final CameraView.CameraGLThread f21984b;

    public o(CameraView.CameraGLThread cameraGLThread, int i3) {
        this.f21983a = i3;
        this.f21984b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21983a) {
            case 0:
                this.f21984b.lambda$onDraw$4();
                return;
            case 1:
                this.f21984b.lambda$onDraw$5();
                return;
            case 2:
                this.f21984b.lambda$new$0();
                return;
            case 3:
                this.f21984b.lambda$new$1();
                return;
            case 4:
                this.f21984b.lambda$new$2();
                return;
            default:
                this.f21984b.lambda$new$3();
                return;
        }
    }
}
