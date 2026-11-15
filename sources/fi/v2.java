package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class v2 extends FrameLayout {
    public final int f12413a;
    public final b4 f12414b;

    public v2(b4 b4Var, Context context, int i7) {
        super(context);
        this.f12413a = i7;
        this.f12414b = b4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f12413a) {
            case 0:
                b4 b4Var = this.f12414b;
                if (b4Var.f11508p2.getVisibility() == 0 && b4Var.f11508p2.getLayoutParams().width != (x10 = (int) (((b4Var.f11491k2.getX() + b4Var.f11491k2.getMeasuredWidth()) - b4Var.f11508p2.getX()) + org.telegram.messenger.g0.L(10.0f)))) {
                    b4Var.f11508p2.getLayoutParams().width = x10;
                    b4Var.f11508p2.invalidate();
                    b4Var.f11508p2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                b4 b4Var2 = this.f12414b;
                if (b4Var2.n1 && b4Var2.B0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - b4Var2.B0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.u5 u5Var = b4Var2.D0;
                    if (b4Var2.F0) {
                        f10 = 1.0f;
                    }
                    float e10 = u5Var.e(false, f10);
                    canvas.scale(e10, e10, b4Var2.B0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.g6 g6Var = b4Var2.B0;
                    g6Var.C = 255;
                    g6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                b4 b4Var3 = this.f12414b;
                if (b4Var3.n1 && b4Var3.A0 != null) {
                    canvas.save();
                    float f11 = 0.0f;
                    canvas.translate((getMeasuredWidth() - b4Var3.A0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.u5 u5Var2 = b4Var3.C0;
                    if (b4Var3.E0) {
                        f11 = 1.0f;
                    }
                    float e11 = u5Var2.e(false, f11);
                    canvas.scale(e11, e11, b4Var3.A0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.g6 g6Var2 = b4Var3.A0;
                    g6Var2.C = 255;
                    g6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f12413a) {
            case 1:
                if (drawable != this.f12414b.B0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f12414b.A0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
