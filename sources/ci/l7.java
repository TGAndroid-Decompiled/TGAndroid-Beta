package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class l7 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final o7 f5392a;

    public l7(o7 o7Var) {
        this.f5392a = o7Var;
    }

    @Override
    public void onCameraInit() {
        o7 o7Var = this.f5392a;
        n7 n7Var = o7Var.f5679a;
        if (o7Var.f5681c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(n7Var.getCameraSessionObject(), o7Var.f5680b, false, new l7(o7Var), new k7(o7Var, 1), n7Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        o7 o7Var = this.f5392a;
        o7Var.d = currentTimeMillis;
        AndroidUtilities.cancelRunOnUIThread(o7Var.h);
        if (!o7Var.f5688x) {
            if (j3 > 1000) {
                o7Var.f5679a.destroy(true, null);
                ai.q0 q0Var = o7Var.f5684n;
                if (q0Var != null) {
                    q0Var.run(o7Var.f5680b, str, Long.valueOf(j3));
                    return;
                }
                return;
            }
            o7Var.a(false);
        }
    }
}
