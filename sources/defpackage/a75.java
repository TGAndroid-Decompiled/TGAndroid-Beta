package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class a75 extends TextView {
    public final RectF a;
    public final j95 b;

    public a75(j95 j95Var, Context context) {
        super(context);
        this.b = j95Var;
        this.a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), this.b.Z2);
        super.onDraw(canvas);
    }
}
