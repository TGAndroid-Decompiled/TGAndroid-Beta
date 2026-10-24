package ah;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u9;
public final class b1 extends u9 {
    public boolean G;
    public p5 H;
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
        p5 p5Var = this.H;
        if (p5Var != null) {
            p5Var.a(this);
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
        p5 p5Var = this.H;
        if (p5Var != null) {
            p5Var.o(this);
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        p5 p5Var = this.H;
        if (p5Var != null) {
            p5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().f32607k0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().f32607k0) {
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
