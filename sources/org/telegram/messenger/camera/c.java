package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraView;
public final class c implements Runnable {
    public final int f15095a;
    public final Object f15096b;

    public c(Object obj, int i10) {
        this.f15095a = i10;
        this.f15096b = obj;
    }

    @Override
    public final void run() {
        switch (this.f15095a) {
            case 0:
                Camera2Session.AnonymousClass1.a((Camera2Session.AnonymousClass1) this.f15096b);
                return;
            case 1:
                CameraView.VideoRecorder.a((CameraView.VideoRecorder) this.f15096b);
                return;
            default:
                CameraController.c((CameraController) this.f15096b);
                return;
        }
    }
}
