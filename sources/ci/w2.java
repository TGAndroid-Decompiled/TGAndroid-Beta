package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ib0;
public final class w2 extends ib0 {
    public final p4 V;

    public w2(p4 p4Var, Context context, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j10, 0L, n2Var, d6Var);
        this.V = p4Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f7) {
        p4 p4Var = this.V;
        com.google.firebase.messaging.l lVar = p4Var.P1;
        lVar.E(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) lVar.f7646a);
        canvas.drawRoundRect(rectF, f7, f7, p4Var.f5687n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, p4Var.B0.n("paintDivider"));
        }
    }
}
