package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f16079a;
    public final CameraView f16080b;
    public final CameraView.CameraGLThread f16081c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16079a = i10;
        this.f16080b = cameraView;
        this.f16081c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16079a) {
            case 0:
                this.f16080b.lambda$createCamera$10(this.f16081c);
                return;
            default:
                this.f16080b.lambda$createCamera$8(this.f16081c);
                return;
        }
    }
}
