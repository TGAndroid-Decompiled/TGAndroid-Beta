package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ob0;
public final class s3 extends ob0 {
    public final q5 V;

    public s3(q5 q5Var, Context context, long j10, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, j10, 0L, m2Var, c6Var);
        this.V = q5Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f7) {
        q5 q5Var = this.V;
        com.google.firebase.messaging.m mVar = q5Var.P1;
        mVar.z(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) mVar.f6194a);
        canvas.drawRoundRect(rectF, f7, f7, q5Var.f3550n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, q5Var.B0.F("paintDivider"));
        }
    }
}
