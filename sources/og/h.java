package og;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.u6;
public final class h extends FrameLayout {
    public lp0 f19403a;
    public float f19404b;
    public float f19405c;
    public float d;
    public u6 e;
    public String f19406f;
    public TextPaint h;
    public int f19407n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f19403a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(y6.x0(null, y6.G6, false));
        canvas.drawText(this.f19406f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), textPaint);
        textPaint.setColor(y6.x0(null, y6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - textPaint.measureText(format), this.f19403a.getY() + AndroidUtilities.dp(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f19403a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f19407n != size) {
            lp0 lp0Var = this.f19403a;
            float floatValue = ((Float) this.e.get(null)).floatValue();
            float f7 = this.f19404b;
            lp0Var.setProgress((floatValue - f7) / (this.f19405c - f7));
            this.f19407n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f19403a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
