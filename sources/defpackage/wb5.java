package defpackage;

import android.content.Context;
public final class wb5 extends ema {
    public float N0;
    public final int O0;
    public final zb5 P0;

    public wb5(zb5 zb5Var, Context context, int i) {
        super(context);
        this.P0 = zb5Var;
        this.O0 = i;
    }

    @Override
    public final float getAlpha() {
        return this.N0;
    }

    @Override
    public final void setAlpha(float f) {
        this.N0 = f;
        zb5 zb5Var = this.P0;
        ema[] emaVarArr = zb5Var.d;
        if (this.O0 == 4) {
            float fullAlpha = emaVarArr[4].getFullAlpha();
            if (zb5Var.c()) {
                float f2 = zb5Var.f0;
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
        super.setAlpha((1.0f - emaVarArr[4].getFullAlpha()) * f);
    }

    @Override
    public final void setFullAlpha(float f) {
        super.setFullAlpha(f);
        int i = 0;
        while (true) {
            ema[] emaVarArr = this.P0.d;
            if (i < emaVarArr.length) {
                ema emaVar = emaVarArr[i];
                emaVar.setAlpha(emaVar.getAlpha());
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
