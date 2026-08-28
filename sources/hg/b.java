package hg;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class b extends ReplacementSpan {
    public final TextPaint f10532a;
    public final RectF f10533b;
    public StaticLayout f10534c;
    public float d;
    public float f10535e;
    public int f10536f;

    public b(b6 b6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f10532a = textPaint;
        this.f10533b = new RectF();
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(f6.v0(f6.C6, b6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f10534c == null) {
            String string = LocaleController.getString(R.string.ReactionAddReactionsHint);
            int i9 = AndroidUtilities.displaySize.x;
            if (LocaleController.isRTL) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(string, this.f10532a, i9, alignment, 1.0f, 0.0f, false);
            this.f10534c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f10535e = this.f10534c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a();
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f10533b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f10536f, 31);
        canvas.translate(f10 + AndroidUtilities.dp(4.0f), (((i13 - i11) / 2.0f) + i11) - (this.f10535e / 2.0f));
        this.f10534c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(8.0f) + this.d);
    }
}
