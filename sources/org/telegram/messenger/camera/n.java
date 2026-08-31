package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f18380a;
    public final CameraView f18381b;
    public final CameraView.CameraGLThread f18382c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18380a = i10;
        this.f18381b = cameraView;
        this.f18382c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18380a) {
            case 0:
                this.f18381b.lambda$createCamera$10(this.f18382c);
                return;
            default:
                this.f18381b.lambda$createCamera$8(this.f18382c);
                return;
        }
    }
}
