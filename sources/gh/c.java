package gh;

import e2.a1;
import h2.j;
import h2.o;
import org.telegram.ui.ActionBar.e6;
import p4.c0;
import p4.g1;
import p4.u;
public final class c implements d, o, c0, j {
    public final int f13307a;
    public final int f13308b;
    public final int f13309c;

    public c(int i7, int i10, int i11) {
        this.f13307a = i11;
        this.f13308b = i7;
        this.f13309c = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13307a) {
            case 4:
                ((g1) obj).M(this.f13308b, this.f13309c);
                return;
            default:
                ((g1) obj).t0(this.f13308b, this.f13309c);
                return;
        }
    }

    @Override
    public void b(u uVar, int i7) {
        uVar.d(i7, this.f13308b, this.f13309c);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f13307a) {
            case 1:
                ((a1) obj).J(this.f13308b, this.f13309c);
                return;
            default:
                ((a1) obj).J(this.f13308b, this.f13309c);
                return;
        }
    }

    @Override
    public int j(e6 e6Var, boolean z10) {
        if (z10) {
            return this.f13308b;
        }
        return this.f13309c;
    }
}
