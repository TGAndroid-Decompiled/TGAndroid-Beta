package dh;

import b2.z0;
import e2.h;
import e2.m;
import m4.e1;
import org.telegram.ui.ActionBar.e6;
public final class c implements d, m, h {
    public final int f7720a;
    public final int f7721b;
    public final int f7722c;

    public c(int i10, int i11, int i12) {
        this.f7720a = i12;
        this.f7721b = i10;
        this.f7722c = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f7720a) {
            case 3:
                ((e1) obj).M(this.f7721b, this.f7722c);
                return;
            default:
                ((e1) obj).q0(this.f7721b, this.f7722c);
                return;
        }
    }

    @Override
    public int h(e6 e6Var, boolean z10) {
        if (z10) {
            return this.f7721b;
        }
        return this.f7722c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f7720a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f7721b, this.f7722c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f7721b, this.f7722c);
                return;
        }
    }
}
