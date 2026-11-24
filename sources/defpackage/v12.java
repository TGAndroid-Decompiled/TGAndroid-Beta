package defpackage;

import android.view.View;
public final class v12 extends p02 {
    public fu n;
    public int r;
    public ar0 s;
    public dy0 w;
    public byte x;
    public vs2 y;

    @Override
    public final void C(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v12.C(int, int):void");
    }

    @Override
    public final void I(p02 p02Var) {
        x02 x02Var = this.b;
        try {
            x02Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        x02Var.U2.setTitle(k96.M0(2131745471, null));
        this.s.g1(0, 0);
    }

    @Override
    public final void K() {
        this.n.z0(0);
    }

    @Override
    public int getCurrentItemTop() {
        fu fuVar = this.n;
        if (fuVar.getChildCount() <= 0) {
            fuVar.setTopGlowOffset(fuVar.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = fuVar.getChildAt(0);
        y29 y29Var = (y29) fuVar.G(childAt);
        int top = childAt.getTop();
        int L = gl.L(7.0f);
        if (top < gl.L(7.0f) || y29Var == null || y29Var.b() != 0) {
            top = L;
        }
        fuVar.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.n.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    public void setDelegate(vs2 vs2Var) {
        this.y = vs2Var;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }
}
