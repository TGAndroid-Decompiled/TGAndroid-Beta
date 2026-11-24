package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.NumberTextView;
public final class dq1 extends AnimatorListenerAdapter {
    public final xv1 a;
    public final boolean b;
    public final lka c;
    public final boolean d;
    public final mv1 e;
    public final boolean f;
    public final yv1 h;

    public dq1(yv1 yv1Var, xv1 xv1Var, boolean z, lka lkaVar, boolean z2, mv1 mv1Var, boolean z3) {
        this.h = yv1Var;
        this.a = xv1Var;
        this.b = z;
        this.c = lkaVar;
        this.d = z2;
        this.e = mv1Var;
        this.f = z3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        yv1 yv1Var = this.h;
        xv1[] xv1VarArr = yv1Var.R2;
        lka[] lkaVarArr = yv1Var.S2;
        bf0[] bf0VarArr = yv1Var.Q2;
        Object tag = yv1Var.U2.getTag();
        NumberTextView numberTextView = yv1Var.U2;
        if (tag != null) {
            numberTextView.setVisibility(4);
            int c7 = yv1Var.c7();
            yv1Var.U2.a(Math.min(c7 - 1, Math.max(1, c7 - yv1Var.a5[0])), false);
        } else {
            numberTextView.setAlpha(1.0f);
        }
        yv1Var.U2.setTranslationY(0.0f);
        lkaVarArr[0].setTranslationX(0.0f);
        lkaVarArr[1].setTranslationX(0.0f);
        yv1Var.U2.setTranslationX(yv1Var.V2 + 0.0f);
        xv1 xv1Var = this.a;
        xv1Var.setTranslationY(0.0f);
        lka lkaVar = this.c;
        if (!this.b) {
            xv1Var.setTranslationY(0.0f);
            lkaVar.setTranslationY(0.0f);
        }
        boolean z = this.d;
        mv1 mv1Var = this.e;
        if (!z) {
            mv1Var.setTranslationY(0.0f);
        }
        xv1VarArr[0].setTranslationX(0.0f);
        xv1VarArr[1].setTranslationX(0.0f);
        bf0VarArr[1].setAlpha(1.0f);
        bf0VarArr[1].setScaleX(1.0f);
        bf0VarArr[1].setScaleY(1.0f);
        bf0VarArr[0].setAlpha(1.0f);
        bf0VarArr[0].setScaleX(1.0f);
        bf0VarArr[0].setScaleY(1.0f);
        lka lkaVar2 = lkaVarArr[0];
        lkaVarArr[1] = lkaVar2;
        lkaVarArr[0] = lkaVar;
        lkaVar2.setVisibility(4);
        mv1[] mv1VarArr = yv1Var.T2;
        mv1 mv1Var2 = mv1VarArr[0];
        mv1VarArr[1] = mv1Var2;
        mv1VarArr[0] = mv1Var;
        mv1Var2.setVisibility(4);
        xv1 xv1Var2 = xv1VarArr[0];
        if (xv1Var != xv1Var2) {
            xv1VarArr[1] = xv1Var2;
            xv1VarArr[0] = xv1Var;
            xv1Var2.setVisibility(4);
        }
        if (this.f) {
            bf0VarArr[1].setImageBitmap(null);
            bf0VarArr[1].setVisibility(4);
        }
        bf0 bf0Var = bf0VarArr[1];
        bf0 bf0Var2 = bf0VarArr[0];
        bf0VarArr[1] = bf0Var2;
        bf0VarArr[0] = bf0Var;
        bf0Var2.setAlpha(1.0f);
        bf0VarArr[1].setScaleX(1.0f);
        bf0VarArr[1].setScaleY(1.0f);
        bf0VarArr[1].setVisibility(4);
        yv1Var.W2[0] = null;
        yv1Var.P2 = false;
    }
}
