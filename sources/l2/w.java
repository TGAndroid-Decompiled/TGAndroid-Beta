package l2;

import android.os.Bundle;
import org.telegram.messenger.k9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.le0;
public final class w implements h2.o, p.a, k9, h2.j {
    public final int f18068a;
    public final boolean f18069b;

    public w(int i7, boolean z9) {
        this.f18068a = i7;
        this.f18069b = z9;
    }

    @Override
    public cc a(hc hcVar) {
        return hcVar.k(this.f18069b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f18068a) {
            case 4:
                ((p4.g1) obj).X(this.f18069b);
                return;
            case 5:
                ((p4.g1) obj).r0(this.f18069b);
                return;
            default:
                ((p4.g1) obj).x(this.f18069b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18068a) {
            case 0:
                ((e2.a1) obj).t(this.f18069b);
                return;
            default:
                ((e2.a1) obj).f(this.f18069b);
                return;
        }
    }

    @Override
    public Object j(Object obj) {
        Void r22 = (Void) obj;
        Bundle k10 = a8.p0.k("afterSignup", this.f18069b);
        le0 le0Var = new le0();
        le0Var.r0(k10);
        return le0Var;
    }
}
