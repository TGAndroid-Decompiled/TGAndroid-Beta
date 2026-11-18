package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f23307a = 1;
    public final CameraView f23308b;
    public final int f23309c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f23308b = cameraView;
        this.f23309c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23307a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f23308b, this.f23309c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f23308b, this.f23309c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23308b = cameraView;
        this.d = cameraGLThread;
        this.f23309c = i7;
    }
}
