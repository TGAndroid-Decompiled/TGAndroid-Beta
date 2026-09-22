package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f16094a;
    public final CameraView f16095b;
    public final CameraView.CameraGLThread f16096c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16094a = i10;
        this.f16095b = cameraView;
        this.f16096c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16094a) {
            case 0:
                this.f16095b.lambda$createCamera$10(this.f16096c);
                return;
            default:
                this.f16095b.lambda$createCamera$8(this.f16096c);
                return;
        }
    }
}
