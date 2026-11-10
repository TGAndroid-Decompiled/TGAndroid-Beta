package gh;

import e2.a1;
import h2.j;
import h2.o;
import org.telegram.ui.ActionBar.h6;
import p4.c0;
import p4.g1;
import p4.u;
public final class c implements d, o, c0, j {
    public final int f13967a;
    public final int f13968b;
    public final int f13969c;

    public c(int i7, int i10, int i11) {
        this.f13967a = i11;
        this.f13968b = i7;
        this.f13969c = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13967a) {
            case 4:
                ((g1) obj).M(this.f13968b, this.f13969c);
                return;
            default:
                ((g1) obj).t0(this.f13968b, this.f13969c);
                return;
        }
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.d(i7, this.f13968b, this.f13969c);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f13967a) {
            case 1:
                ((a1) obj).J(this.f13968b, this.f13969c);
                return;
            default:
                ((a1) obj).J(this.f13968b, this.f13969c);
                return;
        }
    }

    @Override
    public int k(h6 h6Var, boolean z9) {
        if (z9) {
            return this.f13968b;
        }
        return this.f13969c;
    }
}
