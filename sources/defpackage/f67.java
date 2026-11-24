package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class f67 extends r59 {
    public final ArrayList f3;
    public final ln g3;
    public final ln h3;
    public final in3 i3;
    public final j67 j3;

    public f67(j67 j67Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.j3 = j67Var;
        this.f3 = new ArrayList(10);
        d53 d53Var = d53.h;
        this.g3 = new ln(this, 0L, 360L, d53Var);
        this.h3 = new ln(this, 0L, 360L, d53Var);
        this.i3 = new in3((byte) 7);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f67.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        rc2 rc2Var;
        j67 j67Var = this.j3;
        if (j67Var.w && ((view == (rc2Var = j67Var.Q) && rc2Var != null && rc2Var.getCurrentPosition() == null) || view == j67Var.X)) {
            return false;
        }
        if (!(view instanceof rc2)) {
            return true;
        }
        rc2 rc2Var2 = (rc2) view;
        rc2Var2.setInvalidatesParent(true);
        rc2Var2.S0(canvas);
        canvas.save();
        canvas.translate(rc2Var2.getX(), rc2Var2.getY());
        canvas.scale(rc2Var2.getScaleX(), rc2Var2.getScaleY(), rc2Var2.getPivotX(), rc2Var2.getPivotY());
        if (rc2Var2.L0() && rc2Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, rc2Var2.getPaddingTop());
            rc2Var2.M0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.save();
        canvas.translate(rc2Var2.getX(), rc2Var2.getY() + rc2Var2.getPaddingTop());
        canvas.scale(rc2Var2.getScaleX(), rc2Var2.getScaleY(), rc2Var2.getPivotX(), rc2Var2.getPivotY());
        if (rc2Var2.getCurrentPosition() != null && (((rc2Var2.getCurrentPosition().l & rc2Var2.C()) != 0 && (rc2Var2.getCurrentPosition().l & 1) != 0) || (rc2Var2.getCurrentMessagesGroup() != null && rc2Var2.getCurrentMessagesGroup().i))) {
            rc2Var2.Q0(rc2Var2.getAlpha(), canvas, false);
        }
        if (rc2Var2.getCurrentPosition() != null && (((rc2Var2.getCurrentPosition().l & 8) != 0 && (rc2Var2.getCurrentPosition().l & 1) != 0) || (rc2Var2.getCurrentMessagesGroup() != null && rc2Var2.getCurrentMessagesGroup().i))) {
            rc2Var2.q1(canvas, rc2Var2.getAlpha(), null);
            rc2Var2.V0(canvas, rc2Var2.getAlpha());
        }
        if (rc2Var2.getCurrentPosition() != null) {
            rc2Var2.h1(canvas, rc2Var2.getAlpha());
        }
        if (rc2Var2.getCurrentPosition() == null || rc2Var2.getCurrentPosition().h) {
            rc2Var2.A1(rc2Var2.getAlpha(), canvas, true);
        }
        rc2Var2.i1(canvas);
        rc2Var2.getTransitionParams().d();
        canvas.restore();
        rc2Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getTop() != 0 && (childAt instanceof i67)) {
                i67 i67Var = (i67) childAt;
                i67Var.Ld = childAt.getTop();
                i67Var.Md = childAt.getBottom();
                i67Var.Nd = i67Var.getMessageObject().e1();
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
        j67 j67Var = this.j3;
        if (j67Var.N.isEmpty()) {
            f = -6.0f;
        } else {
            f = 48.0f;
        }
        int L = gm.L(f);
        ViewGroup viewGroup = j67Var.Z;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((gm.q.y - (L + measuredHeight)) - gm.L(8.0f)) - j67Var.d.b), Integer.MIN_VALUE));
        if (j67Var.p0) {
            l = j67Var.Y;
        } else {
            l = j67Var.W.l();
        }
        int max = Math.max(gm.L(12.0f) + l, -((gm.L(7.0f) + j67Var.r0[0]) - getMeasuredWidth()));
        int i4 = j67Var.O;
        int measuredWidth = getMeasuredWidth() - max;
        if (j67Var.P.i()) {
            i3 = 0;
        } else {
            i3 = 40;
        }
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - gm.L(8.0f)) + Math.max(0, i4 - (measuredWidth - gm.L(i3 + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
