package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public final class pa extends ReplacementSpan {
    public final TextPaint a;
    public final RectF b;
    public StaticLayout c;
    public float d;
    public float e;
    public int f;
    public final wjb h;

    public pa(wjb wjbVar) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = new RectF();
        this.h = wjbVar;
        textPaint.setTextSize(gl.L(15.0f));
        textPaint.setColor(bkb.v0(bkb.B6, wjbVar));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.c == null) {
            String M0 = k96.M0(2131746215, null);
            int i = gl.q.x;
            if (k96.a0) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(M0, this.a, i, alignment, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        a();
        this.a.setColor(bkb.v0(bkb.B6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f, 31);
        canvas.translate(f + gl.L(4.0f), (((i5 - i3) / 2.0f) + i3) - (this.e / 2.0f));
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (gl.L(8.0f) + this.d);
    }
}
