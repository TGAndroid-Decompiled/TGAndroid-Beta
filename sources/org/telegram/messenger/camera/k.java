package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class k implements Runnable {
    public final int f16971a = 1;
    public final CameraView f16972b;
    public final int f16973c;
    public final CameraView.CameraGLThread d;

    public k(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f16972b = cameraView;
        this.f16973c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16971a) {
            case 0:
                this.f16972b.lambda$createCamera$12(this.d, this.f16973c);
                return;
            default:
                this.f16972b.lambda$createCamera$9(this.f16973c, this.d);
                return;
        }
    }

    public k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16972b = cameraView;
        this.d = cameraGLThread;
        this.f16973c = i10;
    }
}
