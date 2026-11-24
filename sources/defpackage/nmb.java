package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.ThemeActivity;
public final class nmb extends FrameLayout implements vlb {
    public final dx9 a;
    public final byte b;
    public final TextPaint c;
    public int d;
    public final ThemeActivity e;

    public nmb(ThemeActivity themeActivity, Context context) {
        super(context);
        this.e = themeActivity;
        this.b = (byte) 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(gm.L(16.0f));
        dx9 dx9Var = new dx9(context);
        this.a = dx9Var;
        dx9Var.setReportChanges(true);
        dx9Var.setSeparatorsCount(18);
        dx9Var.setDelegate(new oo8(this, (byte) 18));
        dx9Var.setImportantForAccessibility(2);
        addView(dx9Var, qoe.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Lj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w0 = cmb.w0(null, cmb.H6, false);
        TextPaint textPaint = this.c;
        textPaint.setColor(w0);
        canvas.drawText(String.valueOf(gda.U0), getMeasuredWidth() - gm.L(39.0f), gm.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        this.a.setProgress(gda.U0 / this.b);
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!super.performAccessibilityAction(i, bundle) && !this.a.getSeekBarAccessibilityDelegate().g(this, i, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        dx9 dx9Var = this.a;
        if (dx9Var == null) {
            return;
        }
        try {
            int w0 = cmb.w0(null, cmb.Lj, false);
            if (w0 != this.d) {
                this.d = w0;
                dx9Var.setOuterColor(w0);
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
