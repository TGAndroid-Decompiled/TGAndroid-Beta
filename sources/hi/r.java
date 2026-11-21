package hi;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;
public final class r extends i6 {
    public final t G;

    public r(t tVar, Context context) {
        super(context);
        this.G = tVar;
    }

    @Override
    public final void c() {
        org.telegram.messenger.g0.r(this.h);
        if (this.f14790c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.f14788a.getCameraSessionRecording(), false, false);
        }
        t tVar = this.G;
        if (tVar.O1) {
            tVar.z(true, false);
        }
    }
}
