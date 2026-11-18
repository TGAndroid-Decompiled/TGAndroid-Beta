package gh;

import e2.a1;
import h2.j;
import h2.o;
import org.telegram.ui.ActionBar.i6;
import p4.c0;
import p4.i1;
import p4.u;
public final class c implements d, o, c0, j {
    public final int f13619a;
    public final int f13620b;
    public final int f13621c;

    public c(int i7, int i10, int i11) {
        this.f13619a = i11;
        this.f13620b = i7;
        this.f13621c = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13619a) {
            case 4:
                ((i1) obj).M(this.f13620b, this.f13621c);
                return;
            default:
                ((i1) obj).t0(this.f13620b, this.f13621c);
                return;
        }
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.d(i7, this.f13620b, this.f13621c);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f13619a) {
            case 1:
                ((a1) obj).J(this.f13620b, this.f13621c);
                return;
            default:
                ((a1) obj).J(this.f13620b, this.f13621c);
                return;
        }
    }

    @Override
    public int j(i6 i6Var, boolean z10) {
        if (z10) {
            return this.f13620b;
        }
        return this.f13621c;
    }
}
