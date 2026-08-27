package org.telegram.messenger.camera;

public final class p implements Runnable {

    public final int f19936a;

    public final CameraView.CameraGLThread f19937b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f19936a = i10;
        this.f19937b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f19936a) {
            case 0:
                this.f19937b.lambda$onDraw$4();
                break;
            case 1:
                this.f19937b.lambda$onDraw$5();
                break;
            case 2:
                this.f19937b.lambda$new$0();
                break;
            case 3:
                this.f19937b.lambda$new$1();
                break;
            case 4:
                this.f19937b.lambda$new$2();
                break;
            default:
                this.f19937b.lambda$new$3();
                break;
        }
    }
}
