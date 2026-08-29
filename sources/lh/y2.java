package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y2 extends FrameLayout {
    public final int f16415a;
    public final d4 f16416b;

    public y2(d4 d4Var, Context context, int i10) {
        super(context);
        this.f16415a = i10;
        this.f16416b = d4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x4;
        switch (this.f16415a) {
            case 0:
                d4 d4Var = this.f16416b;
                if (d4Var.B2.getVisibility() == 0 && d4Var.B2.getLayoutParams().width != (x4 = (int) (((d4Var.f15537w2.getX() + d4Var.f15537w2.getMeasuredWidth()) - d4Var.B2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    d4Var.B2.getLayoutParams().width = x4;
                    d4Var.B2.invalidate();
                    d4Var.B2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                d4 d4Var2 = this.f16416b;
                if (d4Var2.f15548z1 && d4Var2.N0 != null) {
                    canvas.save();
                    float f9 = 0.0f;
                    canvas.translate((getMeasuredWidth() - d4Var2.N0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.d6 d6Var = d4Var2.P0;
                    if (d4Var2.R0) {
                        f9 = 1.0f;
                    }
                    float d = d6Var.d(f9, false);
                    canvas.scale(d, d, d4Var2.N0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.n6 n6Var = d4Var2.N0;
                    n6Var.f30880w = 255;
                    n6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                d4 d4Var3 = this.f16416b;
                if (d4Var3.f15548z1 && d4Var3.M0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - d4Var3.M0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.d6 d6Var2 = d4Var3.O0;
                    if (d4Var3.Q0) {
                        f10 = 1.0f;
                    }
                    float d10 = d6Var2.d(f10, false);
                    canvas.scale(d10, d10, d4Var3.M0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.n6 n6Var2 = d4Var3.M0;
                    n6Var2.f30880w = 255;
                    n6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f16415a) {
            case 1:
                if (drawable != this.f16416b.N0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f16416b.M0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
