package eh;

import b2.e1;
import e2.j;
import e2.o;
import m4.d0;
import m4.m1;
import m4.u;
import org.telegram.ui.ActionBar.c6;
public final class c implements d, o, d0, j {
    public final int f8776a;
    public final int f8777b;
    public final int f8778c;

    public c(int i10, int i11, int i12) {
        this.f8776a = i12;
        this.f8777b = i10;
        this.f8778c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8776a) {
            case 4:
                ((m1) obj).L(this.f8777b, this.f8778c);
                return;
            default:
                ((m1) obj).s0(this.f8777b, this.f8778c);
                return;
        }
    }

    @Override
    public void d(u uVar, int i10) {
        uVar.d(i10, this.f8777b, this.f8778c);
    }

    @Override
    public int f(c6 c6Var, boolean z10) {
        if (z10) {
            return this.f8777b;
        }
        return this.f8778c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8776a) {
            case 1:
                ((e1) obj).onSurfaceSizeChanged(this.f8777b, this.f8778c);
                return;
            default:
                ((e1) obj).onSurfaceSizeChanged(this.f8777b, this.f8778c);
                return;
        }
    }
}
