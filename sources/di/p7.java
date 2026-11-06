package di;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.fp;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.xq;
public final class p7 {
    public final int f9517a;
    public final nt f9518b;
    public final e10 f9519c;
    public int d;
    public int f9520e;
    public final org.telegram.ui.Components.z4 f9521f;
    public final org.telegram.ui.Components.z4 f9522g;
    public boolean h;
    public fp f9523i;
    public int f9524j;

    public p7(View view) {
        nt ntVar = new nt(1, view);
        this.f9517a = p10.f24459s0;
        this.f9518b = ntVar;
        xq xqVar = xq.h;
        this.f9521f = new org.telegram.ui.Components.z4(ntVar, 350L, xqVar);
        this.f9522g = new org.telegram.ui.Components.z4(ntVar, 350L, xqVar);
        e10 e10Var = new e10();
        this.f9519c = e10Var;
        e10Var.f33084a = true;
        e10Var.f33085b = true;
        b(false);
        e10Var.f33086c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        e10Var.f33086c.setStyle(Paint.Style.STROKE);
        e10Var.f33086c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.f9524j;
        int i10 = org.telegram.ui.ActionBar.r6.f28475b;
        org.telegram.ui.Components.z4 z4Var = this.f9522g;
        org.telegram.ui.Components.z4 z4Var2 = this.f9521f;
        if (i7 != i10) {
            this.f9524j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false);
                    n10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false);
                } else {
                    fp fpVar = this.f9523i;
                    if (fpVar != null) {
                        m10 = fpVar.m(org.telegram.ui.ActionBar.k6.I.q());
                        n10 = this.f9523i.n(org.telegram.ui.ActionBar.k6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.f9520e) {
                    this.d = m10;
                    this.f9520e = n10;
                    z4Var2.a(m10, true);
                    z4Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = z4Var2.a(this.d, false);
        int a11 = z4Var.a(this.f9520e, false);
        e10 e10Var = this.f9519c;
        e10Var.d(a10, a11, 0, 0);
        e10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return e10Var.f33086c;
    }

    public final void b(boolean z9) {
        this.h = true;
        this.f9523i = null;
        this.f9524j = org.telegram.ui.ActionBar.r6.f28475b;
        d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false), z9);
    }

    public final void c(fp fpVar, boolean z9) {
        this.f9523i = fpVar;
        this.f9524j = org.telegram.ui.ActionBar.r6.f28475b;
        if (fpVar != null) {
            this.h = false;
            d(fpVar.m(org.telegram.ui.ActionBar.k6.I.q()), fpVar.n(org.telegram.ui.ActionBar.k6.I.q()), z9);
            return;
        }
        b(z9);
    }

    public final void d(int i7, int i10, boolean z9) {
        this.d = i7;
        this.f9520e = i10;
        if (!z9) {
            this.f9521f.a(i7, true);
            this.f9522g.a(i10, true);
        }
        nt ntVar = this.f9518b;
        if (ntVar != null) {
            ntVar.run();
        }
    }
}
