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
import org.telegram.ui.Components.on0;
public final class k extends FrameLayout {
    public on0 f7081a;
    public float f7082b;
    public float f7083c;
    public float d;
    public h6 e;
    public String f7084f;
    public TextPaint h;
    public int f7085n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f7081a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(t6.x0(null, t6.G6, false));
        canvas.drawText(this.f7084f, i0.L(24.0f), i0.L(24.0f), textPaint);
        textPaint.setColor(t6.x0(null, t6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - i0.L(8.0f)) - textPaint.measureText(format), this.f7081a.getY() + i0.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f7081a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f7085n != size) {
            on0 on0Var = this.f7081a;
            float floatValue = ((Float) this.e.get(null)).floatValue();
            float f7 = this.f7082b;
            on0Var.setProgress((floatValue - f7) / (this.f7083c - f7));
            this.f7085n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f7081a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}
