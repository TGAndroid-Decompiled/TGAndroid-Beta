package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f19959a = 1;
    public final CameraView f19960b;
    public final int f19961c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i9, CameraView.CameraGLThread cameraGLThread) {
        this.f19960b = cameraView;
        this.f19961c = i9;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f19959a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f19960b, this.f19961c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f19960b, this.f19961c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i9) {
        this.f19960b = cameraView;
        this.d = cameraGLThread;
        this.f19961c = i9;
    }
}
