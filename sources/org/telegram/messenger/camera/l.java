package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f23332a = 1;
    public final CameraView f23333b;
    public final int f23334c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f23333b = cameraView;
        this.f23334c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23332a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f23333b, this.f23334c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f23333b, this.f23334c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23333b = cameraView;
        this.d = cameraGLThread;
        this.f23334c = i7;
    }
}
