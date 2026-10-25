package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class k implements Runnable {
    public final int f19795a = 1;
    public final CameraView f19796b;
    public final int f19797c;
    public final CameraView.CameraGLThread d;

    public k(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f19796b = cameraView;
        this.f19797c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f19795a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f19796b, this.f19797c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f19796b, this.f19797c, this.d);
                return;
        }
    }

    public k(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f19796b = cameraView;
        this.d = cameraGLThread;
        this.f19797c = i10;
    }
}
