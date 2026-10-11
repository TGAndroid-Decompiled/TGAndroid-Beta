package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17538a = 1;
    public final CameraView f17539b;
    public final int f17540c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17539b = cameraView;
        this.f17540c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17538a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f17539b, this.f17540c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f17539b, this.f17540c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17539b = cameraView;
        this.d = cameraGLThread;
        this.f17540c = i10;
    }
}
