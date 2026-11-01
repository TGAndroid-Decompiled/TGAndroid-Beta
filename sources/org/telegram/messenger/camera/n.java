package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f15120a;
    public final CameraView f15121b;
    public final CameraView.CameraGLThread f15122c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f15120a = i10;
        this.f15121b = cameraView;
        this.f15122c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f15120a) {
            case 0:
                CameraView.d(this.f15121b, this.f15122c);
                return;
            default:
                CameraView.c(this.f15121b, this.f15122c);
                return;
        }
    }
}
