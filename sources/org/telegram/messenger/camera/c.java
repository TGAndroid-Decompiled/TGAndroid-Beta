package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f18053a;
    public final Object f18054b;

    public c(Object obj, int i10) {
        this.f18053a = i10;
        this.f18054b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18053a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f18054b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f18054b);
                return;
            default:
                CameraController.c((CameraController) this.f18054b);
                return;
        }
    }
}
