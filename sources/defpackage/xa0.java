package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class xa0 extends FrameLayout {
    public final ema a;
    public final de0 b;
    public final Switch c;
    public final og2 d;
    public final View e;
    public TLRPC.TL_availableReaction f;
    public final boolean h;
    public boolean n;

    public xa0(Context context, boolean z, boolean z2) {
        super(context);
        this.h = z2;
        ema emaVar = new ema(context);
        this.a = emaVar;
        jn7.i(emaVar);
        yob.W(emaVar, aob.G6, null);
        emaVar.setTextSize(16);
        emaVar.setTypeface(hl.o());
        emaVar.setMaxLines(1);
        emaVar.setMaxLines(1);
        emaVar.setGravity(tre.y() | 16);
        addView(emaVar, tre.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setAspectFit(true);
        de0Var.setLayerNum(1);
        addView(de0Var, tre.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            og2 og2Var = new og2(26, null, context);
            this.d = og2Var;
            og2Var.setDrawUnchecked(false);
            og2Var.b(-1, -1, aob.h7);
            og2Var.setDrawBackgroundAsArc(-1);
            addView(og2Var, tre.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.c = r14;
            r14.d(aob.M6, aob.N6, aob.Q6, aob.R6);
            addView(r14, tre.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.e = view;
        view.setBackground(aob.L0(false));
        addView(view, tre.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z, int i) {
        boolean z2;
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f;
        boolean z3 = true;
        if (tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = tL_availableReaction;
        String str = tL_availableReaction.title;
        ema emaVar = this.a;
        emaVar.l(c00.f(emaVar, str, false, null, 0), false);
        this.b.n(jn5.b(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", lp3.f(tL_availableReaction.static_icon, aob.a7, 1.0f, null), tL_availableReaction);
        if (!this.h || !tL_availableReaction.premium || yac.h(i).p()) {
            z3 = false;
        }
        this.n = z3;
        if (z3) {
            Drawable drawable = getContext().getDrawable(2131232490);
            yob.x(this, drawable, aob.Li, null, PorterDuff.Mode.MULTIPLY);
            emaVar.i(drawable);
        } else {
            emaVar.i(null);
        }
        Switch r1 = this.c;
        if (r1 != null) {
            r1.c(z, z2);
        }
        og2 og2Var = this.d;
        if (og2Var != null) {
            og2Var.a(z, z2);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float strokeWidth = aob.j0.getStrokeWidth();
        int L = hl.L(81.0f);
        int i = 0;
        if (ob6.a0) {
            i = L;
            L = 0;
        }
        canvas.drawLine(getPaddingLeft() + L, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i, getHeight() - strokeWidth, aob.j0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z = false;
        og2 og2Var = this.d;
        Switch r3 = this.c;
        if (r3 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r3 != null) {
                z = r3.h;
            } else if (og2Var != null) {
                z = og2Var.a.q;
            }
            accessibilityNodeInfo.setChecked(z);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r3 != null) {
                z = r3.h;
            } else if (og2Var != null) {
                z = og2Var.a.q;
            }
            if (z) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.a.getText());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (aob.j0.getStrokeWidth() + hl.L(58.0f)), 1073741824));
    }

    public void setChecked(boolean z) {
        Switch r1 = this.c;
        if (r1 != null) {
            r1.c(z, false);
        }
        og2 og2Var = this.d;
        if (og2Var != null) {
            og2Var.a(z, false);
        }
    }
}
