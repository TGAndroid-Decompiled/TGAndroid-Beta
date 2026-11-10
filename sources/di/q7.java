package di;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.fp;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.wq;
public final class q7 {
    public final int f9587a;
    public final nt f9588b;
    public final e10 f9589c;
    public int d;
    public int f9590e;
    public final org.telegram.ui.Components.y4 f9591f;
    public final org.telegram.ui.Components.y4 f9592g;
    public boolean h;
    public fp f9593i;
    public int f9594j;

    public q7(View view) {
        nt ntVar = new nt(1, view);
        this.f9587a = p10.f24474s0;
        this.f9588b = ntVar;
        wq wqVar = wq.h;
        this.f9591f = new org.telegram.ui.Components.y4(ntVar, 350L, wqVar);
        this.f9592g = new org.telegram.ui.Components.y4(ntVar, 350L, wqVar);
        e10 e10Var = new e10();
        this.f9589c = e10Var;
        e10Var.f33127a = true;
        e10Var.f33128b = true;
        b(false);
        e10Var.f33129c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        e10Var.f33129c.setStyle(Paint.Style.STROKE);
        e10Var.f33129c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.f9594j;
        int i10 = org.telegram.ui.ActionBar.t6.f28531b;
        org.telegram.ui.Components.y4 y4Var = this.f9592g;
        org.telegram.ui.Components.y4 y4Var2 = this.f9591f;
        if (i7 != i10) {
            this.f9594j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vk, false);
                    n10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wk, false);
                } else {
                    fp fpVar = this.f9593i;
                    if (fpVar != null) {
                        m10 = fpVar.m(org.telegram.ui.ActionBar.m6.I.q());
                        n10 = this.f9593i.n(org.telegram.ui.ActionBar.m6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.f9590e) {
                    this.d = m10;
                    this.f9590e = n10;
                    y4Var2.a(m10, true);
                    y4Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = y4Var2.a(this.d, false);
        int a11 = y4Var.a(this.f9590e, false);
        e10 e10Var = this.f9589c;
        e10Var.d(a10, a11, 0, 0);
        e10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return e10Var.f33129c;
    }

    public final void b(boolean z9) {
        this.h = true;
        this.f9593i = null;
        this.f9594j = org.telegram.ui.ActionBar.t6.f28531b;
        d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wk, false), z9);
    }

    public final void c(fp fpVar, boolean z9) {
        this.f9593i = fpVar;
        this.f9594j = org.telegram.ui.ActionBar.t6.f28531b;
        if (fpVar != null) {
            this.h = false;
            d(fpVar.m(org.telegram.ui.ActionBar.m6.I.q()), fpVar.n(org.telegram.ui.ActionBar.m6.I.q()), z9);
            return;
        }
        b(z9);
    }

    public final void d(int i7, int i10, boolean z9) {
        this.d = i7;
        this.f9590e = i10;
        if (!z9) {
            this.f9591f.a(i7, true);
            this.f9592g.a(i10, true);
        }
        nt ntVar = this.f9588b;
        if (ntVar != null) {
            ntVar.run();
        }
    }
}
