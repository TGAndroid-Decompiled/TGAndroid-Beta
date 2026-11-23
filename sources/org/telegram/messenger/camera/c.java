package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f23404a;
    public final Object f23405b;

    public c(Object obj, int i7) {
        this.f23404a = i7;
        this.f23405b = obj;
    }

    @Override
    public final void run() {
        switch (this.f23404a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f23405b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f23405b);
                return;
            default:
                CameraController.c((CameraController) this.f23405b);
                return;
        }
    }
}
