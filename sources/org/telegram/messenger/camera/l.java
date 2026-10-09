package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17536a = 1;
    public final CameraView f17537b;
    public final int f17538c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17537b = cameraView;
        this.f17538c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17536a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f17537b, this.f17538c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f17537b, this.f17538c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17537b = cameraView;
        this.d = cameraGLThread;
        this.f17538c = i10;
    }
}
