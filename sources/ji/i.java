package ji;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.hs;
import org.telegram.messenger.ir;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.ui.Components.r31;
import r0.k1;
public final class i implements s10, t10, r0.m, ir {
    public final n f16312a;

    public i(n nVar) {
        this.f16312a = nVar;
    }

    @Override
    public k1 R0(View view, k1 k1Var) {
        i0.b f10 = k1Var.f54026a.f(519);
        this.f16312a.f16345e.setPadding(0, f10.f14496b, 0, f10.d);
        return k1.f54025b;
    }

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(n.Z(this.f16312a, r31Var, view));
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        n.a0(this.f16312a, (r31) obj);
    }

    @Override
    public void o(boolean z10) {
        n nVar = this.f16312a;
        nVar.finishFragment();
        nVar.getNotificationCenter().k(hs.K2, Long.valueOf(-nVar.f16344c), null, nVar.J, Boolean.valueOf(z10));
    }
}
