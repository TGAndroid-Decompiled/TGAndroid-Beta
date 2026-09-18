package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f16041a = 1;
    public final CameraView f16042b;
    public final int f16043c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f16042b = cameraView;
        this.f16043c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16041a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f16042b, this.f16043c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f16042b, this.f16043c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16042b = cameraView;
        this.d = cameraGLThread;
        this.f16043c = i10;
    }
}
