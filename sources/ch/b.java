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
    public final TextPaint f5006a;
    public final RectF f5007b;
    public StaticLayout f5008c;
    public float d;
    public float f5009e;
    public int f5010f;
    public final e6 h;

    public b(e6 e6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f5006a = textPaint;
        this.f5007b = new RectF();
        this.h = e6Var;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(j6.w0(j6.C6, e6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f5008c == null) {
            String M0 = hd.M0(2131746408, null);
            int i7 = org.telegram.messenger.g0.f23611q.x;
            if (hd.f24104a0) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(M0, this.f5006a, i7, alignment, 1.0f, 0.0f, false);
            this.f5008c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f5009e = this.f5008c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a();
        this.f5006a.setColor(j6.w0(j6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f5007b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f5010f, 31);
        canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), (((i13 - i11) / 2.0f) + i11) - (this.f5009e / 2.0f));
        this.f5008c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(8.0f) + this.d);
    }
}
