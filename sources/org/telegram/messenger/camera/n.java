package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f16091a;
    public final CameraView f16092b;
    public final CameraView.CameraGLThread f16093c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16091a = i10;
        this.f16092b = cameraView;
        this.f16093c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16091a) {
            case 0:
                this.f16092b.lambda$createCamera$10(this.f16093c);
                return;
            default:
                this.f16092b.lambda$createCamera$8(this.f16093c);
                return;
        }
    }
}
