package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class t2 extends FrameLayout {
    public final int f12570a;
    public final z3 f12571b;

    public t2(z3 z3Var, Context context, int i7) {
        super(context);
        this.f12570a = i7;
        this.f12571b = z3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f12570a) {
            case 0:
                z3 z3Var = this.f12571b;
                if (z3Var.f12853p2.getVisibility() == 0 && z3Var.f12853p2.getLayoutParams().width != (x10 = (int) (((z3Var.f12836k2.getX() + z3Var.f12836k2.getMeasuredWidth()) - z3Var.f12853p2.getX()) + org.telegram.messenger.g0.L(10.0f)))) {
                    z3Var.f12853p2.getLayoutParams().width = x10;
                    z3Var.f12853p2.invalidate();
                    z3Var.f12853p2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                z3 z3Var2 = this.f12571b;
                if (z3Var2.n1 && z3Var2.B0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - z3Var2.B0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.d6 d6Var = z3Var2.D0;
                    if (z3Var2.F0) {
                        f10 = 1.0f;
                    }
                    float e10 = d6Var.e(false, f10);
                    canvas.scale(e10, e10, z3Var2.B0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.n6 n6Var = z3Var2.B0;
                    n6Var.C = 255;
                    n6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                z3 z3Var3 = this.f12571b;
                if (z3Var3.n1 && z3Var3.A0 != null) {
                    canvas.save();
                    float f11 = 0.0f;
                    canvas.translate((getMeasuredWidth() - z3Var3.A0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.d6 d6Var2 = z3Var3.C0;
                    if (z3Var3.E0) {
                        f11 = 1.0f;
                    }
                    float e11 = d6Var2.e(false, f11);
                    canvas.scale(e11, e11, z3Var3.A0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.n6 n6Var2 = z3Var3.A0;
                    n6Var2.C = 255;
                    n6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f12570a) {
            case 1:
                if (drawable != this.f12571b.B0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f12571b.A0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
