package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class ek8 extends tk8 {
    public final fk8 O;

    public ek8(fk8 fk8Var, Context context) {
        super(context);
        this.O = fk8Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        gk8 gk8Var = this.O.d;
        TextView textView = this.r;
        if (textView.getVisibility() == 0) {
            RectF rectF = gm.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            gk8Var.n.o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, gk8Var.n.P);
            canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), gk8Var.n.o0.f);
        }
        super.dispatchDraw(canvas);
    }
}
