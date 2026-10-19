package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f18060a = 1;
    public final CameraView f18061b;
    public final int f18062c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f18061b = cameraView;
        this.f18062c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18060a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f18061b, this.f18062c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f18061b, this.f18062c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18061b = cameraView;
        this.d = cameraGLThread;
        this.f18062c = i10;
    }
}
