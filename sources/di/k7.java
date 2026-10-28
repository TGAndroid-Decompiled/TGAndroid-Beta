package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yj0;
public final class k7 extends View {
    public final String f8720a;
    public final String f8721b;
    public final yj0 f8722c;
    public final Paint d;
    public final TextPaint e;
    public final TextPaint f8723f;
    public final RectF h;
    public float f8724n;
    public final Rect f8725r;

    public k7(Context context, int i10, String str, String str2) {
        super(context);
        this.f8725r = new Rect();
        this.f8720a = str;
        this.f8721b = str2;
        yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), true, null);
        this.f8722c = yj0Var;
        yj0Var.K(1);
        yj0Var.R(this);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f8723f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int dp = AndroidUtilities.dp(40.0f);
        int dp2 = (int) ((AndroidUtilities.dp(8.0f) * this.f8724n) + AndroidUtilities.dp(36.0f));
        int i10 = dp2 / 2;
        int i11 = dp - i10;
        int measuredHeight = (getMeasuredHeight() / 2) - i10;
        yj0 yj0Var = this.f8722c;
        yj0Var.setBounds(i11, measuredHeight, i11 + dp2, dp2 + measuredHeight);
        yj0Var.draw(canvas);
        if (this.f8724n > 0.0f) {
            float dpf2 = (1.0f - this.f8724n) * AndroidUtilities.dpf2(4.0f);
            float f7 = dpf2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f7;
            float measuredHeight2 = getMeasuredHeight() - f7;
            RectF rectF = this.h;
            rectF.set(dpf2, dpf2, measuredWidth, measuredHeight2);
            int i12 = (int) (this.f8724n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i12);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
            canvas.save();
            float f10 = this.f8724n;
            canvas.scale((f10 * 0.05f) + 1.0f, (f10 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.f8720a, AndroidUtilities.dpf2(80.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dpf2(4.0f), this.e);
        canvas.drawText(this.f8721b, AndroidUtilities.dpf2(80.0f), AndroidUtilities.dpf2(18.0f) + (getMeasuredHeight() / 2.0f), this.f8723f);
        if (this.f8724n > 0.0f) {
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
        this.f8722c.setBounds(i13, measuredHeight, i13 + dp2, dp2 + measuredHeight);
    }
}
