package dh;

import b2.z0;
import e2.h;
import e2.m;
import m4.g1;
import org.telegram.ui.ActionBar.d6;
public final class c implements d, m, h {
    public final int f8359a;
    public final int f8360b;
    public final int f8361c;

    public c(int i10, int i11, int i12) {
        this.f8359a = i12;
        this.f8360b = i10;
        this.f8361c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8359a) {
            case 3:
                ((g1) obj).M(this.f8360b, this.f8361c);
                return;
            default:
                ((g1) obj).q0(this.f8360b, this.f8361c);
                return;
        }
    }

    @Override
    public int g(d6 d6Var, boolean z10) {
        if (z10) {
            return this.f8360b;
        }
        return this.f8361c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8359a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f8360b, this.f8361c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f8360b, this.f8361c);
                return;
        }
    }
}
