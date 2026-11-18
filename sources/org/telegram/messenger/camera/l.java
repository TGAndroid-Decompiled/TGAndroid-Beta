package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f23304a = 1;
    public final CameraView f23305b;
    public final int f23306c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f23305b = cameraView;
        this.f23306c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23304a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f23305b, this.f23306c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f23305b, this.f23306c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23305b = cameraView;
        this.d = cameraGLThread;
        this.f23306c = i7;
    }
}
