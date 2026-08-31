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
import org.telegram.ui.Components.ij0;
public final class w6 extends View {
    public final String f17899a;
    public final String f17900b;
    public final ij0 f17901c;
    public final Paint d;
    public final TextPaint f17902e;
    public final TextPaint f17903f;
    public final RectF h;
    public float f17904n;
    public final Rect f17905r;

    public w6(Context context, int i10, String str, String str2) {
        super(context);
        this.f17905r = new Rect();
        this.f17899a = str;
        this.f17900b = str2;
        ij0 ij0Var = new ij0(i10, l.d.j(i10, ""), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), true, null);
        this.f17901c = ij0Var;
        ij0Var.I(1);
        ij0Var.f27835s0 = this;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.f17902e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f17903f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int dp = AndroidUtilities.dp(40.0f);
        int dp2 = (int) ((AndroidUtilities.dp(8.0f) * this.f17904n) + AndroidUtilities.dp(36.0f));
        int i10 = dp2 / 2;
        int i11 = dp - i10;
        int measuredHeight = (getMeasuredHeight() / 2) - i10;
        ij0 ij0Var = this.f17901c;
        ij0Var.setBounds(i11, measuredHeight, i11 + dp2, dp2 + measuredHeight);
        ij0Var.draw(canvas);
        if (this.f17904n > 0.0f) {
            float dpf2 = (1.0f - this.f17904n) * AndroidUtilities.dpf2(4.0f);
            float f10 = dpf2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f10;
            float measuredHeight2 = getMeasuredHeight() - f10;
            RectF rectF = this.h;
            rectF.set(dpf2, dpf2, measuredWidth, measuredHeight2);
            int i12 = (int) (this.f17904n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i12);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
            canvas.save();
            float f11 = this.f17904n;
            canvas.scale((f11 * 0.05f) + 1.0f, (f11 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.f17899a, AndroidUtilities.dpf2(80.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dpf2(4.0f), this.f17902e);
        canvas.drawText(this.f17900b, AndroidUtilities.dpf2(80.0f), AndroidUtilities.dpf2(18.0f) + (getMeasuredHeight() / 2.0f), this.f17903f);
        if (this.f17904n > 0.0f) {
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
        this.f17901c.setBounds(i13, measuredHeight, i13 + dp2, dp2 + measuredHeight);
    }
}
