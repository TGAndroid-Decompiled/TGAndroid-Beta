package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z3 extends FrameLayout {
    public final int f4076a;
    public final o5 f4077b;

    public z3(o5 o5Var, Context context, int i10) {
        super(context);
        this.f4076a = i10;
        this.f4077b = o5Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f4076a) {
            case 0:
                o5 o5Var = this.f4077b;
                if (o5Var.F2.getVisibility() == 0 && o5Var.F2.getLayoutParams().width != (x10 = (int) (((o5Var.A2.getX() + o5Var.A2.getMeasuredWidth()) - o5Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    o5Var.F2.getLayoutParams().width = x10;
                    o5Var.F2.invalidate();
                    o5Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                o5 o5Var2 = this.f4077b;
                if (o5Var2.D1 && o5Var2.R0 != null) {
                    canvas.save();
                    float f7 = 0.0f;
                    canvas.translate((getMeasuredWidth() - o5Var2.R0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.e6 e6Var = o5Var2.T0;
                    if (o5Var2.V0) {
                        f7 = 1.0f;
                    }
                    float d = e6Var.d(f7, false);
                    canvas.scale(d, d, o5Var2.R0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var = o5Var2.R0;
                    p6Var.f29330w = 255;
                    p6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                o5 o5Var3 = this.f4077b;
                if (o5Var3.D1 && o5Var3.Q0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - o5Var3.Q0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.e6 e6Var2 = o5Var3.S0;
                    if (o5Var3.U0) {
                        f10 = 1.0f;
                    }
                    float d10 = e6Var2.d(f10, false);
                    canvas.scale(d10, d10, o5Var3.Q0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var2 = o5Var3.Q0;
                    p6Var2.f29330w = 255;
                    p6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f4076a) {
            case 1:
                if (drawable != this.f4077b.R0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f4077b.Q0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
