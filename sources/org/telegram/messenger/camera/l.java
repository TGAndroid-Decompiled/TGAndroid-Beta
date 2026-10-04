package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f17544a = 1;
    public final CameraView f17545b;
    public final int f17546c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f17545b = cameraView;
        this.f17546c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17544a) {
            case 0:
                this.f17545b.lambda$createCamera$12(this.d, this.f17546c);
                return;
            default:
                this.f17545b.lambda$createCamera$9(this.f17546c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17545b = cameraView;
        this.d = cameraGLThread;
        this.f17546c = i10;
    }
}
