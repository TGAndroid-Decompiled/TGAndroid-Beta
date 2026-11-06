package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class m implements Runnable {
    public final int f21776a;
    public final CameraView f21777b;
    public final CameraView.CameraGLThread f21778c;

    public m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f21776a = i7;
        this.f21777b = cameraView;
        this.f21778c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21776a) {
            case 0:
                CameraView.d(this.f21777b, this.f21778c);
                return;
            default:
                CameraView.c(this.f21777b, this.f21778c);
                return;
        }
    }
}
