package dh;

import b2.z0;
import e2.h;
import e2.m;
import m4.f1;
import org.telegram.ui.ActionBar.e6;
public final class c implements d, m, h {
    public final int f8360a;
    public final int f8361b;
    public final int f8362c;

    public c(int i10, int i11, int i12) {
        this.f8360a = i12;
        this.f8361b = i10;
        this.f8362c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8360a) {
            case 3:
                ((f1) obj).M(this.f8361b, this.f8362c);
                return;
            default:
                ((f1) obj).q0(this.f8361b, this.f8362c);
                return;
        }
    }

    @Override
    public int g(e6 e6Var, boolean z10) {
        if (z10) {
            return this.f8361b;
        }
        return this.f8362c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8360a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f8361b, this.f8362c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f8361b, this.f8362c);
                return;
        }
    }
}
