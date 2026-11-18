package ch;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class b extends ReplacementSpan {
    public final TextPaint f5292a;
    public final RectF f5293b;
    public StaticLayout f5294c;
    public float d;
    public float f5295e;
    public int f5296f;
    public final i6 h;

    public b(i6 i6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f5292a = textPaint;
        this.f5293b = new RectF();
        this.h = i6Var;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(n6.w0(n6.C6, i6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f5294c == null) {
            String M0 = gd.M0(2131746213, null);
            int i7 = org.telegram.messenger.g0.f24121q.x;
            if (gd.f24216a0) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(M0, this.f5292a, i7, alignment, 1.0f, 0.0f, false);
            this.f5294c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f5295e = this.f5294c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a();
        this.f5292a.setColor(n6.w0(n6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f5293b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f5296f, 31);
        canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), (((i13 - i11) / 2.0f) + i11) - (this.f5295e / 2.0f));
        this.f5294c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(8.0f) + this.d);
    }
}
