package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f18055a = 1;
    public final CameraView f18056b;
    public final int f18057c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f18056b = cameraView;
        this.f18057c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f18055a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f18056b, this.f18057c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f18056b, this.f18057c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f18056b = cameraView;
        this.d = cameraGLThread;
        this.f18057c = i10;
    }
}
