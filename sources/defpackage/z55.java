package defpackage;

import android.view.TextureView;
public final class z55 implements ka8 {
    public final h75 a;

    public z55(h75 h75Var) {
        this.a = h75Var;
    }

    @Override
    public final TextureView j0() {
        return null;
    }

    @Override
    public final void t0(k27 k27Var) {
        this.a.b.invalidate();
    }

    @Override
    public final void y(k27 k27Var) {
        h75 h75Var = this.a;
        h75Var.J1.J0(true);
        h75Var.V3.f.r0(gl.L(13.0f), gl.L(13.0f), 0, 0);
        h75Var.b.invalidate();
    }
}
