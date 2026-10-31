package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f14951a = 1;
    public final CameraView f14952b;
    public final int f14953c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f14952b = cameraView;
        this.f14953c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f14951a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f14952b, this.f14953c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f14952b, this.f14953c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f14952b = cameraView;
        this.d = cameraGLThread;
        this.f14953c = i10;
    }
}
