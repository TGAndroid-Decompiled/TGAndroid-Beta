package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ThemeActivity;
public final class rob extends FrameLayout implements snb {
    public final sqb a;
    public final uy9 b;
    public final wkb c;
    public final byte d;
    public final byte e;
    public final TextPaint f;
    public int h;
    public int n;
    public final ThemeActivity r;

    public rob(ThemeActivity themeActivity, Context context) {
        super(context);
        wk5 wk5Var;
        this.r = themeActivity;
        this.d = (byte) 12;
        this.e = (byte) 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        textPaint.setTextSize(hl.L(16.0f));
        uy9 uy9Var = new uy9(context);
        this.b = uy9Var;
        uy9Var.setReportChanges(true);
        uy9Var.setSeparatorsCount(19);
        uy9Var.setDelegate(new pq8(this, (byte) 21));
        uy9Var.setImportantForAccessibility(2);
        addView(uy9Var, tre.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z = f11.a;
        wkb wkbVar = new wkb(context);
        this.c = wkbVar;
        wkbVar.setBackground(aob.L0(false));
        wkbVar.f(ob6.M0(2131751797, null), xea.D0, false);
        wkbVar.setOnClickListener(new kla(this, (byte) 18));
        wk5Var = ((e) themeActivity).parentLayout;
        sqb sqbVar = new sqb(context, wk5Var, 0);
        this.a = sqbVar;
        sqbVar.setImportantForAccessibility(4);
        addView(sqbVar, tre.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Mj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
        this.b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w0 = aob.w0(null, aob.I6, false);
        TextPaint textPaint = this.f;
        textPaint.setColor(w0);
        canvas.drawText(String.valueOf(xea.S0), getMeasuredWidth() - hl.L(39.0f), hl.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.h != size) {
            int i3 = xea.S0;
            byte b = this.d;
            this.b.setProgress((i3 - b) / (this.e - b));
            this.h = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!super.performAccessibilityAction(i, bundle) && !this.b.getSeekBarAccessibilityDelegate().g(this, i, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        uy9 uy9Var = this.b;
        if (uy9Var == null) {
            return;
        }
        try {
            int w0 = aob.w0(null, aob.Mj, false);
            if (w0 != this.n) {
                this.n = w0;
                uy9Var.setOuterColor(w0);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
