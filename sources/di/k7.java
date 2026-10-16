package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class k7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final n7 f7174a;

    public k7(n7 n7Var) {
        this.f7174a = n7Var;
    }

    @Override
    public void onCameraInit() {
        n7 n7Var = this.f7174a;
        m7 m7Var = n7Var.f7462a;
        if (n7Var.f7464c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(m7Var.getCameraSessionObject(), n7Var.f7463b, false, new k7(n7Var), new j7(n7Var, 1), m7Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        n7 n7Var = this.f7174a;
        n7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(n7Var.h);
        if (!n7Var.f7470x) {
            if (j10 > 1000) {
                n7Var.f7462a.destroy(true, null);
                bi.j0 j0Var = n7Var.f7466n;
                if (j0Var != null) {
                    j0Var.run(n7Var.f7463b, str, Long.valueOf(j10));
                    return;
                }
                return;
            }
            n7Var.a(false);
        }
    }
}
