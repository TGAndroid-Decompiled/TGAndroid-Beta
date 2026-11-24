package defpackage;

import android.content.Context;
import android.widget.ImageView;
public final class pea extends iga {
    public final nha Q;

    public pea(nha nhaVar, Context context) {
        super(context);
        this.Q = nhaVar;
    }

    @Override
    public final void setTranslationX(float f) {
        iga igaVar;
        int i;
        float translationX = getTranslationX();
        super.setTranslationX(f);
        nha nhaVar = this.Q;
        iga[] igaVarArr = nhaVar.n0;
        if (igaVarArr[0] == this) {
            float f2 = translationX - f;
            sy4 sy4Var = nhaVar.h2;
            if (sy4Var != null) {
                float f3 = nhaVar.i2 + f2;
                nhaVar.i2 = f3;
                int i2 = (int) f3;
                if (i2 != 0) {
                    nhaVar.i2 = f3 - i2;
                    sy4Var.h(i2, 0);
                }
            }
        }
        if (nhaVar.j1 && (igaVar = igaVarArr[0]) == this) {
            float abs = Math.abs(igaVar.getTranslationX()) / igaVarArr[0].getMeasuredWidth();
            nhaVar.g1(abs, igaVarArr[1].F);
            if (nhaVar.q()) {
                byte b = nhaVar.A0;
                if (b == 2) {
                    nhaVar.r0 = 1.0f - abs;
                } else if (b == 1) {
                    nhaVar.r0 = abs;
                }
                nhaVar.K1(abs);
                float U = nhaVar.U(abs);
                nhaVar.s0 = U;
                ImageView imageView = nhaVar.u0;
                if (U != 0.0f && nhaVar.q() && !nhaVar.k0()) {
                    i = 0;
                } else {
                    i = 4;
                }
                imageView.setVisibility(i);
            } else {
                nhaVar.r0 = 0.0f;
            }
            nhaVar.G1(false);
        }
        nhaVar.C();
        qk3 qk3Var = nhaVar.S0;
        if (qk3Var != null) {
            qk3Var.setTranslationY(nhaVar.O1);
        }
    }
}
