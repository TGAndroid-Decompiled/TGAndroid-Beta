package eh;

import b2.d1;
import e2.j;
import e2.o;
import m4.e0;
import m4.m1;
import m4.u;
import org.telegram.ui.ActionBar.g6;
public final class c implements d, o, e0, j {
    public final int f8662a;
    public final int f8663b;
    public final int f8664c;

    public c(int i10, int i11, int i12) {
        this.f8662a = i12;
        this.f8663b = i10;
        this.f8664c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8662a) {
            case 4:
                ((m1) obj).L(this.f8663b, this.f8664c);
                return;
            default:
                ((m1) obj).s0(this.f8663b, this.f8664c);
                return;
        }
    }

    @Override
    public void e(u uVar, int i10) {
        uVar.d(i10, this.f8663b, this.f8664c);
    }

    @Override
    public int i(g6 g6Var, boolean z10) {
        if (z10) {
            return this.f8663b;
        }
        return this.f8664c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8662a) {
            case 1:
                ((d1) obj).onSurfaceSizeChanged(this.f8663b, this.f8664c);
                return;
            default:
                ((d1) obj).onSurfaceSizeChanged(this.f8663b, this.f8664c);
                return;
        }
    }
}
