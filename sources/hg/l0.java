package hg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.o9;
public final class l0 extends o9 {
    public boolean C;
    public k5 D;
    public d E;
    public boolean F;
    public final n0 G;

    public l0(n0 n0Var, Context context) {
        super(context);
        this.G = n0Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        k5 k5Var = this.D;
        if (k5Var != null) {
            k5Var.a(this);
        }
        d dVar = this.E;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        k5 k5Var = this.D;
        if (k5Var != null) {
            k5Var.o(this);
        }
        d dVar = this.E;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        k5 k5Var = this.D;
        if (k5Var != null) {
            k5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.D.setAlpha(255);
            this.D.draw(canvas);
            this.C = true;
            return;
        }
        d dVar = this.E;
        if (dVar != null) {
            dVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.E.b(canvas);
            this.C = true;
            return;
        }
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().f30852h0) {
            this.C = true;
        }
        if (!this.C && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().f30852h0) {
            n0 n0Var = this.G;
            if (n0Var.f10656a == 2 && !n0Var.f10678z) {
                getImageReceiver().getLottieAnimation().L(getImageReceiver().getLottieAnimation().f30847e[0] - 1, false, false);
            } else {
                getImageReceiver().getLottieAnimation().L(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            }
        }
        super.onDraw(canvas);
    }
}
