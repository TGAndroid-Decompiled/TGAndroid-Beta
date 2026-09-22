package dh;

import b2.z0;
import e2.m;
import org.telegram.ui.ActionBar.f6;
public final class c implements d, m {
    public final int f7735a;
    public final int f7736b;
    public final int f7737c;

    public c(int i10, int i11, int i12) {
        this.f7735a = i12;
        this.f7736b = i10;
        this.f7737c = i11;
    }

    @Override
    public int f(f6 f6Var, boolean z10) {
        if (z10) {
            return this.f7736b;
        }
        return this.f7737c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f7735a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f7736b, this.f7737c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f7736b, this.f7737c);
                return;
        }
    }
}
