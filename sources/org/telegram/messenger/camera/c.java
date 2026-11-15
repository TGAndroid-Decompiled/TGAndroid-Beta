package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f22817a;
    public final Object f22818b;

    public c(Object obj, int i7) {
        this.f22817a = i7;
        this.f22818b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22817a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f22818b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f22818b);
                return;
            default:
                CameraController.c((CameraController) this.f22818b);
                return;
        }
    }
}
