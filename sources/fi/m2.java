package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.Components.j90;
public final class m2 extends j90 {
    public final b4 W;

    public m2(b4 b4Var, Context context, long j3, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j3, 0L, e2Var, e6Var);
        this.W = b4Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f10) {
        b4 b4Var = this.W;
        a8.b8 b8Var = b4Var.f11547z1;
        b8Var.k(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.f341a);
        canvas.drawRoundRect(rectF, f10, f10, b4Var.X1);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, b4Var.f11493l0.d("paintDivider"));
        }
    }
}
