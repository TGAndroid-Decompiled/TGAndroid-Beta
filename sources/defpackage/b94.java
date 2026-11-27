package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class b94 extends AnimatorListenerAdapter {
    public final d94 a;

    public b94(d94 d94Var) {
        this.a = d94Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        d94 d94Var = this.a;
        ok8 ok8Var = d94Var.n;
        TextView textView = d94Var.h;
        uv8 uv8Var = d94Var.f;
        if (d94Var.x) {
            uv8Var.setVisibility(4);
            textView.setVisibility(4);
            ok8Var.setVisibility(0);
            return;
        }
        if (d94Var.w) {
            uv8Var.setVisibility(4);
        } else {
            textView.setVisibility(4);
        }
        ok8Var.setVisibility(8);
    }
}
