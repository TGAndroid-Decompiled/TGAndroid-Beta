package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f16095a = 1;
    public final CameraView f16096b;
    public final int f16097c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f16096b = cameraView;
        this.f16097c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16095a) {
            case 0:
                this.f16096b.lambda$createCamera$12(this.d, this.f16097c);
                return;
            default:
                this.f16096b.lambda$createCamera$9(this.f16097c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16096b = cameraView;
        this.d = cameraGLThread;
        this.f16097c = i10;
    }
}
