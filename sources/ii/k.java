package ii;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.x31;
import r0.k1;
public final class k implements a20, b20, r0.m, qr {
    public final p f15553a;

    public k(p pVar) {
        this.f15553a = pVar;
    }

    @Override
    public k1 S0(View view, k1 k1Var) {
        i0.b f10 = k1Var.f54202a.f(519);
        this.f15553a.f15586e.setPadding(0, f10.f15121b, 0, f10.d);
        return k1.f54201b;
    }

    @Override
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(p.Z(this.f15553a, x31Var, view));
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        p.a0(this.f15553a, (x31) obj);
    }

    @Override
    public void k(boolean z9) {
        p pVar = this.f15553a;
        pVar.finishFragment();
        pVar.getNotificationCenter().k(qs.K2, Long.valueOf(-pVar.f15585c), null, pVar.I, Boolean.valueOf(z9));
    }
}
