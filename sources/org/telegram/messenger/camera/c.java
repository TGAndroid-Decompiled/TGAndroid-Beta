package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f15845a;
    public final Object f15846b;

    public c(Object obj, int i10) {
        this.f15845a = i10;
        this.f15846b = obj;
    }

    @Override
    public final void run() {
        switch (this.f15845a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f15846b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f15846b);
                return;
            default:
                CameraController.c((CameraController) this.f15846b);
                return;
        }
    }
}
