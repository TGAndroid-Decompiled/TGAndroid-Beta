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
public final class va0 extends FrameLayout {
    public final jia a;
    public final be0 b;
    public final Switch c;
    public final wf2 d;
    public final View e;
    public TLRPC.TL_availableReaction f;
    public final boolean h;
    public boolean n;

    public va0(Context context, boolean z, boolean z2) {
        super(context);
        this.h = z2;
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        kk7.i(jiaVar);
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setTextSize(16);
        jiaVar.setTypeface(gl.o());
        jiaVar.setMaxLines(1);
        jiaVar.setMaxLines(1);
        jiaVar.setGravity(nme.y() | 16);
        addView(jiaVar, nme.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setAspectFit(true);
        be0Var.setLayerNum(1);
        addView(be0Var, nme.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            wf2 wf2Var = new wf2(26, null, context);
            this.d = wf2Var;
            wf2Var.setDrawUnchecked(false);
            wf2Var.b(-1, -1, bkb.g7);
            wf2Var.setDrawBackgroundAsArc(-1);
            addView(wf2Var, nme.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.c = r14;
            r14.d(bkb.L6, bkb.M6, bkb.P6, bkb.Q6);
            addView(r14, nme.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.e = view;
        view.setBackground(bkb.L0(false));
        addView(view, nme.c(-1.0f, -1));
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
        jia jiaVar = this.a;
        jiaVar.l(b00.e(jiaVar, str, false, null, 0), false);
        this.b.n(gl5.b(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", uo3.f(tL_availableReaction.static_icon, bkb.Z6, 1.0f, null), tL_availableReaction);
        if (!this.h || !tL_availableReaction.premium || y6c.h(i).p()) {
            z3 = false;
        }
        this.n = z3;
        if (z3) {
            Drawable drawable = getContext().getDrawable(2131232479);
            zkb.x(this, drawable, bkb.Ki, null, PorterDuff.Mode.MULTIPLY);
            jiaVar.i(drawable);
        } else {
            jiaVar.i(null);
        }
        Switch r1 = this.c;
        if (r1 != null) {
            r1.c(z, z2);
        }
        wf2 wf2Var = this.d;
        if (wf2Var != null) {
            wf2Var.a(z, z2);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float strokeWidth = bkb.j0.getStrokeWidth();
        int L = gl.L(81.0f);
        int i = 0;
        if (k96.a0) {
            i = L;
            L = 0;
        }
        canvas.drawLine(getPaddingLeft() + L, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i, getHeight() - strokeWidth, bkb.j0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z = false;
        wf2 wf2Var = this.d;
        Switch r3 = this.c;
        if (r3 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r3 != null) {
                z = r3.h;
            } else if (wf2Var != null) {
                z = wf2Var.a.q;
            }
            accessibilityNodeInfo.setChecked(z);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r3 != null) {
                z = r3.h;
            } else if (wf2Var != null) {
                z = wf2Var.a.q;
            }
            if (z) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.a.getText());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (bkb.j0.getStrokeWidth() + gl.L(58.0f)), 1073741824));
    }

    public void setChecked(boolean z) {
        Switch r1 = this.c;
        if (r1 != null) {
            r1.c(z, false);
        }
        wf2 wf2Var = this.d;
        if (wf2Var != null) {
            wf2Var.a(z, false);
        }
    }
}
