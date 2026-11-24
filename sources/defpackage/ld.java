package defpackage;

import android.view.animation.Animation;
public final class ld implements Animation.AnimationListener {
    public final byte a;
    public final Object b;

    public ld(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((nd) obj).o1.setAlpha(0.0f);
                return;
            case 1:
                ((ek4) obj).f.post(new s54(this, (byte) 20));
                return;
            default:
                rt6 rt6Var = ((pt6) obj).x;
                rt6Var.P = false;
                rt6Var.o();
                return;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return;
            case 1:
                ek4 ek4Var = (ek4) obj;
                ek4Var.i.setEnabled(false);
                ek4Var.g.setVisibility(0);
                ek4Var.h.setVisibility(0);
                return;
            default:
                ((pt6) obj).x.P = true;
                return;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
