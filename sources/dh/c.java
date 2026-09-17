package dh;

import b2.z0;
import e2.m;
import org.telegram.ui.ActionBar.f6;
public final class c implements d, m {
    public final int f7736a;
    public final int f7737b;
    public final int f7738c;

    public c(int i10, int i11, int i12) {
        this.f7736a = i12;
        this.f7737b = i10;
        this.f7738c = i11;
    }

    @Override
    public int g(f6 f6Var, boolean z10) {
        if (z10) {
            return this.f7737b;
        }
        return this.f7738c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f7736a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f7737b, this.f7738c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f7737b, this.f7738c);
                return;
        }
    }
}
