package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class a3 extends FrameLayout {
    public final int f8801a;
    public final i4 f8802b;

    public a3(i4 i4Var, Context context, int i7) {
        super(context);
        this.f8801a = i7;
        this.f8802b = i4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f8801a) {
            case 0:
                i4 i4Var = this.f8802b;
                if (i4Var.f9178o2.getVisibility() == 0 && i4Var.f9178o2.getLayoutParams().width != (x10 = (int) (((i4Var.f9162j2.getX() + i4Var.f9162j2.getMeasuredWidth()) - i4Var.f9178o2.getX()) + org.telegram.messenger.g0.L(10.0f)))) {
                    i4Var.f9178o2.getLayoutParams().width = x10;
                    i4Var.f9178o2.invalidate();
                    i4Var.f9178o2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                i4 i4Var2 = this.f8802b;
                if (i4Var2.f9170m1 && i4Var2.A0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - i4Var2.A0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.w5 w5Var = i4Var2.C0;
                    if (i4Var2.E0) {
                        f10 = 1.0f;
                    }
                    float e10 = w5Var.e(false, f10);
                    canvas.scale(e10, e10, i4Var2.A0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.i6 i6Var = i4Var2.A0;
                    i6Var.B = 255;
                    i6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                i4 i4Var3 = this.f8802b;
                if (i4Var3.f9170m1 && i4Var3.f9220z0 != null) {
                    canvas.save();
                    float f11 = 0.0f;
                    canvas.translate((getMeasuredWidth() - i4Var3.f9220z0.c()) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.w5 w5Var2 = i4Var3.B0;
                    if (i4Var3.D0) {
                        f11 = 1.0f;
                    }
                    float e11 = w5Var2.e(false, f11);
                    canvas.scale(e11, e11, i4Var3.f9220z0.c() / 2.0f, org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.Components.i6 i6Var2 = i4Var3.f9220z0;
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
        switch (this.f8801a) {
            case 1:
                if (drawable != this.f8802b.A0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f8802b.f9220z0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
