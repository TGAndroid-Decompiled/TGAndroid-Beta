package ch;

import b2.z0;
import e2.m;
import org.telegram.ui.ActionBar.f6;
public final class c implements d, m {
    public final int f4685a;
    public final int f4686b;
    public final int f4687c;

    public c(int i10, int i11, int i12) {
        this.f4685a = i12;
        this.f4686b = i10;
        this.f4687c = i11;
    }

    @Override
    public int g(f6 f6Var, boolean z10) {
        if (z10) {
            return this.f4686b;
        }
        return this.f4687c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f4685a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f4686b, this.f4687c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f4686b, this.f4687c);
                return;
        }
    }
}
