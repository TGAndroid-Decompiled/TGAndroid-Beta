package gh;

import e2.a1;
import h2.j;
import h2.o;
import org.telegram.ui.ActionBar.i6;
import p4.c0;
import p4.i1;
import p4.u;
public final class c implements d, o, c0, j {
    public final int f13622a;
    public final int f13623b;
    public final int f13624c;

    public c(int i7, int i10, int i11) {
        this.f13622a = i11;
        this.f13623b = i7;
        this.f13624c = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13622a) {
            case 4:
                ((i1) obj).M(this.f13623b, this.f13624c);
                return;
            default:
                ((i1) obj).t0(this.f13623b, this.f13624c);
                return;
        }
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.d(i7, this.f13623b, this.f13624c);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f13622a) {
            case 1:
                ((a1) obj).J(this.f13623b, this.f13624c);
                return;
            default:
                ((a1) obj).J(this.f13623b, this.f13624c);
                return;
        }
    }

    @Override
    public int j(i6 i6Var, boolean z10) {
        if (z10) {
            return this.f13623b;
        }
        return this.f13624c;
    }
}
