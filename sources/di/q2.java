package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.Components.h90;
public final class q2 extends h90 {
    public final j4 V;

    public q2(j4 j4Var, Context context, long j3, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, j3, 0L, f2Var, g6Var);
        this.V = j4Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f10) {
        j4 j4Var = this.V;
        a8.b8 b8Var = j4Var.f9249y1;
        b8Var.k(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.f335a);
        canvas.drawRoundRect(rectF, f10, f10, j4Var.W1);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, j4Var.f9195k0.d("paintDivider"));
        }
    }
}
