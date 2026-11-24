package defpackage;

import org.telegram.messenger.camera.CameraView;
public final class fa1 implements Runnable {
    public final byte a;
    public final CameraView b;

    public fa1(CameraView cameraView, byte b) {
        this.a = b;
        this.b = cameraView;
    }

    @Override
    public final void run() {
        byte b = this.a;
        CameraView cameraView = this.b;
        switch (b) {
            case 0:
                CameraView.j(cameraView);
                return;
            case 1:
                CameraView.c(cameraView);
                return;
            case 2:
                CameraView.b(cameraView);
                return;
            case 3:
                CameraView.l(cameraView);
                return;
            case 4:
                CameraView.e(cameraView);
                return;
            case 5:
                CameraView.m(cameraView);
                return;
            default:
                CameraView.g(cameraView);
                return;
        }
    }
}
