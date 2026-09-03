package j3;

import org.telegram.ui.ActionBar.f6;
public final class w implements h5.j, qg.c {
    public final int f8841a;
    public final int f8842b;
    public final int f8843c;

    public w(int i10, int i11, int i12) {
        this.f8841a = i12;
        this.f8842b = i10;
        this.f8843c = i11;
    }

    @Override
    public int f(f6 f6Var, boolean z4) {
        if (z4) {
            return this.f8842b;
        }
        return this.f8843c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8841a) {
            case 0:
                ((y1) obj).onSurfaceSizeChanged(this.f8842b, this.f8843c);
                return;
            default:
                ((y1) obj).onSurfaceSizeChanged(this.f8842b, this.f8843c);
                return;
        }
    }
}
