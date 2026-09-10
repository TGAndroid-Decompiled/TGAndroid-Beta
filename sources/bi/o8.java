package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class o8 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final r8 f3327a;

    public o8(r8 r8Var) {
        this.f3327a = r8Var;
    }

    @Override
    public void onCameraInit() {
        r8 r8Var = this.f3327a;
        q8 q8Var = r8Var.f3549a;
        if (r8Var.f3551c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(q8Var.getCameraSessionObject(), r8Var.f3550b, false, new o8(r8Var), new n8(r8Var, 1), q8Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        r8 r8Var = this.f3327a;
        r8Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(r8Var.h);
        if (!r8Var.f3557x) {
            if (j3 > 1000) {
                r8Var.f3549a.destroy(true, null);
                od odVar = r8Var.f3553n;
                if (odVar != null) {
                    odVar.run(r8Var.f3550b, str, Long.valueOf(j3));
                    return;
                }
                return;
            }
            r8Var.a(false);
        }
    }
}
