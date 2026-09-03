package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f18382a;
    public final CameraView f18383b;
    public final CameraView.CameraGLThread f18384c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18382a = i10;
        this.f18383b = cameraView;
        this.f18384c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18382a) {
            case 0:
                this.f18383b.lambda$createCamera$10(this.f18384c);
                return;
            default:
                this.f18383b.lambda$createCamera$8(this.f18384c);
                return;
        }
    }
}
