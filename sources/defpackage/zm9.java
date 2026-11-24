package defpackage;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class zm9 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final bn9 a;

    public zm9(bn9 bn9Var) {
        this.a = bn9Var;
    }

    @Override
    public final void onCameraInit() {
        bn9 bn9Var = this.a;
        an9 an9Var = bn9Var.a;
        if (bn9Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(an9Var.getCameraSessionObject(), bn9Var.b, false, new zm9(bn9Var), new ym9(bn9Var, (byte) 1), an9Var, true);
    }

    @Override
    public final void onFinishVideoRecording(String str, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        bn9 bn9Var = this.a;
        bn9Var.d = currentTimeMillis;
        gm.r(bn9Var.h);
        if (!bn9Var.y) {
            if (j > 1000) {
                bn9Var.a.destroy(true, null);
                qp0 qp0Var = bn9Var.n;
                if (qp0Var != null) {
                    qp0Var.a(bn9Var.b, str, Long.valueOf(j));
                    return;
                }
                return;
            }
            bn9Var.a(false);
        }
    }
}
