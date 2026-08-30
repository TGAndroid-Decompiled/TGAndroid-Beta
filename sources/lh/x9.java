package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.p00;
public final class x9 extends org.telegram.ui.Components.k6 {
    public final int f13362s = 0;
    public final Object v;
    public final ViewGroup f13363w;

    public x9(y9 y9Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f13363w = y9Var;
        this.v = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        switch (this.f13362s) {
            case 0:
                Drawable drawable = (Drawable) this.v;
                if (!((y9) this.f13363w).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().d()) - AndroidUtilities.dp(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.ui.b.x(17.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(17.0f) + measuredWidth, (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                p00 p00Var = (p00) this.f13363w;
                int a2 = p00Var.f37144w.a(p00Var.v, false);
                setTextColor(a2);
                Paint paint = (Paint) this.v;
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = 0.2f;
                } else {
                    f10 = 0.1f;
                }
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(f10, a2));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getWidth() - getDrawable().d()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (AndroidUtilities.dpf2(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public x9(p00 p00Var, Context context) {
        super(context, false, true, true);
        this.f13363w = p00Var;
        this.v = new Paint(1);
    }
}
