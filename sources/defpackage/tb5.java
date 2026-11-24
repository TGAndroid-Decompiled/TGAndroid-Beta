package defpackage;

import android.content.Context;
public final class tb5 extends lka {
    public float N0;
    public final int O0;
    public final wb5 P0;

    public tb5(wb5 wb5Var, Context context, int i) {
        super(context);
        this.P0 = wb5Var;
        this.O0 = i;
    }

    @Override
    public final float getAlpha() {
        return this.N0;
    }

    @Override
    public final void setAlpha(float f) {
        this.N0 = f;
        wb5 wb5Var = this.P0;
        lka[] lkaVarArr = wb5Var.d;
        if (this.O0 == 4) {
            float fullAlpha = lkaVarArr[4].getFullAlpha();
            if (wb5Var.c()) {
                float f2 = wb5Var.f0;
                if (f2 > 0.0f) {
                    super.setAlpha(1.0f - f2);
                    return;
                }
            }
            if (fullAlpha > 0.0f) {
                super.setAlpha(Math.max(f, fullAlpha));
                return;
            } else {
                super.setAlpha(f);
                return;
            }
        }
        super.setAlpha((1.0f - lkaVarArr[4].getFullAlpha()) * f);
    }

    @Override
    public final void setFullAlpha(float f) {
        super.setFullAlpha(f);
        int i = 0;
        while (true) {
            lka[] lkaVarArr = this.P0.d;
            if (i < lkaVarArr.length) {
                lka lkaVar = lkaVarArr[i];
                lkaVar.setAlpha(lkaVar.getAlpha());
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setTranslationY(float f) {
        if (this.O0 == 4 && getFullAlpha() > 0.0f) {
            f = 0.0f;
        }
        super.setTranslationY(f);
    }
}
