package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f23288a;
    public final Object f23289b;

    public c(Object obj, int i7) {
        this.f23288a = i7;
        this.f23289b = obj;
    }

    @Override
    public final void run() {
        switch (this.f23288a) {
            case 0:
                Camera2Session.AnonymousClass1.a((Camera2Session.AnonymousClass1) this.f23289b);
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f23289b);
                return;
            default:
                CameraController.c((CameraController) this.f23289b);
                return;
        }
    }
}
