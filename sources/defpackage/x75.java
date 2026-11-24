package defpackage;

import android.view.TextureView;
public final class x75 implements nc8 {
    public final g95 a;

    public x75(g95 g95Var) {
        this.a = g95Var;
    }

    @Override
    public final TextureView J() {
        return null;
    }

    @Override
    public final void L(k47 k47Var) {
        this.a.b.invalidate();
    }

    @Override
    public final void p(k47 k47Var) {
        g95 g95Var = this.a;
        g95Var.J1.J0(true);
        g95Var.V3.f.r0(gm.L(13.0f), gm.L(13.0f), 0, 0);
        g95Var.b.invalidate();
    }
}
