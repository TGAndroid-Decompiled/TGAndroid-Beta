package fg;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.nn0;
public final class k extends FrameLayout {
    public nn0 f7080a;
    public float f7081b;
    public float f7082c;
    public float d;
    public h6 e;
    public String f7083f;
    public TextPaint h;
    public int f7084n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f7080a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(t6.x0(null, t6.G6, false));
        canvas.drawText(this.f7083f, i0.L(24.0f), i0.L(24.0f), textPaint);
        textPaint.setColor(t6.x0(null, t6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - i0.L(8.0f)) - textPaint.measureText(format), this.f7080a.getY() + i0.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f7080a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f7084n != size) {
            nn0 nn0Var = this.f7080a;
            float floatValue = ((Float) this.e.get(null)).floatValue();
            float f7 = this.f7081b;
            nn0Var.setProgress((floatValue - f7) / (this.f7082c - f7));
            this.f7084n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f7080a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
