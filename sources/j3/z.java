package j3;

import org.telegram.ui.ActionBar.c6;
public final class z implements f5.j, og.c {
    public final int f10864a;
    public final int f10865b;
    public final int f10866c;

    public z(int i10, int i11, int i12) {
        this.f10864a = i12;
        this.f10865b = i10;
        this.f10866c = i11;
    }

    @Override
    public int f(c6 c6Var, boolean z10) {
        if (z10) {
            return this.f10865b;
        }
        return this.f10866c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10864a) {
            case 0:
                ((a2) obj).onSurfaceSizeChanged(this.f10865b, this.f10866c);
                return;
            default:
                ((a2) obj).onSurfaceSizeChanged(this.f10865b, this.f10866c);
                return;
        }
    }
}
