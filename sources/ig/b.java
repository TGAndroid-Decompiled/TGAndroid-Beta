package ig;

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

public final class b extends ReplacementSpan {

    public final TextPaint f11231a;

    public final RectF f11232b;

    public StaticLayout f11233c;
    public float d;

    public float f11234e;

    public int f11235f;

    public b(c6 c6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f11231a = textPaint;
        this.f11232b = new RectF();
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(g6.v0(g6.C6, c6Var));
    }

    public final void a() {
        if (this.f11233c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.ReactionAddReactionsHint), this.f11231a, AndroidUtilities.displaySize.x, LocaleController.isRTL ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f11233c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f11234e = this.f11233c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        a();
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f11232b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f11235f, 31);
        canvas.translate(f10 + AndroidUtilities.dp(4.0f), (((i14 - i12) / 2.0f) + i12) - (this.f11234e / 2.0f));
        this.f11233c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(8.0f) + this.d);
    }
}
