package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class m implements Runnable {
    public final int f21979a;
    public final CameraView f21980b;
    public final CameraView.CameraGLThread f21981c;

    public m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i3) {
        this.f21979a = i3;
        this.f21980b = cameraView;
        this.f21981c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21979a) {
            case 0:
                CameraView.d(this.f21980b, this.f21981c);
                return;
            default:
                CameraView.c(this.f21980b, this.f21981c);
                return;
        }
    }
}
