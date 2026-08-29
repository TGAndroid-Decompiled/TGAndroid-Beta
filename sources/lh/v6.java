package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xi0;
public final class v6 extends View {
    public final String f16315a;
    public final String f16316b;
    public final xi0 f16317c;
    public final Paint d;
    public final TextPaint f16318e;
    public final TextPaint f16319f;
    public final RectF h;
    public float f16320n;
    public final Rect f16321r;

    public v6(Context context, int i10, String str, String str2) {
        super(context);
        this.f16321r = new Rect();
        this.f16315a = str;
        this.f16316b = str2;
        xi0 xi0Var = new xi0(i10, j7.l1.k(i10, ""), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), true, null);
        this.f16317c = xi0Var;
        xi0Var.I(1);
        xi0Var.f34753r0 = this;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.f16318e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f16319f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int dp = AndroidUtilities.dp(40.0f);
        int dp2 = (int) ((AndroidUtilities.dp(8.0f) * this.f16320n) + AndroidUtilities.dp(36.0f));
        int i10 = dp2 / 2;
        int i11 = dp - i10;
        int measuredHeight = (getMeasuredHeight() / 2) - i10;
        xi0 xi0Var = this.f16317c;
        xi0Var.setBounds(i11, measuredHeight, i11 + dp2, dp2 + measuredHeight);
        xi0Var.draw(canvas);
        if (this.f16320n > 0.0f) {
            float dpf2 = (1.0f - this.f16320n) * AndroidUtilities.dpf2(4.0f);
            float f9 = dpf2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f9;
            float measuredHeight2 = getMeasuredHeight() - f9;
            RectF rectF = this.h;
            rectF.set(dpf2, dpf2, measuredWidth, measuredHeight2);
            int i12 = (int) (this.f16320n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i12);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
            canvas.save();
            float f10 = this.f16320n;
            canvas.scale((f10 * 0.05f) + 1.0f, (f10 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.f16315a, AndroidUtilities.dpf2(80.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dpf2(4.0f), this.f16318e);
        canvas.drawText(this.f16316b, AndroidUtilities.dpf2(80.0f), AndroidUtilities.dpf2(18.0f) + (getMeasuredHeight() / 2.0f), this.f16319f);
        if (this.f16320n > 0.0f) {
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
        this.f16317c.setBounds(i13, measuredHeight, i13 + dp2, dp2 + measuredHeight);
    }
}
