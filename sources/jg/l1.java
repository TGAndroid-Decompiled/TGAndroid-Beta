package jg;

import android.content.Context;
import android.view.ViewGroup;
public final class l1 extends s4.g0 {
    public final Context f10085c;
    public final n1 d;

    public l1(n1 n1Var, Context context) {
        this.d = n1Var;
        this.f10085c = context;
    }

    @Override
    public final int b() {
        return 14;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        float f7;
        m1 m1Var = (m1) c1Var.f47898a;
        ViewGroup.LayoutParams layoutParams = m1Var.getLayoutParams();
        n1 n1Var = this.d;
        layoutParams.height = ((n1Var.getHeight() - n1Var.getPaddingTop()) - n1Var.getPaddingBottom()) / 2;
        ig.s0 s0Var = n1Var.f10112h3;
        if (s0Var != null) {
            m1Var.f10093a = s0Var.b(i10);
            m1Var.invalidate();
            if (n1Var.f10111g3 == i10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            m1Var.f10094b = f7;
            m1Var.invalidate();
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new s4.c1(new m1(this.d, this.f10085c));
    }
}
