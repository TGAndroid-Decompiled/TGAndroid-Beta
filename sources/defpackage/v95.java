package defpackage;

import android.content.Context;
public final class v95 extends jia {
    public float N0;
    public final int O0;
    public final y95 P0;

    public v95(y95 y95Var, Context context, int i) {
        super(context);
        this.P0 = y95Var;
        this.O0 = i;
    }

    @Override
    public final float getAlpha() {
        return this.N0;
    }

    @Override
    public final void setAlpha(float f) {
        this.N0 = f;
        y95 y95Var = this.P0;
        jia[] jiaVarArr = y95Var.d;
        if (this.O0 == 4) {
            float fullAlpha = jiaVarArr[4].getFullAlpha();
            if (y95Var.c()) {
                float f2 = y95Var.f0;
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
        super.setAlpha((1.0f - jiaVarArr[4].getFullAlpha()) * f);
    }

    @Override
    public final void setFullAlpha(float f) {
        super.setFullAlpha(f);
        int i = 0;
        while (true) {
            jia[] jiaVarArr = this.P0.d;
            if (i < jiaVarArr.length) {
                jia jiaVar = jiaVarArr[i];
                jiaVar.setAlpha(jiaVar.getAlpha());
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
