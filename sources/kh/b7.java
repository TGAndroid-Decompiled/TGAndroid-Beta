package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class b7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final e7 f15004a;

    public b7(e7 e7Var) {
        this.f15004a = e7Var;
    }

    @Override
    public void onCameraInit() {
        e7 e7Var = this.f15004a;
        d7 d7Var = e7Var.f15153a;
        if (e7Var.f15155c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(d7Var.getCameraSessionObject(), e7Var.f15154b, false, new b7(e7Var), new a7(e7Var, 1), d7Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        e7 e7Var = this.f15004a;
        e7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(e7Var.h);
        if (!e7Var.f15162x) {
            if (j10 > 1000) {
                e7Var.f15153a.destroy(true, null);
                ih.b0 b0Var = e7Var.f15158n;
                if (b0Var != null) {
                    b0Var.run(e7Var.f15154b, str, Long.valueOf(j10));
                    return;
                }
                return;
            }
            e7Var.a(false);
        }
    }
}
