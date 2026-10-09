package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17541a;
    public final CameraView f17542b;
    public final CameraView.CameraGLThread f17543c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17541a = i10;
        this.f17542b = cameraView;
        this.f17543c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17541a) {
            case 0:
                this.f17542b.lambda$createCamera$10(this.f17543c);
                return;
            default:
                this.f17542b.lambda$createCamera$8(this.f17543c);
                return;
        }
    }
}
