package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class ggc extends View {
    public final Paint a;
    public final gc0 b;
    public tgb c;

    public ggc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-14538189);
        gc0 gc0Var = new gc0(this, false);
        this.b = gc0Var;
        gc0Var.p = gl.L(100.0f);
        gc0Var.o = gl.L(30.0f);
        gc0Var.x = false;
        gc0Var.s = gl.L(24.0f);
        gc0Var.h(gl.L(18.0f));
        gc0Var.t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        gc0 gc0Var = this.b;
        float c = gc0Var.c() + gl.L(4.0f) + gl.L(7.0f) + this.c.c + gl.L(13.0f);
        RectF rectF = gl.P;
        rectF.set((getWidth() - c) / 2.0f, 0.0f, (getWidth() + c) / 2.0f, getHeight());
        float L = gl.L(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, L, L, this.a);
        canvas.save();
        canvas.translate(rectF.left + gl.L(4.0f), 0.0f);
        gc0Var.g(canvas);
        canvas.translate(gc0Var.A + gl.L(7.0f), 0.0f);
        this.c.c(0.0f, L, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(30.0f));
    }
}
