package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class y18 extends FrameLayout {
    public final byte a;
    public final y28 b;

    public y18(y28 y28Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = y28Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x;
        byte b = this.a;
        float f = 1.0f;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                if (y28Var.v2.getVisibility() == 0 && y28Var.v2.getLayoutParams().width != (x = (int) (((y28Var.q2.getX() + y28Var.q2.getMeasuredWidth()) - y28Var.v2.getX()) + gl.L(10.0f)))) {
                    y28Var.v2.getLayoutParams().width = x;
                    y28Var.v2.invalidate();
                    y28Var.v2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (y28Var.t1 && y28Var.H0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - y28Var.H0.c()) - gl.L(6.0f), 0.0f);
                    lm lmVar = y28Var.J0;
                    if (!y28Var.L0) {
                        f = 0.0f;
                    }
                    float e = lmVar.e(false, f);
                    canvas.scale(e, e, y28Var.H0.c() / 2.0f, gl.L(20.0f));
                    gn gnVar = y28Var.H0;
                    gnVar.C = 255;
                    gnVar.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                if (y28Var.t1 && y28Var.G0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - y28Var.G0.c()) - gl.L(6.0f), 0.0f);
                    lm lmVar2 = y28Var.I0;
                    if (!y28Var.K0) {
                        f = 0.0f;
                    }
                    float e2 = lmVar2.e(false, f);
                    canvas.scale(e2, e2, y28Var.G0.c() / 2.0f, gl.L(20.0f));
                    gn gnVar2 = y28Var.G0;
                    gnVar2.C = 255;
                    gnVar2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        byte b = this.a;
        y28 y28Var = this.b;
        switch (b) {
            case 1:
                if (drawable == y28Var.H0 || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            case 2:
                if (drawable == y28Var.G0 || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
