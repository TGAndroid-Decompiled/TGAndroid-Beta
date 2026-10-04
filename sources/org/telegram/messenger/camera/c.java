package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f17527a;
    public final Object f17528b;

    public c(Object obj, int i10) {
        this.f17527a = i10;
        this.f17528b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17527a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f17528b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f17528b);
                return;
            default:
                CameraController.c((CameraController) this.f17528b);
                return;
        }
    }
}
