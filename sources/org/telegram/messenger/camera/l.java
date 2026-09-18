package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f15862a = 1;
    public final CameraView f15863b;
    public final int f15864c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f15863b = cameraView;
        this.f15864c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15862a) {
            case 0:
                this.f15863b.lambda$createCamera$12(this.d, this.f15864c);
                return;
            default:
                this.f15863b.lambda$createCamera$9(this.f15864c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15863b = cameraView;
        this.d = cameraGLThread;
        this.f15864c = i10;
    }
}
