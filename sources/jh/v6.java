package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oi0;

public final class v6 extends View {

    public final String f14050a;

    public final String f14051b;

    public final oi0 f14052c;
    public final Paint d;

    public final TextPaint f14053e;

    public final TextPaint f14054f;
    public final RectF h;

    public float f14055n;

    public final Rect f14056r;

    public v6(Context context, int i10, String str, String str2) {
        super(context);
        this.f14056r = new Rect();
        this.f14050a = str;
        this.f14051b = str2;
        oi0 oi0Var = new oi0(i10, i0.a.k(i10, ""), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), true, null);
        this.f14052c = oi0Var;
        oi0Var.I(1);
        oi0Var.f31328r0 = this;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.f14053e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f14054f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iDp = AndroidUtilities.dp(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        int iDp2 = (int) ((AndroidUtilities.dp(8.0f) * this.f14055n) + AndroidUtilities.dp(36.0f));
        int i10 = iDp2 / 2;
        int i11 = iDp - i10;
        int i12 = measuredHeight - i10;
        oi0 oi0Var = this.f14052c;
        oi0Var.setBounds(i11, i12, i11 + iDp2, iDp2 + i12);
        oi0Var.draw(canvas);
        if (this.f14055n > 0.0f) {
            float fDpf2 = (1.0f - this.f14055n) * AndroidUtilities.dpf2(4.0f);
            float f10 = fDpf2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f10;
            float measuredHeight2 = getMeasuredHeight() - f10;
            RectF rectF = this.h;
            rectF.set(fDpf2, fDpf2, measuredWidth, measuredHeight2);
            int i13 = (int) (this.f14055n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i13);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
            canvas.save();
            float f11 = this.f14055n;
            canvas.scale((f11 * 0.05f) + 1.0f, (f11 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.f14050a, AndroidUtilities.dpf2(80.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dpf2(4.0f), this.f14053e);
        canvas.drawText(this.f14051b, AndroidUtilities.dpf2(80.0f), AndroidUtilities.dpf2(18.0f) + (getMeasuredHeight() / 2.0f), this.f14054f);
        if (this.f14055n > 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iDp = AndroidUtilities.dp(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        int iDp2 = AndroidUtilities.dp(36.0f);
        int i12 = iDp2 / 2;
        int i13 = iDp - i12;
        int i14 = measuredHeight - i12;
        this.f14052c.setBounds(i13, i14, i13 + iDp2, iDp2 + i14);
    }
}
