package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class m implements Runnable {
    public final int f23424a;
    public final CameraView f23425b;
    public final CameraView.CameraGLThread f23426c;

    public m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23424a = i7;
        this.f23425b = cameraView;
        this.f23426c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23424a) {
            case 0:
                CameraView.d(this.f23425b, this.f23426c);
                return;
            default:
                CameraView.c(this.f23425b, this.f23426c);
                return;
        }
    }
}
