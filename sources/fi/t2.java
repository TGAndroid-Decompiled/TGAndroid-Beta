package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class t2 extends FrameLayout {
    public final int f12578a;
    public final z3 f12579b;

    public t2(z3 z3Var, Context context, int i7) {
        super(context);
        this.f12578a = i7;
        this.f12579b = z3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f12578a) {
            case 0:
                z3 z3Var = this.f12579b;
                if (z3Var.f12861p2.getVisibility() == 0 && z3Var.f12861p2.getLayoutParams().width != (x10 = (int) (((z3Var.f12844k2.getX() + z3Var.f12844k2.getMeasuredWidth()) - z3Var.f12861p2.getX()) + org.telegram.messenger.g0.L(10.0f)))) {
                    z3Var.f12861p2.getLayoutParams().width = x10;
                    z3Var.f12861p2.invalidate();
                    z3Var.f12861p2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                z3 z3Var2 = this.f12579b;
                if (z3Var2.n1 && z3Var2.B0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - z3Var2.B0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.c6 c6Var = z3Var2.D0;
                    if (z3Var2.F0) {
                        f10 = 1.0f;
                    }
                    float e10 = c6Var.e(false, f10);
                    canvas.scale(e10, e10, z3Var2.B0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.m6 m6Var = z3Var2.B0;
                    m6Var.C = 255;
                    m6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                z3 z3Var3 = this.f12579b;
                if (z3Var3.n1 && z3Var3.A0 != null) {
                    canvas.save();
                    float f11 = 0.0f;
                    canvas.translate((getMeasuredWidth() - z3Var3.A0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.c6 c6Var2 = z3Var3.C0;
                    if (z3Var3.E0) {
                        f11 = 1.0f;
                    }
                    float e11 = c6Var2.e(false, f11);
                    canvas.scale(e11, e11, z3Var3.A0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.m6 m6Var2 = z3Var3.A0;
                    m6Var2.C = 255;
                    m6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f12578a) {
            case 1:
                if (drawable != this.f12579b.B0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f12579b.A0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
