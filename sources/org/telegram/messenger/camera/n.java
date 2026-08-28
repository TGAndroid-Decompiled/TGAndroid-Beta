package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f19964a;
    public final CameraView f19965b;
    public final CameraView.CameraGLThread f19966c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i9) {
        this.f19964a = i9;
        this.f19965b = cameraView;
        this.f19966c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f19964a) {
            case 0:
                this.f19965b.lambda$createCamera$10(this.f19966c);
                return;
            default:
                this.f19965b.lambda$createCamera$8(this.f19966c);
                return;
        }
    }
}
