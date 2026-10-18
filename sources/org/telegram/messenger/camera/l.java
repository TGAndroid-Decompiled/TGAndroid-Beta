package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f18057a = 1;
    public final CameraView f18058b;
    public final int f18059c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f18058b = cameraView;
        this.f18059c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18057a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f18058b, this.f18059c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f18058b, this.f18059c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18058b = cameraView;
        this.d = cameraGLThread;
        this.f18059c = i10;
    }
}
