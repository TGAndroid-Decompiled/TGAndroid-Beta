package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f23254a;
    public final Object f23255b;

    public c(Object obj, int i7) {
        this.f23254a = i7;
        this.f23255b = obj;
    }

    @Override
    public final void run() {
        switch (this.f23254a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f23255b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f23255b);
                return;
            default:
                CameraController.c((CameraController) this.f23255b);
                return;
        }
    }
}
