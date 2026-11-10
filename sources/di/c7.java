package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.ui.Components.zg0;
public final class c7 extends View {
    public final String f8880a;
    public final String f8881b;
    public final zg0 f8882c;
    public final Paint d;
    public final TextPaint f8883e;
    public final TextPaint f8884f;
    public final RectF h;
    public float f8885n;
    public final Rect f8886r;

    public c7(Context context, int i7, String str, String str2) {
        super(context);
        this.f8886r = new Rect();
        this.f8880a = str;
        this.f8881b = str2;
        zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), true, null);
        this.f8882c = zg0Var;
        zg0Var.K(1);
        zg0Var.R(this);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.f8883e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.f8884f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int L = org.telegram.messenger.g0.L(40.0f);
        int L2 = (int) ((org.telegram.messenger.g0.L(8.0f) * this.f8885n) + org.telegram.messenger.g0.L(36.0f));
        int i7 = L2 / 2;
        int i10 = L - i7;
        int measuredHeight = (getMeasuredHeight() / 2) - i7;
        zg0 zg0Var = this.f8882c;
        zg0Var.setBounds(i10, measuredHeight, i10 + L2, L2 + measuredHeight);
        zg0Var.draw(canvas);
        if (this.f8885n > 0.0f) {
            float N = (1.0f - this.f8885n) * org.telegram.messenger.g0.N(4.0f);
            float f10 = N * 2.0f;
            float measuredWidth = getMeasuredWidth() - f10;
            float measuredHeight2 = getMeasuredHeight() - f10;
            RectF rectF = this.h;
            rectF.set(N, N, measuredWidth, measuredHeight2);
            int i11 = (int) (this.f8885n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.0f), paint);
            canvas.save();
            float f11 = this.f8885n;
            canvas.scale((f11 * 0.05f) + 1.0f, (f11 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.f8880a, org.telegram.messenger.g0.N(80.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.N(4.0f), this.f8883e);
        canvas.drawText(this.f8881b, org.telegram.messenger.g0.N(80.0f), org.telegram.messenger.g0.N(18.0f) + (getMeasuredHeight() / 2.0f), this.f8884f);
        if (this.f8885n > 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int L = org.telegram.messenger.g0.L(40.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f);
        int i11 = L2 / 2;
        int i12 = L - i11;
        int measuredHeight = (getMeasuredHeight() / 2) - i11;
        this.f8882c.setBounds(i12, measuredHeight, i12 + L2, L2 + measuredHeight);
    }
}
