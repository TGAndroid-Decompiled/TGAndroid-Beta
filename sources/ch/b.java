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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class b extends ReplacementSpan {
    public final TextPaint f5321a;
    public final RectF f5322b;
    public StaticLayout f5323c;
    public float d;
    public float f5324e;
    public int f5325f;
    public final h6 h;

    public b(h6 h6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f5321a = textPaint;
        this.f5322b = new RectF();
        this.h = h6Var;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(m6.w0(m6.C6, h6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f5323c == null) {
            String N0 = hd.N0(2131746212, null);
            int i7 = org.telegram.messenger.g0.f24046q.x;
            if (hd.f24444a0) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(N0, this.f5321a, i7, alignment, 1.0f, 0.0f, false);
            this.f5323c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f5324e = this.f5323c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a();
        this.f5321a.setColor(m6.w0(m6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f5322b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f5325f, 31);
        canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), (((i13 - i11) / 2.0f) + i11) - (this.f5324e / 2.0f));
        this.f5323c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(8.0f) + this.d);
    }
}
