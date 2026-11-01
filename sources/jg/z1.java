package jg;

import android.view.ViewGroup;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.tk0;
public final class z1 extends tk0 {
    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return ig.h0.c().size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        s1 s1Var = (s1) c1Var.f47909a;
        ig.h0 h0Var = (ig.h0) ig.h0.c().get(i10);
        s1Var.getClass();
        s1Var.setTypeface(h0Var.d());
        String str = h0Var.f8322c;
        if (str == null) {
            str = dd.M0(h0Var.f8321b);
        }
        s1Var.setText(str);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        s1 s1Var = new s1(viewGroup.getContext());
        s1Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(s1Var);
    }
}
