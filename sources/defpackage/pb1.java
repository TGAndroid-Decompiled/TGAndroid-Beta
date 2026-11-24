package defpackage;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;
public final class pb1 extends bl9 {
    public final rb1 G;

    public pb1(rb1 rb1Var, Context context) {
        super(context);
        this.G = rb1Var;
    }

    @Override
    public final void c() {
        gl.r(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        rb1 rb1Var = this.G;
        if (rb1Var.O1) {
            rb1Var.z(true, false);
        }
    }
}
