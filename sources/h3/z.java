package h3;

import org.telegram.ui.ActionBar.b6;
public final class z implements d5.k, lg.c {
    public final int f9827a;
    public final int f9828b;
    public final int f9829c;

    public z(int i9, int i10, int i11) {
        this.f9827a = i11;
        this.f9828b = i9;
        this.f9829c = i10;
    }

    @Override
    public int g(b6 b6Var, boolean z10) {
        if (z10) {
            return this.f9828b;
        }
        return this.f9829c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9827a) {
            case 0:
                ((a2) obj).onSurfaceSizeChanged(this.f9828b, this.f9829c);
                return;
            default:
                ((a2) obj).onSurfaceSizeChanged(this.f9828b, this.f9829c);
                return;
        }
    }
}
