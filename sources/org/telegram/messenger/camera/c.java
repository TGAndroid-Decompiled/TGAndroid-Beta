package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f16084a;
    public final Object f16085b;

    public c(Object obj, int i10) {
        this.f16084a = i10;
        this.f16085b = obj;
    }

    @Override
    public final void run() {
        switch (this.f16084a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f16085b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f16085b);
                return;
            default:
                CameraController.c((CameraController) this.f16085b);
                return;
        }
    }
}
