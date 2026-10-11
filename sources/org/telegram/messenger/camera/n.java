package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17543a;
    public final CameraView f17544b;
    public final CameraView.CameraGLThread f17545c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17543a = i10;
        this.f17544b = cameraView;
        this.f17545c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17543a) {
            case 0:
                this.f17544b.lambda$createCamera$10(this.f17545c);
                return;
            default:
                this.f17544b.lambda$createCamera$8(this.f17545c);
                return;
        }
    }
}
