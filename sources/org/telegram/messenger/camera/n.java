package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f15867a;
    public final CameraView f15868b;
    public final CameraView.CameraGLThread f15869c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15867a = i10;
        this.f15868b = cameraView;
        this.f15869c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15867a) {
            case 0:
                this.f15868b.lambda$createCamera$10(this.f15869c);
                return;
            default:
                this.f15868b.lambda$createCamera$8(this.f15869c);
                return;
        }
    }
}
