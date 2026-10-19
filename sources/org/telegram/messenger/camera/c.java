package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f18050a;
    public final Object f18051b;

    public c(Object obj, int i10) {
        this.f18050a = i10;
        this.f18051b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18050a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f18051b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f18051b);
                return;
            default:
                CameraController.c((CameraController) this.f18051b);
                return;
        }
    }
}
