package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.d;
public final class v38 extends u17 {
    public final a58 V;

    public v38(a58 a58Var, Context context, long j, d dVar, r63 r63Var) {
        super(context, j, 0L, dVar, r63Var);
        this.V = a58Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f) {
        a58 a58Var = this.V;
        eq eqVar = a58Var.F1;
        eqVar.i(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = gm.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f, f, (Paint) eqVar.a);
        canvas.drawRoundRect(rectF, f, f, a58Var.d2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, a58Var.r0.d("paintDivider"));
        }
    }
}
