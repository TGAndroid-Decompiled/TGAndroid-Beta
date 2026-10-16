package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c4 extends FrameLayout {
    public final int f2897a;
    public final q5 f2898b;

    public c4(q5 q5Var, Context context, int i10) {
        super(context);
        this.f2897a = i10;
        this.f2898b = q5Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f2897a) {
            case 0:
                q5 q5Var = this.f2898b;
                if (q5Var.F2.getVisibility() == 0 && q5Var.F2.getLayoutParams().width != (x10 = (int) (((q5Var.A2.getX() + q5Var.A2.getMeasuredWidth()) - q5Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    q5Var.F2.getLayoutParams().width = x10;
                    q5Var.F2.invalidate();
                    q5Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                q5 q5Var2 = this.f2898b;
                if (q5Var2.D1 && q5Var2.R0 != null) {
                    canvas.save();
                    float f7 = 0.0f;
                    canvas.translate((getMeasuredWidth() - q5Var2.R0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.g6 g6Var = q5Var2.T0;
                    if (q5Var2.V0) {
                        f7 = 1.0f;
                    }
                    float d = g6Var.d(f7, false);
                    canvas.scale(d, d, q5Var2.R0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.r6 r6Var = q5Var2.R0;
                    r6Var.B = 255;
                    r6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                q5 q5Var3 = this.f2898b;
                if (q5Var3.D1 && q5Var3.Q0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - q5Var3.Q0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.g6 g6Var2 = q5Var3.S0;
                    if (q5Var3.U0) {
                        f10 = 1.0f;
                    }
                    float d10 = g6Var2.d(f10, false);
                    canvas.scale(d10, d10, q5Var3.Q0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.r6 r6Var2 = q5Var3.Q0;
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
        switch (this.f2897a) {
            case 1:
                if (drawable != this.f2898b.R0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f2898b.Q0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
