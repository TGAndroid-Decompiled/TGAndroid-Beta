package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class y45 extends TextView {
    public final RectF a;
    public final h75 b;

    public y45(h75 h75Var, Context context) {
        super(context);
        this.b = h75Var;
        this.a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), this.b.Z2);
        super.onDraw(canvas);
    }
}
