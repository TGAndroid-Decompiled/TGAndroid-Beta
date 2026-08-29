package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f19915a = 1;
    public final CameraView f19916b;
    public final int f19917c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f19916b = cameraView;
        this.f19917c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f19915a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f19916b, this.f19917c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f19916b, this.f19917c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f19916b = cameraView;
        this.d = cameraGLThread;
        this.f19917c = i10;
    }
}
