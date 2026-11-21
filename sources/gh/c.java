package gh;

import e2.a1;
import h2.j;
import h2.o;
import org.telegram.ui.ActionBar.h6;
import p4.d0;
import p4.i1;
import p4.u;
public final class c implements d, o, d0, j {
    public final int f13648a;
    public final int f13649b;
    public final int f13650c;

    public c(int i7, int i10, int i11) {
        this.f13648a = i11;
        this.f13649b = i7;
        this.f13650c = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13648a) {
            case 4:
                ((i1) obj).M(this.f13649b, this.f13650c);
                return;
            default:
                ((i1) obj).t0(this.f13649b, this.f13650c);
                return;
        }
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.d(i7, this.f13649b, this.f13650c);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f13648a) {
            case 1:
                ((a1) obj).J(this.f13649b, this.f13650c);
                return;
            default:
                ((a1) obj).J(this.f13649b, this.f13650c);
                return;
        }
    }

    @Override
    public int j(h6 h6Var, boolean z10) {
        if (z10) {
            return this.f13649b;
        }
        return this.f13650c;
    }
}
