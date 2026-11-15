package l2;

import android.os.Bundle;
import org.telegram.messenger.j9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.je0;
public final class v implements h2.o, p.a, j9, h2.j {
    public final int f19198a;
    public final boolean f19199b;

    public v(int i7, boolean z10) {
        this.f19198a = i7;
        this.f19199b = z10;
    }

    @Override
    public xb a(cc ccVar) {
        return ccVar.k(this.f19199b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19198a) {
            case 4:
                ((p4.g1) obj).X(this.f19199b);
                return;
            case 5:
                ((p4.g1) obj).r0(this.f19199b);
                return;
            default:
                ((p4.g1) obj).x(this.f19199b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f19198a) {
            case 0:
                ((e2.a1) obj).t(this.f19199b);
                return;
            default:
                ((e2.a1) obj).c(this.f19199b);
                return;
        }
    }

    @Override
    public Object o(Object obj) {
        Void r22 = (Void) obj;
        Bundle k10 = a8.p0.k("afterSignup", this.f19199b);
        je0 je0Var = new je0();
        je0Var.r0(k10);
        return je0Var;
    }
}
