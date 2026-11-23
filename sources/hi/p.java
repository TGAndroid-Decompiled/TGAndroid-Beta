package hi;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;
public final class p extends j6 {
    public final r G;

    public p(r rVar, Context context) {
        super(context);
        this.G = rVar;
    }

    @Override
    public final void c() {
        org.telegram.messenger.g0.r(this.h);
        if (this.f14769c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.f14767a.getCameraSessionRecording(), false, false);
        }
        r rVar = this.G;
        if (rVar.O1) {
            rVar.z(true, false);
        }
    }
}
