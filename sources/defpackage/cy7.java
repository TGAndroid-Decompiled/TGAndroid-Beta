package defpackage;

import org.telegram.ui.LaunchActivity;
public final class cy7 extends by7 {
    public final dy7 k0;

    public cy7(dy7 dy7Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = dy7Var;
    }

    @Override
    public final void h(float f) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        wr3 wr3Var = launchActivity.y0;
        wr3Var.setScaleX(gm.R1(1.0f, 1.25f, f));
        wr3Var.setScaleY(gm.R1(1.0f, 1.25f, f));
    }

    @Override
    public final void j() {
        dy7.a(this.k0);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        wr3 wr3Var = launchActivity.y0;
        wr3Var.setScaleX(1.0f);
        wr3Var.setScaleY(1.0f);
    }
}
