package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
public final class e96 extends LinearLayout {
    public yxa a;
    public final Path b;
    public final Paint c;
    public long d;
    public final ln e;
    public final h96 f;

    public e96(h96 h96Var, Context context) {
        super(context);
        this.f = h96Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new ln(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.b;
        path.rewind();
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, gm.L(13.0f), gm.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        h96 h96Var = this.f;
        j96 j96Var = h96Var.f;
        if (j96Var != null) {
            int b = bg5.b(j96Var.a, j96Var.b(), 3);
            j96 j96Var2 = h96Var.f;
            int b2 = bg5.b(j96Var2.a, j96Var2.b(), 5);
            canvas.drawColor(b);
            long j = this.d;
            j96 j96Var3 = h96Var.f;
            int i = (j > j96Var3.b ? 1 : (j == j96Var3.b ? 0 : -1));
            ln lnVar = this.e;
            if (i != 0) {
                lnVar.e(true, j96Var3.a());
            }
            float e = lnVar.e(false, h96Var.f.a());
            this.d = h96Var.f.b;
            Paint paint = this.c;
            paint.setColor(b2);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        yxa yxaVar = this.a;
        if (yxaVar == null) {
            yxaVar = new yxa(1, 250);
            this.a = yxaVar;
        }
        yxaVar.f(0, 0, getWidth(), getHeight());
        yxa yxaVar2 = this.a;
        yxaVar2.h = 30.0f;
        yxaVar2.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
