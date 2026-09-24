package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f16086a = 1;
    public final CameraView f16087b;
    public final int f16088c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f16087b = cameraView;
        this.f16088c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16086a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f16087b, this.f16088c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f16087b, this.f16088c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16087b = cameraView;
        this.d = cameraGLThread;
        this.f16088c = i10;
    }
}
