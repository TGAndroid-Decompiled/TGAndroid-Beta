package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class b7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final e7 f8799a;

    public b7(e7 e7Var) {
        this.f8799a = e7Var;
    }

    @Override
    public void onCameraInit() {
        e7 e7Var = this.f8799a;
        d7 d7Var = e7Var.f8972a;
        if (e7Var.f8974c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(d7Var.getCameraSessionObject(), e7Var.f8973b, false, new b7(e7Var), new a7(e7Var, 1), d7Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        e7 e7Var = this.f8799a;
        e7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(e7Var.h);
        if (!e7Var.f8980x) {
            if (j10 > 1000) {
                e7Var.f8972a.destroy(true, null);
                ci.c0 c0Var = e7Var.f8976n;
                if (c0Var != null) {
                    c0Var.run(e7Var.f8973b, str, Long.valueOf(j10));
                    return;
                }
                return;
            }
            e7Var.a(false);
        }
    }
}
