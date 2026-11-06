package fi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class i6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final l6 f12183a;

    public i6(l6 l6Var) {
        this.f12183a = l6Var;
    }

    @Override
    public void onCameraInit() {
        l6 l6Var = this.f12183a;
        k6 k6Var = l6Var.f12326a;
        if (l6Var.f12328c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(k6Var.getCameraSessionObject(), l6Var.f12327b, false, new i6(l6Var), new h6(l6Var, 1), k6Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        l6 l6Var = this.f12183a;
        l6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(l6Var.h);
        if (!l6Var.f12336y) {
            if (j3 > 1000) {
                l6Var.f12326a.destroy(true, null);
                di.b0 b0Var = l6Var.f12331n;
                if (b0Var != null) {
                    b0Var.a(l6Var.f12327b, str, Long.valueOf(j3));
                    return;
                }
                return;
            }
            l6Var.a(false);
        }
    }
}
