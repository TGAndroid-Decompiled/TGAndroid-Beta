package defpackage;

import android.content.Context;
public final class ry3 extends de0 {
    public final uy3 H;

    public ry3(uy3 uy3Var, Context context) {
        super(context);
        this.H = uy3Var;
    }

    @Override
    public final void invalidate() {
        if (ri5.b(this)) {
            return;
        }
        super.invalidate();
        this.H.f();
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (ri5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
