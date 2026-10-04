package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17547a = 1;
    public final CameraView f17548b;
    public final int f17549c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17548b = cameraView;
        this.f17549c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17547a) {
            case 0:
                this.f17548b.lambda$createCamera$12(this.d, this.f17549c);
                return;
            default:
                this.f17548b.lambda$createCamera$9(this.f17549c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17548b = cameraView;
        this.d = cameraGLThread;
        this.f17549c = i10;
    }
}
