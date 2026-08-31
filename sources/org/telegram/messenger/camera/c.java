package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f18356a;
    public final Object f18357b;

    public c(Object obj, int i10) {
        this.f18356a = i10;
        this.f18357b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18356a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f18357b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f18357b);
                return;
            default:
                CameraController.c((CameraController) this.f18357b);
                return;
        }
    }
}
