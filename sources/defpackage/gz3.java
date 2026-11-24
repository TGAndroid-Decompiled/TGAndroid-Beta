package defpackage;

import android.content.Context;
public final class gz3 extends bf0 {
    public final jz3 H;

    public gz3(jz3 jz3Var, Context context) {
        super(context);
        this.H = jz3Var;
    }

    @Override
    public final void invalidate() {
        if (oi5.b(this)) {
            return;
        }
        super.invalidate();
        this.H.f();
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (oi5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
