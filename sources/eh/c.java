package eh;

import b2.d1;
import e2.j;
import e2.o;
import m4.e0;
import m4.m1;
import m4.u;
import org.telegram.ui.ActionBar.d6;
public final class c implements d, o, e0, j {
    public final int f8657a;
    public final int f8658b;
    public final int f8659c;

    public c(int i10, int i11, int i12) {
        this.f8657a = i12;
        this.f8658b = i10;
        this.f8659c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8657a) {
            case 4:
                ((m1) obj).L(this.f8658b, this.f8659c);
                return;
            default:
                ((m1) obj).s0(this.f8658b, this.f8659c);
                return;
        }
    }

    @Override
    public void b(u uVar, int i10) {
        uVar.d(i10, this.f8658b, this.f8659c);
    }

    @Override
    public int f(d6 d6Var, boolean z10) {
        if (z10) {
            return this.f8658b;
        }
        return this.f8659c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8657a) {
            case 1:
                ((d1) obj).onSurfaceSizeChanged(this.f8658b, this.f8659c);
                return;
            default:
                ((d1) obj).onSurfaceSizeChanged(this.f8658b, this.f8659c);
                return;
        }
    }
}
