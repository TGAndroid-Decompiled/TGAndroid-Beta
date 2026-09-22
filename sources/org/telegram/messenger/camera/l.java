package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f16089a = 1;
    public final CameraView f16090b;
    public final int f16091c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f16090b = cameraView;
        this.f16091c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16089a) {
            case 0:
                this.f16090b.lambda$createCamera$12(this.d, this.f16091c);
                return;
            default:
                this.f16090b.lambda$createCamera$9(this.f16091c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16090b = cameraView;
        this.d = cameraGLThread;
        this.f16091c = i10;
    }
}
