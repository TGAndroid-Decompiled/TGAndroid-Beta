package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f16936a = 1;
    public final CameraView f16937b;
    public final int f16938c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f16937b = cameraView;
        this.f16938c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16936a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f16937b, this.f16938c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f16937b, this.f16938c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16937b = cameraView;
        this.d = cameraGLThread;
        this.f16938c = i10;
    }
}
