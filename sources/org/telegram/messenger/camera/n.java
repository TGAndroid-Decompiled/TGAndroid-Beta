package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f18126a;
    public final CameraView f18127b;
    public final CameraView.CameraGLThread f18128c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18126a = i10;
        this.f18127b = cameraView;
        this.f18128c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18126a) {
            case 0:
                this.f18127b.lambda$createCamera$10(this.f18128c);
                return;
            default:
                this.f18127b.lambda$createCamera$8(this.f18128c);
                return;
        }
    }
}
