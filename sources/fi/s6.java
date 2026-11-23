package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.ui.Components.oh0;
public final class s6 extends View {
    public final String f12518a;
    public final String f12519b;
    public final oh0 f12520c;
    public final Paint d;
    public final TextPaint f12521e;
    public final TextPaint f12522f;
    public final RectF h;
    public float f12523n;
    public final Rect f12524r;

    public s6(Context context, int i7, String str, String str2) {
        super(context);
        this.f12524r = new Rect();
        this.f12518a = str;
        this.f12519b = str2;
        oh0 oh0Var = new oh0(i7, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), true, null);
        this.f12520c = oh0Var;
        oh0Var.K(1);
        oh0Var.R(this);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.f12521e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.f12522f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int L = org.telegram.messenger.g0.L(40.0f);
        int L2 = (int) ((org.telegram.messenger.g0.L(8.0f) * this.f12523n) + org.telegram.messenger.g0.L(36.0f));
        int i7 = L2 / 2;
        int i10 = L - i7;
        int measuredHeight = (getMeasuredHeight() / 2) - i7;
        oh0 oh0Var = this.f12520c;
        oh0Var.setBounds(i10, measuredHeight, i10 + L2, L2 + measuredHeight);
        oh0Var.draw(canvas);
        if (this.f12523n > 0.0f) {
            float N = (1.0f - this.f12523n) * org.telegram.messenger.g0.N(4.0f);
            float f10 = N * 2.0f;
            float measuredWidth = getMeasuredWidth() - f10;
            float measuredHeight2 = getMeasuredHeight() - f10;
            RectF rectF = this.h;
            rectF.set(N, N, measuredWidth, measuredHeight2);
            int i11 = (int) (this.f12523n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.0f), paint);
            canvas.save();
            float f11 = this.f12523n;
            canvas.scale((f11 * 0.05f) + 1.0f, (f11 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.f12518a, org.telegram.messenger.g0.N(80.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.N(4.0f), this.f12521e);
        canvas.drawText(this.f12519b, org.telegram.messenger.g0.N(80.0f), org.telegram.messenger.g0.N(18.0f) + (getMeasuredHeight() / 2.0f), this.f12522f);
        if (this.f12523n > 0.0f) {
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
        this.f12520c.setBounds(i12, measuredHeight, i12 + L2, L2 + measuredHeight);
    }
}
