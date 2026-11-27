package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
public final class bf4 extends in {
    public final Paint s;
    public final cf4 w;

    public bf4(cf4 cf4Var, Context context) {
        super(context, false, true, true);
        this.w = cf4Var;
        this.s = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        cf4 cf4Var = this.w;
        int a = cf4Var.x.a(cf4Var.w, false);
        setTextColor(a);
        if (aob.I.o()) {
            f = 0.2f;
        } else {
            f = 0.1f;
        }
        int p1 = aob.p1(f, a);
        Paint paint = this.s;
        paint.setColor(p1);
        RectF rectF = hl.P;
        rectF.set((getWidth() - getDrawable().c()) - hl.N(9.32f), (getHeight() - hl.N(14.66f)) / 2.0f, getWidth(), (hl.N(14.66f) + getHeight()) / 2.0f);
        canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint);
        super.dispatchDraw(canvas);
    }
}
