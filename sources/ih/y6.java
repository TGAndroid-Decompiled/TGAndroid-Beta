package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mi0;
public final class y6 extends View {
    public final String f12347a;
    public final String f12348b;
    public final mi0 f12349c;
    public final Paint d;
    public final TextPaint f12350e;
    public final TextPaint f12351f;
    public final RectF h;
    public float f12352n;
    public final Rect f12353r;

    public y6(Context context, int i9, String str, String str2) {
        super(context);
        this.f12353r = new Rect();
        this.f12347a = str;
        this.f12348b = str2;
        mi0 mi0Var = new mi0(i9, j3.r0.l(i9, ""), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), true, null);
        this.f12349c = mi0Var;
        mi0Var.I(1);
        mi0Var.f30863r0 = this;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.f12350e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f12351f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int dp = AndroidUtilities.dp(40.0f);
        int dp2 = (int) ((AndroidUtilities.dp(8.0f) * this.f12352n) + AndroidUtilities.dp(36.0f));
        int i9 = dp2 / 2;
        int i10 = dp - i9;
        int measuredHeight = (getMeasuredHeight() / 2) - i9;
        mi0 mi0Var = this.f12349c;
        mi0Var.setBounds(i10, measuredHeight, i10 + dp2, dp2 + measuredHeight);
        mi0Var.draw(canvas);
        if (this.f12352n > 0.0f) {
            float dpf2 = (1.0f - this.f12352n) * AndroidUtilities.dpf2(4.0f);
            float f10 = dpf2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f10;
            float measuredHeight2 = getMeasuredHeight() - f10;
            RectF rectF = this.h;
            rectF.set(dpf2, dpf2, measuredWidth, measuredHeight2);
            int i11 = (int) (this.f12352n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i11);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
            canvas.save();
            float f11 = this.f12352n;
            canvas.scale((f11 * 0.05f) + 1.0f, (f11 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.f12347a, AndroidUtilities.dpf2(80.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dpf2(4.0f), this.f12350e);
        canvas.drawText(this.f12348b, AndroidUtilities.dpf2(80.0f), AndroidUtilities.dpf2(18.0f) + (getMeasuredHeight() / 2.0f), this.f12351f);
        if (this.f12352n > 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int dp = AndroidUtilities.dp(40.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        int i11 = dp2 / 2;
        int i12 = dp - i11;
        int measuredHeight = (getMeasuredHeight() / 2) - i11;
        this.f12349c.setBounds(i12, measuredHeight, i12 + dp2, dp2 + measuredHeight);
    }
}
