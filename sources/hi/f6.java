package hi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class f6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final i6 f14649a;

    public f6(i6 i6Var) {
        this.f14649a = i6Var;
    }

    @Override
    public void onCameraInit() {
        i6 i6Var = this.f14649a;
        h6 h6Var = i6Var.f14791a;
        if (i6Var.f14793c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(h6Var.getCameraSessionObject(), i6Var.f14792b, false, new f6(i6Var), new e6(i6Var, 1), h6Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        i6 i6Var = this.f14649a;
        i6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(i6Var.h);
        if (!i6Var.f14801y) {
            if (j3 > 1000) {
                i6Var.f14791a.destroy(true, null);
                fi.b0 b0Var = i6Var.f14796n;
                if (b0Var != null) {
                    b0Var.a(i6Var.f14792b, str, Long.valueOf(j3));
                    return;
                }
                return;
            }
            i6Var.a(false);
        }
    }
}
