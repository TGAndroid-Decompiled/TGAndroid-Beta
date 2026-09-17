package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f15862a = 1;
    public final CameraView f15863b;
    public final int f15864c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f15863b = cameraView;
        this.f15864c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15862a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f15863b, this.f15864c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f15863b, this.f15864c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15863b = cameraView;
        this.d = cameraGLThread;
        this.f15864c = i10;
    }
}
