package l2;

import android.os.Bundle;
import org.telegram.messenger.j9;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.me0;
public final class v implements h2.o, p.a, j9, h2.j {
    public final int f19593a;
    public final boolean f19594b;

    public v(int i7, boolean z10) {
        this.f19593a = i7;
        this.f19594b = z10;
    }

    @Override
    public gc a(lc lcVar) {
        return lcVar.k(this.f19594b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19593a) {
            case 4:
                ((p4.i1) obj).X(this.f19594b);
                return;
            case 5:
                ((p4.i1) obj).r0(this.f19594b);
                return;
            default:
                ((p4.i1) obj).x(this.f19594b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f19593a) {
            case 0:
                ((e2.a1) obj).t(this.f19594b);
                return;
            default:
                ((e2.a1) obj).f(this.f19594b);
                return;
        }
    }

    @Override
    public Object m(Object obj) {
        Void r22 = (Void) obj;
        Bundle k10 = a8.p0.k("afterSignup", this.f19594b);
        me0 me0Var = new me0();
        me0Var.r0(k10);
        return me0Var;
    }
}
