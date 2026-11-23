package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
public final class t8 {
    public final org.telegram.ui.ActionBar.g2 f9802a;
    public final long f9803b;
    public final org.telegram.ui.Components.gc f9804c;
    public final org.telegram.ui.Components.ac d;
    public final org.telegram.ui.Components.ec f9805e;
    public final x8 f9806f;
    public int f9807g;
    public long h;
    public ai.n2 f9808i;
    public final ArrayList f9809j = new ArrayList();
    public final HashSet f9810k = new HashSet();
    public final long f9811l = System.currentTimeMillis();
    public boolean f9812m = true;
    public boolean f9813n;
    public boolean f9814o;
    public final s8 f9815p;

    public t8(org.telegram.ui.ActionBar.g2 g2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final t8 f9719b;

            {
                this.f9719b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9719b.a();
                        return;
                    default:
                        t8 t8Var = this.f9719b;
                        if (!t8Var.f9813n && !t8Var.f9814o && t8Var.f9812m) {
                            t8Var.f9813n = true;
                            ai.n2 n2Var = t8Var.f9808i;
                            if (n2Var != null) {
                                n2Var.a(t8Var.f9810k);
                            }
                            if (t8Var.f9805e != null) {
                                t8Var.f9804c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f9815p = r22;
        this.f9802a = g2Var;
        this.f9803b = j3;
        Context t6 = y8.t(g2Var);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, g2Var.getResourceProvider());
        this.d = acVar;
        acVar.c(2131624227, new String[0]);
        ?? zbVar = new org.telegram.ui.Components.zb(t6, g2Var.getResourceProvider());
        this.f9806f = zbVar;
        zbVar.f42723b = 3000L;
        int i7 = org.telegram.ui.ActionBar.m6.xj;
        org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.t6.P(i7, -1, 0, 0.0f, resourceProvider);
        vVar2.d(P, zbVar);
        org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, zbVar);
        w10.c(i7, -1, 0, 0.0f, resourceProvider);
        w10.f29793n = vVar;
        w10.f29794o = vVar2;
        w10.f29792m = false;
        w10.f29787g = P;
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, g2Var.getResourceProvider(), true, false);
        this.f9805e = ecVar;
        ecVar.e(hd.N0(2131744782, null));
        ecVar.f34715b = new Runnable(this) {
            public final t8 f9719b;

            {
                this.f9719b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9719b.a();
                        return;
                    default:
                        t8 t8Var = this.f9719b;
                        if (!t8Var.f9813n && !t8Var.f9814o && t8Var.f9812m) {
                            t8Var.f9813n = true;
                            ai.n2 n2Var = t8Var.f9808i;
                            if (n2Var != null) {
                                n2Var.a(t8Var.f9810k);
                            }
                            if (t8Var.f9805e != null) {
                                t8Var.f9804c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ecVar.addView((View) zbVar, c8.na.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.f34717e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(g2Var).b(acVar, -1);
        this.f9804c = b10;
        b10.f35497r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final t8 f9719b;

            {
                this.f9719b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9719b.a();
                        return;
                    default:
                        t8 t8Var = this.f9719b;
                        if (!t8Var.f9813n && !t8Var.f9814o && t8Var.f9812m) {
                            t8Var.f9813n = true;
                            ai.n2 n2Var = t8Var.f9808i;
                            if (n2Var != null) {
                                n2Var.a(t8Var.f9810k);
                            }
                            if (t8Var.f9805e != null) {
                                t8Var.f9804c.b();
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
        if (!this.f9813n && !this.f9814o) {
            this.f9814o = true;
            ArrayList arrayList = this.f9809j;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((Runnable) obj).run();
            }
            if (this.f9805e != null) {
                this.f9804c.b();
            }
        }
    }
}
