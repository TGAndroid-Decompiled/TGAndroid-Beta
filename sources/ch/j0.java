package ch;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p9;
public final class j0 extends p9 {
    public boolean H;
    public o5 I;
    public d J;
    public boolean K;
    public final l0 L;

    public j0(l0 l0Var, Context context) {
        super(context);
        this.L = l0Var;
        getImageReceiver().i0(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        o5 o5Var = this.I;
        if (o5Var != null) {
            o5Var.a(this);
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
        o5 o5Var = this.I;
        if (o5Var != null) {
            o5Var.n(this);
        }
        d dVar = this.J;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        o5 o5Var = this.I;
        if (o5Var != null) {
            o5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
        if (getImageReceiver().C() != null && getImageReceiver().C().f37814l0) {
            this.H = true;
        }
        if (!this.H && getImageReceiver().C() != null && !getImageReceiver().C().f37814l0) {
            l0 l0Var = this.L;
            if (l0Var.f5395a == 2 && !l0Var.f5417z) {
                getImageReceiver().C().N(getImageReceiver().C().f37805e[0] - 1, false, false);
            } else {
                getImageReceiver().C().N(0, false, false);
                getImageReceiver().C().start();
            }
        }
        super.onDraw(canvas);
    }
}
