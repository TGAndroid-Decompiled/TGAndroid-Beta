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
public final class mkb extends FrameLayout implements tjb {
    public final av9 a;
    public final byte b;
    public final TextPaint c;
    public int d;
    public final ThemeActivity e;

    public mkb(ThemeActivity themeActivity, Context context) {
        super(context);
        this.e = themeActivity;
        this.b = (byte) 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(gl.L(16.0f));
        av9 av9Var = new av9(context);
        this.a = av9Var;
        av9Var.setReportChanges(true);
        av9Var.setSeparatorsCount(18);
        av9Var.setDelegate(new v39(this, (byte) 15));
        av9Var.setImportantForAccessibility(2);
        addView(av9Var, nme.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Lj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w0 = bkb.w0(null, bkb.H6, false);
        TextPaint textPaint = this.c;
        textPaint.setColor(w0);
        canvas.drawText(String.valueOf(gba.U0), getMeasuredWidth() - gl.L(39.0f), gl.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        this.a.setProgress(gba.U0 / this.b);
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
        av9 av9Var = this.a;
        if (av9Var == null) {
            return;
        }
        try {
            int w0 = bkb.w0(null, bkb.Lj, false);
            if (w0 != this.d) {
                this.d = w0;
                av9Var.setOuterColor(w0);
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
