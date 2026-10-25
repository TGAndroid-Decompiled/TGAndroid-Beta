package fh;

import b2.e1;
import e2.j;
import e2.o;
import m4.e0;
import m4.n1;
import m4.v;
import org.telegram.ui.ActionBar.u6;
public final class c implements d, o, e0, j {
    public final int f10478a;
    public final int f10479b;
    public final int f10480c;

    public c(int i10, int i11, int i12) {
        this.f10478a = i12;
        this.f10479b = i10;
        this.f10480c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f10478a) {
            case 4:
                ((n1) obj).L(this.f10479b, this.f10480c);
                return;
            default:
                ((n1) obj).s0(this.f10479b, this.f10480c);
                return;
        }
    }

    @Override
    public void d(v vVar, int i10) {
        vVar.d(i10, this.f10479b, this.f10480c);
    }

    @Override
    public int i(u6 u6Var, boolean z10) {
        if (z10) {
            return this.f10479b;
        }
        return this.f10480c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10478a) {
            case 1:
                ((e1) obj).onSurfaceSizeChanged(this.f10479b, this.f10480c);
                return;
            default:
                ((e1) obj).onSurfaceSizeChanged(this.f10479b, this.f10480c);
                return;
        }
    }
}
