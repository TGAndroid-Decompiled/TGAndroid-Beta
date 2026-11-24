package defpackage;

import android.content.Context;
import android.widget.ImageView;
public final class pca extends iea {
    public final nfa Q;

    public pca(nfa nfaVar, Context context) {
        super(context);
        this.Q = nfaVar;
    }

    @Override
    public final void setTranslationX(float f) {
        iea ieaVar;
        int i;
        float translationX = getTranslationX();
        super.setTranslationX(f);
        nfa nfaVar = this.Q;
        iea[] ieaVarArr = nfaVar.n0;
        if (ieaVarArr[0] == this) {
            float f2 = translationX - f;
            qw4 qw4Var = nfaVar.h2;
            if (qw4Var != null) {
                float f3 = nfaVar.i2 + f2;
                nfaVar.i2 = f3;
                int i2 = (int) f3;
                if (i2 != 0) {
                    nfaVar.i2 = f3 - i2;
                    qw4Var.h(i2, 0);
                }
            }
        }
        if (nfaVar.j1 && (ieaVar = ieaVarArr[0]) == this) {
            float abs = Math.abs(ieaVar.getTranslationX()) / ieaVarArr[0].getMeasuredWidth();
            nfaVar.g1(abs, ieaVarArr[1].F);
            if (nfaVar.q()) {
                byte b = nfaVar.A0;
                if (b == 2) {
                    nfaVar.r0 = 1.0f - abs;
                } else if (b == 1) {
                    nfaVar.r0 = abs;
                }
                nfaVar.K1(abs);
                float U = nfaVar.U(abs);
                nfaVar.s0 = U;
                ImageView imageView = nfaVar.u0;
                if (U != 0.0f && nfaVar.q() && !nfaVar.k0()) {
                    i = 0;
                } else {
                    i = 4;
                }
                imageView.setVisibility(i);
            } else {
                nfaVar.r0 = 0.0f;
            }
            nfaVar.G1(false);
        }
        nfaVar.C();
        fj3 fj3Var = nfaVar.S0;
        if (fj3Var != null) {
            fj3Var.setTranslationY(nfaVar.O1);
        }
    }
}
