package hi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class g6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final j6 f14646a;

    public g6(j6 j6Var) {
        this.f14646a = j6Var;
    }

    @Override
    public void onCameraInit() {
        j6 j6Var = this.f14646a;
        i6 i6Var = j6Var.f14767a;
        if (j6Var.f14769c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(i6Var.getCameraSessionObject(), j6Var.f14768b, false, new g6(j6Var), new f6(j6Var, 1), i6Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        j6 j6Var = this.f14646a;
        j6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(j6Var.h);
        if (!j6Var.f14777y) {
            if (j3 > 1000) {
                j6Var.f14767a.destroy(true, null);
                fi.b0 b0Var = j6Var.f14772n;
                if (b0Var != null) {
                    b0Var.a(j6Var.f14768b, str, Long.valueOf(j3));
                    return;
                }
                return;
            }
            j6Var.a(false);
        }
    }
}
