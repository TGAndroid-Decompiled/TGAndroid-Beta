package kg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.t9;
public final class k0 extends t9 {
    public boolean C;
    public p5 D;
    public d E;
    public boolean F;
    public final m0 G;

    public k0(m0 m0Var, Context context) {
        super(context);
        this.G = m0Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.a(this);
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
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.o(this);
        }
        d dVar = this.E;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().f34742h0) {
            this.C = true;
        }
        if (!this.C && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().f34742h0) {
            m0 m0Var = this.G;
            if (m0Var.f13764a == 2 && !m0Var.f13786z) {
                getImageReceiver().getLottieAnimation().L(getImageReceiver().getLottieAnimation().f34737e[0] - 1, false, false);
            } else {
                getImageReceiver().getLottieAnimation().L(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            }
        }
        super.onDraw(canvas);
    }
}
