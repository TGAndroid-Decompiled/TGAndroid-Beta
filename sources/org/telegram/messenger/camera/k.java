package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class k implements Runnable {
    public final int f21771a = 1;
    public final CameraView f21772b;
    public final int f21773c;
    public final CameraView.CameraGLThread d;

    public k(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f21772b = cameraView;
        this.f21773c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f21771a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f21772b, this.f21773c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f21772b, this.f21773c, this.d);
                return;
        }
    }

    public k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f21772b = cameraView;
        this.d = cameraGLThread;
        this.f21773c = i7;
    }
}
