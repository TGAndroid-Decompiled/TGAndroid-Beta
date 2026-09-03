package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f16919a;
    public final Object f16920b;

    public c(Object obj, int i10) {
        this.f16919a = i10;
        this.f16920b = obj;
    }

    @Override
    public final void run() {
        switch (this.f16919a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f16920b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f16920b);
                return;
            default:
                CameraController.c((CameraController) this.f16920b);
                return;
        }
    }
}
