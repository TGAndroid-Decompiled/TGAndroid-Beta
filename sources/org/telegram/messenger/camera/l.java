package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17399a = 1;
    public final CameraView f17400b;
    public final int f17401c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17400b = cameraView;
        this.f17401c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17399a) {
            case 0:
                this.f17400b.lambda$createCamera$12(this.d, this.f17401c);
                return;
            default:
                this.f17400b.lambda$createCamera$9(this.f17401c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17400b = cameraView;
        this.d = cameraGLThread;
        this.f17401c = i10;
    }
}
