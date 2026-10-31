package i2;

import org.telegram.ui.ActionBar.p6;
public final class v implements e2.o, m4.e0, e2.j, wg.c {
    public final int f8095a;
    public final int f8096b;
    public final int f8097c;

    public v(int i10, int i11, int i12) {
        this.f8095a = i12;
        this.f8096b = i10;
        this.f8097c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8095a) {
            case 3:
                ((m4.n1) obj).L(this.f8096b, this.f8097c);
                return;
            default:
                ((m4.n1) obj).t0(this.f8096b, this.f8097c);
                return;
        }
    }

    @Override
    public void e(m4.v vVar, int i10) {
        vVar.d(i10, this.f8096b, this.f8097c);
    }

    @Override
    public int g(p6 p6Var, boolean z10) {
        if (z10) {
            return this.f8096b;
        }
        return this.f8097c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8095a) {
            case 0:
                ((b2.d1) obj).M(this.f8096b, this.f8097c);
                return;
            default:
                ((b2.d1) obj).M(this.f8096b, this.f8097c);
                return;
        }
    }
}
