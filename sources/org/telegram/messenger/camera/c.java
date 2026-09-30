package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f16095a;
    public final Object f16096b;

    public c(Object obj, int i10) {
        this.f16095a = i10;
        this.f16096b = obj;
    }

    @Override
    public final void run() {
        switch (this.f16095a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f16096b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f16096b);
                return;
            default:
                CameraController.c((CameraController) this.f16096b);
                return;
        }
    }
}
