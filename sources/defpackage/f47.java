package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class f47 extends o39 {
    public final ArrayList f3;
    public final lm g3;
    public final lm h3;
    public final xl3 i3;
    public final j47 j3;

    public f47(j47 j47Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.j3 = j47Var;
        this.f3 = new ArrayList(10);
        s33 s33Var = s33.h;
        this.g3 = new lm(this, 0L, 360L, s33Var);
        this.h3 = new lm(this, 0L, 360L, s33Var);
        this.i3 = new xl3((byte) 7);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f47.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        gb2 gb2Var;
        j47 j47Var = this.j3;
        if (j47Var.w && ((view == (gb2Var = j47Var.Q) && gb2Var != null && gb2Var.getCurrentPosition() == null) || view == j47Var.X)) {
            return false;
        }
        if (!(view instanceof gb2)) {
            return true;
        }
        gb2 gb2Var2 = (gb2) view;
        gb2Var2.setInvalidatesParent(true);
        gb2Var2.S0(canvas);
        canvas.save();
        canvas.translate(gb2Var2.getX(), gb2Var2.getY());
        canvas.scale(gb2Var2.getScaleX(), gb2Var2.getScaleY(), gb2Var2.getPivotX(), gb2Var2.getPivotY());
        if (gb2Var2.L0() && gb2Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, gb2Var2.getPaddingTop());
            gb2Var2.M0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.save();
        canvas.translate(gb2Var2.getX(), gb2Var2.getY() + gb2Var2.getPaddingTop());
        canvas.scale(gb2Var2.getScaleX(), gb2Var2.getScaleY(), gb2Var2.getPivotX(), gb2Var2.getPivotY());
        if (gb2Var2.getCurrentPosition() != null && (((gb2Var2.getCurrentPosition().l & gb2Var2.H()) != 0 && (gb2Var2.getCurrentPosition().l & 1) != 0) || (gb2Var2.getCurrentMessagesGroup() != null && gb2Var2.getCurrentMessagesGroup().i))) {
            gb2Var2.Q0(gb2Var2.getAlpha(), canvas, false);
        }
        if (gb2Var2.getCurrentPosition() != null && (((gb2Var2.getCurrentPosition().l & 8) != 0 && (gb2Var2.getCurrentPosition().l & 1) != 0) || (gb2Var2.getCurrentMessagesGroup() != null && gb2Var2.getCurrentMessagesGroup().i))) {
            gb2Var2.q1(canvas, gb2Var2.getAlpha(), null);
            gb2Var2.V0(canvas, gb2Var2.getAlpha());
        }
        if (gb2Var2.getCurrentPosition() != null) {
            gb2Var2.h1(canvas, gb2Var2.getAlpha());
        }
        if (gb2Var2.getCurrentPosition() == null || gb2Var2.getCurrentPosition().h) {
            gb2Var2.A1(gb2Var2.getAlpha(), canvas, true);
        }
        gb2Var2.i1(canvas);
        gb2Var2.getTransitionParams().d();
        canvas.restore();
        gb2Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getTop() != 0 && (childAt instanceof i47)) {
                i47 i47Var = (i47) childAt;
                i47Var.Ld = childAt.getTop();
                i47Var.Md = childAt.getBottom();
                i47Var.Nd = i47Var.getMessageObject().e1();
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
        j47 j47Var = this.j3;
        if (j47Var.N.isEmpty()) {
            f = -6.0f;
        } else {
            f = 48.0f;
        }
        int L = gl.L(f);
        ViewGroup viewGroup = j47Var.Z;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((gl.q.y - (L + measuredHeight)) - gl.L(8.0f)) - j47Var.d.b), Integer.MIN_VALUE));
        if (j47Var.p0) {
            l = j47Var.Y;
        } else {
            l = j47Var.W.l();
        }
        int max = Math.max(gl.L(12.0f) + l, -((gl.L(7.0f) + j47Var.r0[0]) - getMeasuredWidth()));
        int i4 = j47Var.O;
        int measuredWidth = getMeasuredWidth() - max;
        if (j47Var.P.i()) {
            i3 = 0;
        } else {
            i3 = 40;
        }
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - gl.L(8.0f)) + Math.max(0, i4 - (measuredWidth - gl.L(i3 + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
