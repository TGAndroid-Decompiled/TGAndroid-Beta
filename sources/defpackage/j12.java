package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
public final class j12 extends View {
    public final byte a;
    public final i22 b;

    public j12(i22 i22Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = i22Var;
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
                i22 i22Var = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, i22Var.v2.getSelectedItemsCount())));
                TextPaint textPaint = i22Var.G2;
                int ceil = (int) Math.ceil(textPaint.measureText(format));
                int max = Math.max(gm.L(16.0f) + ceil, gm.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int v0 = cmb.v0(cmb.B5, i22Var.J0);
                textPaint.setColor(on2.p(v0, (int) (((i22Var.S2 * 0.42d) + 0.58d) * Color.alpha(v0))));
                Paint paint = i22Var.I2;
                paint.setColor(cmb.v0(cmb.g5, i22Var.J0));
                RectF rectF = i22Var.H2;
                int i = max / 2;
                int i2 = measuredWidth - i;
                int i3 = i + measuredWidth;
                rectF.set(i2, 0.0f, i3, getMeasuredHeight());
                canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), paint);
                paint.setColor(cmb.v0(cmb.V9, i22Var.J0));
                rectF.set(gm.L(2.0f) + i2, gm.L(2.0f), i3 - gm.L(2.0f), getMeasuredHeight() - gm.L(2.0f));
                canvas.drawRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), paint);
                canvas.drawText(format, measuredWidth - (ceil / 2), gm.L(16.2f), textPaint);
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
                this.b.V1.setBounds(0, (i2 - gm.n) - gm.L(48.0f), i, i2);
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }
}
