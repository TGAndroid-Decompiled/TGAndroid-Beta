package defpackage;

import android.content.Context;
import android.widget.ImageView;
public final class gga extends zha {
    public final eja Q;

    public gga(eja ejaVar, Context context) {
        super(context);
        this.Q = ejaVar;
    }

    @Override
    public final void setTranslationX(float f) {
        zha zhaVar;
        int i;
        float translationX = getTranslationX();
        super.setTranslationX(f);
        eja ejaVar = this.Q;
        zha[] zhaVarArr = ejaVar.n0;
        if (zhaVarArr[0] == this) {
            float f2 = translationX - f;
            vy4 vy4Var = ejaVar.h2;
            if (vy4Var != null) {
                float f3 = ejaVar.i2 + f2;
                ejaVar.i2 = f3;
                int i2 = (int) f3;
                if (i2 != 0) {
                    ejaVar.i2 = f3 - i2;
                    vy4Var.h(i2, 0);
                }
            }
        }
        if (ejaVar.j1 && (zhaVar = zhaVarArr[0]) == this) {
            float abs = Math.abs(zhaVar.getTranslationX()) / zhaVarArr[0].getMeasuredWidth();
            ejaVar.g1(abs, zhaVarArr[1].F);
            if (ejaVar.q()) {
                byte b = ejaVar.A0;
                if (b == 2) {
                    ejaVar.r0 = 1.0f - abs;
                } else if (b == 1) {
                    ejaVar.r0 = abs;
                }
                ejaVar.K1(abs);
                float U = ejaVar.U(abs);
                ejaVar.s0 = U;
                ImageView imageView = ejaVar.u0;
                if (U != 0.0f && ejaVar.q() && !ejaVar.k0()) {
                    i = 0;
                } else {
                    i = 4;
                }
                imageView.setVisibility(i);
            } else {
                ejaVar.r0 = 0.0f;
            }
            ejaVar.G1(false);
        }
        ejaVar.C();
        xj3 xj3Var = ejaVar.S0;
        if (xj3Var != null) {
            xj3Var.setTranslationY(ejaVar.O1);
        }
    }
}
