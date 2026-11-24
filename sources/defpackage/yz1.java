package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
public final class yz1 extends View {
    public final byte a;
    public final x02 b;

    public yz1(x02 x02Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = x02Var;
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
                x02 x02Var = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, x02Var.v2.getSelectedItemsCount())));
                TextPaint textPaint = x02Var.G2;
                int ceil = (int) Math.ceil(textPaint.measureText(format));
                int max = Math.max(gl.L(16.0f) + ceil, gl.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int v0 = bkb.v0(bkb.B5, x02Var.J0);
                textPaint.setColor(bm2.o(v0, (int) (((x02Var.S2 * 0.42d) + 0.58d) * Color.alpha(v0))));
                Paint paint = x02Var.I2;
                paint.setColor(bkb.v0(bkb.g5, x02Var.J0));
                RectF rectF = x02Var.H2;
                int i = max / 2;
                int i2 = measuredWidth - i;
                int i3 = i + measuredWidth;
                rectF.set(i2, 0.0f, i3, getMeasuredHeight());
                canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), paint);
                paint.setColor(bkb.v0(bkb.V9, x02Var.J0));
                rectF.set(gl.L(2.0f) + i2, gl.L(2.0f), i3 - gl.L(2.0f), getMeasuredHeight() - gl.L(2.0f));
                canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), paint);
                canvas.drawText(format, measuredWidth - (ceil / 2), gl.L(16.2f), textPaint);
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
                this.b.V1.setBounds(0, (i2 - gl.n) - gl.L(48.0f), i, i2);
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }
}
