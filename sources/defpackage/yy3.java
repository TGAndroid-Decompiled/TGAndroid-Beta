package defpackage;

import android.content.Context;
public final class yy3 extends h14 {
    public final t14 I;

    public yy3(t14 t14Var, Context context) {
        super(t14Var, context, 2);
        this.I = t14Var;
    }

    @Override
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            this.I.h0.invalidate();
        }
    }
}
