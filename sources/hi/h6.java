package hi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class h6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final k6 f14381a;

    public h6(k6 k6Var) {
        this.f14381a = k6Var;
    }

    @Override
    public void onCameraInit() {
        k6 k6Var = this.f14381a;
        j6 j6Var = k6Var.f14504a;
        if (k6Var.f14506c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(j6Var.getCameraSessionObject(), k6Var.f14505b, false, new h6(k6Var), new g6(k6Var, 1), j6Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        k6 k6Var = this.f14381a;
        k6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(k6Var.h);
        if (!k6Var.f14514y) {
            if (j3 > 1000) {
                k6Var.f14504a.destroy(true, null);
                fi.b0 b0Var = k6Var.f14509n;
                if (b0Var != null) {
                    b0Var.a(k6Var.f14505b, str, Long.valueOf(j3));
                    return;
                }
                return;
            }
            k6Var.a(false);
        }
    }
}
