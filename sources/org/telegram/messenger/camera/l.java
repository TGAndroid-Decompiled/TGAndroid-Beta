package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f15853a = 1;
    public final CameraView f15854b;
    public final int f15855c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f15854b = cameraView;
        this.f15855c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15853a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f15854b, this.f15855c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f15854b, this.f15855c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15854b = cameraView;
        this.d = cameraGLThread;
        this.f15855c = i10;
    }
}
