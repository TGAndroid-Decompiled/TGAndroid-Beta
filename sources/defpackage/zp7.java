package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class zp7 extends FrameLayout {
    public TextView a;
    public RadioButton b;
    public og2 c;
    public boolean d;
    public yp7 e;

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        if (this.d) {
            float f2 = 60.0f;
            if (ob6.a0) {
                f = 0.0f;
            } else {
                f = 60.0f;
            }
            float L = hl.L(f);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!ob6.a0) {
                f2 = 0.0f;
            }
            canvas.drawLine(L, height, measuredWidth - hl.L(f2), getHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.b.f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
    }
}
