package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class m implements Runnable {
    public final int f16673a;
    public final CameraView f16674b;
    public final CameraView.CameraGLThread f16675c;

    public m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16673a = i10;
        this.f16674b = cameraView;
        this.f16675c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16673a) {
            case 0:
                this.f16674b.lambda$createCamera$10(this.f16675c);
                return;
            default:
                this.f16674b.lambda$createCamera$8(this.f16675c);
                return;
        }
    }
}
