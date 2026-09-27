package org.telegram.messenger.camera;

import org.telegram.messenger.camera.CameraView;
public final class n implements Runnable {
    public final int f16100a;
    public final CameraView f16101b;
    public final CameraView.CameraGLThread f16102c;

    public n(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i10) {
        this.f16100a = i10;
        this.f16101b = cameraView;
        this.f16102c = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.f16100a) {
            case 0:
                this.f16101b.lambda$createCamera$10(this.f16102c);
                return;
            default:
                this.f16101b.lambda$createCamera$8(this.f16102c);
                return;
        }
    }
}
