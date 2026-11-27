package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class m67 extends d79 {
    public final ArrayList f3;
    public final mm g3;
    public final mm h3;
    public final pm3 i3;
    public final q67 j3;

    public m67(q67 q67Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.j3 = q67Var;
        this.f3 = new ArrayList(10);
        k43 k43Var = k43.h;
        this.g3 = new mm(this, 0L, 360L, k43Var);
        this.h3 = new mm(this, 0L, 360L, k43Var);
        this.i3 = new pm3((byte) 7);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m67.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        wb2 wb2Var;
        q67 q67Var = this.j3;
        if (q67Var.w && ((view == (wb2Var = q67Var.Q) && wb2Var != null && wb2Var.getCurrentPosition() == null) || view == q67Var.X)) {
            return false;
        }
        if (!(view instanceof wb2)) {
            return true;
        }
        wb2 wb2Var2 = (wb2) view;
        wb2Var2.setInvalidatesParent(true);
        wb2Var2.S0(canvas);
        canvas.save();
        canvas.translate(wb2Var2.getX(), wb2Var2.getY());
        canvas.scale(wb2Var2.getScaleX(), wb2Var2.getScaleY(), wb2Var2.getPivotX(), wb2Var2.getPivotY());
        if (wb2Var2.L0() && wb2Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, wb2Var2.getPaddingTop());
            wb2Var2.M0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.save();
        canvas.translate(wb2Var2.getX(), wb2Var2.getY() + wb2Var2.getPaddingTop());
        canvas.scale(wb2Var2.getScaleX(), wb2Var2.getScaleY(), wb2Var2.getPivotX(), wb2Var2.getPivotY());
        if (wb2Var2.getCurrentPosition() != null && (((wb2Var2.getCurrentPosition().l & wb2Var2.G()) != 0 && (wb2Var2.getCurrentPosition().l & 1) != 0) || (wb2Var2.getCurrentMessagesGroup() != null && wb2Var2.getCurrentMessagesGroup().i))) {
            wb2Var2.Q0(wb2Var2.getAlpha(), canvas, false);
        }
        if (wb2Var2.getCurrentPosition() != null && (((wb2Var2.getCurrentPosition().l & 8) != 0 && (wb2Var2.getCurrentPosition().l & 1) != 0) || (wb2Var2.getCurrentMessagesGroup() != null && wb2Var2.getCurrentMessagesGroup().i))) {
            wb2Var2.q1(canvas, wb2Var2.getAlpha(), null);
            wb2Var2.V0(canvas, wb2Var2.getAlpha());
        }
        if (wb2Var2.getCurrentPosition() != null) {
            wb2Var2.h1(canvas, wb2Var2.getAlpha());
        }
        if (wb2Var2.getCurrentPosition() == null || wb2Var2.getCurrentPosition().h) {
            wb2Var2.A1(wb2Var2.getAlpha(), canvas, true);
        }
        wb2Var2.i1(canvas);
        wb2Var2.getTransitionParams().d();
        canvas.restore();
        wb2Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getTop() != 0 && (childAt instanceof p67)) {
                p67 p67Var = (p67) childAt;
                p67Var.Ld = childAt.getTop();
                p67Var.Md = childAt.getBottom();
                p67Var.Nd = p67Var.getMessageObject().e1();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int measuredHeight;
        int l;
        int i3;
        q67 q67Var = this.j3;
        if (q67Var.N.isEmpty()) {
            f = -6.0f;
        } else {
            f = 48.0f;
        }
        int L = hl.L(f);
        ViewGroup viewGroup = q67Var.Z;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((hl.q.y - (L + measuredHeight)) - hl.L(8.0f)) - q67Var.d.b), Integer.MIN_VALUE));
        if (q67Var.p0) {
            l = q67Var.Y;
        } else {
            l = q67Var.W.l();
        }
        int max = Math.max(hl.L(12.0f) + l, -((hl.L(7.0f) + q67Var.r0[0]) - getMeasuredWidth()));
        int i4 = q67Var.O;
        int measuredWidth = getMeasuredWidth() - max;
        if (q67Var.P.i()) {
            i3 = 0;
        } else {
            i3 = 40;
        }
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - hl.L(8.0f)) + Math.max(0, i4 - (measuredWidth - hl.L(i3 + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
