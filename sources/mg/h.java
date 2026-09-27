package mg;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.to0;
public final class h extends FrameLayout {
    public to0 f15071a;
    public float f15072b;
    public float f15073c;
    public float d;
    public r6 e;
    public String f15074f;
    public TextPaint h;
    public int f15075n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f15071a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(i6.w0(null, i6.G6, false));
        canvas.drawText(this.f15074f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), textPaint);
        textPaint.setColor(i6.w0(null, i6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - textPaint.measureText(format), this.f15071a.getY() + AndroidUtilities.dp(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f15071a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f15075n != size) {
            to0 to0Var = this.f15071a;
            float floatValue = ((Float) this.e.get(null)).floatValue();
            float f7 = this.f15072b;
            to0Var.setProgress((floatValue - f7) / (this.f15073c - f7));
            this.f15075n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f15071a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
