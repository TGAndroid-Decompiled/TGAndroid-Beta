package i2;

import android.os.Bundle;
import org.telegram.messenger.l9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.pf0;
public final class y implements e2.o, e2.j, p.a, l9 {
    public final int f8115a;
    public final boolean f8116b;

    public y(int i10, boolean z10) {
        this.f8115a = i10;
        this.f8116b = z10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8115a) {
            case 2:
                ((m4.n1) obj).W(this.f8116b);
                return;
            case 3:
                ((m4.n1) obj).p0(this.f8116b);
                return;
            default:
                ((m4.n1) obj).w(this.f8116b);
                return;
        }
    }

    @Override
    public wb c(cc ccVar) {
        return ccVar.k(this.f8116b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8115a) {
            case 0:
                ((b2.d1) obj).x(this.f8116b);
                return;
            default:
                ((b2.d1) obj).e(this.f8116b);
                return;
        }
    }

    @Override
    public Object l(Object obj) {
        Void r22 = (Void) obj;
        Bundle g10 = a1.g.g("afterSignup", this.f8116b);
        pf0 pf0Var = new pf0();
        pf0Var.q0(g10);
        return pf0Var;
    }
}
