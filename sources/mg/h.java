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
import org.telegram.ui.Components.yo0;
public final class h extends FrameLayout {
    public yo0 f16418a;
    public float f16419b;
    public float f16420c;
    public float d;
    public r6 f16421e;
    public String f16422f;
    public TextPaint h;
    public int f16423n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f16418a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(i6.w0(null, i6.G6, false));
        canvas.drawText(this.f16422f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), textPaint);
        textPaint.setColor(i6.w0(null, i6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - textPaint.measureText(format), this.f16418a.getY() + AndroidUtilities.dp(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f16418a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f16423n != size) {
            yo0 yo0Var = this.f16418a;
            float floatValue = ((Float) this.f16421e.get(null)).floatValue();
            float f7 = this.f16419b;
            yo0Var.setProgress((floatValue - f7) / (this.f16420c - f7));
            this.f16423n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f16418a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
