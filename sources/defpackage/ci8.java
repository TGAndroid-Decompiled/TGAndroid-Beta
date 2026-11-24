package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class ci8 extends ri8 {
    public final di8 O;

    public ci8(di8 di8Var, Context context) {
        super(context);
        this.O = di8Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ei8 ei8Var = this.O.d;
        TextView textView = this.r;
        if (textView.getVisibility() == 0) {
            RectF rectF = gl.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            ei8Var.n.o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ei8Var.n.P);
            canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), ei8Var.n.o0.f);
        }
        super.dispatchDraw(canvas);
    }
}
