package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.g6;

public final class r2 extends AnimatorListenerAdapter {

    public final int f18933a;

    public final int f18934b;

    public final v1 f18935c;
    public final b3 d;

    public r2(b3 b3Var, int i10, int i11, v1 v1Var) {
        this.d = b3Var;
        this.f18933a = i10;
        this.f18934b = i11;
        this.f18935c = v1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int iD = i0.b.d(1.0f, this.f18933a, this.f18934b);
        b3 b3Var = this.d;
        b3Var.M = iD;
        b3Var.h();
        a3 a3Var = b3Var.f18575e;
        a3Var.invalidate();
        y2 y2Var = b3Var.S;
        y2Var.setBackgroundColor(b3Var.M);
        v1 v1Var = this.f18935c;
        v1Var.b(y2Var, 1.0f);
        b3Var.f18568a = v1Var.a(g6.Ii);
        a3Var.invalidate();
    }
}
