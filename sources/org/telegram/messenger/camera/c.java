package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f19940a;
    public final Object f19941b;

    public c(Object obj, int i9) {
        this.f19940a = i9;
        this.f19941b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19940a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f19941b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f19941b);
                return;
            default:
                CameraController.c((CameraController) this.f19941b);
                return;
        }
    }
}
