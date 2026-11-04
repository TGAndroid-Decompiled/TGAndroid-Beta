package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.h10;
import org.telegram.messenger.wo;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.xq;
public final class q7 {
    public final int f10811a;
    public final nt f10812b;
    public final b10 f10813c;
    public int d;
    public int f10814e;
    public final org.telegram.ui.Components.x4 f10815f;
    public final org.telegram.ui.Components.x4 f10816g;
    public boolean h;
    public wo f10817i;
    public int f10818j;

    public q7(View view) {
        nt ntVar = new nt(1, view);
        this.f10811a = h10.f22829t0;
        this.f10812b = ntVar;
        xq xqVar = xq.h;
        this.f10815f = new org.telegram.ui.Components.x4(ntVar, 350L, xqVar);
        this.f10816g = new org.telegram.ui.Components.x4(ntVar, 350L, xqVar);
        b10 b10Var = new b10();
        this.f10813c = b10Var;
        b10Var.f32036a = true;
        b10Var.f32037b = true;
        b(false);
        b10Var.f32038c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        b10Var.f32038c.setStyle(Paint.Style.STROKE);
        b10Var.f32038c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n4;
        int i3 = this.f10818j;
        int i10 = org.telegram.ui.ActionBar.r6.f28515b;
        org.telegram.ui.Components.x4 x4Var = this.f10816g;
        org.telegram.ui.Components.x4 x4Var2 = this.f10815f;
        if (i3 != i10) {
            this.f10818j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false);
                    n4 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false);
                } else {
                    wo woVar = this.f10817i;
                    if (woVar != null) {
                        m10 = woVar.m(org.telegram.ui.ActionBar.k6.I.q());
                        n4 = this.f10817i.n(org.telegram.ui.ActionBar.k6.I.q());
                    }
                }
                if (m10 != this.d || n4 != this.f10814e) {
                    this.d = m10;
                    this.f10814e = n4;
                    x4Var2.a(m10, true);
                    x4Var.a(n4, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = x4Var2.a(this.d, false);
        int a11 = x4Var.a(this.f10814e, false);
        b10 b10Var = this.f10813c;
        b10Var.d(a10, a11, 0, 0);
        b10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return b10Var.f32038c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.f10817i = null;
        this.f10818j = org.telegram.ui.ActionBar.r6.f28515b;
        d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false), z10);
    }

    public final void c(wo woVar, boolean z10) {
        this.f10817i = woVar;
        this.f10818j = org.telegram.ui.ActionBar.r6.f28515b;
        if (woVar != null) {
            this.h = false;
            d(woVar.m(org.telegram.ui.ActionBar.k6.I.q()), woVar.n(org.telegram.ui.ActionBar.k6.I.q()), z10);
            return;
        }
        b(z10);
    }

    public final void d(int i3, int i10, boolean z10) {
        this.d = i3;
        this.f10814e = i10;
        if (!z10) {
            this.f10815f.a(i3, true);
            this.f10816g.a(i10, true);
        }
        nt ntVar = this.f10812b;
        if (ntVar != null) {
            ntVar.run();
        }
    }
}
