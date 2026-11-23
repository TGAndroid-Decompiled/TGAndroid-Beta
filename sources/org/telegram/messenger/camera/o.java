package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class o implements Runnable {
    public final int f23428a;
    public final CameraView.CameraGLThread f23429b;

    public o(CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23428a = i7;
        this.f23429b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23428a) {
            case 0:
                CameraView.CameraGLThread.f(this.f23429b);
                return;
            case 1:
                CameraView.CameraGLThread.a(this.f23429b);
                return;
            case 2:
                CameraView.CameraGLThread.g(this.f23429b);
                return;
            case 3:
                CameraView.CameraGLThread.b(this.f23429b);
                return;
            case 4:
                CameraView.CameraGLThread.c(this.f23429b);
                return;
            default:
                CameraView.CameraGLThread.h(this.f23429b);
                return;
        }
    }
}
