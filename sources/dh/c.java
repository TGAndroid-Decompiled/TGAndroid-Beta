package dh;

import b2.z0;
import e2.h;
import e2.m;
import m4.f1;
import org.telegram.ui.ActionBar.d6;
public final class c implements d, m, h {
    public final int f7719a;
    public final int f7720b;
    public final int f7721c;

    public c(int i10, int i11, int i12) {
        this.f7719a = i12;
        this.f7720b = i10;
        this.f7721c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f7719a) {
            case 3:
                ((f1) obj).M(this.f7720b, this.f7721c);
                return;
            default:
                ((f1) obj).q0(this.f7720b, this.f7721c);
                return;
        }
    }

    @Override
    public int g(d6 d6Var, boolean z10) {
        if (z10) {
            return this.f7720b;
        }
        return this.f7721c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f7719a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f7720b, this.f7721c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f7720b, this.f7721c);
                return;
        }
    }
}
