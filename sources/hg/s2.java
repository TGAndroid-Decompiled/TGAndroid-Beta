package hg;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
public final class s2 extends qh.d {
    public final v2 f7606e0;

    public s2(v2 v2Var, Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.f7606e0 = v2Var;
    }

    @Override
    public final float a(float f10, float f11) {
        boolean z4;
        v2 v2Var = this.f7606e0;
        if (v2Var.f7647q0 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        v2Var.f7647q0 = f10;
        if (z4) {
            v2Var.f7648r0 = new o2(v2Var, 0);
            v2Var.g0(false);
        }
        return f10;
    }
}
