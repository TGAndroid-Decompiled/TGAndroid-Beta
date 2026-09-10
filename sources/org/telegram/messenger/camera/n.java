package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f14890a;
    public final CameraView f14891b;
    public final CameraView.CameraGLThread f14892c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f14890a = i10;
        this.f14891b = cameraView;
        this.f14892c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f14890a) {
            case 0:
                this.f14891b.lambda$createCamera$10(this.f14892c);
                return;
            default:
                this.f14891b.lambda$createCamera$8(this.f14892c);
                return;
        }
    }
}
