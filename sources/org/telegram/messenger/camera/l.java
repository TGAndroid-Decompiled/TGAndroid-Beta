package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17372a = 1;
    public final CameraView f17373b;
    public final int f17374c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17373b = cameraView;
        this.f17374c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17372a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f17373b, this.f17374c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f17373b, this.f17374c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17373b = cameraView;
        this.d = cameraGLThread;
        this.f17374c = i10;
    }
}
