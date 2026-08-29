package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f19896a;
    public final Object f19897b;

    public c(Object obj, int i10) {
        this.f19896a = i10;
        this.f19897b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19896a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f19897b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f19897b);
                return;
            default:
                CameraController.c((CameraController) this.f19897b);
                return;
        }
    }
}
