package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.Components.c90;
public final class u2 extends c90 {
    public final j4 W;

    public u2(j4 j4Var, Context context, long j10, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j10, 0L, d2Var, e6Var);
        this.W = j4Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f10) {
        j4 j4Var = this.W;
        l2.e eVar = j4Var.f10531z1;
        eVar.m(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) eVar.f17689a);
        canvas.drawRoundRect(rectF, f10, f10, j4Var.X1);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, j4Var.f10476l0.d("paintDivider"));
        }
    }
}
