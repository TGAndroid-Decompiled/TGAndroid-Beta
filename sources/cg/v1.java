package cg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class v1 extends View {

    public Paint f2840a;

    public Drawable f2841b;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, this.f2840a);
        ag.j2.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), ag.j2.d().e());
        float fDp = AndroidUtilities.dp(18.0f) / 2.0f;
        Drawable drawable = this.f2841b;
        drawable.setBounds((int) (measuredWidth - fDp), (int) (measuredHeight - fDp), (int) (measuredWidth + fDp), (int) (measuredHeight + fDp));
        drawable.draw(canvas);
    }
}
