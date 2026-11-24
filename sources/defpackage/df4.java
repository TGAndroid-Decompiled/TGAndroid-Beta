package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
public final class df4 extends io {
    public final Paint s;
    public final ef4 w;

    public df4(ef4 ef4Var, Context context) {
        super(context, false, true, true);
        this.w = ef4Var;
        this.s = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        ef4 ef4Var = this.w;
        int a = ef4Var.x.a(ef4Var.w, false);
        setTextColor(a);
        if (cmb.I.o()) {
            f = 0.2f;
        } else {
            f = 0.1f;
        }
        int p1 = cmb.p1(f, a);
        Paint paint = this.s;
        paint.setColor(p1);
        RectF rectF = gm.P;
        rectF.set((getWidth() - getDrawable().c()) - gm.N(9.32f), (getHeight() - gm.N(14.66f)) / 2.0f, getWidth(), (gm.N(14.66f) + getHeight()) / 2.0f);
        canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
        super.dispatchDraw(canvas);
    }
}
