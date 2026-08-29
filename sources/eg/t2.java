package eg;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
public final class t2 extends nh.d {
    public final w2 f6137d0;

    public t2(w2 w2Var, Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.f6137d0 = w2Var;
    }

    @Override
    public final float a(float f9, float f10) {
        boolean z10;
        w2 w2Var = this.f6137d0;
        if (w2Var.f6176p0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        w2Var.f6176p0 = f9;
        if (z10) {
            w2Var.f6177q0 = new p2(w2Var, 0);
            w2Var.g0(false);
        }
        return f9;
    }
}
