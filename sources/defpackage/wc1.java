package defpackage;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;
public final class wc1 extends bn9 {
    public final yc1 G;

    public wc1(yc1 yc1Var, Context context) {
        super(context);
        this.G = yc1Var;
    }

    @Override
    public final void c() {
        gm.r(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        yc1 yc1Var = this.G;
        if (yc1Var.O1) {
            yc1Var.z(true, false);
        }
    }
}
