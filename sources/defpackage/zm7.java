package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class zm7 extends FrameLayout {
    public TextView a;
    public RadioButton b;
    public wf2 c;
    public boolean d;
    public ym7 e;

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        if (this.d) {
            float f2 = 60.0f;
            if (k96.a0) {
                f = 0.0f;
            } else {
                f = 60.0f;
            }
            float L = gl.L(f);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!k96.a0) {
                f2 = 0.0f;
            }
            canvas.drawLine(L, height, measuredWidth - gl.L(f2), getHeight() - 1, bkb.j0);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
    }
}
