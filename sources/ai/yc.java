package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.d00;
public final class yc extends org.telegram.ui.Components.q6 {
    public final int f2504s = 0;
    public final Object v;
    public final ViewGroup f2505w;

    public yc(zc zcVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f2505w = zcVar;
        this.v = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        switch (this.f2504s) {
            case 0:
                Drawable drawable = (Drawable) this.v;
                if (!((zc) this.f2505w).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - AndroidUtilities.dp(20.0f));
                    drawable.setBounds(measuredWidth, wh.B(17.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(17.0f) + measuredWidth, (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                d00 d00Var = (d00) this.f2505w;
                int a2 = d00Var.f36021w.a(d00Var.v, false);
                setTextColor(a2);
                Paint paint = (Paint) this.v;
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = 0.2f;
                } else {
                    f7 = 0.1f;
                }
                paint.setColor(org.telegram.ui.ActionBar.h6.m1(f7, a2));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getWidth() - getDrawable().c()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (AndroidUtilities.dpf2(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public yc(d00 d00Var, Context context) {
        super(context, false, true, true);
        this.f2505w = d00Var;
        this.v = new Paint(1);
    }
}
