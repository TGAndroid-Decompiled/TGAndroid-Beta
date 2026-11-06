package ch;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class b extends ReplacementSpan {
    public final TextPaint f6178a;
    public final RectF f6179b;
    public StaticLayout f6180c;
    public float d;
    public float f6181e;
    public int f6182f;
    public final f6 h;

    public b(f6 f6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f6178a = textPaint;
        this.f6179b = new RectF();
        this.h = f6Var;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(k6.w0(k6.C6, f6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f6180c == null) {
            String M0 = hd.M0(2131746407, null);
            int i7 = org.telegram.messenger.g0.f22544q.x;
            if (hd.f22878a0) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(M0, this.f6178a, i7, alignment, 1.0f, 0.0f, false);
            this.f6180c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f6181e = this.f6180c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a();
        this.f6178a.setColor(k6.w0(k6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f6179b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f6182f, 31);
        canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), (((i13 - i11) / 2.0f) + i11) - (this.f6181e / 2.0f));
        this.f6180c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(8.0f) + this.d);
    }
}
