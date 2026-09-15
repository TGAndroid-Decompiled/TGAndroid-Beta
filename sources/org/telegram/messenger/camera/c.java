package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f15836a;
    public final Object f15837b;

    public c(Object obj, int i10) {
        this.f15836a = i10;
        this.f15837b = obj;
    }

    @Override
    public final void run() {
        switch (this.f15836a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f15837b).lambda$onError$0();
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f15837b);
                return;
            default:
                CameraController.c((CameraController) this.f15837b);
                return;
        }
    }
}
