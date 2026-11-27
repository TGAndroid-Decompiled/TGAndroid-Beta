package defpackage;

import org.telegram.messenger.camera.CameraView;
public final class na1 implements Runnable {
    public final byte a;
    public final CameraView b;

    public na1(CameraView cameraView, byte b) {
        this.a = b;
        this.b = cameraView;
    }

    @Override
    public final void run() {
        byte b = this.a;
        CameraView cameraView = this.b;
        switch (b) {
            case 0:
                CameraView.g(cameraView);
                return;
            case 1:
                CameraView.b(cameraView);
                return;
            case 2:
                CameraView.j(cameraView);
                return;
            case 3:
                CameraView.m(cameraView);
                return;
            case 4:
                CameraView.k(cameraView);
                return;
            case 5:
                CameraView.a(cameraView);
                return;
            default:
                CameraView.f(cameraView);
                return;
        }
    }
}
