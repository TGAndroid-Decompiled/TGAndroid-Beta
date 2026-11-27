package defpackage;

import android.content.Context;
public final class oz3 extends c24 {
    public final o24 I;

    public oz3(o24 o24Var, Context context) {
        super(o24Var, context, 1);
        this.I = o24Var;
    }

    @Override
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            this.I.K.invalidate();
        }
    }
}
