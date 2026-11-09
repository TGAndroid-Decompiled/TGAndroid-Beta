package di;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.fp;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.xq;
public final class q7 {
    public final int f9582a;
    public final ot f9583b;
    public final f10 f9584c;
    public int d;
    public int f9585e;
    public final org.telegram.ui.Components.z4 f9586f;
    public final org.telegram.ui.Components.z4 f9587g;
    public boolean h;
    public fp f9588i;
    public int f9589j;

    public q7(View view) {
        ot otVar = new ot(1, view);
        this.f9582a = p10.f24470s0;
        this.f9583b = otVar;
        xq xqVar = xq.h;
        this.f9586f = new org.telegram.ui.Components.z4(otVar, 350L, xqVar);
        this.f9587g = new org.telegram.ui.Components.z4(otVar, 350L, xqVar);
        f10 f10Var = new f10();
        this.f9584c = f10Var;
        f10Var.f33547a = true;
        f10Var.f33548b = true;
        b(false);
        f10Var.f33549c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        f10Var.f33549c.setStyle(Paint.Style.STROKE);
        f10Var.f33549c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.f9589j;
        int i10 = org.telegram.ui.ActionBar.s6.f28501b;
        org.telegram.ui.Components.z4 z4Var = this.f9587g;
        org.telegram.ui.Components.z4 z4Var2 = this.f9586f;
        if (i7 != i10) {
            this.f9589j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Vk, false);
                    n10 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Wk, false);
                } else {
                    fp fpVar = this.f9588i;
                    if (fpVar != null) {
                        m10 = fpVar.m(org.telegram.ui.ActionBar.l6.I.q());
                        n10 = this.f9588i.n(org.telegram.ui.ActionBar.l6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.f9585e) {
                    this.d = m10;
                    this.f9585e = n10;
                    z4Var2.a(m10, true);
                    z4Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = z4Var2.a(this.d, false);
        int a11 = z4Var.a(this.f9585e, false);
        f10 f10Var = this.f9584c;
        f10Var.d(a10, a11, 0, 0);
        f10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return f10Var.f33549c;
    }

    public final void b(boolean z9) {
        this.h = true;
        this.f9588i = null;
        this.f9589j = org.telegram.ui.ActionBar.s6.f28501b;
        d(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Vk, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Wk, false), z9);
    }

    public final void c(fp fpVar, boolean z9) {
        this.f9588i = fpVar;
        this.f9589j = org.telegram.ui.ActionBar.s6.f28501b;
        if (fpVar != null) {
            this.h = false;
            d(fpVar.m(org.telegram.ui.ActionBar.l6.I.q()), fpVar.n(org.telegram.ui.ActionBar.l6.I.q()), z9);
            return;
        }
        b(z9);
    }

    public final void d(int i7, int i10, boolean z9) {
        this.d = i7;
        this.f9585e = i10;
        if (!z9) {
            this.f9586f.a(i7, true);
            this.f9587g.a(i10, true);
        }
        ot otVar = this.f9583b;
        if (otVar != null) {
            otVar.run();
        }
    }
}
