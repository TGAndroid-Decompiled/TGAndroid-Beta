package gh;

import e2.a1;
import h2.j;
import h2.o;
import org.telegram.ui.ActionBar.i6;
import p4.c0;
import p4.h1;
import p4.u;
public final class c implements d, o, c0, j {
    public final int f13614a;
    public final int f13615b;
    public final int f13616c;

    public c(int i7, int i10, int i11) {
        this.f13614a = i11;
        this.f13615b = i7;
        this.f13616c = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13614a) {
            case 4:
                ((h1) obj).N(this.f13615b, this.f13616c);
                return;
            default:
                ((h1) obj).u0(this.f13615b, this.f13616c);
                return;
        }
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.d(i7, this.f13615b, this.f13616c);
    }

    @Override
    public int f(i6 i6Var, boolean z10) {
        if (z10) {
            return this.f13615b;
        }
        return this.f13616c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f13614a) {
            case 1:
                ((a1) obj).J(this.f13615b, this.f13616c);
                return;
            default:
                ((a1) obj).J(this.f13615b, this.f13616c);
                return;
        }
    }
}
