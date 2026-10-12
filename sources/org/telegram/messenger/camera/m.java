package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class m implements Runnable {
    public final int f16976a;
    public final CameraView f16977b;
    public final CameraView.CameraGLThread f16978c;

    public m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16976a = i10;
        this.f16977b = cameraView;
        this.f16978c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16976a) {
            case 0:
                this.f16977b.lambda$createCamera$10(this.f16978c);
                return;
            default:
                this.f16977b.lambda$createCamera$8(this.f16978c);
                return;
        }
    }
}
