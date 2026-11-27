package defpackage;

import android.content.Context;
public final class a04 extends c24 {
    public final o24 I;

    public a04(o24 o24Var, Context context) {
        super(o24Var, context, 0);
        this.I = o24Var;
    }

    @Override
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            this.I.y0.invalidate();
        }
    }
}
