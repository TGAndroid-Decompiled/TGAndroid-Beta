package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.d;
public final class q42 extends a22 {
    public final e34 n;
    public final r59 r;
    public final u46 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public q42(i22 i22Var, Context context, ylb ylbVar, boolean z) {
        super(i22Var, ylbVar, context);
        this.x = z;
        this.f = true;
        d dVar = i22Var.Z1;
        boolean z2 = !z ? 1 : 0;
        e34 e34Var = new e34(dVar, z2, z, false, getContext(), true, null, null, false, ylbVar, false, true);
        this.n = e34Var;
        e34Var.x0 = false;
        e34Var.H(z2, z, false, false);
        e34Var.o2 = true;
        t04 t04Var = e34Var.y;
        if (t04Var != null) {
            t04Var.setVisibility(8);
        }
        e34Var.p2 = true;
        ImageView imageView = e34Var.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        e34Var.S2 = true;
        addView(e34Var, qoe.c(-1.0f, -1));
        HorizontalScrollView w = e34Var.w(z2 ? 1 : 0);
        this.w = w;
        r59 v = e34Var.v(z2 ? 1 : 0);
        this.r = v;
        v.j(new y(this, (byte) 21));
        this.s = (u46) v.getLayoutManager();
        w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q42.B(int, int):void");
    }

    @Override
    public final void H(a22 a22Var) {
        int i;
        i22 i22Var = this.b;
        try {
            i22Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        x20 x20Var = i22Var.U2;
        if (this.x) {
            i = 2131745386;
        } else {
            i = 2131745392;
        }
        x20Var.setTitle(jb6.M0(i, null));
        this.s.g1(0, 0);
    }

    @Override
    public final void J() {
        this.r.z0(0);
    }

    @Override
    public int getCurrentItemTop() {
        r59 r59Var = this.r;
        if (r59Var.getChildCount() <= 0) {
            r59Var.setTopGlowOffset(r59Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = r59Var.getChildAt(0);
        b59 b59Var = (b59) r59Var.G(childAt);
        int top = childAt.getTop() - gm.L(36.0f);
        int L = gm.L(7.0f);
        if (top < gm.L(7.0f) || b59Var == null || b59Var.b() != 0) {
            top = L;
        }
        r59Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return gm.L(56.0f) + getListTopPadding();
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

    public void setDelegate(f24 f24Var) {
        this.n.setDelegate(f24Var);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }
}
