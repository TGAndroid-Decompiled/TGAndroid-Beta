package dh;

import b2.z0;
import e2.h;
import e2.m;
import m4.e1;
import org.telegram.ui.ActionBar.d6;
public final class c implements d, m, h {
    public final int f8348a;
    public final int f8349b;
    public final int f8350c;

    public c(int i10, int i11, int i12) {
        this.f8348a = i12;
        this.f8349b = i10;
        this.f8350c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8348a) {
            case 3:
                ((e1) obj).M(this.f8349b, this.f8350c);
                return;
            default:
                ((e1) obj).q0(this.f8349b, this.f8350c);
                return;
        }
    }

    @Override
    public int h(d6 d6Var, boolean z10) {
        if (z10) {
            return this.f8349b;
        }
        return this.f8350c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8348a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f8349b, this.f8350c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f8349b, this.f8350c);
                return;
        }
    }
}
