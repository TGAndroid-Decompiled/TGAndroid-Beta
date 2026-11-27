package defpackage;

import org.telegram.messenger.camera.CameraView;
public final class oa1 implements Runnable {
    public final byte a;
    public final CameraView.CameraGLThread b;

    public oa1(CameraView.CameraGLThread cameraGLThread, byte b) {
        this.a = b;
        this.b = cameraGLThread;
    }

    @Override
    public final void run() {
        byte b = this.a;
        CameraView.CameraGLThread cameraGLThread = this.b;
        switch (b) {
            case 0:
                cameraGLThread.lambda$onDraw$4();
                return;
            case 1:
                cameraGLThread.lambda$onDraw$5();
                return;
            case 2:
                cameraGLThread.lambda$new$0();
                return;
            case 3:
                cameraGLThread.lambda$new$1();
                return;
            case 4:
                cameraGLThread.lambda$new$2();
                return;
            default:
                cameraGLThread.lambda$new$3();
                return;
        }
    }
}
