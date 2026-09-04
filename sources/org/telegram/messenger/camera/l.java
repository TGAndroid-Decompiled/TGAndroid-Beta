package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17354a = 1;
    public final CameraView f17355b;
    public final int f17356c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17355b = cameraView;
        this.f17356c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17354a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f17355b, this.f17356c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f17355b, this.f17356c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17355b = cameraView;
        this.d = cameraGLThread;
        this.f17356c = i10;
    }
}
