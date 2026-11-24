package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
public final class e76 extends LinearLayout {
    public vva a;
    public final Path b;
    public final Paint c;
    public long d;
    public final lm e;
    public final h76 f;

    public e76(h76 h76Var, Context context) {
        super(context);
        this.f = h76Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new lm(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.b;
        path.rewind();
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        h76 h76Var = this.f;
        j76 j76Var = h76Var.f;
        if (j76Var != null) {
            int b = de5.b(j76Var.a, j76Var.b(), 3);
            j76 j76Var2 = h76Var.f;
            int b2 = de5.b(j76Var2.a, j76Var2.b(), 5);
            canvas.drawColor(b);
            long j = this.d;
            j76 j76Var3 = h76Var.f;
            int i = (j > j76Var3.b ? 1 : (j == j76Var3.b ? 0 : -1));
            lm lmVar = this.e;
            if (i != 0) {
                lmVar.e(true, j76Var3.a());
            }
            float e = lmVar.e(false, h76Var.f.a());
            this.d = h76Var.f.b;
            Paint paint = this.c;
            paint.setColor(b2);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        vva vvaVar = this.a;
        if (vvaVar == null) {
            vvaVar = new vva(1, 250);
            this.a = vvaVar;
        }
        vvaVar.f(0, 0, getWidth(), getHeight());
        vva vvaVar2 = this.a;
        vvaVar2.h = 30.0f;
        vvaVar2.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
