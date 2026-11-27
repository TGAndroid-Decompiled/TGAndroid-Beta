package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
public final class i96 extends LinearLayout {
    public yza a;
    public final Path b;
    public final Paint c;
    public long d;
    public final mm e;
    public final l96 f;

    public i96(l96 l96Var, Context context) {
        super(context);
        this.f = l96Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new mm(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.b;
        path.rewind();
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, hl.L(13.0f), hl.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        l96 l96Var = this.f;
        n96 n96Var = l96Var.f;
        if (n96Var != null) {
            int b = eg5.b(n96Var.a, n96Var.b(), 3);
            n96 n96Var2 = l96Var.f;
            int b2 = eg5.b(n96Var2.a, n96Var2.b(), 5);
            canvas.drawColor(b);
            long j = this.d;
            n96 n96Var3 = l96Var.f;
            int i = (j > n96Var3.b ? 1 : (j == n96Var3.b ? 0 : -1));
            mm mmVar = this.e;
            if (i != 0) {
                mmVar.e(true, n96Var3.a());
            }
            float e = mmVar.e(false, l96Var.f.a());
            this.d = l96Var.f.b;
            Paint paint = this.c;
            paint.setColor(b2);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        yza yzaVar = this.a;
        if (yzaVar == null) {
            yzaVar = new yza(1, 250);
            this.a = yzaVar;
        }
        yzaVar.f(0, 0, getWidth(), getHeight());
        yza yzaVar2 = this.a;
        yzaVar2.h = 30.0f;
        yzaVar2.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
