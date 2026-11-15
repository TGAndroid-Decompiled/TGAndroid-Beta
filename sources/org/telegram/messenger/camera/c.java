package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f22821a;
    public final Object f22822b;

    public c(Object obj, int i7) {
        this.f22821a = i7;
        this.f22822b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22821a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f22822b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f22822b);
                return;
            default:
                CameraController.c((CameraController) this.f22822b);
                return;
        }
    }
}
