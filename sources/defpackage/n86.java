package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class n86 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final o86 c;

    public n86(o86 o86Var, float f, byte b) {
        this.a = b;
        this.c = o86Var;
        this.b = f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        o86 o86Var = this.c;
        switch (b) {
            case 0:
                TextView textView = o86Var.f;
                int w0 = aob.w0(null, aob.y6, false);
                int w02 = aob.w0(null, aob.n6, false);
                o86Var.s = f;
                textView.setTextColor(vm2.f(f, w0, w02));
                return;
            default:
                TextView textView2 = o86Var.d;
                int w03 = aob.w0(null, aob.y6, false);
                int w04 = aob.w0(null, aob.n6, false);
                o86Var.x = f;
                textView2.setTextColor(vm2.f(f, w03, w04));
                return;
        }
    }
}
