package bg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.il0;
public final class s2 extends il0 {
    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        return ag.u0.c().size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        m2 m2Var = (m2) n1Var.f6432a;
        ag.u0 u0Var = (ag.u0) ag.u0.c().get(i10);
        m2Var.getClass();
        m2Var.setTypeface(u0Var.d());
        String str = u0Var.f676c;
        if (str == null) {
            str = LocaleController.getString(u0Var.f675b);
        }
        m2Var.setText(str);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        m2 m2Var = new m2(viewGroup.getContext());
        m2Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(m2Var);
    }
}
