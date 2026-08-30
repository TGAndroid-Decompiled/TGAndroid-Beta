package j3;

import org.telegram.ui.ActionBar.f6;
public final class w implements h5.j, qg.c {
    public final int f8859a;
    public final int f8860b;
    public final int f8861c;

    public w(int i10, int i11, int i12) {
        this.f8859a = i12;
        this.f8860b = i10;
        this.f8861c = i11;
    }

    @Override
    public int g(f6 f6Var, boolean z4) {
        if (z4) {
            return this.f8860b;
        }
        return this.f8861c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8859a) {
            case 0:
                ((y1) obj).onSurfaceSizeChanged(this.f8860b, this.f8861c);
                return;
            default:
                ((y1) obj).onSurfaceSizeChanged(this.f8860b, this.f8861c);
                return;
        }
    }
}
