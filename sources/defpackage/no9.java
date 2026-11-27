package defpackage;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class no9 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final qo9 a;

    public no9(qo9 qo9Var) {
        this.a = qo9Var;
    }

    @Override
    public final void onCameraInit() {
        qo9 qo9Var = this.a;
        oo9 oo9Var = qo9Var.a;
        if (qo9Var.c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(oo9Var.getCameraSessionObject(), qo9Var.b, false, new no9(qo9Var), new mo9(qo9Var, (byte) 1), oo9Var, true);
    }

    @Override
    public final void onFinishVideoRecording(String str, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        qo9 qo9Var = this.a;
        qo9Var.d = currentTimeMillis;
        hl.r(qo9Var.h);
        if (!qo9Var.y) {
            if (j > 1000) {
                qo9Var.a.destroy(true, null);
                qo0 qo0Var = qo9Var.n;
                if (qo0Var != null) {
                    qo0Var.a(qo9Var.b, str, Long.valueOf(j));
                    return;
                }
                return;
            }
            qo9Var.a(false);
        }
    }
}
