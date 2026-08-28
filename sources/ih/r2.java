package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w90;
public final class r2 extends w90 {
    public final i4 R;

    public r2(i4 i4Var, Context context, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, j10, 0L, o2Var, b6Var);
        this.R = i4Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f10) {
        i4 i4Var = this.R;
        com.google.firebase.messaging.m mVar = i4Var.L1;
        mVar.w(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) mVar.f4160a);
        canvas.drawRoundRect(rectF, f10, f10, i4Var.f11558j2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, i4Var.f11603x0.O("paintDivider"));
        }
    }
}
