package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class dj3 extends el9 {
    public boolean T;
    public mk3 U;
    public final gk3 V;
    public final Context W;
    public final nk3 a0;

    public dj3(nk3 nk3Var, Context context, gk3 gk3Var, Context context2) {
        super(context);
        this.a0 = nk3Var;
        this.V = gk3Var;
        this.W = context2;
        this.e = 0.0f;
        this.n = new po(null);
        this.N = true;
    }

    @Override
    public final void d(boolean z) {
        mk3 mk3Var = this.U;
        mk3Var.c.G = true;
        mk3Var.d.N(this.U.a, c());
        mk3 mk3Var2 = this.U;
        mk3Var2.d.H = false;
        mk3Var2.H.H = false;
        nk3 nk3Var = this.a0;
        nk3Var.U4(false, true);
        this.U.a.setClipChildren(true);
        this.U.a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.a.B1(null, 0.0f, z);
        nk3Var.E = false;
        this.V.requestLayout();
        if (!c()) {
            nk3Var.R = true;
            if (nk3Var.O != 0.0f) {
                nk3Var.S = true;
            }
            View view = nk3Var.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        sj3 sj3Var = nk3Var.D0;
        if (sj3Var != null) {
            sj3Var.S();
        }
        nk3Var.s5(false, true);
        nk3Var.Z2();
        nk3Var.q5();
    }

    @Override
    public final void e(boolean z) {
        int i;
        float f;
        sy4 sy4Var;
        int i2;
        nk3 nk3Var = this.a0;
        nk3Var.E = true;
        nk3Var.F = z;
        this.V.requestLayout();
        mk3 mk3Var = nk3Var.f0[0];
        this.U = mk3Var;
        if (mk3Var.G == null) {
            mk3Var.G = new r59(this.W, null);
            sy4Var = ((d) nk3Var).glassEngine;
            sy4Var.b(this.U.G);
            this.U.G.setLayoutManager(new cj3(this, this.U));
            mk3 mk3Var2 = this.U;
            int i3 = this.U.s;
            int i4 = nk3Var.Y2;
            boolean z2 = nk3Var.n2;
            ArrayList arrayList = nk3Var.K2;
            i2 = ((d) nk3Var).currentAccount;
            mk3Var2.H = new zk3(nk3Var, this.W, i3, i4, z2, arrayList, i2, nk3Var.H);
            mk3 mk3Var3 = this.U;
            zk3 zk3Var = mk3Var3.H;
            zk3Var.T = true;
            mk3Var3.G.setAdapter(zk3Var);
            mk3 mk3Var4 = this.U;
            mk3Var4.addView(mk3Var4.G);
        }
        if (!z) {
            nk3Var.R = false;
            if (nk3Var.y3() && this.U.s == 0) {
                i = 1;
            } else {
                i = 0;
            }
            u69 L = this.U.a.L(i, false);
            if (L != null && L.a.getTop() >= this.U.a.getPaddingTop()) {
                f = 0.0f;
            } else {
                f = -nk3Var.q3();
            }
            nk3Var.W4(f);
        }
        this.U.a.D0();
        mk3 mk3Var5 = this.U;
        zk3 zk3Var2 = mk3Var5.H;
        zk3Var2.h = mk3Var5.s;
        zk3Var2.f();
        mk3 mk3Var6 = this.U;
        mk3Var6.d.N(mk3Var6.a, false);
        mk3 mk3Var7 = this.U;
        mk3Var7.d.H = true;
        mk3Var7.H.H = true;
        mk3Var7.c.H = false;
        nk3Var.U4(true, true);
        nk3Var.B3(this.T);
        this.U.d.f();
        this.U.H.f();
        float f2 = nk3Var.O;
        if (z) {
            f2 = -f2;
        }
        mk3 mk3Var8 = this.U;
        mk3Var8.a.B1(mk3Var8.G, f2, false);
        this.U.a.setClipChildren(false);
        this.U.a.D0();
        nk3Var.Z2();
        nk3Var.q5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        a aVar;
        a aVar2;
        nk3 nk3Var = this.a0;
        aVar = ((d) nk3Var).actionBar;
        if (aVar != null) {
            aVar2 = ((d) nk3Var).actionBar;
            if (aVar2.getOccupyStatusBar()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setOpenProgress(float f) {
        boolean z;
        a aVar;
        a aVar2;
        jk3 jk3Var;
        a aVar3;
        a aVar4;
        a aVar5;
        a aVar6;
        float f2 = 0.0f;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.T != z) {
            this.T = z;
        }
        nk3 nk3Var = this.a0;
        View view = nk3Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        aVar = ((d) nk3Var).actionBar;
        if (aVar.getTitleTextView() != null) {
            aVar4 = ((d) nk3Var).actionBar;
            aVar4.getTitleTextView().setAlpha(1.0f - f);
            aVar5 = ((d) nk3Var).actionBar;
            if (aVar5.getTitleTextView().getAlpha() > 0.0f) {
                aVar6 = ((d) nk3Var).actionBar;
                aVar6.getTitleTextView().setVisibility(0);
            }
        }
        aVar2 = ((d) nk3Var).actionBar;
        if (aVar2.getBackButton() != null) {
            aVar3 = ((d) nk3Var).actionBar;
            ImageView backButton = aVar3.getBackButton();
            if (f != 1.0f) {
                f2 = 1.0f;
            }
            backButton.setAlpha(f2);
        }
        if (nk3Var.Y2 != 0 || nk3Var.a3 != 0) {
            Paint paint = nk3Var.h1;
            int i = cmb.c6;
            paint.setColor(on2.f(f, nk3Var.getThemedColor(i), nk3Var.getThemedColor(i)));
        }
        mk3 mk3Var = this.U;
        if (mk3Var != null) {
            mk3Var.a.setOpenRightFragmentProgress(f);
        }
        nk3Var.Y2();
        nk3Var.d3();
        nk3Var.Q2();
        nk3Var.a3();
        mk3 mk3Var2 = nk3Var.f0[0];
        if (mk3Var2 != null && (jk3Var = mk3Var2.a) != null) {
            jk3Var.requestLayout();
        }
        View view2 = nk3Var.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
