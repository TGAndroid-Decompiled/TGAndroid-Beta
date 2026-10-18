package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class h3 extends FrameLayout {
    public final int f5456a;
    public final q4 f5457b;

    public h3(q4 q4Var, Context context, int i10) {
        super(context);
        this.f5456a = i10;
        this.f5457b = q4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f5456a) {
            case 0:
                q4 q4Var = this.f5457b;
                if (q4Var.F2.getVisibility() == 0 && q4Var.F2.getLayoutParams().width != (x10 = (int) (((q4Var.A2.getX() + q4Var.A2.getMeasuredWidth()) - q4Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    q4Var.F2.getLayoutParams().width = x10;
                    q4Var.F2.invalidate();
                    q4Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                q4 q4Var2 = this.f5457b;
                if (q4Var2.D1 && q4Var2.R0 != null) {
                    canvas.save();
                    float f7 = 0.0f;
                    canvas.translate((getMeasuredWidth() - q4Var2.R0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.f6 f6Var = q4Var2.T0;
                    if (q4Var2.V0) {
                        f7 = 1.0f;
                    }
                    float d = f6Var.d(f7, false);
                    canvas.scale(d, d, q4Var2.R0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var = q4Var2.R0;
                    p6Var.B = 255;
                    p6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                q4 q4Var3 = this.f5457b;
                if (q4Var3.D1 && q4Var3.Q0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - q4Var3.Q0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.f6 f6Var2 = q4Var3.S0;
                    if (q4Var3.U0) {
                        f10 = 1.0f;
                    }
                    float d10 = f6Var2.d(f10, false);
                    canvas.scale(d10, d10, q4Var3.Q0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var2 = q4Var3.Q0;
                    p6Var2.B = 255;
                    p6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f5456a) {
            case 1:
                if (drawable != this.f5457b.R0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f5457b.Q0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
