package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
public final class dd4 extends hn {
    public final Paint s;
    public final ed4 w;

    public dd4(ed4 ed4Var, Context context) {
        super(context, false, true, true);
        this.w = ed4Var;
        this.s = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        ed4 ed4Var = this.w;
        int a = ed4Var.x.a(ed4Var.w, false);
        setTextColor(a);
        if (bkb.I.o()) {
            f = 0.2f;
        } else {
            f = 0.1f;
        }
        int p1 = bkb.p1(f, a);
        Paint paint = this.s;
        paint.setColor(p1);
        RectF rectF = gl.P;
        rectF.set((getWidth() - getDrawable().c()) - gl.N(9.32f), (getHeight() - gl.N(14.66f)) / 2.0f, getWidth(), (gl.N(14.66f) + getHeight()) / 2.0f);
        canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
        super.dispatchDraw(canvas);
    }
}
