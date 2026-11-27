package defpackage;

import android.content.Context;
public final class tz3 extends c24 {
    public final o24 I;

    public tz3(o24 o24Var, Context context) {
        super(o24Var, context, 2);
        this.I = o24Var;
    }

    @Override
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            this.I.h0.invalidate();
        }
    }
}
