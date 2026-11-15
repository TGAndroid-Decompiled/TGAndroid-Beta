package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.nr;
import org.telegram.messenger.ns;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.b41;
import r0.k1;
public final class i implements x10, y10, r0.m, nr {
    public final n f19577a;

    public i(n nVar) {
        this.f19577a = nVar;
    }

    @Override
    public k1 M0(View view, k1 k1Var) {
        i0.c f10 = k1Var.f55682a.f(519);
        this.f19577a.f19612e.setPadding(0, f10.f15575b, 0, f10.d);
        return k1.f55681b;
    }

    @Override
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(n.Z(this.f19577a, b41Var, view));
    }

    @Override
    public void j(boolean z10) {
        n nVar = this.f19577a;
        nVar.finishFragment();
        nVar.getNotificationCenter().k(ns.K2, Long.valueOf(-nVar.f19611c), null, nVar.J, Boolean.valueOf(z10));
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        n.a0(this.f19577a, (b41) obj);
    }
}
