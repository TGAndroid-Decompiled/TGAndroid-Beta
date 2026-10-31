package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f14956a;
    public final CameraView f14957b;
    public final CameraView.CameraGLThread f14958c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f14956a = i10;
        this.f14957b = cameraView;
        this.f14958c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f14956a) {
            case 0:
                CameraView.d(this.f14957b, this.f14958c);
                return;
            default:
                CameraView.c(this.f14957b, this.f14958c);
                return;
        }
    }
}
