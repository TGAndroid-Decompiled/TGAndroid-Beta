package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m4 extends FrameLayout {
    public final int f1245a;
    public final e6 f1246b;

    public m4(e6 e6Var, Context context, int i10) {
        super(context);
        this.f1245a = i10;
        this.f1246b = e6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f1245a) {
            case 0:
                e6 e6Var = this.f1246b;
                if (e6Var.F2.getVisibility() == 0 && e6Var.F2.getLayoutParams().width != (x10 = (int) (((e6Var.A2.getX() + e6Var.A2.getMeasuredWidth()) - e6Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    e6Var.F2.getLayoutParams().width = x10;
                    e6Var.F2.invalidate();
                    e6Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                e6 e6Var2 = this.f1246b;
                if (e6Var2.D1 && e6Var2.R0 != null) {
                    canvas.save();
                    float f7 = 0.0f;
                    canvas.translate((getMeasuredWidth() - e6Var2.R0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.e6 e6Var3 = e6Var2.T0;
                    if (e6Var2.V0) {
                        f7 = 1.0f;
                    }
                    float d = e6Var3.d(f7, false);
                    canvas.scale(d, d, e6Var2.R0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.o6 o6Var = e6Var2.R0;
                    o6Var.f26946w = 255;
                    o6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                e6 e6Var4 = this.f1246b;
                if (e6Var4.D1 && e6Var4.Q0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - e6Var4.Q0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.e6 e6Var5 = e6Var4.S0;
                    if (e6Var4.U0) {
                        f10 = 1.0f;
                    }
                    float d10 = e6Var5.d(f10, false);
                    canvas.scale(d10, d10, e6Var4.Q0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.o6 o6Var2 = e6Var4.Q0;
                    o6Var2.f26946w = 255;
                    o6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f1245a) {
            case 1:
                if (drawable != this.f1246b.R0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f1246b.Q0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
