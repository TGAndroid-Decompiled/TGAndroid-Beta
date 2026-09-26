package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f16101a = 1;
    public final CameraView f16102b;
    public final int f16103c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f16102b = cameraView;
        this.f16103c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16101a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f16102b, this.f16103c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f16102b, this.f16103c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16102b = cameraView;
        this.d = cameraGLThread;
        this.f16103c = i10;
    }
}
