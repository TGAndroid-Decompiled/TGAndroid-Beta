package defpackage;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class yk9 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final bl9 a;

    public yk9(bl9 bl9Var) {
        this.a = bl9Var;
    }

    @Override
    public final void onCameraInit() {
        bl9 bl9Var = this.a;
        al9 al9Var = bl9Var.a;
        if (bl9Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(al9Var.getCameraSessionObject(), bl9Var.b, false, new yk9(bl9Var), new xk9(bl9Var, (byte) 1), al9Var, true);
    }

    @Override
    public final void onFinishVideoRecording(String str, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        bl9 bl9Var = this.a;
        bl9Var.d = currentTimeMillis;
        gl.r(bl9Var.h);
        if (!bl9Var.y) {
            if (j > 1000) {
                bl9Var.a.destroy(true, null);
                qo0 qo0Var = bl9Var.n;
                if (qo0Var != null) {
                    qo0Var.a(bl9Var.b, str, Long.valueOf(j));
                    return;
                }
                return;
            }
            bl9Var.a(false);
        }
    }
}
