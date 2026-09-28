package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f16101a;
    public final CameraView f16102b;
    public final CameraView.CameraGLThread f16103c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16101a = i10;
        this.f16102b = cameraView;
        this.f16103c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16101a) {
            case 0:
                this.f16102b.lambda$createCamera$10(this.f16103c);
                return;
            default:
                this.f16102b.lambda$createCamera$8(this.f16103c);
                return;
        }
    }
}
