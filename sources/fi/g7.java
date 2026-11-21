package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.bp;
import org.telegram.messenger.j10;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.s10;
public final class g7 {
    public final int f12060a;
    public final bu f12061b;
    public final s10 f12062c;
    public int d;
    public int f12063e;
    public final org.telegram.ui.Components.g5 f12064f;
    public final org.telegram.ui.Components.g5 f12065g;
    public boolean h;
    public bp f12066i;
    public int f12067j;

    public g7(View view) {
        bu buVar = new bu(1, view);
        this.f12060a = j10.f24798t0;
        this.f12061b = buVar;
        nr nrVar = nr.h;
        this.f12064f = new org.telegram.ui.Components.g5(buVar, 350L, nrVar);
        this.f12065g = new org.telegram.ui.Components.g5(buVar, 350L, nrVar);
        s10 s10Var = new s10();
        this.f12062c = s10Var;
        s10Var.f39452a = true;
        s10Var.f39453b = true;
        b(false);
        s10Var.f39454c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        s10Var.f39454c.setStyle(Paint.Style.STROKE);
        s10Var.f39454c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.f12067j;
        int i10 = org.telegram.ui.ActionBar.t6.f30066b;
        org.telegram.ui.Components.g5 g5Var = this.f12065g;
        org.telegram.ui.Components.g5 g5Var2 = this.f12064f;
        if (i7 != i10) {
            this.f12067j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yk, false);
                    n10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zk, false);
                } else {
                    bp bpVar = this.f12066i;
                    if (bpVar != null) {
                        m10 = bpVar.m(org.telegram.ui.ActionBar.m6.I.q());
                        n10 = this.f12066i.n(org.telegram.ui.ActionBar.m6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.f12063e) {
                    this.d = m10;
                    this.f12063e = n10;
                    g5Var2.a(m10, true);
                    g5Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = g5Var2.a(this.d, false);
        int a11 = g5Var.a(this.f12063e, false);
        s10 s10Var = this.f12062c;
        s10Var.d(a10, a11, 0, 0);
        s10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return s10Var.f39454c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.f12066i = null;
        this.f12067j = org.telegram.ui.ActionBar.t6.f30066b;
        d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zk, false), z10);
    }

    public final void c(bp bpVar, boolean z10) {
        this.f12066i = bpVar;
        this.f12067j = org.telegram.ui.ActionBar.t6.f30066b;
        if (bpVar != null) {
            this.h = false;
            d(bpVar.m(org.telegram.ui.ActionBar.m6.I.q()), bpVar.n(org.telegram.ui.ActionBar.m6.I.q()), z10);
            return;
        }
        b(z10);
    }

    public final void d(int i7, int i10, boolean z10) {
        this.d = i7;
        this.f12063e = i10;
        if (!z10) {
            this.f12064f.a(i7, true);
            this.f12065g.a(i10, true);
        }
        bu buVar = this.f12061b;
        if (buVar != null) {
            buVar.run();
        }
    }
}
