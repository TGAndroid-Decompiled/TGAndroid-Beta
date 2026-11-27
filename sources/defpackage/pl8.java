package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class pl8 extends em8 {
    public final ql8 O;

    public pl8(ql8 ql8Var, Context context) {
        super(context);
        this.O = ql8Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        rl8 rl8Var = this.O.d;
        TextView textView = this.r;
        if (textView.getVisibility() == 0) {
            RectF rectF = hl.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            rl8Var.n.o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, rl8Var.n.P);
            canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), rl8Var.n.o0.f);
        }
        super.dispatchDraw(canvas);
    }
}
