package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f16956a;
    public final CameraView f16957b;
    public final CameraView.CameraGLThread f16958c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16956a = i10;
        this.f16957b = cameraView;
        this.f16958c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16956a) {
            case 0:
                this.f16957b.lambda$createCamera$10(this.f16958c);
                return;
            default:
                this.f16957b.lambda$createCamera$8(this.f16958c);
                return;
        }
    }
}
