package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

public final class a7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {

    public final d7 f15646a;

    public a7(d7 d7Var) {
        this.f15646a = d7Var;
    }

    @Override
    public void onCameraInit() {
        d7 d7Var = this.f15646a;
        c7 c7Var = d7Var.f15860a;
        if (d7Var.f15862c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(c7Var.getCameraSessionObject(), d7Var.f15861b, false, new a7(d7Var), new z6(d7Var, 1), c7Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        d7 d7Var = this.f15646a;
        d7Var.d = jCurrentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(d7Var.h);
        if (d7Var.f15869x) {
            return;
        }
        if (j10 <= 1000) {
            d7Var.a(false);
            return;
        }
        d7Var.f15860a.destroy(true, null);
        jh.z zVar = d7Var.f15865n;
        if (zVar != null) {
            zVar.run(d7Var.f15861b, str, Long.valueOf(j10));
        }
    }
}
