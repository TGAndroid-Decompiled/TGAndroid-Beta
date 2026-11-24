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
public final class vb0 extends FrameLayout {
    public final lka a;
    public final bf0 b;
    public final Switch c;
    public final jh2 d;
    public final View e;
    public TLRPC.TL_availableReaction f;
    public final boolean h;
    public boolean n;

    public vb0(Context context, boolean z, boolean z2) {
        super(context);
        this.h = z2;
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        nm7.i(lkaVar);
        anb.W(lkaVar, cmb.F6, null);
        lkaVar.setTextSize(16);
        lkaVar.setTypeface(gm.o());
        lkaVar.setMaxLines(1);
        lkaVar.setMaxLines(1);
        lkaVar.setGravity(qoe.y() | 16);
        addView(lkaVar, qoe.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setAspectFit(true);
        bf0Var.setLayerNum(1);
        addView(bf0Var, qoe.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            jh2 jh2Var = new jh2(26, null, context);
            this.d = jh2Var;
            jh2Var.setDrawUnchecked(false);
            jh2Var.b(-1, -1, cmb.g7);
            jh2Var.setDrawBackgroundAsArc(-1);
            addView(jh2Var, qoe.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.c = r14;
            r14.d(cmb.L6, cmb.M6, cmb.P6, cmb.Q6);
            addView(r14, qoe.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.e = view;
        view.setBackground(cmb.L0(false));
        addView(view, qoe.c(-1.0f, -1));
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
        lka lkaVar = this.a;
        lkaVar.l(b10.e(lkaVar, str, false, null, 0), false);
        this.b.n(gn5.b(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", eq3.f(tL_availableReaction.static_icon, cmb.Z6, 1.0f, null), tL_availableReaction);
        if (!this.h || !tL_availableReaction.premium || z8c.h(i).p()) {
            z3 = false;
        }
        this.n = z3;
        if (z3) {
            Drawable drawable = getContext().getDrawable(2131232491);
            anb.x(this, drawable, cmb.Ki, null, PorterDuff.Mode.MULTIPLY);
            lkaVar.i(drawable);
        } else {
            lkaVar.i(null);
        }
        Switch r1 = this.c;
        if (r1 != null) {
            r1.c(z, z2);
        }
        jh2 jh2Var = this.d;
        if (jh2Var != null) {
            jh2Var.a(z, z2);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float strokeWidth = cmb.j0.getStrokeWidth();
        int L = gm.L(81.0f);
        int i = 0;
        if (jb6.a0) {
            i = L;
            L = 0;
        }
        canvas.drawLine(getPaddingLeft() + L, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i, getHeight() - strokeWidth, cmb.j0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z = false;
        jh2 jh2Var = this.d;
        Switch r3 = this.c;
        if (r3 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r3 != null) {
                z = r3.h;
            } else if (jh2Var != null) {
                z = jh2Var.a.q;
            }
            accessibilityNodeInfo.setChecked(z);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r3 != null) {
                z = r3.h;
            } else if (jh2Var != null) {
                z = jh2Var.a.q;
            }
            if (z) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.a.getText());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (cmb.j0.getStrokeWidth() + gm.L(58.0f)), 1073741824));
    }

    public void setChecked(boolean z) {
        Switch r1 = this.c;
        if (r1 != null) {
            r1.c(z, false);
        }
        jh2 jh2Var = this.d;
        if (jh2Var != null) {
            jh2Var.a(z, false);
        }
    }
}
