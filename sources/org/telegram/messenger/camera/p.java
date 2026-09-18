package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class p implements Runnable {
    public final int f16050a;
    public final CameraView.CameraGLThread f16051b;

    public p(CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16050a = i10;
        this.f16051b = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16050a) {
            case 0:
                CameraView.CameraGLThread.g(this.f16051b);
                return;
            case 1:
                CameraView.CameraGLThread.b(this.f16051b);
                return;
            case 2:
                CameraView.CameraGLThread.h(this.f16051b);
                return;
            case 3:
                CameraView.CameraGLThread.c(this.f16051b);
                return;
            case 4:
                CameraView.CameraGLThread.e(this.f16051b);
                return;
            default:
                CameraView.CameraGLThread.i(this.f16051b);
                return;
        }
    }
}
