package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f23316a;
    public final CameraView.CameraGLThread f23317b;

    public p(CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23316a = i7;
        this.f23317b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23316a) {
            case 0:
                this.f23317b.lambda$onDraw$4();
                return;
            case 1:
                this.f23317b.lambda$onDraw$5();
                return;
            case 2:
                this.f23317b.lambda$new$0();
                return;
            case 3:
                this.f23317b.lambda$new$1();
                return;
            case 4:
                this.f23317b.lambda$new$2();
                return;
            default:
                this.f23317b.lambda$new$3();
                return;
        }
    }
}
