package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f17353a;
    public final Object f17354b;

    public c(Object obj, int i10) {
        this.f17353a = i10;
        this.f17354b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17353a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f17354b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f17354b);
                return;
            default:
                CameraController.c((CameraController) this.f17354b);
                return;
        }
    }
}
