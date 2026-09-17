package eh;

import b2.z0;
import e2.m;
import org.telegram.ui.ActionBar.f6;
public final class c implements d, m {
    public final int f9135a;
    public final int f9136b;
    public final int f9137c;

    public c(int i10, int i11, int i12) {
        this.f9135a = i12;
        this.f9136b = i10;
        this.f9137c = i11;
    }

    @Override
    public int f(f6 f6Var, boolean z10) {
        if (z10) {
            return this.f9136b;
        }
        return this.f9137c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9135a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f9136b, this.f9137c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f9136b, this.f9137c);
                return;
        }
    }
}
