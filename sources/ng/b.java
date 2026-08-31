package ng;

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
public final class b extends ReplacementSpan {
    public final TextPaint f15996a;
    public final RectF f15997b;
    public StaticLayout f15998c;
    public float d;
    public float f15999e;
    public int f16000f;

    public b(g6 g6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f15996a = textPaint;
        this.f15997b = new RectF();
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(k6.v0(k6.C6, g6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f15998c == null) {
            String string = LocaleController.getString(R.string.ReactionAddReactionsHint);
            int i10 = AndroidUtilities.displaySize.x;
            if (LocaleController.isRTL) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(string, this.f15996a, i10, alignment, 1.0f, 0.0f, false);
            this.f15998c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f15999e = this.f15998c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        a();
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f15997b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f16000f, 31);
        canvas.translate(f10 + AndroidUtilities.dp(4.0f), (((i14 - i12) / 2.0f) + i12) - (this.f15999e / 2.0f));
        this.f15998c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(8.0f) + this.d);
    }
}
