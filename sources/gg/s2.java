package gg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
public final class s2 extends ph.d {
    public final v2 f6738e0;

    public s2(v2 v2Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.f6738e0 = v2Var;
    }

    @Override
    public final float a(float f10, float f11) {
        boolean z4;
        v2 v2Var = this.f6738e0;
        if (v2Var.f6778q0 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        v2Var.f6778q0 = f10;
        if (z4) {
            v2Var.f6779r0 = new o2(v2Var, 0);
            v2Var.g0(false);
        }
        return f10;
    }
}
