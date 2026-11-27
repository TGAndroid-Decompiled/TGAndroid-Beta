package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
public final class o02 extends View {
    public final byte a;
    public final n12 b;

    public o02(n12 n12Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = n12Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.V1.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                n12 n12Var = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, n12Var.v2.getSelectedItemsCount())));
                TextPaint textPaint = n12Var.G2;
                int ceil = (int) Math.ceil(textPaint.measureText(format));
                int max = Math.max(hl.L(16.0f) + ceil, hl.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int v0 = aob.v0(aob.C5, n12Var.J0);
                textPaint.setColor(vm2.o(v0, (int) (((n12Var.S2 * 0.42d) + 0.58d) * Color.alpha(v0))));
                Paint paint = n12Var.I2;
                paint.setColor(aob.v0(aob.h5, n12Var.J0));
                RectF rectF = n12Var.H2;
                int i = max / 2;
                int i2 = measuredWidth - i;
                int i3 = i + measuredWidth;
                rectF.set(i2, 0.0f, i3, getMeasuredHeight());
                canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), paint);
                paint.setColor(aob.v0(aob.W9, n12Var.J0));
                rectF.set(hl.L(2.0f) + i2, hl.L(2.0f), i3 - hl.L(2.0f), getMeasuredHeight() - hl.L(2.0f));
                canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), paint);
                canvas.drawText(format, measuredWidth - (ceil / 2), hl.L(16.2f), textPaint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i, i2, i3, i4);
                this.b.V1.setBounds(0, (i2 - hl.n) - hl.L(48.0f), i, i2);
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }
}
