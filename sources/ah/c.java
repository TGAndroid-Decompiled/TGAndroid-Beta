package ah;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class c extends ReplacementSpan {
    public final TextPaint f662a;
    public final RectF f663b;
    public StaticLayout f664c;
    public float d;
    public float e;
    public int f665f;
    public final g6 h;

    public c(g6 g6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f662a = textPaint;
        this.f663b = new RectF();
        this.h = g6Var;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(k6.w0(k6.C6, g6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f664c == null) {
            String string = LocaleController.getString(R.string.ReactionAddReactionsHint);
            int i10 = AndroidUtilities.displaySize.x;
            if (LocaleController.isRTL) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(string, this.f662a, i10, alignment, 1.0f, 0.0f, false);
            this.f664c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.f664c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        a();
        this.f662a.setColor(k6.w0(k6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f663b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f665f, 31);
        canvas.translate(f7 + AndroidUtilities.dp(4.0f), (((i14 - i12) / 2.0f) + i12) - (this.e / 2.0f));
        this.f664c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(8.0f) + this.d);
    }
}
