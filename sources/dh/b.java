package dh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
public final class b extends ReplacementSpan {
    public final TextPaint f8954a;
    public final RectF f8955b;
    public StaticLayout f8956c;
    public float d;
    public float f8957e;
    public int f8958f;
    public final e6 h;

    public b(e6 e6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f8954a = textPaint;
        this.f8955b = new RectF();
        this.h = e6Var;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(k6.w0(k6.C6, e6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f8956c == null) {
            String M0 = bd.M0(2131746416, null);
            int i3 = org.telegram.messenger.g0.f22608q.x;
            if (bd.f21784a0) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(M0, this.f8954a, i3, alignment, 1.0f, 0.0f, false);
            this.f8956c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f8957e = this.f8956c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a();
        this.f8954a.setColor(k6.w0(k6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f8955b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f8958f, 31);
        canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), (((i13 - i11) / 2.0f) + i11) - (this.f8957e / 2.0f));
        this.f8956c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(8.0f) + this.d);
    }
}
