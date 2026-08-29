package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f19920a;
    public final CameraView f19921b;
    public final CameraView.CameraGLThread f19922c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f19920a = i10;
        this.f19921b = cameraView;
        this.f19922c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f19920a) {
            case 0:
                this.f19921b.lambda$createCamera$10(this.f19922c);
                return;
            default:
                this.f19921b.lambda$createCamera$8(this.f19922c);
                return;
        }
    }
}
