package defpackage;

import android.content.Context;
import android.view.ViewGroup;
public final class zt7 extends y59 {
    public final Context c;
    public final bu7 d;

    public zt7(bu7 bu7Var, Context context) {
        this.d = bu7Var;
        this.c = context;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        float f;
        au7 au7Var = (au7) u69Var.a;
        ViewGroup.LayoutParams layoutParams = au7Var.getLayoutParams();
        bu7 bu7Var = this.d;
        layoutParams.height = ((bu7Var.getHeight() - bu7Var.getPaddingTop()) - bu7Var.getPaddingBottom()) / 2;
        m58 m58Var = bu7Var.i3;
        if (m58Var != null) {
            au7Var.a = m58Var.b(i);
            au7Var.invalidate();
            if (bu7Var.h3 == i) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            au7Var.b = f;
            au7Var.invalidate();
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        return new u69(new au7(this.d, this.c));
    }
}
