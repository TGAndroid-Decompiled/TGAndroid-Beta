package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17386a;
    public final CameraView f17387b;
    public final CameraView.CameraGLThread f17388c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17386a = i10;
        this.f17387b = cameraView;
        this.f17388c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17386a) {
            case 0:
                this.f17387b.lambda$createCamera$10(this.f17388c);
                return;
            default:
                this.f17387b.lambda$createCamera$8(this.f17388c);
                return;
        }
    }
}
