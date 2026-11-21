package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
public final class t8 {
    public final org.telegram.ui.ActionBar.g2 f9837a;
    public final long f9838b;
    public final org.telegram.ui.Components.gc f9839c;
    public final org.telegram.ui.Components.ac d;
    public final org.telegram.ui.Components.ec f9840e;
    public final x8 f9841f;
    public int f9842g;
    public long h;
    public ai.w2 f9843i;
    public final ArrayList f9844j = new ArrayList();
    public final HashSet f9845k = new HashSet();
    public final long f9846l = System.currentTimeMillis();
    public boolean f9847m = true;
    public boolean f9848n;
    public boolean f9849o;
    public final s8 f9850p;

    public t8(org.telegram.ui.ActionBar.g2 g2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final t8 f9753b;

            {
                this.f9753b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9753b.a();
                        return;
                    default:
                        t8 t8Var = this.f9753b;
                        if (!t8Var.f9848n && !t8Var.f9849o && t8Var.f9847m) {
                            t8Var.f9848n = true;
                            ai.w2 w2Var = t8Var.f9843i;
                            if (w2Var != null) {
                                w2Var.a(t8Var.f9845k);
                            }
                            if (t8Var.f9840e != null) {
                                t8Var.f9839c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f9850p = r22;
        this.f9837a = g2Var;
        this.f9838b = j3;
        Context t6 = y8.t(g2Var);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, g2Var.getResourceProvider());
        this.d = acVar;
        acVar.c(2131624227, new String[0]);
        ?? zbVar = new org.telegram.ui.Components.zb(t6, g2Var.getResourceProvider());
        this.f9841f = zbVar;
        zbVar.f42762b = 3000L;
        int i7 = org.telegram.ui.ActionBar.m6.xj;
        org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.t6.P(i7, -1, 0, 0.0f, resourceProvider);
        vVar2.d(P, zbVar);
        org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, zbVar);
        w10.c(i7, -1, 0, 0.0f, resourceProvider);
        w10.f29824n = vVar;
        w10.f29825o = vVar2;
        w10.f29823m = false;
        w10.f29818g = P;
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, g2Var.getResourceProvider(), true, false);
        this.f9840e = ecVar;
        ecVar.e(gd.N0(2131744782, null));
        ecVar.f34727b = new Runnable(this) {
            public final t8 f9753b;

            {
                this.f9753b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9753b.a();
                        return;
                    default:
                        t8 t8Var = this.f9753b;
                        if (!t8Var.f9848n && !t8Var.f9849o && t8Var.f9847m) {
                            t8Var.f9848n = true;
                            ai.w2 w2Var = t8Var.f9843i;
                            if (w2Var != null) {
                                w2Var.a(t8Var.f9845k);
                            }
                            if (t8Var.f9840e != null) {
                                t8Var.f9839c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ecVar.addView((View) zbVar, c8.ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.f34729e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(g2Var).b(acVar, -1);
        this.f9839c = b10;
        b10.f35516r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final t8 f9753b;

            {
                this.f9753b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9753b.a();
                        return;
                    default:
                        t8 t8Var = this.f9753b;
                        if (!t8Var.f9848n && !t8Var.f9849o && t8Var.f9847m) {
                            t8Var.f9848n = true;
                            ai.w2 w2Var = t8Var.f9843i;
                            if (w2Var != null) {
                                w2Var.a(t8Var.f9845k);
                            }
                            if (t8Var.f9840e != null) {
                                t8Var.f9839c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        org.telegram.messenger.g0.r(r22);
        org.telegram.messenger.g0.h3(r22, 3000L);
    }

    public final void a() {
        if (!this.f9848n && !this.f9849o) {
            this.f9849o = true;
            ArrayList arrayList = this.f9844j;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((Runnable) obj).run();
            }
            if (this.f9840e != null) {
                this.f9839c.b();
            }
        }
    }
}
