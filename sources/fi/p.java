package fi;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;
public final class p extends l6 {
    public final r F;

    public p(r rVar, Context context) {
        super(context);
        this.F = rVar;
    }

    @Override
    public final void c() {
        org.telegram.messenger.g0.r(this.h);
        if (this.f12330c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.f12328a.getCameraSessionRecording(), false, false);
        }
        r rVar = this.F;
        if (rVar.N1) {
            rVar.z(true, false);
        }
    }
}
