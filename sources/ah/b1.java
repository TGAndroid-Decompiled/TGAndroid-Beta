package ah;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.z9;
public final class b1 extends z9 {
    public boolean G;
    public s5 H;
    public e I;
    public boolean J;
    public final d1 K;

    public b1(d1 d1Var, Context context) {
        super(context);
        this.K = d1Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        s5 s5Var = this.H;
        if (s5Var != null) {
            s5Var.a(this);
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
        s5 s5Var = this.H;
        if (s5Var != null) {
            s5Var.o(this);
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        s5 s5Var = this.H;
        if (s5Var != null) {
            s5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().f31298k0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().f31298k0) {
            d1 d1Var = this.K;
            if (d1Var.f688a == 2 && !d1Var.f709z) {
                getImageReceiver().getLottieAnimation().N(getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            } else {
                getImageReceiver().getLottieAnimation().N(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            }
        }
        super.onDraw(canvas);
    }
}
