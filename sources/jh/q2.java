package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aa0;

public final class q2 extends aa0 {
    public final e4 R;

    public q2(e4 e4Var, Context context, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, j10, 0L, n2Var, c6Var);
        this.R = e4Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f10) {
        e4 e4Var = this.R;
        com.google.firebase.messaging.m mVar = e4Var.L1;
        mVar.w(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) mVar.f4602a);
        canvas.drawRoundRect(rectF, f10, f10, e4Var.f13245j2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, e4Var.f13290x0.N("paintDivider"));
        }
    }
}
