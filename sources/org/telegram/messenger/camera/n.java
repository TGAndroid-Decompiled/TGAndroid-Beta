package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f18060a;
    public final CameraView f18061b;
    public final CameraView.CameraGLThread f18062c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18060a = i10;
        this.f18061b = cameraView;
        this.f18062c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18060a) {
            case 0:
                this.f18061b.lambda$createCamera$10(this.f18062c);
                return;
            default:
                this.f18061b.lambda$createCamera$8(this.f18062c);
                return;
        }
    }
}
