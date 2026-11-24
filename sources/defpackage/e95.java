package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class e95 extends TextView {
    public final Paint[] a;
    public final f65 b;

    public e95(f65 f65Var, Context context) {
        super(context);
        this.b = f65Var;
        this.a = new Paint[f65Var.o1.length];
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
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        f65 f65Var = this.b;
        int i2 = f65Var.q1;
        Paint[] paintArr = this.a;
        paintArr[i2].setAlpha(255);
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paintArr[f65Var.q1]);
        float f = f65Var.p1;
        if (f > 0.0f && (i = f65Var.q1 + 1) < paintArr.length) {
            paintArr[i].setAlpha((int) (f * 255.0f));
            canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paintArr[f65Var.q1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e95.onSizeChanged(int, int, int, int):void");
    }
}
