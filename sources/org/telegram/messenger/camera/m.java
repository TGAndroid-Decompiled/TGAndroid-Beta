package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class m implements Runnable {
    public final int f21822a;
    public final CameraView f21823b;
    public final CameraView.CameraGLThread f21824c;

    public m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f21822a = i7;
        this.f21823b = cameraView;
        this.f21824c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21822a) {
            case 0:
                this.f21823b.lambda$createCamera$10(this.f21824c);
                return;
            default:
                this.f21823b.lambda$createCamera$8(this.f21824c);
                return;
        }
    }
}
