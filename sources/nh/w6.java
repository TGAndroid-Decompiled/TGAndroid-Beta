package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gj0;
public final class w6 extends View {
    public final String f16032a;
    public final String f16033b;
    public final gj0 f16034c;
    public final Paint d;
    public final TextPaint e;
    public final TextPaint f16035f;
    public final RectF h;
    public float f16036n;
    public final Rect f16037r;

    public w6(Context context, int i10, String str, String str2) {
        super(context);
        this.f16037r = new Rect();
        this.f16032a = str;
        this.f16033b = str2;
        gj0 gj0Var = new gj0(i10, kh.a2.j(i10, ""), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), true, null);
        this.f16034c = gj0Var;
        gj0Var.I(1);
        gj0Var.f25170s0 = this;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f16035f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int dp = AndroidUtilities.dp(40.0f);
        int dp2 = (int) ((AndroidUtilities.dp(8.0f) * this.f16036n) + AndroidUtilities.dp(36.0f));
        int i10 = dp2 / 2;
        int i11 = dp - i10;
        int measuredHeight = (getMeasuredHeight() / 2) - i10;
        gj0 gj0Var = this.f16034c;
        gj0Var.setBounds(i11, measuredHeight, i11 + dp2, dp2 + measuredHeight);
        gj0Var.draw(canvas);
        if (this.f16036n > 0.0f) {
            float dpf2 = (1.0f - this.f16036n) * AndroidUtilities.dpf2(4.0f);
            float f10 = dpf2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f10;
            float measuredHeight2 = getMeasuredHeight() - f10;
            RectF rectF = this.h;
            rectF.set(dpf2, dpf2, measuredWidth, measuredHeight2);
            int i12 = (int) (this.f16036n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i12);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
            canvas.save();
            float f11 = this.f16036n;
            canvas.scale((f11 * 0.05f) + 1.0f, (f11 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.f16032a, AndroidUtilities.dpf2(80.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dpf2(4.0f), this.e);
        canvas.drawText(this.f16033b, AndroidUtilities.dpf2(80.0f), AndroidUtilities.dpf2(18.0f) + (getMeasuredHeight() / 2.0f), this.f16035f);
        if (this.f16036n > 0.0f) {
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
        this.f16034c.setBounds(i13, measuredHeight, i13 + dp2, dp2 + measuredHeight);
    }
}
