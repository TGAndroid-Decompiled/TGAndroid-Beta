package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class g84 extends AnimatorListenerAdapter {
    public final i84 a;

    public g84(i84 i84Var) {
        this.a = i84Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i84 i84Var = this.a;
        ah8 ah8Var = i84Var.n;
        TextView textView = i84Var.h;
        ls8 ls8Var = i84Var.f;
        if (i84Var.x) {
            ls8Var.setVisibility(4);
            textView.setVisibility(4);
            ah8Var.setVisibility(0);
            return;
        }
        if (i84Var.w) {
            ls8Var.setVisibility(4);
        } else {
            textView.setVisibility(4);
        }
        ah8Var.setVisibility(8);
    }
}
