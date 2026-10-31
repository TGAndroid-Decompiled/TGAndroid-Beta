package kg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
public final class u0 extends org.telegram.ui.Cells.q {
    public f2 e;
    public Paint f11276f;
    public float h;

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(10.0f);
        f2 f2Var = this.e;
        f2Var.f11070c.set(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(5.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(5.0f));
        float f7 = -L;
        f2Var.f11068a.set(f7, f7, getWidth() + L, getHeight() + L);
        canvas.save();
        float f10 = 1.0f - this.h;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        f2Var.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), this.f11276f);
        super.draw(canvas);
    }
}
