package eh;

import b2.z0;
import e2.m;
import org.telegram.ui.ActionBar.f6;
public final class c implements d, m {
    public final int f9107a;
    public final int f9108b;
    public final int f9109c;

    public c(int i10, int i11, int i12) {
        this.f9107a = i12;
        this.f9108b = i10;
        this.f9109c = i11;
    }

    @Override
    public int f(f6 f6Var, boolean z10) {
        if (z10) {
            return this.f9108b;
        }
        return this.f9109c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9107a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.f9108b, this.f9109c);
                return;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.f9108b, this.f9109c);
                return;
        }
    }
}
