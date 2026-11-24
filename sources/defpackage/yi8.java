package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
public final class yi8 extends ms {
    public cta e;
    public Paint f;
    public float h;

    @Override
    public final void draw(Canvas canvas) {
        int L = gm.L(10.0f);
        cta ctaVar = this.e;
        ctaVar.c.set(gm.L(5.0f), gm.L(5.0f), getMeasuredWidth() - gm.L(5.0f), getMeasuredHeight() - gm.L(5.0f));
        float f = -L;
        ctaVar.a.set(f, f, getWidth() + L, getHeight() + L);
        canvas.save();
        float f2 = 1.0f - this.h;
        canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        ctaVar.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, gm.L(18.0f), gm.L(18.0f), this.f);
        super.draw(canvas);
    }
}
