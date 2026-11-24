package defpackage;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
public final class kl4 extends FrameLayout {
    public dx9 a;
    public float b;
    public float c;
    public float d;
    public ro e;
    public String f;
    public TextPaint h;
    public int n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(cmb.w0(null, cmb.F6, false));
        canvas.drawText(this.f, gm.L(24.0f), gm.L(24.0f), textPaint);
        textPaint.setColor(cmb.w0(null, cmb.H6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - gm.L(8.0f)) - textPaint.measureText(format), this.a.getY() + gm.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.n != size) {
            dx9 dx9Var = this.a;
            float floatValue = ((Float) this.e.get(null)).floatValue();
            float f = this.b;
            dx9Var.setProgress((floatValue - f) / (this.c - f));
            this.n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!super.performAccessibilityAction(i, bundle) && !this.a.getSeekBarAccessibilityDelegate().g(this, i, bundle)) {
            return false;
        }
        return true;
    }
}
