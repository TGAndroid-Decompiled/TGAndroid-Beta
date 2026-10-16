package ng;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.u6;
public final class h extends FrameLayout {
    public gp0 f16079a;
    public float f16080b;
    public float f16081c;
    public float d;
    public u6 e;
    public String f16082f;
    public TextPaint h;
    public int f16083n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f16079a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(g6.x0(null, g6.G6, false));
        canvas.drawText(this.f16082f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), textPaint);
        textPaint.setColor(g6.x0(null, g6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - textPaint.measureText(format), this.f16079a.getY() + AndroidUtilities.dp(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f16079a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f16083n != size) {
            gp0 gp0Var = this.f16079a;
            float floatValue = ((Float) this.e.get(null)).floatValue();
            float f7 = this.f16080b;
            gp0Var.setProgress((floatValue - f7) / (this.f16081c - f7));
            this.f16083n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f16079a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
