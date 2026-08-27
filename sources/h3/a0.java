package h3;

import org.telegram.ui.ActionBar.c6;

public final class a0 implements d5.k, mg.c {

    public final int f7764a;

    public final int f7765b;

    public final int f7766c;

    public a0(int i10, int i11, int i12) {
        this.f7764a = i12;
        this.f7765b = i10;
        this.f7766c = i11;
    }

    @Override
    public int i(c6 c6Var, boolean z10) {
        return z10 ? this.f7765b : this.f7766c;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f7764a) {
            case 0:
                ((a2) obj).onSurfaceSizeChanged(this.f7765b, this.f7766c);
                break;
            default:
                ((a2) obj).onSurfaceSizeChanged(this.f7765b, this.f7766c);
                break;
        }
    }
}
