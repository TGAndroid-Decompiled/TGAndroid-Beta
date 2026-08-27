package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.ui.e00;

public final class ca extends org.telegram.ui.Components.j6 {

    public final int f9103s = 0;
    public final Object v;

    public final ViewGroup f9104w;

    public ca(da daVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f9104w = daVar;
        this.v = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f9103s) {
            case 0:
                Drawable drawable = (Drawable) this.v;
                if (!((da) this.f9104w).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().d()) - AndroidUtilities.dp(20.0f));
                    drawable.setBounds(measuredWidth, rl.x(17.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(17.0f) + measuredWidth, (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                e00 e00Var = (e00) this.f9104w;
                int iA = e00Var.f37582w.a(e00Var.v, false);
                setTextColor(iA);
                Paint paint = (Paint) this.v;
                paint.setColor(org.telegram.ui.ActionBar.g6.l1(org.telegram.ui.ActionBar.g6.I.q() ? 0.2f : 0.1f, iA));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getWidth() - getDrawable().d()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (AndroidUtilities.dpf2(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                super.dispatchDraw(canvas);
                break;
        }
    }

    public ca(e00 e00Var, Context context) {
        super(context, false, true, true);
        this.f9104w = e00Var;
        this.v = new Paint(1);
    }
}
