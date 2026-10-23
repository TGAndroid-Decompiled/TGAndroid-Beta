package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f18068a;
    public final CameraView f18069b;
    public final CameraView.CameraGLThread f18070c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18068a = i10;
        this.f18069b = cameraView;
        this.f18070c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18068a) {
            case 0:
                this.f18069b.lambda$createCamera$10(this.f18070c);
                return;
            default:
                this.f18069b.lambda$createCamera$8(this.f18070c);
                return;
        }
    }
}
