package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.ls;
import org.telegram.messenger.mr;
import org.telegram.messenger.w10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.o41;
import r0.l1;
public final class k implements w10, x10, r0.m, mr {
    public final p f19978a;

    public k(p pVar) {
        this.f19978a = pVar;
    }

    @Override
    public l1 P0(View view, l1 l1Var) {
        i0.b f10 = l1Var.f56303a.f(519);
        this.f19978a.f20011e.setPadding(0, f10.f15918b, 0, f10.d);
        return l1.f56302b;
    }

    @Override
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(p.Z(this.f19978a, o41Var, view));
    }

    @Override
    public void d(boolean z10) {
        p pVar = this.f19978a;
        pVar.finishFragment();
        pVar.getNotificationCenter().k(ls.K2, Long.valueOf(-pVar.f20010c), null, pVar.J, Boolean.valueOf(z10));
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        p.a0(this.f19978a, (o41) obj);
    }
}
