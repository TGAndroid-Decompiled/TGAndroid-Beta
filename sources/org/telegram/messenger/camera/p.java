package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f18064a;
    public final CameraView.CameraGLThread f18065b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18064a = i10;
        this.f18065b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18064a) {
            case 0:
                this.f18065b.lambda$onDraw$4();
                return;
            case 1:
                this.f18065b.lambda$onDraw$5();
                return;
            case 2:
                this.f18065b.lambda$new$0();
                return;
            case 3:
                this.f18065b.lambda$new$1();
                return;
            case 4:
                this.f18065b.lambda$new$2();
                return;
            default:
                this.f18065b.lambda$new$3();
                return;
        }
    }
}
