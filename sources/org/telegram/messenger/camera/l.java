package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17372a = 1;
    public final CameraView f17373b;
    public final int f17374c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17373b = cameraView;
        this.f17374c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17372a) {
            case 0:
                this.f17373b.lambda$createCamera$12(this.d, this.f17374c);
                return;
            default:
                this.f17373b.lambda$createCamera$9(this.f17374c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17373b = cameraView;
        this.d = cameraGLThread;
        this.f17374c = i10;
    }
}
