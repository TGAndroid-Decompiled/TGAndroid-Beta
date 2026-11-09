package gh;

import e2.a1;
import h2.j;
import h2.o;
import org.telegram.ui.ActionBar.g6;
import p4.c0;
import p4.g1;
import p4.u;
public final class c implements d, o, c0, j {
    public final int f13965a;
    public final int f13966b;
    public final int f13967c;

    public c(int i7, int i10, int i11) {
        this.f13965a = i11;
        this.f13966b = i7;
        this.f13967c = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13965a) {
            case 4:
                ((g1) obj).M(this.f13966b, this.f13967c);
                return;
            default:
                ((g1) obj).t0(this.f13966b, this.f13967c);
                return;
        }
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.d(i7, this.f13966b, this.f13967c);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f13965a) {
            case 1:
                ((a1) obj).J(this.f13966b, this.f13967c);
                return;
            default:
                ((a1) obj).J(this.f13966b, this.f13967c);
                return;
        }
    }

    @Override
    public int k(g6 g6Var, boolean z9) {
        if (z9) {
            return this.f13966b;
        }
        return this.f13967c;
    }
}
