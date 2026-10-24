package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f18121a = 1;
    public final CameraView f18122b;
    public final int f18123c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f18122b = cameraView;
        this.f18123c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18121a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f18122b, this.f18123c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f18122b, this.f18123c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18122b = cameraView;
        this.d = cameraGLThread;
        this.f18123c = i10;
    }
}
