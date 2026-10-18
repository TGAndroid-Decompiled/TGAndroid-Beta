package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f18062a;
    public final CameraView f18063b;
    public final CameraView.CameraGLThread f18064c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18062a = i10;
        this.f18063b = cameraView;
        this.f18064c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18062a) {
            case 0:
                this.f18063b.lambda$createCamera$10(this.f18064c);
                return;
            default:
                this.f18063b.lambda$createCamera$8(this.f18064c);
                return;
        }
    }
}
