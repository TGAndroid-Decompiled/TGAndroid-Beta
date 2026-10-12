package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17288a;
    public final CameraView f17289b;
    public final CameraView.CameraGLThread f17290c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17288a = i10;
        this.f17289b = cameraView;
        this.f17290c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17288a) {
            case 0:
                this.f17289b.lambda$createCamera$10(this.f17290c);
                return;
            default:
                this.f17289b.lambda$createCamera$8(this.f17290c);
                return;
        }
    }
}
