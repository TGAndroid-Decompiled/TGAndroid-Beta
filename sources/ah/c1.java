package ah;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.x9;
public final class c1 extends x9 {
    public boolean G;
    public q5 H;
    public e I;
    public boolean J;
    public final e1 K;

    public c1(e1 e1Var, Context context) {
        super(context);
        this.K = e1Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        q5 q5Var = this.H;
        if (q5Var != null) {
            q5Var.a(this);
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
        q5 q5Var = this.H;
        if (q5Var != null) {
            q5Var.o(this);
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        q5 q5Var = this.H;
        if (q5Var != null) {
            q5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().f32566l0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().f32566l0) {
            e1 e1Var = this.K;
            if (e1Var.f506a == 2 && !e1Var.f528z) {
                getImageReceiver().getLottieAnimation().L(getImageReceiver().getLottieAnimation().f32557e[0] - 1, false, false);
            } else {
                getImageReceiver().getLottieAnimation().L(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            }
        }
        super.onDraw(canvas);
    }
}
