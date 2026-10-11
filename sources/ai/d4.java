package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qb0;
public final class d4 extends qb0 {
    public final f6 V;

    public d4(f6 f6Var, Context context, long j3, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j3, 0L, m2Var, d6Var);
        this.V = f6Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f7) {
        f6 f6Var = this.V;
        com.google.firebase.messaging.n nVar = f6Var.P1;
        nVar.z(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.f7953a);
        canvas.drawRoundRect(rectF, f7, f7, f6Var.f989n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, f6Var.B0.F("paintDivider"));
        }
    }
}
