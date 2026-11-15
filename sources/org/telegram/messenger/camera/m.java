package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class m implements Runnable {
    public final int f22837a;
    public final CameraView f22838b;
    public final CameraView.CameraGLThread f22839c;

    public m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f22837a = i7;
        this.f22838b = cameraView;
        this.f22839c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f22837a) {
            case 0:
                this.f22838b.lambda$createCamera$10(this.f22839c);
                return;
            default:
                this.f22838b.lambda$createCamera$8(this.f22839c);
                return;
        }
    }
}
