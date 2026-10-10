package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17545a;
    public final CameraView f17546b;
    public final CameraView.CameraGLThread f17547c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17545a = i10;
        this.f17546b = cameraView;
        this.f17547c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17545a) {
            case 0:
                this.f17546b.lambda$createCamera$10(this.f17547c);
                return;
            default:
                this.f17546b.lambda$createCamera$8(this.f17547c);
                return;
        }
    }
}
