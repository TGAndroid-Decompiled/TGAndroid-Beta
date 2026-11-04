package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class d3 extends FrameLayout {
    public final int f10195a;
    public final j4 f10196b;

    public d3(j4 j4Var, Context context, int i3) {
        super(context);
        this.f10195a = i3;
        this.f10196b = j4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f10195a) {
            case 0:
                j4 j4Var = this.f10196b;
                if (j4Var.f10492p2.getVisibility() == 0 && j4Var.f10492p2.getLayoutParams().width != (x10 = (int) (((j4Var.f10474k2.getX() + j4Var.f10474k2.getMeasuredWidth()) - j4Var.f10492p2.getX()) + org.telegram.messenger.g0.L(10.0f)))) {
                    j4Var.f10492p2.getLayoutParams().width = x10;
                    j4Var.f10492p2.invalidate();
                    j4Var.f10492p2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                j4 j4Var2 = this.f10196b;
                if (j4Var2.f10483n1 && j4Var2.B0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - j4Var2.B0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.u5 u5Var = j4Var2.D0;
                    if (j4Var2.F0) {
                        f10 = 1.0f;
                    }
                    float e10 = u5Var.e(false, f10);
                    canvas.scale(e10, e10, j4Var2.B0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.g6 g6Var = j4Var2.B0;
                    g6Var.B = 255;
                    g6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                j4 j4Var3 = this.f10196b;
                if (j4Var3.f10483n1 && j4Var3.A0 != null) {
                    canvas.save();
                    float f11 = 0.0f;
                    canvas.translate((getMeasuredWidth() - j4Var3.A0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.u5 u5Var2 = j4Var3.C0;
                    if (j4Var3.E0) {
                        f11 = 1.0f;
                    }
                    float e11 = u5Var2.e(false, f11);
                    canvas.scale(e11, e11, j4Var3.A0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.g6 g6Var2 = j4Var3.A0;
                    g6Var2.B = 255;
                    g6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f10195a) {
            case 1:
                if (drawable != this.f10196b.B0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f10196b.A0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
