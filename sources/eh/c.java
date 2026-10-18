package eh;

import b2.d1;
import e2.j;
import e2.o;
import m4.e0;
import m4.m1;
import m4.u;
import org.telegram.ui.ActionBar.d6;
public final class c implements d, o, e0, j {
    public final int f8655a;
    public final int f8656b;
    public final int f8657c;

    public c(int i10, int i11, int i12) {
        this.f8655a = i12;
        this.f8656b = i10;
        this.f8657c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8655a) {
            case 4:
                ((m1) obj).L(this.f8656b, this.f8657c);
                return;
            default:
                ((m1) obj).s0(this.f8656b, this.f8657c);
                return;
        }
    }

    @Override
    public void b(u uVar, int i10) {
        uVar.d(i10, this.f8656b, this.f8657c);
    }

    @Override
    public int f(d6 d6Var, boolean z10) {
        if (z10) {
            return this.f8656b;
        }
        return this.f8657c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8655a) {
            case 1:
                ((d1) obj).onSurfaceSizeChanged(this.f8656b, this.f8657c);
                return;
            default:
                ((d1) obj).onSurfaceSizeChanged(this.f8656b, this.f8657c);
                return;
        }
    }
}
