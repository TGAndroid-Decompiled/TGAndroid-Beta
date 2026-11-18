package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.ks;
import org.telegram.messenger.lr;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.l41;
import r0.l1;
public final class k implements v10, w10, r0.m, lr {
    public final p f19950a;

    public k(p pVar) {
        this.f19950a = pVar;
    }

    @Override
    public l1 P0(View view, l1 l1Var) {
        i0.b f10 = l1Var.f56258a.f(519);
        this.f19950a.f19983e.setPadding(0, f10.f15893b, 0, f10.d);
        return l1.f56257b;
    }

    @Override
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(p.Z(this.f19950a, l41Var, view));
    }

    @Override
    public void d(boolean z10) {
        p pVar = this.f19950a;
        pVar.finishFragment();
        pVar.getNotificationCenter().k(ks.K2, Long.valueOf(-pVar.f19982c), null, pVar.J, Boolean.valueOf(z10));
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        p.a0(this.f19950a, (l41) obj);
    }
}
