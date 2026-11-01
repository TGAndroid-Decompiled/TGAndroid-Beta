package i2;

import android.os.Bundle;
import org.telegram.messenger.m9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.of0;
public final class y implements e2.o, e2.j, p.a, m9 {
    public final int f8116a;
    public final boolean f8117b;

    public y(int i10, boolean z10) {
        this.f8116a = i10;
        this.f8117b = z10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8116a) {
            case 2:
                ((m4.n1) obj).W(this.f8117b);
                return;
            case 3:
                ((m4.n1) obj).p0(this.f8117b);
                return;
            default:
                ((m4.n1) obj).w(this.f8117b);
                return;
        }
    }

    @Override
    public wb c(cc ccVar) {
        return ccVar.k(this.f8117b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8116a) {
            case 0:
                ((b2.d1) obj).x(this.f8117b);
                return;
            default:
                ((b2.d1) obj).e(this.f8117b);
                return;
        }
    }

    @Override
    public Object l(Object obj) {
        Void r22 = (Void) obj;
        Bundle g10 = a1.g.g("afterSignup", this.f8117b);
        of0 of0Var = new of0();
        of0Var.r0(g10);
        return of0Var;
    }
}
