package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.e00;
public final class qc extends org.telegram.ui.Components.s6 {
    public final int f5307s = 0;
    public final Object v;
    public final ViewGroup f5308w;

    public qc(rc rcVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f5308w = rcVar;
        this.v = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        switch (this.f5307s) {
            case 0:
                Drawable drawable = (Drawable) this.v;
                if (!((rc) this.f5308w).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - AndroidUtilities.dp(20.0f));
                    drawable.setBounds(measuredWidth, wh.B(17.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(17.0f) + measuredWidth, (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                e00 e00Var = (e00) this.f5308w;
                int a2 = e00Var.f38723w.a(e00Var.v, false);
                setTextColor(a2);
                Paint paint = (Paint) this.v;
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f7 = 0.2f;
                } else {
                    f7 = 0.1f;
                }
                paint.setColor(org.telegram.ui.ActionBar.y6.o1(f7, a2));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getWidth() - getDrawable().c()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (AndroidUtilities.dpf2(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public qc(e00 e00Var, Context context) {
        super(context, false, true, true);
        this.f5308w = e00Var;
        this.v = new Paint(1);
    }
}
