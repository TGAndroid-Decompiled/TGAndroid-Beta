package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f16951a = 1;
    public final CameraView f16952b;
    public final int f16953c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f16952b = cameraView;
        this.f16953c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16951a) {
            case 0:
                CameraView.CameraGLThread cameraGLThread = this.d;
                CameraView.i(this.f16952b, this.f16953c, cameraGLThread);
                return;
            default:
                CameraView.j(this.f16952b, this.f16953c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16952b = cameraView;
        this.d = cameraGLThread;
        this.f16953c = i10;
    }
}
