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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class b extends ReplacementSpan {
    public final TextPaint f5003a;
    public final RectF f5004b;
    public StaticLayout f5005c;
    public float d;
    public float f5006e;
    public int f5007f;
    public final e6 h;

    public b(e6 e6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f5003a = textPaint;
        this.f5004b = new RectF();
        this.h = e6Var;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(j6.w0(j6.C6, e6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f5005c == null) {
            String M0 = hd.M0(2131746408, null);
            int i7 = org.telegram.messenger.g0.f23609q.x;
            if (hd.f24101a0) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(M0, this.f5003a, i7, alignment, 1.0f, 0.0f, false);
            this.f5005c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f5006e = this.f5005c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a();
        this.f5003a.setColor(j6.w0(j6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f5004b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f5007f, 31);
        canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), (((i13 - i11) / 2.0f) + i11) - (this.f5006e / 2.0f));
        this.f5005c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(8.0f) + this.d);
    }
}
