package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class k implements Runnable {
    public final int f21817a = 1;
    public final CameraView f21818b;
    public final int f21819c;
    public final CameraView.CameraGLThread d;

    public k(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f21818b = cameraView;
        this.f21819c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21817a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f21818b, this.f21819c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f21818b, this.f21819c, this.d);
                return;
        }
    }

    public k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f21818b = cameraView;
        this.d = cameraGLThread;
        this.f21819c = i7;
    }
}
