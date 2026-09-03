package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ra0;
public final class r2 extends ra0 {
    public final f4 S;

    public r2(f4 f4Var, Context context, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, j10, 0L, p2Var, g6Var);
        this.S = f4Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f10) {
        f4 f4Var = this.S;
        a9.a aVar = f4Var.M1;
        aVar.x(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f10, f10, (Paint) aVar.f155a);
        canvas.drawRoundRect(rectF, f10, f10, f4Var.f17084k2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, f4Var.f17129y0.F("paintDivider"));
        }
    }
}
