package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
public final class mob extends View {
    public static final int c = 0;
    public final Paint a;
    public int[] b;

    public mob(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new int[7];
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        float L = hl.L(5.0f);
        float L2 = hl.L(20.0f) - L;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.a;
        paint.setStyle(style);
        int i = 0;
        paint.setColor(this.b[0]);
        canvas.drawCircle(measuredWidth, measuredHeight, L, paint);
        double d = 0.0d;
        while (i < 6) {
            i++;
            paint.setColor(this.b[i]);
            canvas.drawCircle((((float) Math.sin(d)) * L2) + measuredWidth, measuredHeight - (((float) Math.cos(d)) * L2), L, paint);
            d += 1.0471975511965976d;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(ob6.M0(2131751980, "ColorPickerMainColor"));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(62.0f), 1073741824));
    }
}
