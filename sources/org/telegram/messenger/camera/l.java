package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f18061a = 1;
    public final CameraView f18062b;
    public final int f18063c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f18062b = cameraView;
        this.f18063c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18061a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f18062b, this.f18063c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f18062b, this.f18063c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18062b = cameraView;
        this.d = cameraGLThread;
        this.f18063c = i10;
    }
}
