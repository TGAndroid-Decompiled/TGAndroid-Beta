package bh;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class c extends ReplacementSpan {
    public final TextPaint f3995a;
    public final RectF f3996b;
    public StaticLayout f3997c;
    public float d;
    public float e;
    public int f3998f;
    public final u6 h;

    public c(u6 u6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f3995a = textPaint;
        this.f3996b = new RectF();
        this.h = u6Var;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(y6.w0(y6.C6, u6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f3997c == null) {
            String string = LocaleController.getString(R.string.ReactionAddReactionsHint);
            int i10 = AndroidUtilities.displaySize.x;
            if (LocaleController.isRTL) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(string, this.f3995a, i10, alignment, 1.0f, 0.0f, false);
            this.f3997c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.f3997c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        a();
        this.f3995a.setColor(y6.w0(y6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f3996b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f3998f, 31);
        canvas.translate(f7 + AndroidUtilities.dp(4.0f), (((i14 - i12) / 2.0f) + i12) - (this.e / 2.0f));
        this.f3997c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(8.0f) + this.d);
    }
}
