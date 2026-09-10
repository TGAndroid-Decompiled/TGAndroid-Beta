package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f14885a = 1;
    public final CameraView f14886b;
    public final int f14887c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f14886b = cameraView;
        this.f14887c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f14885a) {
            case 0:
                this.f14886b.lambda$createCamera$12(this.d, this.f14887c);
                return;
            default:
                this.f14886b.lambda$createCamera$9(this.f14887c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f14886b = cameraView;
        this.d = cameraGLThread;
        this.f14887c = i10;
    }
}
