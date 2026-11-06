package l2;

import android.os.Bundle;
import org.telegram.messenger.k9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.je0;
public final class x implements h2.o, p.a, k9, h2.j {
    public final int f18069a;
    public final boolean f18070b;

    public x(int i7, boolean z9) {
        this.f18069a = i7;
        this.f18070b = z9;
    }

    @Override
    public cc a(hc hcVar) {
        return hcVar.k(this.f18070b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f18069a) {
            case 4:
                ((p4.g1) obj).X(this.f18070b);
                return;
            case 5:
                ((p4.g1) obj).r0(this.f18070b);
                return;
            default:
                ((p4.g1) obj).x(this.f18070b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18069a) {
            case 0:
                ((e2.a1) obj).t(this.f18070b);
                return;
            default:
                ((e2.a1) obj).f(this.f18070b);
                return;
        }
    }

    @Override
    public Object j(Object obj) {
        Void r22 = (Void) obj;
        Bundle k10 = a8.p0.k("afterSignup", this.f18070b);
        je0 je0Var = new je0();
        je0Var.r0(k10);
        return je0Var;
    }
}
