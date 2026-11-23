package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f23237a = 1;
    public final CameraView f23238b;
    public final int f23239c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i7, CameraView.CameraGLThread cameraGLThread) {
        this.f23238b = cameraView;
        this.f23239c = i7;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f23237a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f23238b, this.f23239c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f23238b, this.f23239c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f23238b = cameraView;
        this.d = cameraGLThread;
        this.f23239c = i7;
    }
}
