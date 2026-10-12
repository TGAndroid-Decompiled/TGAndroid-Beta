package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f17264a;
    public final Object f17265b;

    public c(Object obj, int i10) {
        this.f17264a = i10;
        this.f17265b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17264a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f17265b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f17265b);
                return;
            default:
                CameraController.c((CameraController) this.f17265b);
                return;
        }
    }
}
