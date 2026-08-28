package bg;

import android.content.Context;
import org.telegram.ui.ActionBar.b6;
public final class d3 extends kh.d {
    public final g3 f1736d0;

    public d3(g3 g3Var, Context context, b6 b6Var) {
        super(context, b6Var, true);
        this.f1736d0 = g3Var;
    }

    @Override
    public final float a(float f10, float f11) {
        boolean z10;
        g3 g3Var = this.f1736d0;
        if (g3Var.f1787p0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        g3Var.f1787p0 = f10;
        if (z10) {
            g3Var.f1788q0 = new z2(g3Var, 0);
            g3Var.f0(false);
        }
        return f10;
    }
}
