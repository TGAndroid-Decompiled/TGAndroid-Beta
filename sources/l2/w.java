package l2;

import android.os.Bundle;
import org.telegram.messenger.k9;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.me0;
public final class w implements h2.o, p.a, k9, h2.j {
    public final int f18071a;
    public final boolean f18072b;

    public w(int i7, boolean z9) {
        this.f18071a = i7;
        this.f18072b = z9;
    }

    @Override
    public bc a(gc gcVar) {
        return gcVar.k(this.f18072b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f18071a) {
            case 4:
                ((p4.g1) obj).X(this.f18072b);
                return;
            case 5:
                ((p4.g1) obj).r0(this.f18072b);
                return;
            default:
                ((p4.g1) obj).x(this.f18072b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18071a) {
            case 0:
                ((e2.a1) obj).t(this.f18072b);
                return;
            default:
                ((e2.a1) obj).f(this.f18072b);
                return;
        }
    }

    @Override
    public Object j(Object obj) {
        Void r22 = (Void) obj;
        Bundle k10 = a8.p0.k("afterSignup", this.f18072b);
        me0 me0Var = new me0();
        me0Var.r0(k10);
        return me0Var;
    }
}
