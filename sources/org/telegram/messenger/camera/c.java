package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f23313a;
    public final Object f23314b;

    public c(Object obj, int i7) {
        this.f23313a = i7;
        this.f23314b = obj;
    }

    @Override
    public final void run() {
        switch (this.f23313a) {
            case 0:
                Camera2Session.AnonymousClass1.a((Camera2Session.AnonymousClass1) this.f23314b);
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f23314b);
                return;
            default:
                CameraController.c((CameraController) this.f23314b);
                return;
        }
    }
}
