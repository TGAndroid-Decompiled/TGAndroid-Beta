package defpackage;

import android.content.Context;
public final class wx3 extends be0 {
    public final zx3 H;

    public wx3(zx3 zx3Var, Context context) {
        super(context);
        this.H = zx3Var;
    }

    @Override
    public final void invalidate() {
        if (pg5.b(this)) {
            return;
        }
        super.invalidate();
        this.H.f();
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (pg5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
