package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class y6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final b7 f12001a;

    public y6(b7 b7Var) {
        this.f12001a = b7Var;
    }

    @Override
    public void onCameraInit() {
        b7 b7Var = this.f12001a;
        a7 a7Var = b7Var.f10565a;
        if (b7Var.f10567c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(a7Var.getCameraSessionObject(), b7Var.f10566b, false, new y6(b7Var), new x6(b7Var, 1), a7Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        b7 b7Var = this.f12001a;
        b7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(b7Var.h);
        if (!b7Var.f10573x) {
            if (j10 > 1000) {
                b7Var.f10565a.destroy(true, null);
                di.c0 c0Var = b7Var.f10569n;
                if (c0Var != null) {
                    c0Var.run(b7Var.f10566b, str, Long.valueOf(j10));
                    return;
                }
                return;
            }
            b7Var.a(false);
        }
    }
}
