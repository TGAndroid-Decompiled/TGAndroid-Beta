package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hj0;
public final class w6 extends View {
    public final String f17901a;
    public final String f17902b;
    public final hj0 f17903c;
    public final Paint d;
    public final TextPaint f17904e;
    public final TextPaint f17905f;
    public final RectF h;
    public float f17906n;
    public final Rect f17907r;

    public w6(Context context, int i10, String str, String str2) {
        super(context);
        this.f17907r = new Rect();
        this.f17901a = str;
        this.f17902b = str2;
        hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), true, null);
        this.f17903c = hj0Var;
        hj0Var.I(1);
        hj0Var.f27542s0 = this;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.f17904e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f17905f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int dp = AndroidUtilities.dp(40.0f);
        int dp2 = (int) ((AndroidUtilities.dp(8.0f) * this.f17906n) + AndroidUtilities.dp(36.0f));
        int i10 = dp2 / 2;
        int i11 = dp - i10;
        int measuredHeight = (getMeasuredHeight() / 2) - i10;
        hj0 hj0Var = this.f17903c;
        hj0Var.setBounds(i11, measuredHeight, i11 + dp2, dp2 + measuredHeight);
        hj0Var.draw(canvas);
        if (this.f17906n > 0.0f) {
            float dpf2 = (1.0f - this.f17906n) * AndroidUtilities.dpf2(4.0f);
            float f10 = dpf2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f10;
            float measuredHeight2 = getMeasuredHeight() - f10;
            RectF rectF = this.h;
            rectF.set(dpf2, dpf2, measuredWidth, measuredHeight2);
            int i12 = (int) (this.f17906n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i12);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
            canvas.save();
            float f11 = this.f17906n;
            canvas.scale((f11 * 0.05f) + 1.0f, (f11 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.f17901a, AndroidUtilities.dpf2(80.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dpf2(4.0f), this.f17904e);
        canvas.drawText(this.f17902b, AndroidUtilities.dpf2(80.0f), AndroidUtilities.dpf2(18.0f) + (getMeasuredHeight() / 2.0f), this.f17905f);
        if (this.f17906n > 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int dp = AndroidUtilities.dp(40.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        int i12 = dp2 / 2;
        int i13 = dp - i12;
        int measuredHeight = (getMeasuredHeight() / 2) - i12;
        this.f17903c.setBounds(i13, measuredHeight, i13 + dp2, dp2 + measuredHeight);
    }
}
