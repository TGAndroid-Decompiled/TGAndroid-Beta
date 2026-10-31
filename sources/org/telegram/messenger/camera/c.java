package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f14931a;
    public final Object f14932b;

    public c(Object obj, int i10) {
        this.f14931a = i10;
        this.f14932b = obj;
    }

    @Override
    public final void run() {
        switch (this.f14931a) {
            case 0:
                Camera2Session.AnonymousClass1.a((Camera2Session.AnonymousClass1) this.f14932b);
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f14932b);
                return;
            default:
                CameraController.c((CameraController) this.f14932b);
                return;
        }
    }
}
