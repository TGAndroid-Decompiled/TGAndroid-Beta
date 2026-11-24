package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class j66 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final k66 c;

    public j66(k66 k66Var, float f, byte b) {
        this.a = b;
        this.c = k66Var;
        this.b = f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        k66 k66Var = this.c;
        switch (b) {
            case 0:
                TextView textView = k66Var.f;
                int w0 = bkb.w0(null, bkb.x6, false);
                int w02 = bkb.w0(null, bkb.m6, false);
                k66Var.s = f;
                textView.setTextColor(bm2.f(f, w0, w02));
                return;
            default:
                TextView textView2 = k66Var.d;
                int w03 = bkb.w0(null, bkb.x6, false);
                int w04 = bkb.w0(null, bkb.m6, false);
                k66Var.x = f;
                textView2.setTextColor(bm2.f(f, w03, w04));
                return;
        }
    }
}
