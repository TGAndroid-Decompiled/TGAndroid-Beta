package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g3 extends FrameLayout {
    public final int f5351a;
    public final p4 f5352b;

    public g3(p4 p4Var, Context context, int i10) {
        super(context);
        this.f5351a = i10;
        this.f5352b = p4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f5351a) {
            case 0:
                p4 p4Var = this.f5352b;
                if (p4Var.F2.getVisibility() == 0 && p4Var.F2.getLayoutParams().width != (x10 = (int) (((p4Var.A2.getX() + p4Var.A2.getMeasuredWidth()) - p4Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    p4Var.F2.getLayoutParams().width = x10;
                    p4Var.F2.invalidate();
                    p4Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                p4 p4Var2 = this.f5352b;
                if (p4Var2.D1 && p4Var2.R0 != null) {
                    canvas.save();
                    float f7 = 0.0f;
                    canvas.translate((getMeasuredWidth() - p4Var2.R0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.f6 f6Var = p4Var2.T0;
                    if (p4Var2.V0) {
                        f7 = 1.0f;
                    }
                    float d = f6Var.d(f7, false);
                    canvas.scale(d, d, p4Var2.R0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var = p4Var2.R0;
                    p6Var.B = 255;
                    p6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                p4 p4Var3 = this.f5352b;
                if (p4Var3.D1 && p4Var3.Q0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - p4Var3.Q0.c()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.f6 f6Var2 = p4Var3.S0;
                    if (p4Var3.U0) {
                        f10 = 1.0f;
                    }
                    float d10 = f6Var2.d(f10, false);
                    canvas.scale(d10, d10, p4Var3.Q0.c() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.p6 p6Var2 = p4Var3.Q0;
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
        switch (this.f5351a) {
            case 1:
                if (drawable != this.f5352b.R0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f5352b.Q0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
