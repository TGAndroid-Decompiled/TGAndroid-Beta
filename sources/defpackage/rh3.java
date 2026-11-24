package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class rh3 extends dj9 {
    public boolean T;
    public bj3 U;
    public final vi3 V;
    public final Context W;
    public final cj3 a0;

    public rh3(cj3 cj3Var, Context context, vi3 vi3Var, Context context2) {
        super(context);
        this.a0 = cj3Var;
        this.V = vi3Var;
        this.W = context2;
        this.e = 0.0f;
        this.n = new on(null);
        this.N = true;
    }

    @Override
    public final void d(boolean z) {
        bj3 bj3Var = this.U;
        bj3Var.c.G = true;
        bj3Var.d.N(this.U.a, c());
        bj3 bj3Var2 = this.U;
        bj3Var2.d.H = false;
        bj3Var2.H.H = false;
        cj3 cj3Var = this.a0;
        cj3Var.Q4(false, true);
        this.U.a.setClipChildren(true);
        this.U.a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.a.B1(null, 0.0f, z);
        cj3Var.E = false;
        this.V.requestLayout();
        if (!c()) {
            cj3Var.R = true;
            if (cj3Var.O != 0.0f) {
                cj3Var.S = true;
            }
            View view = cj3Var.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        hi3 hi3Var = cj3Var.D0;
        if (hi3Var != null) {
            hi3Var.S();
        }
        cj3Var.o5(false, true);
        cj3Var.X2();
        cj3Var.m5();
    }

    @Override
    public final void e(boolean z) {
        int i;
        float f;
        qw4 qw4Var;
        int i2;
        cj3 cj3Var = this.a0;
        cj3Var.E = true;
        cj3Var.F = z;
        this.V.requestLayout();
        bj3 bj3Var = cj3Var.f0[0];
        this.U = bj3Var;
        if (bj3Var.G == null) {
            bj3Var.G = new o39(this.W, null);
            qw4Var = ((d) cj3Var).glassEngine;
            qw4Var.b(this.U.G);
            this.U.G.setLayoutManager(new qh3(this, this.U));
            bj3 bj3Var2 = this.U;
            int i3 = this.U.s;
            int i4 = cj3Var.Y2;
            boolean z2 = cj3Var.n2;
            ArrayList arrayList = cj3Var.K2;
            i2 = ((d) cj3Var).currentAccount;
            bj3Var2.H = new oj3(cj3Var, this.W, i3, i4, z2, arrayList, i2, cj3Var.H);
            bj3 bj3Var3 = this.U;
            oj3 oj3Var = bj3Var3.H;
            oj3Var.T = true;
            bj3Var3.G.setAdapter(oj3Var);
            bj3 bj3Var4 = this.U;
            bj3Var4.addView(bj3Var4.G);
        }
        if (!z) {
            cj3Var.R = false;
            if (cj3Var.w3() && this.U.s == 0) {
                i = 1;
            } else {
                i = 0;
            }
            s49 L = this.U.a.L(i, false);
            if (L != null && L.a.getTop() >= this.U.a.getPaddingTop()) {
                f = 0.0f;
            } else {
                f = -cj3Var.o3();
            }
            cj3Var.S4(f);
        }
        this.U.a.D0();
        bj3 bj3Var5 = this.U;
        oj3 oj3Var2 = bj3Var5.H;
        oj3Var2.h = bj3Var5.s;
        oj3Var2.f();
        bj3 bj3Var6 = this.U;
        bj3Var6.d.N(bj3Var6.a, false);
        bj3 bj3Var7 = this.U;
        bj3Var7.d.H = true;
        bj3Var7.H.H = true;
        bj3Var7.c.H = false;
        cj3Var.Q4(true, true);
        cj3Var.z3(this.T);
        this.U.d.f();
        this.U.H.f();
        float f2 = cj3Var.O;
        if (z) {
            f2 = -f2;
        }
        bj3 bj3Var8 = this.U;
        bj3Var8.a.B1(bj3Var8.G, f2, false);
        this.U.a.setClipChildren(false);
        this.U.a.D0();
        cj3Var.X2();
        cj3Var.m5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        a aVar;
        a aVar2;
        cj3 cj3Var = this.a0;
        aVar = ((d) cj3Var).actionBar;
        if (aVar != null) {
            aVar2 = ((d) cj3Var).actionBar;
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
        yi3 yi3Var;
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
        cj3 cj3Var = this.a0;
        View view = cj3Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        aVar = ((d) cj3Var).actionBar;
        if (aVar.getTitleTextView() != null) {
            aVar4 = ((d) cj3Var).actionBar;
            aVar4.getTitleTextView().setAlpha(1.0f - f);
            aVar5 = ((d) cj3Var).actionBar;
            if (aVar5.getTitleTextView().getAlpha() > 0.0f) {
                aVar6 = ((d) cj3Var).actionBar;
                aVar6.getTitleTextView().setVisibility(0);
            }
        }
        aVar2 = ((d) cj3Var).actionBar;
        if (aVar2.getBackButton() != null) {
            aVar3 = ((d) cj3Var).actionBar;
            ImageView backButton = aVar3.getBackButton();
            if (f != 1.0f) {
                f2 = 1.0f;
            }
            backButton.setAlpha(f2);
        }
        if (cj3Var.Y2 != 0 || cj3Var.a3 != 0) {
            Paint paint = cj3Var.h1;
            int i = bkb.c6;
            paint.setColor(bm2.f(f, cj3Var.getThemedColor(i), cj3Var.getThemedColor(i)));
        }
        bj3 bj3Var = this.U;
        if (bj3Var != null) {
            bj3Var.a.setOpenRightFragmentProgress(f);
        }
        cj3Var.W2();
        cj3Var.b3();
        cj3Var.O2();
        cj3Var.Y2();
        bj3 bj3Var2 = cj3Var.f0[0];
        if (bj3Var2 != null && (yi3Var = bj3Var2.a) != null) {
            yi3Var.requestLayout();
        }
        View view2 = cj3Var.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
