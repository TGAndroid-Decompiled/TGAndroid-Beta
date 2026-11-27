package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class li3 extends rm9 {
    public boolean T;
    public tj3 U;
    public final nj3 V;
    public final Context W;
    public final uj3 a0;

    public li3(uj3 uj3Var, Context context, nj3 nj3Var, Context context2) {
        super(context);
        this.a0 = uj3Var;
        this.V = nj3Var;
        this.W = context2;
        this.e = 0.0f;
        this.n = new pn(null);
        this.N = true;
    }

    @Override
    public final void d(boolean z) {
        tj3 tj3Var = this.U;
        tj3Var.c.G = true;
        tj3Var.d.N(this.U.a, c());
        tj3 tj3Var2 = this.U;
        tj3Var2.d.H = false;
        tj3Var2.H.H = false;
        uj3 uj3Var = this.a0;
        uj3Var.U4(false, true);
        this.U.a.setClipChildren(true);
        this.U.a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.a.C1(null, 0.0f, z);
        uj3Var.E = false;
        this.V.requestLayout();
        if (!c()) {
            uj3Var.R = true;
            if (uj3Var.O != 0.0f) {
                uj3Var.S = true;
            }
            View view = uj3Var.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        bj3 bj3Var = uj3Var.D0;
        if (bj3Var != null) {
            bj3Var.T();
        }
        uj3Var.s5(false, true);
        uj3Var.Z2();
        uj3Var.q5();
    }

    @Override
    public final void e(boolean z) {
        int i;
        float f;
        vy4 vy4Var;
        int i2;
        uj3 uj3Var = this.a0;
        uj3Var.E = true;
        uj3Var.F = z;
        this.V.requestLayout();
        tj3 tj3Var = uj3Var.f0[0];
        this.U = tj3Var;
        if (tj3Var.G == null) {
            tj3Var.G = new d79(this.W, null);
            vy4Var = ((e) uj3Var).glassEngine;
            vy4Var.b(this.U.G);
            this.U.G.setLayoutManager(new ki3(this, this.U));
            tj3 tj3Var2 = this.U;
            int i3 = this.U.s;
            int i4 = uj3Var.Y2;
            boolean z2 = uj3Var.n2;
            ArrayList arrayList = uj3Var.K2;
            i2 = ((e) uj3Var).currentAccount;
            tj3Var2.H = new gk3(uj3Var, this.W, i3, i4, z2, arrayList, i2, uj3Var.H);
            tj3 tj3Var3 = this.U;
            gk3 gk3Var = tj3Var3.H;
            gk3Var.T = true;
            tj3Var3.G.setAdapter(gk3Var);
            tj3 tj3Var4 = this.U;
            tj3Var4.addView(tj3Var4.G);
        }
        if (!z) {
            uj3Var.R = false;
            if (uj3Var.y3() && this.U.s == 0) {
                i = 1;
            } else {
                i = 0;
            }
            f89 M = this.U.a.M(i, false);
            if (M != null && M.a.getTop() >= this.U.a.getPaddingTop()) {
                f = 0.0f;
            } else {
                f = -uj3Var.q3();
            }
            uj3Var.W4(f);
        }
        this.U.a.E0();
        tj3 tj3Var5 = this.U;
        gk3 gk3Var2 = tj3Var5.H;
        gk3Var2.h = tj3Var5.s;
        gk3Var2.f();
        tj3 tj3Var6 = this.U;
        tj3Var6.d.N(tj3Var6.a, false);
        tj3 tj3Var7 = this.U;
        tj3Var7.d.H = true;
        tj3Var7.H.H = true;
        tj3Var7.c.H = false;
        uj3Var.U4(true, true);
        uj3Var.B3(this.T);
        this.U.d.f();
        this.U.H.f();
        float f2 = uj3Var.O;
        if (z) {
            f2 = -f2;
        }
        tj3 tj3Var8 = this.U;
        tj3Var8.a.C1(tj3Var8.G, f2, false);
        this.U.a.setClipChildren(false);
        this.U.a.E0();
        uj3Var.Z2();
        uj3Var.q5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        a aVar;
        a aVar2;
        uj3 uj3Var = this.a0;
        aVar = ((e) uj3Var).actionBar;
        if (aVar != null) {
            aVar2 = ((e) uj3Var).actionBar;
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
        qj3 qj3Var;
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
        uj3 uj3Var = this.a0;
        View view = uj3Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        aVar = ((e) uj3Var).actionBar;
        if (aVar.getTitleTextView() != null) {
            aVar4 = ((e) uj3Var).actionBar;
            aVar4.getTitleTextView().setAlpha(1.0f - f);
            aVar5 = ((e) uj3Var).actionBar;
            if (aVar5.getTitleTextView().getAlpha() > 0.0f) {
                aVar6 = ((e) uj3Var).actionBar;
                aVar6.getTitleTextView().setVisibility(0);
            }
        }
        aVar2 = ((e) uj3Var).actionBar;
        if (aVar2.getBackButton() != null) {
            aVar3 = ((e) uj3Var).actionBar;
            ImageView backButton = aVar3.getBackButton();
            if (f != 1.0f) {
                f2 = 1.0f;
            }
            backButton.setAlpha(f2);
        }
        if (uj3Var.Y2 != 0 || uj3Var.a3 != 0) {
            Paint paint = uj3Var.h1;
            int i = aob.d6;
            paint.setColor(vm2.f(f, uj3Var.getThemedColor(i), uj3Var.getThemedColor(i)));
        }
        tj3 tj3Var = this.U;
        if (tj3Var != null) {
            tj3Var.a.setOpenRightFragmentProgress(f);
        }
        uj3Var.Y2();
        uj3Var.d3();
        uj3Var.Q2();
        uj3Var.a3();
        tj3 tj3Var2 = uj3Var.f0[0];
        if (tj3Var2 != null && (qj3Var = tj3Var2.a) != null) {
            qj3Var.requestLayout();
        }
        View view2 = uj3Var.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
