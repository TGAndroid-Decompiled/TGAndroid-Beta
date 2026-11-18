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
    public final TextPaint f5289a;
    public final RectF f5290b;
    public StaticLayout f5291c;
    public float d;
    public float f5292e;
    public int f5293f;
    public final i6 h;

    public b(i6 i6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f5289a = textPaint;
        this.f5290b = new RectF();
        this.h = i6Var;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(n6.w0(n6.C6, i6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f5291c == null) {
            String M0 = gd.M0(2131746213, null);
            int i7 = org.telegram.messenger.g0.f24118q.x;
            if (gd.f24213a0) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(M0, this.f5289a, i7, alignment, 1.0f, 0.0f, false);
            this.f5291c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f5292e = this.f5291c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a();
        this.f5289a.setColor(n6.w0(n6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f5290b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f5293f, 31);
        canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), (((i13 - i11) / 2.0f) + i11) - (this.f5292e / 2.0f));
        this.f5291c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(8.0f) + this.d);
    }
}
