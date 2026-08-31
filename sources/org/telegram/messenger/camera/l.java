package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f18375a = 1;
    public final CameraView f18376b;
    public final int f18377c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f18376b = cameraView;
        this.f18377c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18375a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f18376b, this.f18377c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f18376b, this.f18377c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18376b = cameraView;
        this.d = cameraGLThread;
        this.f18377c = i10;
    }
}
