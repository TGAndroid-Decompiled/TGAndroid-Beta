package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class b48 extends FrameLayout {
    public final byte a;
    public final a58 b;

    public b48(a58 a58Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = a58Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x;
        byte b = this.a;
        float f = 1.0f;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                if (a58Var.v2.getVisibility() == 0 && a58Var.v2.getLayoutParams().width != (x = (int) (((a58Var.q2.getX() + a58Var.q2.getMeasuredWidth()) - a58Var.v2.getX()) + gm.L(10.0f)))) {
                    a58Var.v2.getLayoutParams().width = x;
                    a58Var.v2.invalidate();
                    a58Var.v2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (a58Var.t1 && a58Var.H0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - a58Var.H0.c()) - gm.L(6.0f), 0.0f);
                    ln lnVar = a58Var.J0;
                    if (!a58Var.L0) {
                        f = 0.0f;
                    }
                    float e = lnVar.e(false, f);
                    canvas.scale(e, e, a58Var.H0.c() / 2.0f, gm.L(20.0f));
                    ho hoVar = a58Var.H0;
                    hoVar.C = 255;
                    hoVar.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                if (a58Var.t1 && a58Var.G0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - a58Var.G0.c()) - gm.L(6.0f), 0.0f);
                    ln lnVar2 = a58Var.I0;
                    if (!a58Var.K0) {
                        f = 0.0f;
                    }
                    float e2 = lnVar2.e(false, f);
                    canvas.scale(e2, e2, a58Var.G0.c() / 2.0f, gm.L(20.0f));
                    ho hoVar2 = a58Var.G0;
                    hoVar2.C = 255;
                    hoVar2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        byte b = this.a;
        a58 a58Var = this.b;
        switch (b) {
            case 1:
                if (drawable == a58Var.H0 || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            case 2:
                if (drawable == a58Var.G0 || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
