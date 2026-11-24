package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class e39 extends bf0 {
    public boolean H;
    public vm I;
    public xm J;
    public boolean K;
    public final g39 L;

    public e39(g39 g39Var, Context context) {
        super(context);
        this.L = g39Var;
        getImageReceiver().T(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        vm vmVar = this.I;
        if (vmVar != null) {
            vmVar.b(this);
        }
        xm xmVar = this.J;
        if (xmVar != null) {
            xmVar.f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        vm vmVar = this.I;
        if (vmVar != null) {
            vmVar.o(this);
        }
        xm xmVar = this.J;
        if (xmVar != null) {
            xmVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        vm vmVar = this.I;
        if (vmVar != null) {
            vmVar.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.setAlpha(255);
            this.I.draw(canvas);
            this.H = true;
            return;
        }
        xm xmVar = this.J;
        if (xmVar != null) {
            xmVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.b(canvas);
            this.H = true;
            return;
        }
        if (getImageReceiver().y() != null && getImageReceiver().y().l0) {
            this.H = true;
        }
        if (!this.H && getImageReceiver().y() != null && !getImageReceiver().y().l0) {
            g39 g39Var = this.L;
            if (g39Var.a == 2 && !g39Var.z) {
                getImageReceiver().y().I(getImageReceiver().y().e[0] - 1, false, false);
            } else {
                getImageReceiver().y().I(0, false, false);
                getImageReceiver().y().start();
            }
        }
        super.onDraw(canvas);
    }
}
