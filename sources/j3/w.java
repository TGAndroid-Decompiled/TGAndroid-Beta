package j3;

import org.telegram.ui.ActionBar.g6;
public final class w implements h5.j, rg.c {
    public final int f9455a;
    public final int f9456b;
    public final int f9457c;

    public w(int i10, int i11, int i12) {
        this.f9455a = i12;
        this.f9456b = i10;
        this.f9457c = i11;
    }

    @Override
    public int g(g6 g6Var, boolean z4) {
        if (z4) {
            return this.f9456b;
        }
        return this.f9457c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9455a) {
            case 0:
                ((y1) obj).onSurfaceSizeChanged(this.f9456b, this.f9457c);
                return;
            default:
                ((y1) obj).onSurfaceSizeChanged(this.f9456b, this.f9457c);
                return;
        }
    }
}
