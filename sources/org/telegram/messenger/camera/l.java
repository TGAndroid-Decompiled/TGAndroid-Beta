package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17574a = 1;
    public final CameraView f17575b;
    public final int f17576c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17575b = cameraView;
        this.f17576c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17574a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f17575b, this.f17576c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f17575b, this.f17576c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17575b = cameraView;
        this.d = cameraGLThread;
        this.f17576c = i10;
    }
}
