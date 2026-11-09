package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class m implements Runnable {
    public final int f21818a;
    public final CameraView f21819b;
    public final CameraView.CameraGLThread f21820c;

    public m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f21818a = i7;
        this.f21819b = cameraView;
        this.f21820c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21818a) {
            case 0:
                CameraView.d(this.f21819b, this.f21820c);
                return;
            default:
                CameraView.c(this.f21819b, this.f21820c);
                return;
        }
    }
}
