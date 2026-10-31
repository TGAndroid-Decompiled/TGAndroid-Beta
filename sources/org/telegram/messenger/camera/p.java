package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f14960a;
    public final CameraView.CameraGLThread f14961b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f14960a = i10;
        this.f14961b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f14960a) {
            case 0:
                CameraView.CameraGLThread.f(this.f14961b);
                return;
            case 1:
                CameraView.CameraGLThread.a(this.f14961b);
                return;
            case 2:
                CameraView.CameraGLThread.g(this.f14961b);
                return;
            case 3:
                CameraView.CameraGLThread.b(this.f14961b);
                return;
            case 4:
                CameraView.CameraGLThread.c(this.f14961b);
                return;
            default:
                CameraView.CameraGLThread.h(this.f14961b);
                return;
        }
    }
}
