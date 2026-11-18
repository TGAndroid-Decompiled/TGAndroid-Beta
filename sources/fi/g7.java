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
    public final int f12019a;
    public final zt f12020b;
    public final p10 f12021c;
    public int d;
    public int f12022e;
    public final org.telegram.ui.Components.f5 f12023f;
    public final org.telegram.ui.Components.f5 f12024g;
    public boolean h;
    public bp f12025i;
    public int f12026j;

    public g7(View view) {
        zt ztVar = new zt(1, view);
        this.f12019a = j10.f24770t0;
        this.f12020b = ztVar;
        lr lrVar = lr.h;
        this.f12023f = new org.telegram.ui.Components.f5(ztVar, 350L, lrVar);
        this.f12024g = new org.telegram.ui.Components.f5(ztVar, 350L, lrVar);
        p10 p10Var = new p10();
        this.f12021c = p10Var;
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
        int i7 = this.f12026j;
        int i10 = org.telegram.ui.ActionBar.u6.f30083b;
        org.telegram.ui.Components.f5 f5Var = this.f12024g;
        org.telegram.ui.Components.f5 f5Var2 = this.f12023f;
        if (i7 != i10) {
            this.f12026j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yk, false);
                    n10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zk, false);
                } else {
                    bp bpVar = this.f12025i;
                    if (bpVar != null) {
                        m10 = bpVar.m(org.telegram.ui.ActionBar.n6.I.q());
                        n10 = this.f12025i.n(org.telegram.ui.ActionBar.n6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.f12022e) {
                    this.d = m10;
                    this.f12022e = n10;
                    f5Var2.a(m10, true);
                    f5Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = f5Var2.a(this.d, false);
        int a11 = f5Var.a(this.f12022e, false);
        p10 p10Var = this.f12021c;
        p10Var.d(a10, a11, 0, 0);
        p10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return p10Var.f38236c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.f12025i = null;
        this.f12026j = org.telegram.ui.ActionBar.u6.f30083b;
        d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yk, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zk, false), z10);
    }

    public final void c(bp bpVar, boolean z10) {
        this.f12025i = bpVar;
        this.f12026j = org.telegram.ui.ActionBar.u6.f30083b;
        if (bpVar != null) {
            this.h = false;
            d(bpVar.m(org.telegram.ui.ActionBar.n6.I.q()), bpVar.n(org.telegram.ui.ActionBar.n6.I.q()), z10);
            return;
        }
        b(z10);
    }

    public final void d(int i7, int i10, boolean z10) {
        this.d = i7;
        this.f12022e = i10;
        if (!z10) {
            this.f12023f.a(i7, true);
            this.f12024g.a(i10, true);
        }
        zt ztVar = this.f12020b;
        if (ztVar != null) {
            ztVar.run();
        }
    }
}
