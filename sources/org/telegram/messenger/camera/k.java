package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class k implements Runnable {
    public final int f22836a = 1;
    public final CameraView f22837b;
    public final int f22838c;
    public final CameraView.CameraGLThread d;

    public k(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f22837b = cameraView;
        this.f22838c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f22836a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f22837b, this.f22838c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f22837b, this.f22838c, this.d);
                return;
        }
    }

    public k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f22837b = cameraView;
        this.d = cameraGLThread;
        this.f22838c = i7;
    }
}
