package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f15854a;
    public final CameraView f15855b;
    public final CameraView.CameraGLThread f15856c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15854a = i10;
        this.f15855b = cameraView;
        this.f15856c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15854a) {
            case 0:
                this.f15855b.lambda$createCamera$10(this.f15856c);
                return;
            default:
                this.f15855b.lambda$createCamera$8(this.f15856c);
                return;
        }
    }
}
