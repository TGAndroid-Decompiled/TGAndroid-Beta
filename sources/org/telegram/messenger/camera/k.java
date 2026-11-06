package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class k implements Runnable {
    public final int f21777a = 1;
    public final CameraView f21778b;
    public final int f21779c;
    public final CameraView.CameraGLThread d;

    public k(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f21778b = cameraView;
        this.f21779c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21777a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f21778b, this.f21779c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f21778b, this.f21779c, this.d);
                return;
        }
    }

    public k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f21778b = cameraView;
        this.d = cameraGLThread;
        this.f21779c = i7;
    }
}
