package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17359a;
    public final CameraView f17360b;
    public final CameraView.CameraGLThread f17361c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17359a = i10;
        this.f17360b = cameraView;
        this.f17361c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17359a) {
            case 0:
                this.f17360b.lambda$createCamera$10(this.f17361c);
                return;
            default:
                this.f17360b.lambda$createCamera$8(this.f17361c);
                return;
        }
    }
}
