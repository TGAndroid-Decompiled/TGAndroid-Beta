package dh;

import b2.z0;
import e2.h;
import e2.m;
import m4.e1;
import org.telegram.ui.ActionBar.d6;
public final class c implements d, m, h {
    public final int f8347a;
    public final int f8348b;
    public final int f8349c;

    public c(int i10, int i11, int i12) {
        this.f8347a = i12;
        this.f8348b = i10;
        this.f8349c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8347a) {
            case 3:
                ((e1) obj).M(this.f8348b, this.f8349c);
                return;
            default:
                ((e1) obj).q0(this.f8348b, this.f8349c);
                return;
        }
    }

    @Override
    public int h(d6 d6Var, boolean z10) {
        if (z10) {
            return this.f8348b;
        }
        return this.f8349c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8347a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f8348b, this.f8349c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f8348b, this.f8349c);
                return;
        }
    }
}
