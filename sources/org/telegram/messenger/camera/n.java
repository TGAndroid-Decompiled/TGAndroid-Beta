package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f16117a;
    public final CameraView f16118b;
    public final CameraView.CameraGLThread f16119c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16117a = i10;
        this.f16118b = cameraView;
        this.f16119c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16117a) {
            case 0:
                this.f16118b.lambda$createCamera$10(this.f16119c);
                return;
            default:
                this.f16118b.lambda$createCamera$8(this.f16119c);
                return;
        }
    }
}
