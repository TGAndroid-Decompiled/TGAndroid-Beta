package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f19968a;
    public final CameraView.CameraGLThread f19969b;

    public p(CameraView.CameraGLThread cameraGLThread, int i9) {
        this.f19968a = i9;
        this.f19969b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f19968a) {
            case 0:
                this.f19969b.lambda$onDraw$4();
                return;
            case 1:
                this.f19969b.lambda$onDraw$5();
                return;
            case 2:
                this.f19969b.lambda$new$0();
                return;
            case 3:
                this.f19969b.lambda$new$1();
                return;
            case 4:
                this.f19969b.lambda$new$2();
                return;
            default:
                this.f19969b.lambda$new$3();
                return;
        }
    }
}
