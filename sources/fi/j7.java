package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.cp;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.ut;
public final class j7 {
    public final int f11904a;
    public final ut f11905b;
    public final i10 f11906c;
    public int d;
    public int f11907e;
    public final org.telegram.ui.Components.x4 f11908f;
    public final org.telegram.ui.Components.x4 f11909g;
    public boolean h;
    public cp f11910i;
    public int f11911j;

    public j7(View view) {
        ut utVar = new ut(1, view);
        this.f11904a = m10.f24940t0;
        this.f11905b = utVar;
        er erVar = er.h;
        this.f11908f = new org.telegram.ui.Components.x4(utVar, 350L, erVar);
        this.f11909g = new org.telegram.ui.Components.x4(utVar, 350L, erVar);
        i10 i10Var = new i10();
        this.f11906c = i10Var;
        i10Var.f35406a = true;
        i10Var.f35407b = true;
        b(false);
        i10Var.f35408c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        i10Var.f35408c.setStyle(Paint.Style.STROKE);
        i10Var.f35408c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i7 = this.f11911j;
        int i10 = org.telegram.ui.ActionBar.q6.f29535b;
        org.telegram.ui.Components.x4 x4Var = this.f11909g;
        org.telegram.ui.Components.x4 x4Var2 = this.f11908f;
        if (i7 != i10) {
            this.f11911j = i10;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yk, false);
                    n10 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Zk, false);
                } else {
                    cp cpVar = this.f11910i;
                    if (cpVar != null) {
                        m10 = cpVar.m(org.telegram.ui.ActionBar.j6.I.q());
                        n10 = this.f11910i.n(org.telegram.ui.ActionBar.j6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.f11907e) {
                    this.d = m10;
                    this.f11907e = n10;
                    x4Var2.a(m10, true);
                    x4Var.a(n10, true);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int a10 = x4Var2.a(this.d, false);
        int a11 = x4Var.a(this.f11907e, false);
        i10 i10Var = this.f11906c;
        i10Var.d(a10, a11, 0, 0);
        i10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return i10Var.f35408c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.f11910i = null;
        this.f11911j = org.telegram.ui.ActionBar.q6.f29535b;
        d(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yk, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Zk, false), z10);
    }

    public final void c(cp cpVar, boolean z10) {
        this.f11910i = cpVar;
        this.f11911j = org.telegram.ui.ActionBar.q6.f29535b;
        if (cpVar != null) {
            this.h = false;
            d(cpVar.m(org.telegram.ui.ActionBar.j6.I.q()), cpVar.n(org.telegram.ui.ActionBar.j6.I.q()), z10);
            return;
        }
        b(z10);
    }

    public final void d(int i7, int i10, boolean z10) {
        this.d = i7;
        this.f11907e = i10;
        if (!z10) {
            this.f11908f.a(i7, true);
            this.f11909g.a(i10, true);
        }
        ut utVar = this.f11905b;
        if (utVar != null) {
            utVar.run();
        }
    }
}
