package defpackage;

import android.view.animation.Animation;
public final class md implements Animation.AnimationListener {
    public final byte a;
    public final Object b;

    public md(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((od) obj).o1.setAlpha(0.0f);
                return;
            case 1:
                ((jm4) obj).f.post(new rj4(this, (byte) 4));
                return;
            default:
                wv6 wv6Var = ((uv6) obj).x;
                wv6Var.P = false;
                wv6Var.o();
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
                jm4 jm4Var = (jm4) obj;
                jm4Var.i.setEnabled(false);
                jm4Var.g.setVisibility(0);
                jm4Var.h.setVisibility(0);
                return;
            default:
                ((uv6) obj).x.P = true;
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
