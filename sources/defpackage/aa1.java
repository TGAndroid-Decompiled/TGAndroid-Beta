package defpackage;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
public final class aa1 implements Runnable {
    public final byte a;
    public final CameraController b;
    public final CameraSession c;

    public aa1(CameraController cameraController, CameraSession cameraSession, byte b) {
        this.a = b;
        this.b = cameraController;
        this.c = cameraSession;
    }

    @Override
    public final void run() {
        byte b = this.a;
        CameraSession cameraSession = this.c;
        CameraController cameraController = this.b;
        switch (b) {
            case 0:
                CameraController.b(cameraController, cameraSession);
                return;
            default:
                CameraController.o(cameraController, cameraSession);
                return;
        }
    }
}
