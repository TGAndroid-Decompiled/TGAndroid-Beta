package defpackage;

import org.telegram.ui.LaunchActivity;
public final class zv7 extends yv7 {
    public final aw7 k0;

    public zv7(aw7 aw7Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = aw7Var;
    }

    @Override
    public final void h(float f) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        mq3 mq3Var = launchActivity.y0;
        mq3Var.setScaleX(gl.R1(1.0f, 1.25f, f));
        mq3Var.setScaleY(gl.R1(1.0f, 1.25f, f));
    }

    @Override
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        mq3 mq3Var = launchActivity.y0;
        mq3Var.setScaleX(1.0f);
        mq3Var.setScaleY(1.0f);
    }
}
