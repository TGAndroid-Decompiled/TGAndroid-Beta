package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class k implements Runnable {
    public final int f22832a = 1;
    public final CameraView f22833b;
    public final int f22834c;
    public final CameraView.CameraGLThread d;

    public k(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f22833b = cameraView;
        this.f22834c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f22832a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f22833b, this.f22834c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f22833b, this.f22834c, this.d);
                return;
        }
    }

    public k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f22833b = cameraView;
        this.d = cameraGLThread;
        this.f22834c = i7;
    }
}
