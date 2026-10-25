package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f19781a;
    public final Object f19782b;

    public c(Object obj, int i10) {
        this.f19781a = i10;
        this.f19782b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19781a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f19782b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f19782b);
                return;
            default:
                CameraController.c((CameraController) this.f19782b);
                return;
        }
    }
}
