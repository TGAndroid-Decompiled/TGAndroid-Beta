package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class k implements Runnable {
    public final int f21813a = 1;
    public final CameraView f21814b;
    public final int f21815c;
    public final CameraView.CameraGLThread d;

    public k(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f21814b = cameraView;
        this.f21815c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21813a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f21814b, this.f21815c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f21814b, this.f21815c, this.d);
                return;
        }
    }

    public k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f21814b = cameraView;
        this.d = cameraGLThread;
        this.f21815c = i7;
    }
}
