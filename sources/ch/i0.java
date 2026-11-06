package ch;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.l9;
public final class i0 extends l9 {
    public boolean G;
    public i5 H;
    public d I;
    public boolean J;
    public final k0 K;

    public i0(k0 k0Var, Context context) {
        super(context);
        this.K = k0Var;
        getImageReceiver().h0(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.a(this);
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.n(this);
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.H.setAlpha(255);
            this.H.draw(canvas);
            this.G = true;
            return;
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.b(canvas);
            this.G = true;
            return;
        }
        if (getImageReceiver().B() != null && getImageReceiver().B().f40939k0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().B() != null && !getImageReceiver().B().f40939k0) {
            k0 k0Var = this.K;
            if (k0Var.f6282a == 2 && !k0Var.f6304z) {
                getImageReceiver().B().N(getImageReceiver().B().f40931e[0] - 1, false, false);
            } else {
                getImageReceiver().B().N(0, false, false);
                getImageReceiver().B().start();
            }
        }
        super.onDraw(canvas);
    }
}
