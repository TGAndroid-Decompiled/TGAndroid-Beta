package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class cb5 extends TextView {
    public final Paint[] a;
    public final d85 b;

    public cb5(d85 d85Var, Context context) {
        super(context);
        this.b = d85Var;
        this.a = new Paint[d85Var.o1.length];
        int i = 0;
        while (true) {
            Paint[] paintArr = this.a;
            if (i < paintArr.length) {
                paintArr[i] = new Paint(1);
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        d85 d85Var = this.b;
        int i2 = d85Var.q1;
        Paint[] paintArr = this.a;
        paintArr[i2].setAlpha(255);
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paintArr[d85Var.q1]);
        float f = d85Var.p1;
        if (f > 0.0f && (i = d85Var.q1 + 1) < paintArr.length) {
            paintArr[i].setAlpha((int) (f * 255.0f));
            canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paintArr[d85Var.q1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb5.onSizeChanged(int, int, int, int):void");
    }
}
