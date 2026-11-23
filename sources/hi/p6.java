package hi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class p6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final s6 f15185a;

    public p6(s6 s6Var) {
        this.f15185a = s6Var;
    }

    @Override
    public void onCameraInit() {
        s6 s6Var = this.f15185a;
        r6 r6Var = s6Var.f15386a;
        if (s6Var.f15388c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(r6Var.getCameraSessionObject(), s6Var.f15387b, false, new p6(s6Var), new o6(s6Var, 1), r6Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        s6 s6Var = this.f15185a;
        s6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(s6Var.h);
        if (!s6Var.f15396y) {
            if (j3 > 1000) {
                s6Var.f15386a.destroy(true, null);
                fi.b0 b0Var = s6Var.f15391n;
                if (b0Var != null) {
                    b0Var.a(s6Var.f15387b, str, Long.valueOf(j3));
                    return;
                }
                return;
            }
            s6Var.a(false);
        }
    }
}
