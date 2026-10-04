package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17546a = 1;
    public final CameraView f17547b;
    public final int f17548c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17547b = cameraView;
        this.f17548c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17546a) {
            case 0:
                this.f17547b.lambda$createCamera$12(this.d, this.f17548c);
                return;
            default:
                this.f17547b.lambda$createCamera$9(this.f17548c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17547b = cameraView;
        this.d = cameraGLThread;
        this.f17548c = i10;
    }
}
