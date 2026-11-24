package defpackage;

import android.view.View;
public final class h32 extends a22 {
    public fv n;
    public int r;
    public as0 s;
    public kz0 w;
    public byte x;
    public gu2 y;

    @Override
    public final void B(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h32.B(int, int):void");
    }

    @Override
    public final void H(a22 a22Var) {
        i22 i22Var = this.b;
        try {
            i22Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        i22Var.U2.setTitle(jb6.M0(2131745397, null));
        this.s.g1(0, 0);
    }

    @Override
    public final void J() {
        this.n.z0(0);
    }

    @Override
    public int getCurrentItemTop() {
        fv fvVar = this.n;
        if (fvVar.getChildCount() <= 0) {
            fvVar.setTopGlowOffset(fvVar.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = fvVar.getChildAt(0);
        b59 b59Var = (b59) fvVar.G(childAt);
        int top = childAt.getTop();
        int L = gm.L(7.0f);
        if (top < gm.L(7.0f) || b59Var == null || b59Var.b() != 0) {
            top = L;
        }
        fvVar.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return gm.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.n.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    public void setDelegate(gu2 gu2Var) {
        this.y = gu2Var;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }
}
