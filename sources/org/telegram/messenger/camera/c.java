package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f16024a;
    public final Object f16025b;

    public c(Object obj, int i10) {
        this.f16024a = i10;
        this.f16025b = obj;
    }

    @Override
    public final void run() {
        switch (this.f16024a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f16025b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f16025b);
                return;
            default:
                CameraController.c((CameraController) this.f16025b);
                return;
        }
    }
}
