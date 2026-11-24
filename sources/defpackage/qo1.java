package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.NumberTextView;
public final class qo1 extends AnimatorListenerAdapter {
    public final lu1 a;
    public final boolean b;
    public final jia c;
    public final boolean d;
    public final au1 e;
    public final boolean f;
    public final mu1 h;

    public qo1(mu1 mu1Var, lu1 lu1Var, boolean z, jia jiaVar, boolean z2, au1 au1Var, boolean z3) {
        this.h = mu1Var;
        this.a = lu1Var;
        this.b = z;
        this.c = jiaVar;
        this.d = z2;
        this.e = au1Var;
        this.f = z3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        mu1 mu1Var = this.h;
        lu1[] lu1VarArr = mu1Var.R2;
        jia[] jiaVarArr = mu1Var.S2;
        be0[] be0VarArr = mu1Var.Q2;
        Object tag = mu1Var.U2.getTag();
        NumberTextView numberTextView = mu1Var.U2;
        if (tag != null) {
            numberTextView.setVisibility(4);
            int S6 = mu1Var.S6();
            mu1Var.U2.a(Math.min(S6 - 1, Math.max(1, S6 - mu1Var.a5[0])), false);
        } else {
            numberTextView.setAlpha(1.0f);
        }
        mu1Var.U2.setTranslationY(0.0f);
        jiaVarArr[0].setTranslationX(0.0f);
        jiaVarArr[1].setTranslationX(0.0f);
        mu1Var.U2.setTranslationX(mu1Var.V2 + 0.0f);
        lu1 lu1Var = this.a;
        lu1Var.setTranslationY(0.0f);
        jia jiaVar = this.c;
        if (!this.b) {
            lu1Var.setTranslationY(0.0f);
            jiaVar.setTranslationY(0.0f);
        }
        boolean z = this.d;
        au1 au1Var = this.e;
        if (!z) {
            au1Var.setTranslationY(0.0f);
        }
        lu1VarArr[0].setTranslationX(0.0f);
        lu1VarArr[1].setTranslationX(0.0f);
        be0VarArr[1].setAlpha(1.0f);
        be0VarArr[1].setScaleX(1.0f);
        be0VarArr[1].setScaleY(1.0f);
        be0VarArr[0].setAlpha(1.0f);
        be0VarArr[0].setScaleX(1.0f);
        be0VarArr[0].setScaleY(1.0f);
        jia jiaVar2 = jiaVarArr[0];
        jiaVarArr[1] = jiaVar2;
        jiaVarArr[0] = jiaVar;
        jiaVar2.setVisibility(4);
        au1[] au1VarArr = mu1Var.T2;
        au1 au1Var2 = au1VarArr[0];
        au1VarArr[1] = au1Var2;
        au1VarArr[0] = au1Var;
        au1Var2.setVisibility(4);
        lu1 lu1Var2 = lu1VarArr[0];
        if (lu1Var != lu1Var2) {
            lu1VarArr[1] = lu1Var2;
            lu1VarArr[0] = lu1Var;
            lu1Var2.setVisibility(4);
        }
        if (this.f) {
            be0VarArr[1].setImageBitmap(null);
            be0VarArr[1].setVisibility(4);
        }
        be0 be0Var = be0VarArr[1];
        be0 be0Var2 = be0VarArr[0];
        be0VarArr[1] = be0Var2;
        be0VarArr[0] = be0Var;
        be0Var2.setAlpha(1.0f);
        be0VarArr[1].setScaleX(1.0f);
        be0VarArr[1].setScaleY(1.0f);
        be0VarArr[1].setVisibility(4);
        mu1Var.W2[0] = null;
        mu1Var.P2 = false;
    }
}
