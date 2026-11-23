package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class k implements Runnable {
    public final int f23419a = 1;
    public final CameraView f23420b;
    public final int f23421c;
    public final CameraView.CameraGLThread d;

    public k(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f23420b = cameraView;
        this.f23421c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23419a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f23420b, this.f23421c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f23420b, this.f23421c, this.d);
                return;
        }
    }

    public k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23420b = cameraView;
        this.d = cameraGLThread;
        this.f23421c = i7;
    }
}
