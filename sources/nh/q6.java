package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class q6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final t6 f18401a;

    public q6(t6 t6Var) {
        this.f18401a = t6Var;
    }

    @Override
    public void onCameraInit() {
        t6 t6Var = this.f18401a;
        s6 s6Var = t6Var.f18672a;
        if (t6Var.f18674c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(s6Var.getCameraSessionObject(), t6Var.f18673b, false, new q6(t6Var), new p6(t6Var, 1), s6Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        t6 t6Var = this.f18401a;
        t6Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(t6Var.h);
        if (!t6Var.f18681x) {
            if (j10 > 1000) {
                t6Var.f18672a.destroy(true, null);
                lh.z zVar = t6Var.f18677n;
                if (zVar != null) {
                    zVar.run(t6Var.f18673b, str, Long.valueOf(j10));
                    return;
                }
                return;
            }
            t6Var.a(false);
        }
    }
}
