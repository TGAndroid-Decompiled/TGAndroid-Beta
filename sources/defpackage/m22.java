package defpackage;

import android.view.View;
public final class m22 extends f12 {
    public gu n;
    public int r;
    public ar0 s;
    public ly0 w;
    public byte x;
    public pt2 y;

    @Override
    public final void C(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m22.C(int, int):void");
    }

    @Override
    public final void H(f12 f12Var) {
        n12 n12Var = this.b;
        try {
            n12Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        n12Var.U2.setTitle(ob6.M0(2131745391, null));
        this.s.g1(0, 0);
    }

    @Override
    public final void J() {
        this.n.A0(0);
    }

    @Override
    public int getCurrentItemTop() {
        gu guVar = this.n;
        if (guVar.getChildCount() <= 0) {
            guVar.setTopGlowOffset(guVar.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = guVar.getChildAt(0);
        n69 n69Var = (n69) guVar.H(childAt);
        int top = childAt.getTop();
        int L = hl.L(7.0f);
        if (top < hl.L(7.0f) || n69Var == null || n69Var.b() != 0) {
            top = L;
        }
        guVar.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return hl.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.n.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    public void setDelegate(pt2 pt2Var) {
        this.y = pt2Var;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }
}
