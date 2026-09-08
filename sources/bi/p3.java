package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oa0;
public final class p3 extends oa0 {
    public final o5 V;

    public p3(o5 o5Var, Context context, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j3, 0L, n2Var, f6Var);
        this.V = o5Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f7) {
        o5 o5Var = this.V;
        com.google.firebase.messaging.n nVar = o5Var.P1;
        nVar.z(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.f6401a);
        canvas.drawRoundRect(rectF, f7, f7, o5Var.f3470n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, o5Var.B0.G("paintDivider"));
        }
    }
}
