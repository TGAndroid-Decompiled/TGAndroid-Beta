package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class n7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final q7 f5073a;

    public n7(q7 q7Var) {
        this.f5073a = q7Var;
    }

    @Override
    public void onCameraInit() {
        q7 q7Var = this.f5073a;
        p7 p7Var = q7Var.f5346a;
        if (q7Var.f5348c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(p7Var.getCameraSessionObject(), q7Var.f5347b, false, new n7(q7Var), new m7(q7Var, 1), p7Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        q7 q7Var = this.f5073a;
        q7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(q7Var.h);
        if (!q7Var.f5354x) {
            if (j3 > 1000) {
                q7Var.f5346a.destroy(true, null);
                ai.q0 q0Var = q7Var.f5350n;
                if (q0Var != null) {
                    q0Var.run(q7Var.f5347b, str, Long.valueOf(j3));
                    return;
                }
                return;
            }
            q7Var.a(false);
        }
    }
}
