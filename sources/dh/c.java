package dh;

import b2.z0;
import e2.m;
import org.telegram.ui.ActionBar.e6;
public final class c implements d, m {
    public final int f7733a;
    public final int f7734b;
    public final int f7735c;

    public c(int i10, int i11, int i12) {
        this.f7733a = i12;
        this.f7734b = i10;
        this.f7735c = i11;
    }

    @Override
    public int g(e6 e6Var, boolean z10) {
        if (z10) {
            return this.f7734b;
        }
        return this.f7735c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f7733a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f7734b, this.f7735c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f7734b, this.f7735c);
                return;
        }
    }
}
