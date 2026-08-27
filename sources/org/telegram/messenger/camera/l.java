package org.telegram.messenger.camera;

public final class l implements Runnable {

    public final int f19927a = 1;

    public final CameraView f19928b;

    public final int f19929c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f19928b = cameraView;
        this.f19929c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f19927a) {
            case 0:
                this.f19928b.lambda$createCamera$12(this.d, this.f19929c);
                break;
            default:
                this.f19928b.lambda$createCamera$9(this.f19929c, this.d);
                break;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f19928b = cameraView;
        this.d = cameraGLThread;
        this.f19929c = i10;
    }
}
