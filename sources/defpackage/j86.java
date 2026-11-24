package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class j86 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final k86 c;

    public j86(k86 k86Var, float f, byte b) {
        this.a = b;
        this.c = k86Var;
        this.b = f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        k86 k86Var = this.c;
        switch (b) {
            case 0:
                TextView textView = k86Var.f;
                int w0 = cmb.w0(null, cmb.x6, false);
                int w02 = cmb.w0(null, cmb.m6, false);
                k86Var.s = f;
                textView.setTextColor(on2.f(f, w0, w02));
                return;
            default:
                TextView textView2 = k86Var.d;
                int w03 = cmb.w0(null, cmb.x6, false);
                int w04 = cmb.w0(null, cmb.m6, false);
                k86Var.x = f;
                textView2.setTextColor(on2.f(f, w03, w04));
                return;
        }
    }
}
