package cg;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class m1 extends View {

    public TextPaint f2773a;

    public int f2774b;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float measuredWidth2 = getMeasuredWidth() / 2.0f;
        TextPaint textPaint = this.f2773a;
        canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, textPaint);
        ag.j2.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(1.5f), ag.j2.d().e());
        canvas.drawText("+" + this.f2774b, measuredWidth, (int) (measuredHeight - ((textPaint.ascent() + textPaint.descent()) / 2.0f)), textPaint);
    }
}
