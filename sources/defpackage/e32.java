package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.d;
public final class e32 extends p02 {
    public final t14 n;
    public final o39 r;
    public final t26 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public e32(x02 x02Var, Context context, wjb wjbVar, boolean z) {
        super(x02Var, wjbVar, context);
        this.x = z;
        this.f = true;
        d dVar = x02Var.Z1;
        boolean z2 = !z ? 1 : 0;
        t14 t14Var = new t14(dVar, z2, z, false, getContext(), true, null, null, false, wjbVar, false, true);
        this.n = t14Var;
        t14Var.x0 = false;
        t14Var.I(z2, z, false, false);
        t14Var.o2 = true;
        jz3 jz3Var = t14Var.y;
        if (jz3Var != null) {
            jz3Var.setVisibility(8);
        }
        t14Var.p2 = true;
        ImageView imageView = t14Var.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        t14Var.S2 = true;
        addView(t14Var, nme.c(-1.0f, -1));
        HorizontalScrollView x = t14Var.x(z2 ? 1 : 0);
        this.w = x;
        o39 w = t14Var.w(z2 ? 1 : 0);
        this.r = w;
        w.j(new y(this, (byte) 20));
        this.s = (t26) w.getLayoutManager();
        x.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void C(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e32.C(int, int):void");
    }

    @Override
    public final void I(p02 p02Var) {
        int i;
        x02 x02Var = this.b;
        try {
            x02Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        x10 x10Var = x02Var.U2;
        if (this.x) {
            i = 2131745460;
        } else {
            i = 2131745466;
        }
        x10Var.setTitle(k96.M0(i, null));
        this.s.g1(0, 0);
    }

    @Override
    public final void K() {
        this.r.z0(0);
    }

    @Override
    public int getCurrentItemTop() {
        o39 o39Var = this.r;
        if (o39Var.getChildCount() <= 0) {
            o39Var.setTopGlowOffset(o39Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = o39Var.getChildAt(0);
        y29 y29Var = (y29) o39Var.G(childAt);
        int top = childAt.getTop() - gl.L(36.0f);
        int L = gl.L(7.0f);
        if (top < gl.L(7.0f) || y29Var == null || y29Var.b() != 0) {
            top = L;
        }
        o39Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(u04 u04Var) {
        this.n.setDelegate(u04Var);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }
}
