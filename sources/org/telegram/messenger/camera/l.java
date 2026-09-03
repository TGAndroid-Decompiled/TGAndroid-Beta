package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f18377a = 1;
    public final CameraView f18378b;
    public final int f18379c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f18378b = cameraView;
        this.f18379c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18377a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f18378b, this.f18379c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f18378b, this.f18379c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18378b = cameraView;
        this.d = cameraGLThread;
        this.f18379c = i10;
    }
}
