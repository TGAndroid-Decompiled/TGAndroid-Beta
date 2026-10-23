package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f18063a = 1;
    public final CameraView f18064b;
    public final int f18065c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f18064b = cameraView;
        this.f18065c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18063a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f18064b, this.f18065c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f18064b, this.f18065c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18064b = cameraView;
        this.d = cameraGLThread;
        this.f18065c = i10;
    }
}
