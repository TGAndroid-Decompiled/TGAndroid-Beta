package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class m implements Runnable {
    public final int f22841a;
    public final CameraView f22842b;
    public final CameraView.CameraGLThread f22843c;

    public m(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i7) {
        this.f22841a = i7;
        this.f22842b = cameraView;
        this.f22843c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f22841a) {
            case 0:
                this.f22842b.lambda$createCamera$10(this.f22843c);
                return;
            default:
                this.f22842b.lambda$createCamera$8(this.f22843c);
                return;
        }
    }
}
