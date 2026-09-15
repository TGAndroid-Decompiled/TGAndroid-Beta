package dh;

import b2.z0;
import e2.m;
import org.telegram.ui.ActionBar.e6;
public final class c implements d, m {
    public final int f7731a;
    public final int f7732b;
    public final int f7733c;

    public c(int i10, int i11, int i12) {
        this.f7731a = i12;
        this.f7732b = i10;
        this.f7733c = i11;
    }

    @Override
    public int g(e6 e6Var, boolean z10) {
        if (z10) {
            return this.f7732b;
        }
        return this.f7733c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f7731a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f7732b, this.f7733c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f7732b, this.f7733c);
                return;
        }
    }
}
