package k2;

import android.os.Bundle;
import org.telegram.messenger.e9;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.ee0;
public final class x implements g2.p, g2.k, p.a, e9 {
    public final int f16758a;
    public final boolean f16759b;

    public x(int i3, boolean z10) {
        this.f16758a = i3;
        this.f16759b = z10;
    }

    @Override
    public ac a(fc fcVar) {
        return fcVar.k(this.f16759b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f16758a) {
            case 2:
                ((o4.l1) obj).V(this.f16759b);
                return;
            case 3:
                ((o4.l1) obj).o0(this.f16759b);
                return;
            default:
                ((o4.l1) obj).x(this.f16759b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f16758a) {
            case 0:
                ((d2.c1) obj).y(this.f16759b);
                return;
            default:
                ((d2.c1) obj).e(this.f16759b);
                return;
        }
    }

    @Override
    public Object k(Object obj) {
        Void r22 = (Void) obj;
        Bundle k10 = a1.g.k("afterSignup", this.f16759b);
        ee0 ee0Var = new ee0();
        ee0Var.r0(k10);
        return ee0Var;
    }
}
