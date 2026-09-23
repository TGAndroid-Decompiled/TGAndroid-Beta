package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f15826a;
    public final Object f15827b;

    public c(Object obj, int i10) {
        this.f15826a = i10;
        this.f15827b = obj;
    }

    @Override
    public final void run() {
        switch (this.f15826a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f15827b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f15827b);
                return;
            default:
                CameraController.c((CameraController) this.f15827b);
                return;
        }
    }
}
