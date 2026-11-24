package defpackage;

import android.content.Context;
public final class fz3 extends h14 {
    public final t14 I;

    public fz3(t14 t14Var, Context context) {
        super(t14Var, context, 0);
        this.I = t14Var;
    }

    @Override
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            this.I.y0.invalidate();
        }
    }
}
