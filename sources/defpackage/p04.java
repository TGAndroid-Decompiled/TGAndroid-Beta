package defpackage;

import android.content.Context;
public final class p04 extends s24 {
    public final e34 I;

    public p04(e34 e34Var, Context context) {
        super(e34Var, context, 0);
        this.I = e34Var;
    }

    @Override
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            this.I.y0.invalidate();
        }
    }
}
