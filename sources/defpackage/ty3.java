package defpackage;

import android.content.Context;
public final class ty3 extends h14 {
    public final t14 I;

    public ty3(t14 t14Var, Context context) {
        super(t14Var, context, 1);
        this.I = t14Var;
    }

    @Override
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            this.I.K.invalidate();
        }
    }
}
