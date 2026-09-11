package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17377a;
    public final CameraView f17378b;
    public final CameraView.CameraGLThread f17379c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17377a = i10;
        this.f17378b = cameraView;
        this.f17379c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17377a) {
            case 0:
                this.f17378b.lambda$createCamera$10(this.f17379c);
                return;
            default:
                this.f17378b.lambda$createCamera$8(this.f17379c);
                return;
        }
    }
}
