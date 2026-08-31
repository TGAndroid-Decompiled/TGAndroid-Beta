package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f18384a;
    public final CameraView.CameraGLThread f18385b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18384a = i10;
        this.f18385b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18384a) {
            case 0:
                this.f18385b.lambda$onDraw$4();
                return;
            case 1:
                this.f18385b.lambda$onDraw$5();
                return;
            case 2:
                this.f18385b.lambda$new$0();
                return;
            case 3:
                this.f18385b.lambda$new$1();
                return;
            case 4:
                this.f18385b.lambda$new$2();
                return;
            default:
                this.f18385b.lambda$new$3();
                return;
        }
    }
}
