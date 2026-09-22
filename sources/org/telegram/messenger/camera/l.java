package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f15849a = 1;
    public final CameraView f15850b;
    public final int f15851c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f15850b = cameraView;
        this.f15851c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15849a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f15850b, this.f15851c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f15850b, this.f15851c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15850b = cameraView;
        this.d = cameraGLThread;
        this.f15851c = i10;
    }
}
