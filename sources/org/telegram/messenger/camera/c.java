package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f17380a;
    public final Object f17381b;

    public c(Object obj, int i10) {
        this.f17380a = i10;
        this.f17381b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17380a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f17381b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f17381b);
                return;
            default:
                CameraController.c((CameraController) this.f17381b);
                return;
        }
    }
}
