package defpackage;

import android.content.Context;
public final class i04 extends s24 {
    public final e34 I;

    public i04(e34 e34Var, Context context) {
        super(e34Var, context, 2);
        this.I = e34Var;
    }

    @Override
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            this.I.h0.invalidate();
        }
    }
}
