package ch;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
public final class b extends ReplacementSpan {
    public final TextPaint f6176a;
    public final RectF f6177b;
    public StaticLayout f6178c;
    public float d;
    public float f6179e;
    public int f6180f;
    public final g6 h;

    public b(g6 g6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f6176a = textPaint;
        this.f6177b = new RectF();
        this.h = g6Var;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(l6.w0(l6.C6, g6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f6178c == null) {
            String M0 = id.M0(2131746408, null);
            int i7 = org.telegram.messenger.g0.f22563q.x;
            if (id.f23157a0) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(M0, this.f6176a, i7, alignment, 1.0f, 0.0f, false);
            this.f6178c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f6179e = this.f6178c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a();
        this.f6176a.setColor(l6.w0(l6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f6177b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f6180f, 31);
        canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), (((i13 - i11) / 2.0f) + i11) - (this.f6179e / 2.0f));
        this.f6178c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(8.0f) + this.d);
    }
}
