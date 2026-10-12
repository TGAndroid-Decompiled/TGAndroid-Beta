package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f16957a;
    public final Object f16958b;

    public c(Object obj, int i10) {
        this.f16957a = i10;
        this.f16958b = obj;
    }

    @Override
    public final void run() {
        switch (this.f16957a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f16958b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f16958b);
                return;
            default:
                CameraController.c((CameraController) this.f16958b);
                return;
        }
    }
}
