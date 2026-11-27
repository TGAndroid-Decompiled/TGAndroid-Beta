package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
public final class kk8 extends nr {
    public dva e;
    public Paint f;
    public float h;

    @Override
    public final void draw(Canvas canvas) {
        int L = hl.L(10.0f);
        dva dvaVar = this.e;
        dvaVar.c.set(hl.L(5.0f), hl.L(5.0f), getMeasuredWidth() - hl.L(5.0f), getMeasuredHeight() - hl.L(5.0f));
        float f = -L;
        dvaVar.a.set(f, f, getWidth() + L, getHeight() + L);
        canvas.save();
        float f2 = 1.0f - this.h;
        canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        dvaVar.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, hl.L(18.0f), hl.L(18.0f), this.f);
        super.draw(canvas);
    }
}
