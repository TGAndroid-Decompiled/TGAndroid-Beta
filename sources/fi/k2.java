package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.Components.t90;
public final class k2 extends t90 {
    public final z3 W;

    public k2(z3 z3Var, Context context, long j3, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, j3, 0L, h2Var, i6Var);
        this.W = z3Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f10) {
        z3 z3Var = this.W;
        a8.b8 b8Var = z3Var.f12897z1;
        b8Var.k(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.f341a);
        canvas.drawRoundRect(rectF, f10, f10, z3Var.X1);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, z3Var.f12843l0.g("paintDivider"));
        }
    }
}
