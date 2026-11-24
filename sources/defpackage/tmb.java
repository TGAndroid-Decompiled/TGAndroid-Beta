package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ThemeActivity;
public final class tmb extends FrameLayout implements vlb {
    public final uob a;
    public final dx9 b;
    public final bjb c;
    public final byte d;
    public final byte e;
    public final TextPaint f;
    public int h;
    public int n;
    public final ThemeActivity r;

    public tmb(ThemeActivity themeActivity, Context context) {
        super(context);
        tk5 tk5Var;
        this.r = themeActivity;
        this.d = (byte) 12;
        this.e = (byte) 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        textPaint.setTextSize(gm.L(16.0f));
        dx9 dx9Var = new dx9(context);
        this.b = dx9Var;
        dx9Var.setReportChanges(true);
        dx9Var.setSeparatorsCount(19);
        dx9Var.setDelegate(new et8(this, (byte) 18));
        dx9Var.setImportantForAccessibility(2);
        addView(dx9Var, qoe.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z = e21.a;
        bjb bjbVar = new bjb(context);
        this.c = bjbVar;
        bjbVar.setBackground(cmb.L0(false));
        bjbVar.f(jb6.M0(2131751769, null), gda.D0, false);
        bjbVar.setOnClickListener(new oha(this, (byte) 20));
        tk5Var = ((d) themeActivity).parentLayout;
        uob uobVar = new uob(context, tk5Var, 0);
        this.a = uobVar;
        uobVar.setImportantForAccessibility(4);
        addView(uobVar, qoe.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Lj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
        this.b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w0 = cmb.w0(null, cmb.H6, false);
        TextPaint textPaint = this.f;
        textPaint.setColor(w0);
        canvas.drawText(String.valueOf(gda.S0), getMeasuredWidth() - gm.L(39.0f), gm.L(28.0f), textPaint);
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
            int i3 = gda.S0;
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
        dx9 dx9Var = this.b;
        if (dx9Var == null) {
            return;
        }
        try {
            int w0 = cmb.w0(null, cmb.Lj, false);
            if (w0 != this.n) {
                this.n = w0;
                dx9Var.setOuterColor(w0);
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
