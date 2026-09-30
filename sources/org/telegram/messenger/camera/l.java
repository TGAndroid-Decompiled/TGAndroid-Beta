package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class l implements Runnable {
    public final int f16096a = 1;
    public final CameraView f16097b;
    public final int f16098c;
    public final CameraView.CameraGLThread d;

    public l(CameraView cameraView, int i10, CameraView.CameraGLThread cameraGLThread) {
        this.f16097b = cameraView;
        this.f16098c = i10;
        this.d = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16096a) {
            case 0:
                this.f16097b.lambda$createCamera$12(this.d, this.f16098c);
                return;
            default:
                this.f16097b.lambda$createCamera$9(this.f16098c, this.d);
                return;
        }
    }

    public l(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16097b = cameraView;
        this.d = cameraGLThread;
        this.f16098c = i10;
    }
}
