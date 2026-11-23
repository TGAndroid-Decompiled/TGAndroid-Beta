package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f23218a;
    public final Object f23219b;

    public c(Object obj, int i7) {
        this.f23218a = i7;
        this.f23219b = obj;
    }

    @Override
    public final void run() {
        switch (this.f23218a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f23219b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f23219b);
                return;
            default:
                CameraController.c((CameraController) this.f23219b);
                return;
        }
    }
}
