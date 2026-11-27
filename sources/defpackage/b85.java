package defpackage;

import android.view.TextureView;
public final class b85 implements be8 {
    public final j95 a;

    public b85(j95 j95Var) {
        this.a = j95Var;
    }

    @Override
    public final TextureView D() {
        return null;
    }

    @Override
    public final void J(r47 r47Var) {
        this.a.b.invalidate();
    }

    @Override
    public final void k(r47 r47Var) {
        j95 j95Var = this.a;
        j95Var.J1.K0(true);
        j95Var.V3.f.r0(hl.L(13.0f), hl.L(13.0f), 0, 0);
        j95Var.b.invalidate();
    }
}
