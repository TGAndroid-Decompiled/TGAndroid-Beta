package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f15124a;
    public final CameraView.CameraGLThread f15125b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15124a = i10;
        this.f15125b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15124a) {
            case 0:
                CameraView.CameraGLThread.f(this.f15125b);
                return;
            case 1:
                CameraView.CameraGLThread.a(this.f15125b);
                return;
            case 2:
                CameraView.CameraGLThread.g(this.f15125b);
                return;
            case 3:
                CameraView.CameraGLThread.b(this.f15125b);
                return;
            case 4:
                CameraView.CameraGLThread.c(this.f15125b);
                return;
            default:
                CameraView.CameraGLThread.h(this.f15125b);
                return;
        }
    }
}
