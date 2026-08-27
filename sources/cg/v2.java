package cg;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;

public final class v2 extends lh.d {

    public final y2 f2842d0;

    public v2(y2 y2Var, Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.f2842d0 = y2Var;
    }

    @Override
    public final float a(float f10, float f11) {
        y2 y2Var = this.f2842d0;
        boolean z10 = y2Var.f2882p0 == 0.0f;
        y2Var.f2882p0 = f10;
        if (z10) {
            y2Var.f2883q0 = new r2(y2Var, 0);
            y2Var.g0(false);
        }
        return f10;
    }
}
