package l2;

import android.os.Bundle;
import org.telegram.messenger.i9;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.le0;
public final class w implements h2.o, p.a, i9, h2.j {
    public final int f19663a;
    public final boolean f19664b;

    public w(int i7, boolean z10) {
        this.f19663a = i7;
        this.f19664b = z10;
    }

    @Override
    public fc a(kc kcVar) {
        return kcVar.k(this.f19664b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19663a) {
            case 4:
                ((p4.h1) obj).Y(this.f19664b);
                return;
            case 5:
                ((p4.h1) obj).s0(this.f19664b);
                return;
            default:
                ((p4.h1) obj).y(this.f19664b);
                return;
        }
    }

    @Override
    public Object h(Object obj) {
        Void r22 = (Void) obj;
        Bundle k10 = a8.p0.k("afterSignup", this.f19664b);
        le0 le0Var = new le0();
        le0Var.r0(k10);
        return le0Var;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f19663a) {
            case 0:
                ((e2.a1) obj).t(this.f19664b);
                return;
            default:
                ((e2.a1) obj).c(this.f19664b);
                return;
        }
    }
}
