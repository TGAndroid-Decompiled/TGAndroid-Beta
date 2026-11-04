package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.ui.Components.ch0;
public final class c7 extends View {
    public final String f10153a;
    public final String f10154b;
    public final ch0 f10155c;
    public final Paint d;
    public final TextPaint f10156e;
    public final TextPaint f10157f;
    public final RectF h;
    public float f10158n;
    public final Rect f10159r;

    public c7(Context context, int i3, String str, String str2) {
        super(context);
        this.f10159r = new Rect();
        this.f10153a = str;
        this.f10154b = str2;
        ch0 ch0Var = new ch0(i3, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), true, null);
        this.f10155c = ch0Var;
        ch0Var.K(1);
        ch0Var.R(this);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.f10156e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.f10157f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int L = org.telegram.messenger.g0.L(40.0f);
        int L2 = (int) ((org.telegram.messenger.g0.L(8.0f) * this.f10158n) + org.telegram.messenger.g0.L(36.0f));
        int i3 = L2 / 2;
        int i10 = L - i3;
        int measuredHeight = (getMeasuredHeight() / 2) - i3;
        ch0 ch0Var = this.f10155c;
        ch0Var.setBounds(i10, measuredHeight, i10 + L2, L2 + measuredHeight);
        ch0Var.draw(canvas);
        if (this.f10158n > 0.0f) {
            float N = (1.0f - this.f10158n) * org.telegram.messenger.g0.N(4.0f);
            float f10 = N * 2.0f;
            float measuredWidth = getMeasuredWidth() - f10;
            float measuredHeight2 = getMeasuredHeight() - f10;
            RectF rectF = this.h;
            rectF.set(N, N, measuredWidth, measuredHeight2);
            int i11 = (int) (this.f10158n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.0f), paint);
            canvas.save();
            float f11 = this.f10158n;
            canvas.scale((f11 * 0.05f) + 1.0f, (f11 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.f10153a, org.telegram.messenger.g0.N(80.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.N(4.0f), this.f10156e);
        canvas.drawText(this.f10154b, org.telegram.messenger.g0.N(80.0f), org.telegram.messenger.g0.N(18.0f) + (getMeasuredHeight() / 2.0f), this.f10157f);
        if (this.f10158n > 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int L = org.telegram.messenger.g0.L(40.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f);
        int i11 = L2 / 2;
        int i12 = L - i11;
        int measuredHeight = (getMeasuredHeight() / 2) - i11;
        this.f10155c.setBounds(i12, measuredHeight, i12 + L2, L2 + measuredHeight);
    }
}
