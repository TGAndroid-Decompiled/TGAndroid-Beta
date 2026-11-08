package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f21798a;
    public final Object f21799b;

    public c(Object obj, int i7) {
        this.f21798a = i7;
        this.f21799b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21798a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f21799b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f21799b);
                return;
            default:
                CameraController.c((CameraController) this.f21799b);
                return;
        }
    }
}
