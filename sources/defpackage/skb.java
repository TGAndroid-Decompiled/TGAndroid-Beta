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
public final class skb extends FrameLayout implements tjb {
    public final tmb a;
    public final av9 b;
    public final ahb c;
    public final byte d;
    public final byte e;
    public final TextPaint f;
    public int h;
    public int n;
    public final ThemeActivity r;

    public skb(ThemeActivity themeActivity, Context context) {
        super(context);
        ui5 ui5Var;
        this.r = themeActivity;
        this.d = (byte) 12;
        this.e = (byte) 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        textPaint.setTextSize(gl.L(16.0f));
        av9 av9Var = new av9(context);
        this.b = av9Var;
        av9Var.setReportChanges(true);
        av9Var.setSeparatorsCount(19);
        av9Var.setDelegate(new g29(this, (byte) 17));
        av9Var.setImportantForAccessibility(2);
        addView(av9Var, nme.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z = w01.a;
        ahb ahbVar = new ahb(context);
        this.c = ahbVar;
        ahbVar.setBackground(bkb.L0(false));
        ahbVar.f(k96.M0(2131751820, null), gba.D0, false);
        ahbVar.setOnClickListener(new bna(this, (byte) 17));
        ui5Var = ((d) themeActivity).parentLayout;
        tmb tmbVar = new tmb(context, ui5Var, 0);
        this.a = tmbVar;
        tmbVar.setImportantForAccessibility(4);
        addView(tmbVar, nme.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Lj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
        this.b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w0 = bkb.w0(null, bkb.H6, false);
        TextPaint textPaint = this.f;
        textPaint.setColor(w0);
        canvas.drawText(String.valueOf(gba.T0), getMeasuredWidth() - gl.L(39.0f), gl.L(28.0f), textPaint);
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
            int i3 = gba.T0;
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
        av9 av9Var = this.b;
        if (av9Var == null) {
            return;
        }
        try {
            int w0 = bkb.w0(null, bkb.Lj, false);
            if (w0 != this.n) {
                this.n = w0;
                av9Var.setOuterColor(w0);
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
