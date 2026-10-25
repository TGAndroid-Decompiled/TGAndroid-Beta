package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g3 extends FrameLayout {
    public final int f8577a;
    public final q4 f8578b;

    public g3(q4 q4Var, Context context, int i10) {
        super(context);
        this.f8577a = i10;
        this.f8578b = q4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x9;
        switch (this.f8577a) {
            case 0:
                q4 q4Var = this.f8578b;
                if (q4Var.f9033u2.getVisibility() == 0 && q4Var.f9033u2.getLayoutParams().width != (x9 = (int) (((q4Var.f9013p2.getX() + q4Var.f9013p2.getMeasuredWidth()) - q4Var.f9033u2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    q4Var.f9033u2.getLayoutParams().width = x9;
                    q4Var.f9033u2.invalidate();
                    q4Var.f9033u2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                q4 q4Var2 = this.f8578b;
                if (q4Var2.f9024s1 && q4Var2.G0 != null) {
                    canvas.save();
                    float f7 = 0.0f;
                    canvas.translate((getMeasuredWidth() - q4Var2.G0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.h6 h6Var = q4Var2.I0;
                    if (q4Var2.K0) {
                        f7 = 1.0f;
                    }
                    float d = h6Var.d(f7, false);
                    canvas.scale(d, d, q4Var2.G0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.r6 r6Var = q4Var2.G0;
                    r6Var.B = 255;
                    r6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                q4 q4Var3 = this.f8578b;
                if (q4Var3.f9024s1 && q4Var3.F0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - q4Var3.F0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.h6 h6Var2 = q4Var3.H0;
                    if (q4Var3.J0) {
                        f10 = 1.0f;
                    }
                    float d10 = h6Var2.d(f10, false);
                    canvas.scale(d10, d10, q4Var3.F0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.r6 r6Var2 = q4Var3.F0;
                    r6Var2.B = 255;
                    r6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f8577a) {
            case 1:
                if (drawable != this.f8578b.G0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f8578b.F0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
