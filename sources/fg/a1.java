package fg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.tp;
public final class a1 extends k6 {
    public final int f6238s;
    public final b1 v;

    public a1(b1 b1Var, Context context, int i10) {
        super(context, true, true, true);
        this.f6238s = i10;
        this.v = b1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f6238s) {
            case 0:
                b1 b1Var = this.v;
                if (b1Var.J > 0.0f) {
                    if (b1Var.I == null) {
                        b1Var.I = new tp(b1Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - b1Var.J) * AndroidUtilities.dp(24.0f));
                    b1Var.I.setBounds(0, dp, getWidth(), getHeight() + dp);
                    b1Var.I.setAlpha((int) (b1Var.J * 255.0f));
                    b1Var.I.draw(canvas);
                    invalidate();
                }
                float f10 = b1Var.J;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (b1Var.J * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (b1Var.J * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                b1 b1Var2 = this.v;
                if (b1Var2.J > 0.0f) {
                    if (b1Var2.I == null) {
                        b1Var2.I = new tp(b1Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - b1Var2.J) * AndroidUtilities.dp(24.0f));
                    b1Var2.I.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    b1Var2.I.setAlpha((int) (b1Var2.J * 255.0f));
                    b1Var2.I.draw(canvas);
                    invalidate();
                }
                float f11 = b1Var2.J;
                if (f11 < 1.0f) {
                    if (f11 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (b1Var2.J * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (b1Var2.J * 0.4f));
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
