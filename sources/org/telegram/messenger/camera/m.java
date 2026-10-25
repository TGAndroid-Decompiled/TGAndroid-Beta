package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class m implements Runnable {
    public final int f19800a;
    public final CameraView f19801b;
    public final CameraView.CameraGLThread f19802c;

    public m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f19800a = i10;
        this.f19801b = cameraView;
        this.f19802c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f19800a) {
            case 0:
                this.f19801b.lambda$createCamera$10(this.f19802c);
                return;
            default:
                this.f19801b.lambda$createCamera$8(this.f19802c);
                return;
        }
    }
}
