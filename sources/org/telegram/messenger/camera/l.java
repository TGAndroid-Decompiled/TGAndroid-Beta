package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f23273a = 1;
    public final CameraView f23274b;
    public final int f23275c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f23274b = cameraView;
        this.f23275c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23273a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f23274b, this.f23275c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f23274b, this.f23275c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23274b = cameraView;
        this.d = cameraGLThread;
        this.f23275c = i7;
    }
}
