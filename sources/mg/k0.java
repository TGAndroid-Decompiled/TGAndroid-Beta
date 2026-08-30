package mg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.p9;
public final class k0 extends p9 {
    public boolean D;
    public l5 E;
    public d F;
    public boolean G;
    public final m0 H;

    public k0(m0 m0Var, Context context) {
        super(context);
        this.H = m0Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        l5 l5Var = this.E;
        if (l5Var != null) {
            l5Var.a(this);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        l5 l5Var = this.E;
        if (l5Var != null) {
            l5Var.o(this);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        l5 l5Var = this.E;
        if (l5Var != null) {
            l5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.E.setAlpha(255);
            this.E.draw(canvas);
            this.D = true;
            return;
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.F.b(canvas);
            this.D = true;
            return;
        }
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().f25158i0) {
            this.D = true;
        }
        if (!this.D && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().f25158i0) {
            m0 m0Var = this.H;
            if (m0Var.f14048a == 2 && !m0Var.f14069z) {
                getImageReceiver().getLottieAnimation().L(getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            } else {
                getImageReceiver().getLottieAnimation().L(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            }
        }
        super.onDraw(canvas);
    }
}
