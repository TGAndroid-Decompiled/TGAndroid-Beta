package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.cp;
import org.telegram.messenger.k10;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.s10;
public final class g7 {
    public final int f12063a;
    public final bu f12064b;
    public final s10 f12065c;
    public int d;
    public int f12066e;
    public final org.telegram.ui.Components.g5 f12067f;
    public final org.telegram.ui.Components.g5 f12068g;
    public boolean h;
    public cp f12069i;
    public int f12070j;

    public g7(View view) {
        bu buVar = new bu(1, view);
        this.f12063a = k10.f24968t0;
        this.f12064b = buVar;
        nr nrVar = nr.h;
        this.f12067f = new org.telegram.ui.Components.g5(buVar, 350L, nrVar);
        this.f12068g = new org.telegram.ui.Components.g5(buVar, 350L, nrVar);
        s10 s10Var = new s10();
        this.f12065c = s10Var;
        s10Var.f39445a = true;
        s10Var.f39446b = true;
        b(false);
        s10Var.f39447c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        s10Var.f39447c.setStyle(Paint.Style.STROKE);
        s10Var.f39447c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.f12070j;
        int i10 = org.telegram.ui.ActionBar.t6.f30069b;
        org.telegram.ui.Components.g5 g5Var = this.f12068g;
        org.telegram.ui.Components.g5 g5Var2 = this.f12067f;
        if (i7 != i10) {
            this.f12070j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yk, false);
                    n10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zk, false);
                } else {
                    cp cpVar = this.f12069i;
                    if (cpVar != null) {
                        m10 = cpVar.m(org.telegram.ui.ActionBar.m6.I.q());
                        n10 = this.f12069i.n(org.telegram.ui.ActionBar.m6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.f12066e) {
                    this.d = m10;
                    this.f12066e = n10;
                    g5Var2.a(m10, true);
                    g5Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = g5Var2.a(this.d, false);
        int a11 = g5Var.a(this.f12066e, false);
        s10 s10Var = this.f12065c;
        s10Var.d(a10, a11, 0, 0);
        s10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return s10Var.f39447c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.f12069i = null;
        this.f12070j = org.telegram.ui.ActionBar.t6.f30069b;
        d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zk, false), z10);
    }

    public final void c(cp cpVar, boolean z10) {
        this.f12069i = cpVar;
        this.f12070j = org.telegram.ui.ActionBar.t6.f30069b;
        if (cpVar != null) {
            this.h = false;
            d(cpVar.m(org.telegram.ui.ActionBar.m6.I.q()), cpVar.n(org.telegram.ui.ActionBar.m6.I.q()), z10);
            return;
        }
        b(z10);
    }

    public final void d(int i7, int i10, boolean z10) {
        this.d = i7;
        this.f12066e = i10;
        if (!z10) {
            this.f12067f.a(i7, true);
            this.f12068g.a(i10, true);
        }
        bu buVar = this.f12064b;
        if (buVar != null) {
            buVar.run();
        }
    }
}
