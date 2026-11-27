package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.NumberTextView;
public final class ep1 extends AnimatorListenerAdapter {
    public final yu1 a;
    public final boolean b;
    public final ema c;
    public final boolean d;
    public final nu1 e;
    public final boolean f;
    public final zu1 h;

    public ep1(zu1 zu1Var, yu1 yu1Var, boolean z, ema emaVar, boolean z2, nu1 nu1Var, boolean z3) {
        this.h = zu1Var;
        this.a = yu1Var;
        this.b = z;
        this.c = emaVar;
        this.d = z2;
        this.e = nu1Var;
        this.f = z3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        zu1 zu1Var = this.h;
        yu1[] yu1VarArr = zu1Var.R2;
        ema[] emaVarArr = zu1Var.S2;
        de0[] de0VarArr = zu1Var.Q2;
        Object tag = zu1Var.U2.getTag();
        NumberTextView numberTextView = zu1Var.U2;
        if (tag != null) {
            numberTextView.setVisibility(4);
            int c7 = zu1Var.c7();
            zu1Var.U2.a(Math.min(c7 - 1, Math.max(1, c7 - zu1Var.a5[0])), false);
        } else {
            numberTextView.setAlpha(1.0f);
        }
        zu1Var.U2.setTranslationY(0.0f);
        emaVarArr[0].setTranslationX(0.0f);
        emaVarArr[1].setTranslationX(0.0f);
        zu1Var.U2.setTranslationX(zu1Var.V2 + 0.0f);
        yu1 yu1Var = this.a;
        yu1Var.setTranslationY(0.0f);
        ema emaVar = this.c;
        if (!this.b) {
            yu1Var.setTranslationY(0.0f);
            emaVar.setTranslationY(0.0f);
        }
        boolean z = this.d;
        nu1 nu1Var = this.e;
        if (!z) {
            nu1Var.setTranslationY(0.0f);
        }
        yu1VarArr[0].setTranslationX(0.0f);
        yu1VarArr[1].setTranslationX(0.0f);
        de0VarArr[1].setAlpha(1.0f);
        de0VarArr[1].setScaleX(1.0f);
        de0VarArr[1].setScaleY(1.0f);
        de0VarArr[0].setAlpha(1.0f);
        de0VarArr[0].setScaleX(1.0f);
        de0VarArr[0].setScaleY(1.0f);
        ema emaVar2 = emaVarArr[0];
        emaVarArr[1] = emaVar2;
        emaVarArr[0] = emaVar;
        emaVar2.setVisibility(4);
        nu1[] nu1VarArr = zu1Var.T2;
        nu1 nu1Var2 = nu1VarArr[0];
        nu1VarArr[1] = nu1Var2;
        nu1VarArr[0] = nu1Var;
        nu1Var2.setVisibility(4);
        yu1 yu1Var2 = yu1VarArr[0];
        if (yu1Var != yu1Var2) {
            yu1VarArr[1] = yu1Var2;
            yu1VarArr[0] = yu1Var;
            yu1Var2.setVisibility(4);
        }
        if (this.f) {
            de0VarArr[1].setImageBitmap(null);
            de0VarArr[1].setVisibility(4);
        }
        de0 de0Var = de0VarArr[1];
        de0 de0Var2 = de0VarArr[0];
        de0VarArr[1] = de0Var2;
        de0VarArr[0] = de0Var;
        de0Var2.setAlpha(1.0f);
        de0VarArr[1].setScaleX(1.0f);
        de0VarArr[1].setScaleY(1.0f);
        de0VarArr[1].setVisibility(4);
        zu1Var.W2[0] = null;
        zu1Var.P2 = false;
    }
}
