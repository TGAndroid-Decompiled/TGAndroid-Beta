package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f15858a;
    public final CameraView f15859b;
    public final CameraView.CameraGLThread f15860c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15858a = i10;
        this.f15859b = cameraView;
        this.f15860c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15858a) {
            case 0:
                this.f15859b.lambda$createCamera$10(this.f15860c);
                return;
            default:
                this.f15859b.lambda$createCamera$8(this.f15860c);
                return;
        }
    }
}
