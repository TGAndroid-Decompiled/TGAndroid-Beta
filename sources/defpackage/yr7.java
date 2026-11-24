package defpackage;

import android.content.Context;
import android.view.ViewGroup;
public final class yr7 extends w39 {
    public final Context c;
    public final as7 d;

    public yr7(as7 as7Var, Context context) {
        this.d = as7Var;
        this.c = context;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        float f;
        zr7 zr7Var = (zr7) s49Var.a;
        ViewGroup.LayoutParams layoutParams = zr7Var.getLayoutParams();
        as7 as7Var = this.d;
        layoutParams.height = ((as7Var.getHeight() - as7Var.getPaddingTop()) - as7Var.getPaddingBottom()) / 2;
        k38 k38Var = as7Var.i3;
        if (k38Var != null) {
            zr7Var.a = k38Var.b(i);
            zr7Var.invalidate();
            if (as7Var.h3 == i) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            zr7Var.b = f;
            zr7Var.invalidate();
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        return new s49(new zr7(this.d, this.c));
    }
}
