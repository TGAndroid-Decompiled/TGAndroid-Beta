package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class q49 extends de0 {
    public boolean H;
    public wl I;
    public yl J;
    public boolean K;
    public final s49 L;

    public q49(s49 s49Var, Context context) {
        super(context);
        this.L = s49Var;
        getImageReceiver().T(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        wl wlVar = this.I;
        if (wlVar != null) {
            wlVar.b(this);
        }
        yl ylVar = this.J;
        if (ylVar != null) {
            ylVar.f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        wl wlVar = this.I;
        if (wlVar != null) {
            wlVar.o(this);
        }
        yl ylVar = this.J;
        if (ylVar != null) {
            ylVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wl wlVar = this.I;
        if (wlVar != null) {
            wlVar.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.setAlpha(255);
            this.I.draw(canvas);
            this.H = true;
            return;
        }
        yl ylVar = this.J;
        if (ylVar != null) {
            ylVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.b(canvas);
            this.H = true;
            return;
        }
        if (getImageReceiver().y() != null && getImageReceiver().y().l0) {
            this.H = true;
        }
        if (!this.H && getImageReceiver().y() != null && !getImageReceiver().y().l0) {
            s49 s49Var = this.L;
            if (s49Var.a == 2 && !s49Var.z) {
                getImageReceiver().y().I(getImageReceiver().y().e[0] - 1, false, false);
            } else {
                getImageReceiver().y().I(0, false, false);
                getImageReceiver().y().start();
            }
        }
        super.onDraw(canvas);
    }
}
