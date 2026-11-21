package ch;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q9;
public final class j0 extends q9 {
    public boolean H;
    public p5 I;
    public d J;
    public boolean K;
    public final l0 L;

    public j0(l0 l0Var, Context context) {
        super(context);
        this.L = l0Var;
        getImageReceiver().h0(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        p5 p5Var = this.I;
        if (p5Var != null) {
            p5Var.a(this);
        }
        d dVar = this.J;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        p5 p5Var = this.I;
        if (p5Var != null) {
            p5Var.n(this);
        }
        d dVar = this.J;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        p5 p5Var = this.I;
        if (p5Var != null) {
            p5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.setAlpha(255);
            this.I.draw(canvas);
            this.H = true;
            return;
        }
        d dVar = this.J;
        if (dVar != null) {
            dVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.b(canvas);
            this.H = true;
            return;
        }
        if (getImageReceiver().B() != null && getImageReceiver().B().f38226l0) {
            this.H = true;
        }
        if (!this.H && getImageReceiver().B() != null && !getImageReceiver().B().f38226l0) {
            l0 l0Var = this.L;
            if (l0Var.f5429a == 2 && !l0Var.f5451z) {
                getImageReceiver().B().N(getImageReceiver().B().f38217e[0] - 1, false, false);
            } else {
                getImageReceiver().B().N(0, false, false);
                getImageReceiver().B().start();
            }
        }
        super.onDraw(canvas);
    }
}
