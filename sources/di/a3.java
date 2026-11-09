package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class a3 extends FrameLayout {
    public final int f8799a;
    public final j4 f8800b;

    public a3(j4 j4Var, Context context, int i7) {
        super(context);
        this.f8799a = i7;
        this.f8800b = j4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f8799a) {
            case 0:
                j4 j4Var = this.f8800b;
                if (j4Var.f9210o2.getVisibility() == 0 && j4Var.f9210o2.getLayoutParams().width != (x10 = (int) (((j4Var.f9194j2.getX() + j4Var.f9194j2.getMeasuredWidth()) - j4Var.f9210o2.getX()) + org.telegram.messenger.g0.L(10.0f)))) {
                    j4Var.f9210o2.getLayoutParams().width = x10;
                    j4Var.f9210o2.invalidate();
                    j4Var.f9210o2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                j4 j4Var2 = this.f8800b;
                if (j4Var2.f9202m1 && j4Var2.A0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - j4Var2.A0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.w5 w5Var = j4Var2.C0;
                    if (j4Var2.E0) {
                        f10 = 1.0f;
                    }
                    float e10 = w5Var.e(false, f10);
                    canvas.scale(e10, e10, j4Var2.A0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.i6 i6Var = j4Var2.A0;
                    i6Var.B = 255;
                    i6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                j4 j4Var3 = this.f8800b;
                if (j4Var3.f9202m1 && j4Var3.f9252z0 != null) {
                    canvas.save();
                    float f11 = 0.0f;
                    canvas.translate((getMeasuredWidth() - j4Var3.f9252z0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.w5 w5Var2 = j4Var3.B0;
                    if (j4Var3.D0) {
                        f11 = 1.0f;
                    }
                    float e11 = w5Var2.e(false, f11);
                    canvas.scale(e11, e11, j4Var3.f9252z0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.i6 i6Var2 = j4Var3.f9252z0;
                    i6Var2.B = 255;
                    i6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f8799a) {
            case 1:
                if (drawable != this.f8800b.A0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f8800b.f9252z0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
