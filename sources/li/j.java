package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.ks;
import org.telegram.messenger.lr;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.n41;
import r0.l1;
public final class j implements u10, v10, r0.m, lr {
    public final o f20041a;

    public j(o oVar) {
        this.f20041a = oVar;
    }

    @Override
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(o.Z(this.f20041a, n41Var, view));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        o.a0(this.f20041a, (n41) obj);
    }

    @Override
    public l1 l1(View view, l1 l1Var) {
        i0.b f10 = l1Var.f56381a.f(519);
        this.f20041a.f20074e.setPadding(0, f10.f15979b, 0, f10.d);
        return l1.f56380b;
    }

    @Override
    public void q(boolean z10) {
        o oVar = this.f20041a;
        oVar.finishFragment();
        oVar.getNotificationCenter().k(ks.K2, Long.valueOf(-oVar.f20073c), null, oVar.J, Boolean.valueOf(z10));
    }
}
