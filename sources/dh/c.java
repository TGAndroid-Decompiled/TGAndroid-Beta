package dh;

import b2.z0;
import e2.h;
import e2.m;
import m4.g1;
import org.telegram.ui.ActionBar.c6;
public final class c implements d, m, h {
    public final int f8357a;
    public final int f8358b;
    public final int f8359c;

    public c(int i10, int i11, int i12) {
        this.f8357a = i12;
        this.f8358b = i10;
        this.f8359c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8357a) {
            case 3:
                ((g1) obj).M(this.f8358b, this.f8359c);
                return;
            default:
                ((g1) obj).q0(this.f8358b, this.f8359c);
                return;
        }
    }

    @Override
    public int g(c6 c6Var, boolean z10) {
        if (z10) {
            return this.f8358b;
        }
        return this.f8359c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8357a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f8358b, this.f8359c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f8358b, this.f8359c);
                return;
        }
    }
}
