package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f14868a;
    public final Object f14869b;

    public c(Object obj, int i10) {
        this.f14868a = i10;
        this.f14869b = obj;
    }

    @Override
    public final void run() {
        switch (this.f14868a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f14869b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f14869b);
                return;
            default:
                CameraController.c((CameraController) this.f14869b);
                return;
        }
    }
}
