package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class p94 extends AnimatorListenerAdapter {
    public final r94 a;

    public p94(r94 r94Var) {
        this.a = r94Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r94 r94Var = this.a;
        cj8 cj8Var = r94Var.n;
        TextView textView = r94Var.h;
        mu8 mu8Var = r94Var.f;
        if (r94Var.x) {
            mu8Var.setVisibility(4);
            textView.setVisibility(4);
            cj8Var.setVisibility(0);
            return;
        }
        if (r94Var.w) {
            mu8Var.setVisibility(4);
        } else {
            textView.setVisibility(4);
        }
        cj8Var.setVisibility(8);
    }
}
