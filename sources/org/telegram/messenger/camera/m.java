package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class m implements Runnable {
    public final int f21782a;
    public final CameraView f21783b;
    public final CameraView.CameraGLThread f21784c;

    public m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f21782a = i7;
        this.f21783b = cameraView;
        this.f21784c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21782a) {
            case 0:
                this.f21783b.lambda$createCamera$10(this.f21784c);
                return;
            default:
                this.f21783b.lambda$createCamera$8(this.f21784c);
                return;
        }
    }
}
