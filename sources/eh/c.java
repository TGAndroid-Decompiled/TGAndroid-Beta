package eh;

import b2.d1;
import e2.j;
import e2.o;
import m4.e0;
import m4.m1;
import m4.u;
import org.telegram.ui.ActionBar.d6;
public final class c implements d, o, e0, j {
    public final int f8654a;
    public final int f8655b;
    public final int f8656c;

    public c(int i10, int i11, int i12) {
        this.f8654a = i12;
        this.f8655b = i10;
        this.f8656c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8654a) {
            case 4:
                ((m1) obj).L(this.f8655b, this.f8656c);
                return;
            default:
                ((m1) obj).s0(this.f8655b, this.f8656c);
                return;
        }
    }

    @Override
    public void b(u uVar, int i10) {
        uVar.d(i10, this.f8655b, this.f8656c);
    }

    @Override
    public int f(d6 d6Var, boolean z10) {
        if (z10) {
            return this.f8655b;
        }
        return this.f8656c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8654a) {
            case 1:
                ((d1) obj).onSurfaceSizeChanged(this.f8655b, this.f8656c);
                return;
            default:
                ((d1) obj).onSurfaceSizeChanged(this.f8655b, this.f8656c);
                return;
        }
    }
}
