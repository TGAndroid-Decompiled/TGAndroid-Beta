package dh;

import b2.z0;
import e2.h;
import e2.m;
import m4.e1;
import org.telegram.ui.ActionBar.d6;
public final class c implements d, m, h {
    public final int f7718a;
    public final int f7719b;
    public final int f7720c;

    public c(int i10, int i11, int i12) {
        this.f7718a = i12;
        this.f7719b = i10;
        this.f7720c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f7718a) {
            case 3:
                ((e1) obj).M(this.f7719b, this.f7720c);
                return;
            default:
                ((e1) obj).q0(this.f7719b, this.f7720c);
                return;
        }
    }

    @Override
    public int g(d6 d6Var, boolean z10) {
        if (z10) {
            return this.f7719b;
        }
        return this.f7720c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f7718a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f7719b, this.f7720c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f7719b, this.f7720c);
                return;
        }
    }
}
