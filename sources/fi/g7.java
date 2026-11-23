package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.bp;
import org.telegram.messenger.i10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.zt;
public final class g7 {
    public final int f12025a;
    public final zt f12026b;
    public final q10 f12027c;
    public int d;
    public int f12028e;
    public final org.telegram.ui.Components.f5 f12029f;
    public final org.telegram.ui.Components.f5 f12030g;
    public boolean h;
    public bp f12031i;
    public int f12032j;

    public g7(View view) {
        zt ztVar = new zt(1, view);
        this.f12025a = i10.f24637t0;
        this.f12026b = ztVar;
        kr krVar = kr.h;
        this.f12029f = new org.telegram.ui.Components.f5(ztVar, 350L, krVar);
        this.f12030g = new org.telegram.ui.Components.f5(ztVar, 350L, krVar);
        q10 q10Var = new q10();
        this.f12027c = q10Var;
        q10Var.f38659a = true;
        q10Var.f38660b = true;
        b(false);
        q10Var.f38661c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        q10Var.f38661c.setStyle(Paint.Style.STROKE);
        q10Var.f38661c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.f12032j;
        int i10 = org.telegram.ui.ActionBar.u6.f30164b;
        org.telegram.ui.Components.f5 f5Var = this.f12030g;
        org.telegram.ui.Components.f5 f5Var2 = this.f12029f;
        if (i7 != i10) {
            this.f12032j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yk, false);
                    n10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zk, false);
                } else {
                    bp bpVar = this.f12031i;
                    if (bpVar != null) {
                        m10 = bpVar.m(org.telegram.ui.ActionBar.n6.I.q());
                        n10 = this.f12031i.n(org.telegram.ui.ActionBar.n6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.f12028e) {
                    this.d = m10;
                    this.f12028e = n10;
                    f5Var2.a(m10, true);
                    f5Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = f5Var2.a(this.d, false);
        int a11 = f5Var.a(this.f12028e, false);
        q10 q10Var = this.f12027c;
        q10Var.d(a10, a11, 0, 0);
        q10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return q10Var.f38661c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.f12031i = null;
        this.f12032j = org.telegram.ui.ActionBar.u6.f30164b;
        d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yk, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zk, false), z10);
    }

    public final void c(bp bpVar, boolean z10) {
        this.f12031i = bpVar;
        this.f12032j = org.telegram.ui.ActionBar.u6.f30164b;
        if (bpVar != null) {
            this.h = false;
            d(bpVar.m(org.telegram.ui.ActionBar.n6.I.q()), bpVar.n(org.telegram.ui.ActionBar.n6.I.q()), z10);
            return;
        }
        b(z10);
    }

    public final void d(int i7, int i10, boolean z10) {
        this.d = i7;
        this.f12028e = i10;
        if (!z10) {
            this.f12029f.a(i7, true);
            this.f12030g.a(i10, true);
        }
        zt ztVar = this.f12026b;
        if (ztVar != null) {
            ztVar.run();
        }
    }
}
