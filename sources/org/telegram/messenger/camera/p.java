package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f18386a;
    public final CameraView.CameraGLThread f18387b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18386a = i10;
        this.f18387b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18386a) {
            case 0:
                this.f18387b.lambda$onDraw$4();
                return;
            case 1:
                this.f18387b.lambda$onDraw$5();
                return;
            case 2:
                this.f18387b.lambda$new$0();
                return;
            case 3:
                this.f18387b.lambda$new$1();
                return;
            case 4:
                this.f18387b.lambda$new$2();
                return;
            default:
                this.f18387b.lambda$new$3();
                return;
        }
    }
}
