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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class c extends ReplacementSpan {
    public final TextPaint f658a;
    public final RectF f659b;
    public StaticLayout f660c;
    public float d;
    public float e;
    public int f661f;

    public c(c6 c6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f658a = textPaint;
        this.f659b = new RectF();
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(g6.w0(g6.C6, c6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f660c == null) {
            String string = LocaleController.getString(R.string.ReactionAddReactionsHint);
            int i10 = AndroidUtilities.displaySize.x;
            if (LocaleController.isRTL) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(string, this.f658a, i10, alignment, 1.0f, 0.0f, false);
            this.f660c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.f660c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        a();
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f659b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f661f, 31);
        canvas.translate(f7 + AndroidUtilities.dp(4.0f), (((i14 - i12) / 2.0f) + i12) - (this.e / 2.0f));
        this.f660c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(8.0f) + this.d);
    }
}
