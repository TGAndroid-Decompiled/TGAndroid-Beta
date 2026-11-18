package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.bp;
import org.telegram.messenger.j10;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.zt;
public final class g7 {
    public final int f12022a;
    public final zt f12023b;
    public final p10 f12024c;
    public int d;
    public int f12025e;
    public final org.telegram.ui.Components.f5 f12026f;
    public final org.telegram.ui.Components.f5 f12027g;
    public boolean h;
    public bp f12028i;
    public int f12029j;

    public g7(View view) {
        zt ztVar = new zt(1, view);
        this.f12022a = j10.f24773t0;
        this.f12023b = ztVar;
        lr lrVar = lr.h;
        this.f12026f = new org.telegram.ui.Components.f5(ztVar, 350L, lrVar);
        this.f12027g = new org.telegram.ui.Components.f5(ztVar, 350L, lrVar);
        p10 p10Var = new p10();
        this.f12024c = p10Var;
        p10Var.f38234a = true;
        p10Var.f38235b = true;
        b(false);
        p10Var.f38236c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        p10Var.f38236c.setStyle(Paint.Style.STROKE);
        p10Var.f38236c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.f12029j;
        int i10 = org.telegram.ui.ActionBar.u6.f30085b;
        org.telegram.ui.Components.f5 f5Var = this.f12027g;
        org.telegram.ui.Components.f5 f5Var2 = this.f12026f;
        if (i7 != i10) {
            this.f12029j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yk, false);
                    n10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zk, false);
                } else {
                    bp bpVar = this.f12028i;
                    if (bpVar != null) {
                        m10 = bpVar.m(org.telegram.ui.ActionBar.n6.I.q());
                        n10 = this.f12028i.n(org.telegram.ui.ActionBar.n6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.f12025e) {
                    this.d = m10;
                    this.f12025e = n10;
                    f5Var2.a(m10, true);
                    f5Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = f5Var2.a(this.d, false);
        int a11 = f5Var.a(this.f12025e, false);
        p10 p10Var = this.f12024c;
        p10Var.d(a10, a11, 0, 0);
        p10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return p10Var.f38236c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.f12028i = null;
        this.f12029j = org.telegram.ui.ActionBar.u6.f30085b;
        d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yk, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zk, false), z10);
    }

    public final void c(bp bpVar, boolean z10) {
        this.f12028i = bpVar;
        this.f12029j = org.telegram.ui.ActionBar.u6.f30085b;
        if (bpVar != null) {
            this.h = false;
            d(bpVar.m(org.telegram.ui.ActionBar.n6.I.q()), bpVar.n(org.telegram.ui.ActionBar.n6.I.q()), z10);
            return;
        }
        b(z10);
    }

    public final void d(int i7, int i10, boolean z10) {
        this.d = i7;
        this.f12025e = i10;
        if (!z10) {
            this.f12026f.a(i7, true);
            this.f12027g.a(i10, true);
        }
        zt ztVar = this.f12023b;
        if (ztVar != null) {
            ztVar.run();
        }
    }
}
