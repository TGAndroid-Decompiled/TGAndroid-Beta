package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class k implements Runnable {
    public final int f21974a = 1;
    public final CameraView f21975b;
    public final int f21976c;
    public final CameraView.CameraGLThread d;

    public k(CameraView cameraView, int i3, CameraView.CameraGLThread cameraGLThread) {
        this.f21975b = cameraView;
        this.f21976c = i3;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21974a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f21975b, this.f21976c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f21975b, this.f21976c, this.d);
                return;
        }
    }

    public k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i3) {
        this.f21975b = cameraView;
        this.d = cameraGLThread;
        this.f21976c = i3;
    }
}
