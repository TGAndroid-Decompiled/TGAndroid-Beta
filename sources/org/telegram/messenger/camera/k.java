package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class k implements Runnable {
    public final int f16668a = 1;
    public final CameraView f16669b;
    public final int f16670c;
    public final CameraView.CameraGLThread d;

    public k(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f16669b = cameraView;
        this.f16670c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16668a) {
            case 0:
                this.f16669b.lambda$createCamera$12(this.d, this.f16670c);
                return;
            default:
                this.f16669b.lambda$createCamera$9(this.f16670c, this.d);
                return;
        }
    }

    public k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16669b = cameraView;
        this.d = cameraGLThread;
        this.f16670c = i10;
    }
}
