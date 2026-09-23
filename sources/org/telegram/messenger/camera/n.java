package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f15848a;
    public final CameraView f15849b;
    public final CameraView.CameraGLThread f15850c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15848a = i10;
        this.f15849b = cameraView;
        this.f15850c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15848a) {
            case 0:
                this.f15849b.lambda$createCamera$10(this.f15850c);
                return;
            default:
                this.f15849b.lambda$createCamera$8(this.f15850c);
                return;
        }
    }
}
