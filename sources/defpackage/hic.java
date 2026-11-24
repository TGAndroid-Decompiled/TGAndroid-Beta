package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class hic extends View {
    public final Paint a;
    public final gd0 b;
    public uib c;

    public hic(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-14538189);
        gd0 gd0Var = new gd0(this, false);
        this.b = gd0Var;
        gd0Var.p = gm.L(100.0f);
        gd0Var.o = gm.L(30.0f);
        gd0Var.x = false;
        gd0Var.s = gm.L(24.0f);
        gd0Var.h(gm.L(18.0f));
        gd0Var.t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        gd0 gd0Var = this.b;
        float c = gd0Var.c() + gm.L(4.0f) + gm.L(7.0f) + this.c.c + gm.L(13.0f);
        RectF rectF = gm.P;
        rectF.set((getWidth() - c) / 2.0f, 0.0f, (getWidth() + c) / 2.0f, getHeight());
        float L = gm.L(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, L, L, this.a);
        canvas.save();
        canvas.translate(rectF.left + gm.L(4.0f), 0.0f);
        gd0Var.g(canvas);
        canvas.translate(gd0Var.A + gm.L(7.0f), 0.0f);
        this.c.c(0.0f, L, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(30.0f));
    }
}
