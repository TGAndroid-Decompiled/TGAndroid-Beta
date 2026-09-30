package mg;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.vo0;
public final class h extends FrameLayout {
    public vo0 f15060a;
    public float f15061b;
    public float f15062c;
    public float d;
    public r6 e;
    public String f15063f;
    public TextPaint h;
    public int f15064n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f15060a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(h6.w0(null, h6.G6, false));
        canvas.drawText(this.f15063f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), textPaint);
        textPaint.setColor(h6.w0(null, h6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - textPaint.measureText(format), this.f15060a.getY() + AndroidUtilities.dp(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f15060a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f15064n != size) {
            vo0 vo0Var = this.f15060a;
            float floatValue = ((Float) this.e.get(null)).floatValue();
            float f7 = this.f15061b;
            vo0Var.setProgress((floatValue - f7) / (this.f15062c - f7));
            this.f15064n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f15060a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
