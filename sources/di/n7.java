package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class n7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final q7 f7717a;

    public n7(q7 q7Var) {
        this.f7717a = q7Var;
    }

    @Override
    public void onCameraInit() {
        q7 q7Var = this.f7717a;
        p7 p7Var = q7Var.f8030a;
        if (q7Var.f8032c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(p7Var.getCameraSessionObject(), q7Var.f8031b, false, new n7(q7Var), new m7(q7Var, 1), p7Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        q7 q7Var = this.f7717a;
        q7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(q7Var.h);
        if (!q7Var.f8039x) {
            if (j3 > 1000) {
                q7Var.f8030a.destroy(true, null);
                bi.j0 j0Var = q7Var.f8035n;
                if (j0Var != null) {
                    j0Var.run(q7Var.f8031b, str, Long.valueOf(j3));
                    return;
                }
                return;
            }
            q7Var.a(false);
        }
    }
}
