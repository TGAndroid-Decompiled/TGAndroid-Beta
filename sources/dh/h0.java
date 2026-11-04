package dh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.k9;
public final class h0 extends k9 {
    public boolean H;
    public g5 I;
    public d J;
    public boolean K;
    public final j0 L;

    public h0(j0 j0Var, Context context) {
        super(context);
        this.L = j0Var;
        getImageReceiver().h0(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        g5 g5Var = this.I;
        if (g5Var != null) {
            g5Var.a(this);
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
        g5 g5Var = this.I;
        if (g5Var != null) {
            g5Var.n(this);
        }
        d dVar = this.J;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g5 g5Var = this.I;
        if (g5Var != null) {
            g5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
        if (getImageReceiver().B() != null && getImageReceiver().B().f32734l0) {
            this.H = true;
        }
        if (!this.H && getImageReceiver().B() != null && !getImageReceiver().B().f32734l0) {
            j0 j0Var = this.L;
            if (j0Var.f9034a == 2 && !j0Var.f9056z) {
                getImageReceiver().B().N(getImageReceiver().B().f32725e[0] - 1, false, false);
            } else {
                getImageReceiver().B().N(0, false, false);
                getImageReceiver().B().start();
            }
        }
        super.onDraw(canvas);
    }
}
