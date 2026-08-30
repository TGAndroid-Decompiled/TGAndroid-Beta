package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b2 extends View {
    public final Paint f4391a;
    public float f4392b;

    public b2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f4391a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f4391a;
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -4.0f, this.f4392b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 0.0f, this.f4392b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 3.0f, this.f4392b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -7.0f, this.f4392b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 3.0f, this.f4392b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 7.0f, this.f4392b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -4.0f, this.f4392b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, 0.0f, this.f4392b)), paint);
    }

    public void setProgress(float f10) {
        this.f4392b = f10;
        invalidate();
    }
}
