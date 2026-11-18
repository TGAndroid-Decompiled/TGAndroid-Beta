package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f23285a;
    public final Object f23286b;

    public c(Object obj, int i7) {
        this.f23285a = i7;
        this.f23286b = obj;
    }

    @Override
    public final void run() {
        switch (this.f23285a) {
            case 0:
                Camera2Session.AnonymousClass1.a((Camera2Session.AnonymousClass1) this.f23286b);
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f23286b);
                return;
            default:
                CameraController.c((CameraController) this.f23286b);
                return;
        }
    }
}
