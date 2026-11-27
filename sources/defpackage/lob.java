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
public final class lob extends FrameLayout implements snb {
    public final uy9 a;
    public final byte b;
    public final TextPaint c;
    public int d;
    public final ThemeActivity e;

    public lob(ThemeActivity themeActivity, Context context) {
        super(context);
        this.e = themeActivity;
        this.b = (byte) 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(hl.L(16.0f));
        uy9 uy9Var = new uy9(context);
        this.a = uy9Var;
        uy9Var.setReportChanges(true);
        uy9Var.setSeparatorsCount(18);
        uy9Var.setDelegate(new l09(this, (byte) 15));
        uy9Var.setImportantForAccessibility(2);
        addView(uy9Var, tre.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Mj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w0 = aob.w0(null, aob.I6, false);
        TextPaint textPaint = this.c;
        textPaint.setColor(w0);
        canvas.drawText(String.valueOf(xea.U0), getMeasuredWidth() - hl.L(39.0f), hl.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        this.a.setProgress(xea.U0 / this.b);
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
        uy9 uy9Var = this.a;
        if (uy9Var == null) {
            return;
        }
        try {
            int w0 = aob.w0(null, aob.Mj, false);
            if (w0 != this.d) {
                this.d = w0;
                uy9Var.setOuterColor(w0);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
