package cg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o6;
public final class b1 extends o6 {
    public final int f3074s;
    public final d1 v;

    public b1(d1 d1Var, Context context, int i10) {
        super(context, true, true, true);
        this.f3074s = i10;
        this.v = d1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f3074s) {
            case 0:
                d1 d1Var = this.v;
                if (d1Var.I > 0.0f) {
                    if (d1Var.H == null) {
                        d1Var.H = new np(d1Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - d1Var.I) * AndroidUtilities.dp(24.0f));
                    d1Var.H.setBounds(0, dp, getWidth(), getHeight() + dp);
                    d1Var.H.setAlpha((int) (d1Var.I * 255.0f));
                    d1Var.H.draw(canvas);
                    invalidate();
                }
                float f9 = d1Var.I;
                if (f9 < 1.0f) {
                    if (f9 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (d1Var.I * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (d1Var.I * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                d1 d1Var2 = this.v;
                if (d1Var2.I > 0.0f) {
                    if (d1Var2.H == null) {
                        d1Var2.H = new np(d1Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - d1Var2.I) * AndroidUtilities.dp(24.0f));
                    d1Var2.H.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    d1Var2.H.setAlpha((int) (d1Var2.I * 255.0f));
                    d1Var2.H.draw(canvas);
                    invalidate();
                }
                float f10 = d1Var2.I;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (d1Var2.I * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (d1Var2.I * 0.4f));
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
