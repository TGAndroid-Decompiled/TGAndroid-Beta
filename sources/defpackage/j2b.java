package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
public final class j2b extends View {
    public final String a;
    public final String b;
    public final oy8 c;
    public final Paint d;
    public final TextPaint e;
    public final TextPaint f;
    public final RectF h;
    public float n;
    public final Rect r;

    public j2b(Context context, int i, String str, String str2) {
        super(context);
        this.r = new Rect();
        this.a = str;
        this.b = str2;
        oy8 oy8Var = new oy8(i, gl.L(36.0f), gl.L(36.0f), true, null);
        this.c = oy8Var;
        oy8Var.F(1);
        oy8Var.M(this);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(gl.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int L = gl.L(40.0f);
        int L2 = (int) ((gl.L(8.0f) * this.n) + gl.L(36.0f));
        int i = L2 / 2;
        int i2 = L - i;
        int measuredHeight = (getMeasuredHeight() / 2) - i;
        oy8 oy8Var = this.c;
        oy8Var.setBounds(i2, measuredHeight, i2 + L2, L2 + measuredHeight);
        oy8Var.draw(canvas);
        if (this.n > 0.0f) {
            float N = (1.0f - this.n) * gl.N(4.0f);
            float f = N * 2.0f;
            float measuredWidth = getMeasuredWidth() - f;
            float measuredHeight2 = getMeasuredHeight() - f;
            RectF rectF = this.h;
            rectF.set(N, N, measuredWidth, measuredHeight2);
            int i3 = (int) (this.n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i3);
            canvas.drawRoundRect(rectF, gl.N(12.0f), gl.N(12.0f), paint);
            canvas.save();
            float f2 = this.n;
            canvas.scale((f2 * 0.05f) + 1.0f, (f2 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.a, gl.N(80.0f), (getMeasuredHeight() / 2.0f) - gl.N(4.0f), this.e);
        canvas.drawText(this.b, gl.N(80.0f), gl.N(18.0f) + (getMeasuredHeight() / 2.0f), this.f);
        if (this.n > 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int L = gl.L(40.0f);
        int L2 = gl.L(36.0f);
        int i3 = L2 / 2;
        int i4 = L - i3;
        int measuredHeight = (getMeasuredHeight() / 2) - i3;
        this.c.setBounds(i4, measuredHeight, i4 + L2, L2 + measuredHeight);
    }
}
