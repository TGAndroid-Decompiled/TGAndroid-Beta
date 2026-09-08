package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17381a = 1;
    public final CameraView f17382b;
    public final int f17383c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17382b = cameraView;
        this.f17383c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17381a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f17382b, this.f17383c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f17382b, this.f17383c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17382b = cameraView;
        this.d = cameraGLThread;
        this.f17383c = i10;
    }
}
