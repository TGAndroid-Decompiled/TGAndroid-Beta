package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class o implements Runnable {
    public final int f21780a;
    public final CameraView.CameraGLThread f21781b;

    public o(CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f21780a = i7;
        this.f21781b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21780a) {
            case 0:
                CameraView.CameraGLThread.f(this.f21781b);
                return;
            case 1:
                CameraView.CameraGLThread.a(this.f21781b);
                return;
            case 2:
                CameraView.CameraGLThread.g(this.f21781b);
                return;
            case 3:
                CameraView.CameraGLThread.b(this.f21781b);
                return;
            case 4:
                CameraView.CameraGLThread.c(this.f21781b);
                return;
            default:
                CameraView.CameraGLThread.h(this.f21781b);
                return;
        }
    }
}
