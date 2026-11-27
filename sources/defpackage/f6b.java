package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
public final class f6b extends View {
    public final String a;
    public final String b;
    public final b29 c;
    public final Paint d;
    public final TextPaint e;
    public final TextPaint f;
    public final RectF h;
    public float n;
    public final Rect r;

    public f6b(Context context, int i, String str, String str2) {
        super(context);
        this.r = new Rect();
        this.a = str;
        this.b = str2;
        b29 b29Var = new b29(i, hl.L(36.0f), hl.L(36.0f), true, null);
        this.c = b29Var;
        b29Var.F(1);
        b29Var.M(this);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(hl.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int L = hl.L(40.0f);
        int L2 = (int) ((hl.L(8.0f) * this.n) + hl.L(36.0f));
        int i = L2 / 2;
        int i2 = L - i;
        int measuredHeight = (getMeasuredHeight() / 2) - i;
        b29 b29Var = this.c;
        b29Var.setBounds(i2, measuredHeight, i2 + L2, L2 + measuredHeight);
        b29Var.draw(canvas);
        if (this.n > 0.0f) {
            float N = (1.0f - this.n) * hl.N(4.0f);
            float f = N * 2.0f;
            float measuredWidth = getMeasuredWidth() - f;
            float measuredHeight2 = getMeasuredHeight() - f;
            RectF rectF = this.h;
            rectF.set(N, N, measuredWidth, measuredHeight2);
            int i3 = (int) (this.n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i3);
            canvas.drawRoundRect(rectF, hl.N(12.0f), hl.N(12.0f), paint);
            canvas.save();
            float f2 = this.n;
            canvas.scale((f2 * 0.05f) + 1.0f, (f2 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.a, hl.N(80.0f), (getMeasuredHeight() / 2.0f) - hl.N(4.0f), this.e);
        canvas.drawText(this.b, hl.N(80.0f), hl.N(18.0f) + (getMeasuredHeight() / 2.0f), this.f);
        if (this.n > 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int L = hl.L(40.0f);
        int L2 = hl.L(36.0f);
        int i3 = L2 / 2;
        int i4 = L - i3;
        int measuredHeight = (getMeasuredHeight() / 2) - i3;
        this.c.setBounds(i4, measuredHeight, i4 + L2, L2 + measuredHeight);
    }
}
