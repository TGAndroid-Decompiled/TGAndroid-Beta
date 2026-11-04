package hh;

import d2.c1;
import g2.k;
import g2.p;
import o4.d0;
import o4.l1;
import o4.u;
import org.telegram.ui.ActionBar.e6;
public final class c implements d, p, d0, k {
    public final int f14411a;
    public final int f14412b;
    public final int f14413c;

    public c(int i3, int i10, int i11) {
        this.f14411a = i11;
        this.f14412b = i3;
        this.f14413c = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f14411a) {
            case 4:
                ((l1) obj).K(this.f14412b, this.f14413c);
                return;
            default:
                ((l1) obj).q0(this.f14412b, this.f14413c);
                return;
        }
    }

    @Override
    public void d(u uVar, int i3) {
        uVar.c(i3, this.f14412b, this.f14413c);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f14411a) {
            case 1:
                ((c1) obj).J(this.f14412b, this.f14413c);
                return;
            default:
                ((c1) obj).J(this.f14412b, this.f14413c);
                return;
        }
    }

    @Override
    public int j(e6 e6Var, boolean z10) {
        if (z10) {
            return this.f14412b;
        }
        return this.f14413c;
    }
}
