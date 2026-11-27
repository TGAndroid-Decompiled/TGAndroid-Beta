package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class fb5 extends TextView {
    public final Paint[] a;
    public final h85 b;

    public fb5(h85 h85Var, Context context) {
        super(context);
        this.b = h85Var;
        this.a = new Paint[h85Var.o1.length];
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
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        h85 h85Var = this.b;
        int i2 = h85Var.q1;
        Paint[] paintArr = this.a;
        paintArr[i2].setAlpha(255);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paintArr[h85Var.q1]);
        float f = h85Var.p1;
        if (f > 0.0f && (i = h85Var.q1 + 1) < paintArr.length) {
            paintArr[i].setAlpha((int) (f * 255.0f));
            canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paintArr[h85Var.q1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb5.onSizeChanged(int, int, int, int):void");
    }
}
