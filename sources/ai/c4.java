package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ab0;
public final class c4 extends ab0 {
    public final e6 V;

    public c4(e6 e6Var, Context context, long j3, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.e6 e6Var2) {
        super(context, j3, 0L, o2Var, e6Var2);
        this.V = e6Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f7) {
        e6 e6Var = this.V;
        com.google.firebase.messaging.n nVar = e6Var.P1;
        nVar.z(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.f7320a);
        canvas.drawRoundRect(rectF, f7, f7, e6Var.f813n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, e6Var.B0.G("paintDivider"));
        }
    }
}
