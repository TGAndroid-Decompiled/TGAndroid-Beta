package bh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y9;
public final class q0 extends y9 {
    public boolean G;
    public t5 H;
    public e I;
    public boolean J;
    public final s0 K;

    public q0(s0 s0Var, Context context) {
        super(context);
        this.K = s0Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        t5 t5Var = this.H;
        if (t5Var != null) {
            t5Var.a(this);
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        t5 t5Var = this.H;
        if (t5Var != null) {
            t5Var.o(this);
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        t5 t5Var = this.H;
        if (t5Var != null) {
            t5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.H.setAlpha(255);
            this.H.draw(canvas);
            this.G = true;
            return;
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.b(canvas);
            this.G = true;
            return;
        }
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().f34749k0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().f34749k0) {
            s0 s0Var = this.K;
            if (s0Var.f4125a == 2 && !s0Var.f4146z) {
                getImageReceiver().getLottieAnimation().N(getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            } else {
                getImageReceiver().getLottieAnimation().N(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            }
        }
        super.onDraw(canvas);
    }
}
