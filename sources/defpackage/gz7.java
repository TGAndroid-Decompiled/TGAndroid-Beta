package defpackage;

import org.telegram.ui.LaunchActivity;
public final class gz7 extends fz7 {
    public final hz7 k0;

    public gz7(hz7 hz7Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = hz7Var;
    }

    @Override
    public final void h(float f) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        dr3 dr3Var = launchActivity.y0;
        dr3Var.setScaleX(hl.R1(1.0f, 1.25f, f));
        dr3Var.setScaleY(hl.R1(1.0f, 1.25f, f));
    }

    @Override
    public final void j() {
        hz7.a(this.k0);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        dr3 dr3Var = launchActivity.y0;
        dr3Var.setScaleX(1.0f);
        dr3Var.setScaleY(1.0f);
    }
}
