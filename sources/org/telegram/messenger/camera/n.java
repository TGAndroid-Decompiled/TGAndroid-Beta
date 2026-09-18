package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f16046a;
    public final CameraView f16047b;
    public final CameraView.CameraGLThread f16048c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16046a = i10;
        this.f16047b = cameraView;
        this.f16048c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16046a) {
            case 0:
                CameraView.d(this.f16047b, this.f16048c);
                return;
            default:
                CameraView.c(this.f16047b, this.f16048c);
                return;
        }
    }
}
