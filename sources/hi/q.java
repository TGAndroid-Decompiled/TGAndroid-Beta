package hi;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;
public final class q extends s6 {
    public final s G;

    public q(s sVar, Context context) {
        super(context);
        this.G = sVar;
    }

    @Override
    public final void c() {
        org.telegram.messenger.g0.r(this.h);
        if (this.f15388c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.f15386a.getCameraSessionRecording(), false, false);
        }
        s sVar = this.G;
        if (sVar.O1) {
            sVar.z(true, false);
        }
    }
}
