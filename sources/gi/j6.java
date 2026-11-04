package gi;

import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class j6 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final m6 f13015a;

    public j6(m6 m6Var) {
        this.f13015a = m6Var;
    }

    @Override
    public void onCameraInit() {
        m6 m6Var = this.f13015a;
        l6 l6Var = m6Var.f13243a;
        if (m6Var.f13245c > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(l6Var.getCameraSessionObject(), m6Var.f13244b, false, new j6(m6Var), new i6(m6Var, 1), l6Var, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        m6 m6Var = this.f13015a;
        m6Var.d = currentTimeMillis;
        org.telegram.messenger.g0.r(m6Var.h);
        if (!m6Var.f13253y) {
            if (j10 > 1000) {
                m6Var.f13243a.destroy(true, null);
                ei.d0 d0Var = m6Var.f13248n;
                if (d0Var != null) {
                    d0Var.a(m6Var.f13244b, str, Long.valueOf(j10));
                    return;
                }
                return;
            }
            m6Var.a(false);
        }
    }
}
