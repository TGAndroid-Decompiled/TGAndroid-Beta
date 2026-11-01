package mg;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
public final class d1 extends View implements k6 {
    public TextPaint f13093a;
    public int f13094b;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        TextPaint textPaint = this.f13093a;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, textPaint);
        ea.f.d().f(-org.telegram.messenger.i0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(1.5f), ea.f.d().e());
        float descent = textPaint.descent();
        canvas.drawText("+" + this.f13094b, measuredWidth, (int) (measuredHeight - ((textPaint.ascent() + descent) / 2.0f)), textPaint);
    }

    @Override
    public final void updateColors() {
        try {
            this.f13093a.setColor(t6.x0(null, t6.f20873a7, false));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
