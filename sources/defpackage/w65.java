package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class w65 extends TextView {
    public final RectF a;
    public final g95 b;

    public w65(g95 g95Var, Context context) {
        super(context);
        this.b = g95Var;
        this.a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), this.b.Z2);
        super.onDraw(canvas);
    }
}
