package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f16112a = 1;
    public final CameraView f16113b;
    public final int f16114c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f16113b = cameraView;
        this.f16114c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16112a) {
            case 0:
                this.f16113b.lambda$createCamera$12(this.d, this.f16114c);
                return;
            default:
                this.f16113b.lambda$createCamera$9(this.f16114c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16113b = cameraView;
        this.d = cameraGLThread;
        this.f16114c = i10;
    }
}
