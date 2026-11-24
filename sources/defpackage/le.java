package defpackage;

import android.view.animation.Animation;
public final class le implements Animation.AnimationListener {
    public final byte a;
    public final Object b;

    public le(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ne) obj).o1.setAlpha(0.0f);
                return;
            case 1:
                ((fm4) obj).f.post(new a14(this, (byte) 27));
                return;
            default:
                rv6 rv6Var = ((pv6) obj).x;
                rv6Var.P = false;
                rv6Var.o();
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
                fm4 fm4Var = (fm4) obj;
                fm4Var.i.setEnabled(false);
                fm4Var.g.setVisibility(0);
                fm4Var.h.setVisibility(0);
                return;
            default:
                ((pv6) obj).x.P = true;
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
