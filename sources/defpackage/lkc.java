package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class lkc extends View {
    public final Paint a;
    public final ic0 b;
    public pkb c;

    public lkc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-14538189);
        ic0 ic0Var = new ic0(this, false);
        this.b = ic0Var;
        ic0Var.p = hl.L(100.0f);
        ic0Var.o = hl.L(30.0f);
        ic0Var.x = false;
        ic0Var.s = hl.L(24.0f);
        ic0Var.h(hl.L(18.0f));
        ic0Var.t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        ic0 ic0Var = this.b;
        float c = ic0Var.c() + hl.L(4.0f) + hl.L(7.0f) + this.c.c + hl.L(13.0f);
        RectF rectF = hl.P;
        rectF.set((getWidth() - c) / 2.0f, 0.0f, (getWidth() + c) / 2.0f, getHeight());
        float L = hl.L(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, L, L, this.a);
        canvas.save();
        canvas.translate(rectF.left + hl.L(4.0f), 0.0f);
        ic0Var.g(canvas);
        canvas.translate(ic0Var.A + hl.L(7.0f), 0.0f);
        this.c.c(0.0f, L, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(30.0f));
    }
}
