package dg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ql0;
public final class p2 extends ql0 {
    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        return cg.t0.c().size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        j2 j2Var = (j2) l1Var.f5774a;
        cg.t0 t0Var = (cg.t0) cg.t0.c().get(i10);
        j2Var.getClass();
        j2Var.setTypeface(t0Var.d());
        String str = t0Var.f2514c;
        if (str == null) {
            str = LocaleController.getString(t0Var.f2513b);
        }
        j2Var.setText(str);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        j2 j2Var = new j2(viewGroup.getContext());
        j2Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(j2Var);
    }
}
