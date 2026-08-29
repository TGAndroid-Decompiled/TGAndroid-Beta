package eg;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l1 extends View {
    public TextPaint f6077a;
    public int f6078b;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        TextPaint textPaint = this.f6077a;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, textPaint);
        cg.s1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(1.5f), cg.s1.d().e());
        float descent = textPaint.descent();
        canvas.drawText("+" + this.f6078b, measuredWidth, (int) (measuredHeight - ((textPaint.ascent() + descent) / 2.0f)), textPaint);
    }
}
