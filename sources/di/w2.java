package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gb0;
public final class w2 extends gb0 {
    public final q4 V;

    public w2(q4 q4Var, Context context, long j10, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, j10, 0L, r2Var, u6Var);
        this.V = q4Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f7) {
        q4 q4Var = this.V;
        aa.m0 m0Var = q4Var.E1;
        m0Var.w(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) m0Var.f1150a);
        canvas.drawRoundRect(rectF, f7, f7, q4Var.f8971c2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, q4Var.f9015q0.d("paintDivider"));
        }
    }
}
