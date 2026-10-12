package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f17265a;
    public final Object f17266b;

    public c(Object obj, int i10) {
        this.f17265a = i10;
        this.f17266b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17265a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f17266b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f17266b);
                return;
            default:
                CameraController.c((CameraController) this.f17266b);
                return;
        }
    }
}
