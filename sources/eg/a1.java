package eg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.rp;
public final class a1 extends k6 {
    public final int f5215s;
    public final c1 v;

    public a1(c1 c1Var, Context context, int i10) {
        super(context, true, true, true);
        this.f5215s = i10;
        this.v = c1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f5215s) {
            case 0:
                c1 c1Var = this.v;
                if (c1Var.J > 0.0f) {
                    if (c1Var.I == null) {
                        c1Var.I = new rp(c1Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - c1Var.J) * AndroidUtilities.dp(24.0f));
                    c1Var.I.setBounds(0, dp, getWidth(), getHeight() + dp);
                    c1Var.I.setAlpha((int) (c1Var.J * 255.0f));
                    c1Var.I.draw(canvas);
                    invalidate();
                }
                float f10 = c1Var.J;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (c1Var.J * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (c1Var.J * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                c1 c1Var2 = this.v;
                if (c1Var2.J > 0.0f) {
                    if (c1Var2.I == null) {
                        c1Var2.I = new rp(c1Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - c1Var2.J) * AndroidUtilities.dp(24.0f));
                    c1Var2.I.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    c1Var2.I.setAlpha((int) (c1Var2.J * 255.0f));
                    c1Var2.I.draw(canvas);
                    invalidate();
                }
                float f11 = c1Var2.J;
                if (f11 < 1.0f) {
                    if (f11 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (c1Var2.J * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (c1Var2.J * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
        }
    }
}
