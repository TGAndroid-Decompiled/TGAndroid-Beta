package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f21959a;
    public final Object f21960b;

    public c(Object obj, int i3) {
        this.f21959a = i3;
        this.f21960b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21959a) {
            case 0:
                Camera2Session.AnonymousClass1.a((Camera2Session.AnonymousClass1) this.f21960b);
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f21960b);
                return;
            default:
                CameraController.c((CameraController) this.f21960b);
                return;
        }
    }
}
