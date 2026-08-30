package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z2 extends FrameLayout {
    public final int f16110a;
    public final d4 f16111b;

    public z2(d4 d4Var, Context context, int i10) {
        super(context);
        this.f16110a = i10;
        this.f16111b = d4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f16110a) {
            case 0:
                d4 d4Var = this.f16111b;
                if (d4Var.C2.getVisibility() == 0 && d4Var.C2.getLayoutParams().width != (x10 = (int) (((d4Var.f15255x2.getX() + d4Var.f15255x2.getMeasuredWidth()) - d4Var.C2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    d4Var.C2.getLayoutParams().width = x10;
                    d4Var.C2.invalidate();
                    d4Var.C2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                d4 d4Var2 = this.f16111b;
                if (d4Var2.A1 && d4Var2.O0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - d4Var2.O0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.z5 z5Var = d4Var2.Q0;
                    if (d4Var2.S0) {
                        f10 = 1.0f;
                    }
                    float d = z5Var.d(f10, false);
                    canvas.scale(d, d, d4Var2.O0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.j6 j6Var = d4Var2.O0;
                    j6Var.f25901w = 255;
                    j6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                d4 d4Var3 = this.f16111b;
                if (d4Var3.A1 && d4Var3.N0 != null) {
                    canvas.save();
                    float f11 = 0.0f;
                    canvas.translate((getMeasuredWidth() - d4Var3.N0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.z5 z5Var2 = d4Var3.P0;
                    if (d4Var3.R0) {
                        f11 = 1.0f;
                    }
                    float d10 = z5Var2.d(f11, false);
                    canvas.scale(d10, d10, d4Var3.N0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.j6 j6Var2 = d4Var3.N0;
                    j6Var2.f25901w = 255;
                    j6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f16110a) {
            case 1:
                if (drawable != this.f16111b.O0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f16111b.N0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
