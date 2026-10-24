package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f18104a;
    public final Object f18105b;

    public c(Object obj, int i10) {
        this.f18104a = i10;
        this.f18105b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18104a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f18105b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f18105b);
                return;
            default:
                CameraController.c((CameraController) this.f18105b);
                return;
        }
    }
}
