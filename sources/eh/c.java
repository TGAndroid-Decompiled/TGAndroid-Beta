package eh;

import b2.e1;
import e2.j;
import e2.o;
import m4.e0;
import m4.n1;
import m4.v;
import org.telegram.ui.ActionBar.c6;
public final class c implements d, o, e0, j {
    public final int f8773a;
    public final int f8774b;
    public final int f8775c;

    public c(int i10, int i11, int i12) {
        this.f8773a = i12;
        this.f8774b = i10;
        this.f8775c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8773a) {
            case 4:
                ((n1) obj).L(this.f8774b, this.f8775c);
                return;
            default:
                ((n1) obj).s0(this.f8774b, this.f8775c);
                return;
        }
    }

    @Override
    public void d(v vVar, int i10) {
        vVar.d(i10, this.f8774b, this.f8775c);
    }

    @Override
    public int f(c6 c6Var, boolean z10) {
        if (z10) {
            return this.f8774b;
        }
        return this.f8775c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8773a) {
            case 1:
                ((e1) obj).onSurfaceSizeChanged(this.f8774b, this.f8775c);
                return;
            default:
                ((e1) obj).onSurfaceSizeChanged(this.f8774b, this.f8775c);
                return;
        }
    }
}
