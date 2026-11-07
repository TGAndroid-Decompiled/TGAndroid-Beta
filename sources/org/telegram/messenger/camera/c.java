package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f21762a;
    public final Object f21763b;

    public c(Object obj, int i7) {
        this.f21762a = i7;
        this.f21763b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21762a) {
            case 0:
                Camera2Session.AnonymousClass1.a((Camera2Session.AnonymousClass1) this.f21763b);
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f21763b);
                return;
            default:
                CameraController.c((CameraController) this.f21763b);
                return;
        }
    }
}
