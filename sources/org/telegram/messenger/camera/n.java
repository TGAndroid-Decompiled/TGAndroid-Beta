package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f16106a;
    public final CameraView f16107b;
    public final CameraView.CameraGLThread f16108c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16106a = i10;
        this.f16107b = cameraView;
        this.f16108c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16106a) {
            case 0:
                this.f16107b.lambda$createCamera$10(this.f16108c);
                return;
            default:
                this.f16107b.lambda$createCamera$8(this.f16108c);
                return;
        }
    }
}
