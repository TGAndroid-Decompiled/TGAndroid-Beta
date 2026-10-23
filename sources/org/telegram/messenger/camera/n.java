package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f18131a;
    public final CameraView f18132b;
    public final CameraView.CameraGLThread f18133c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18131a = i10;
        this.f18132b = cameraView;
        this.f18133c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18131a) {
            case 0:
                this.f18132b.lambda$createCamera$10(this.f18133c);
                return;
            default:
                this.f18132b.lambda$createCamera$8(this.f18133c);
                return;
        }
    }
}
