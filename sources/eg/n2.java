package eg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.sl0;
public final class n2 extends sl0 {
    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        return dg.s0.c().size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        h2 h2Var = (h2) m1Var.f5875a;
        dg.s0 s0Var = (dg.s0) dg.s0.c().get(i10);
        h2Var.getClass();
        h2Var.setTypeface(s0Var.d());
        String str = s0Var.f4667c;
        if (str == null) {
            str = LocaleController.getString(s0Var.f4666b);
        }
        h2Var.setText(str);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        h2 h2Var = new h2(viewGroup.getContext());
        h2Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(h2Var);
    }
}
