package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17540a = 1;
    public final CameraView f17541b;
    public final int f17542c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17541b = cameraView;
        this.f17542c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17540a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f17541b, this.f17542c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f17541b, this.f17542c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17541b = cameraView;
        this.d = cameraGLThread;
        this.f17542c = i10;
    }
}
