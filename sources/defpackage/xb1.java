package defpackage;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;
public final class xb1 extends qo9 {
    public final zb1 G;

    public xb1(zb1 zb1Var, Context context) {
        super(context);
        this.G = zb1Var;
    }

    @Override
    public final void c() {
        hl.r(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        zb1 zb1Var = this.G;
        if (zb1Var.O1) {
            zb1Var.z(true, false);
        }
    }
}
