package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17549a = 1;
    public final CameraView f17550b;
    public final int f17551c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17550b = cameraView;
        this.f17551c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17549a) {
            case 0:
                this.f17550b.lambda$createCamera$12(this.d, this.f17551c);
                return;
            default:
                this.f17550b.lambda$createCamera$9(this.f17551c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17550b = cameraView;
        this.d = cameraGLThread;
        this.f17551c = i10;
    }
}
