package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qa0;
public final class q2 extends qa0 {
    public final d4 S;

    public q2(d4 d4Var, Context context, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j10, 0L, p2Var, f6Var);
        this.S = d4Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f10) {
        d4 d4Var = this.S;
        a9.a aVar = d4Var.M1;
        aVar.w(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) aVar.f142a);
        canvas.drawRoundRect(rectF, f10, f10, d4Var.f15192k2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, d4Var.f15237y0.G("paintDivider"));
        }
    }
}
