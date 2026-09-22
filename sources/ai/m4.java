package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m4 extends FrameLayout {
    public final int f1243a;
    public final f6 f1244b;

    public m4(f6 f6Var, Context context, int i10) {
        super(context);
        this.f1243a = i10;
        this.f1244b = f6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f1243a) {
            case 0:
                f6 f6Var = this.f1244b;
                if (f6Var.F2.getVisibility() == 0 && f6Var.F2.getLayoutParams().width != (x10 = (int) (((f6Var.A2.getX() + f6Var.A2.getMeasuredWidth()) - f6Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    f6Var.F2.getLayoutParams().width = x10;
                    f6Var.F2.invalidate();
                    f6Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                f6 f6Var2 = this.f1244b;
                if (f6Var2.D1 && f6Var2.R0 != null) {
                    canvas.save();
                    float f7 = 0.0f;
                    canvas.translate((getMeasuredWidth() - f6Var2.R0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.c6 c6Var = f6Var2.T0;
                    if (f6Var2.V0) {
                        f7 = 1.0f;
                    }
                    float d = c6Var.d(f7, false);
                    canvas.scale(d, d, f6Var2.R0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.m6 m6Var = f6Var2.R0;
                    m6Var.f26102w = 255;
                    m6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                f6 f6Var3 = this.f1244b;
                if (f6Var3.D1 && f6Var3.Q0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - f6Var3.Q0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.c6 c6Var2 = f6Var3.S0;
                    if (f6Var3.U0) {
                        f10 = 1.0f;
                    }
                    float d10 = c6Var2.d(f10, false);
                    canvas.scale(d10, d10, f6Var3.Q0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.m6 m6Var2 = f6Var3.Q0;
                    m6Var2.f26102w = 255;
                    m6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f1243a) {
            case 1:
                if (drawable != this.f1244b.R0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f1244b.Q0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
