package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f15843a = 1;
    public final CameraView f15844b;
    public final int f15845c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f15844b = cameraView;
        this.f15845c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15843a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f15844b, this.f15845c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f15844b, this.f15845c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15844b = cameraView;
        this.d = cameraGLThread;
        this.f15845c = i10;
    }
}
