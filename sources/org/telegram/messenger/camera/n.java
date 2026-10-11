package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f17579a;
    public final CameraView f17580b;
    public final CameraView.CameraGLThread f17581c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f17579a = i10;
        this.f17580b = cameraView;
        this.f17581c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f17579a) {
            case 0:
                this.f17580b.lambda$createCamera$10(this.f17581c);
                return;
            default:
                this.f17580b.lambda$createCamera$8(this.f17581c);
                return;
        }
    }
}
