package org.telegram.messenger.camera;

public final class n implements Runnable {

    public final int f19932a;

    public final CameraView f19933b;

    public final CameraView.CameraGLThread f19934c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f19932a = i10;
        this.f19933b = cameraView;
        this.f19934c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f19932a) {
            case 0:
                this.f19933b.lambda$createCamera$10(this.f19934c);
                break;
            default:
                this.f19933b.lambda$createCamera$8(this.f19934c);
                break;
        }
    }
}
