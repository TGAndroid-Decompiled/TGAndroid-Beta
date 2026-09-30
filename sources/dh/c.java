package dh;

import b2.z0;
import e2.h;
import e2.m;
import m4.e1;
import org.telegram.ui.ActionBar.d6;
public final class c implements d, m, h {
    public final int f7730a;
    public final int f7731b;
    public final int f7732c;

    public c(int i10, int i11, int i12) {
        this.f7730a = i12;
        this.f7731b = i10;
        this.f7732c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f7730a) {
            case 3:
                ((e1) obj).M(this.f7731b, this.f7732c);
                return;
            default:
                ((e1) obj).q0(this.f7731b, this.f7732c);
                return;
        }
    }

    @Override
    public int g(d6 d6Var, boolean z10) {
        if (z10) {
            return this.f7731b;
        }
        return this.f7732c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f7730a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f7731b, this.f7732c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f7731b, this.f7732c);
                return;
        }
    }
}
