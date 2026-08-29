package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.d00;
public final class w9 extends org.telegram.ui.Components.o6 {
    public final int f13039s = 0;
    public final Object v;
    public final ViewGroup f13040w;

    public w9(x9 x9Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f13040w = x9Var;
        this.v = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        switch (this.f13039s) {
            case 0:
                Drawable drawable = (Drawable) this.v;
                if (!((x9) this.f13040w).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().d()) - AndroidUtilities.dp(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.ui.b.x(17.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(17.0f) + measuredWidth, (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                d00 d00Var = (d00) this.f13040w;
                int a2 = d00Var.f37252w.a(d00Var.v, false);
                setTextColor(a2);
                Paint paint = (Paint) this.v;
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f9 = 0.2f;
                } else {
                    f9 = 0.1f;
                }
                paint.setColor(org.telegram.ui.ActionBar.g6.l1(f9, a2));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getWidth() - getDrawable().d()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (AndroidUtilities.dpf2(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public w9(d00 d00Var, Context context) {
        super(context, false, true, true);
        this.f13040w = d00Var;
        this.v = new Paint(1);
    }
}
