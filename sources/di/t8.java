package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
public final class t8 {
    public final org.telegram.ui.ActionBar.g2 f9840a;
    public final long f9841b;
    public final org.telegram.ui.Components.gc f9842c;
    public final org.telegram.ui.Components.ac d;
    public final org.telegram.ui.Components.ec f9843e;
    public final x8 f9844f;
    public int f9845g;
    public long h;
    public ai.x2 f9846i;
    public final ArrayList f9847j = new ArrayList();
    public final HashSet f9848k = new HashSet();
    public final long f9849l = System.currentTimeMillis();
    public boolean f9850m = true;
    public boolean f9851n;
    public boolean f9852o;
    public final s8 f9853p;

    public t8(org.telegram.ui.ActionBar.g2 g2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final t8 f9756b;

            {
                this.f9756b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9756b.a();
                        return;
                    default:
                        t8 t8Var = this.f9756b;
                        if (!t8Var.f9851n && !t8Var.f9852o && t8Var.f9850m) {
                            t8Var.f9851n = true;
                            ai.x2 x2Var = t8Var.f9846i;
                            if (x2Var != null) {
                                x2Var.a(t8Var.f9848k);
                            }
                            if (t8Var.f9843e != null) {
                                t8Var.f9842c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f9853p = r22;
        this.f9840a = g2Var;
        this.f9841b = j3;
        Context t6 = y8.t(g2Var);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, g2Var.getResourceProvider());
        this.d = acVar;
        acVar.c(2131624227, new String[0]);
        ?? zbVar = new org.telegram.ui.Components.zb(t6, g2Var.getResourceProvider());
        this.f9844f = zbVar;
        zbVar.f42765b = 3000L;
        int i7 = org.telegram.ui.ActionBar.m6.xj;
        org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.t6.P(i7, -1, 0, 0.0f, resourceProvider);
        vVar2.d(P, zbVar);
        org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, zbVar);
        w10.c(i7, -1, 0, 0.0f, resourceProvider);
        w10.f29827n = vVar;
        w10.f29828o = vVar2;
        w10.f29826m = false;
        w10.f29821g = P;
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, g2Var.getResourceProvider(), true, false);
        this.f9843e = ecVar;
        ecVar.e(hd.N0(2131744780, null));
        ecVar.f34725b = new Runnable(this) {
            public final t8 f9756b;

            {
                this.f9756b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9756b.a();
                        return;
                    default:
                        t8 t8Var = this.f9756b;
                        if (!t8Var.f9851n && !t8Var.f9852o && t8Var.f9850m) {
                            t8Var.f9851n = true;
                            ai.x2 x2Var = t8Var.f9846i;
                            if (x2Var != null) {
                                x2Var.a(t8Var.f9848k);
                            }
                            if (t8Var.f9843e != null) {
                                t8Var.f9842c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ecVar.addView((View) zbVar, c8.ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.f34727e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(g2Var).b(acVar, -1);
        this.f9842c = b10;
        b10.f35535r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final t8 f9756b;

            {
                this.f9756b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9756b.a();
                        return;
                    default:
                        t8 t8Var = this.f9756b;
                        if (!t8Var.f9851n && !t8Var.f9852o && t8Var.f9850m) {
                            t8Var.f9851n = true;
                            ai.x2 x2Var = t8Var.f9846i;
                            if (x2Var != null) {
                                x2Var.a(t8Var.f9848k);
                            }
                            if (t8Var.f9843e != null) {
                                t8Var.f9842c.b();
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
        if (!this.f9851n && !this.f9852o) {
            this.f9852o = true;
            ArrayList arrayList = this.f9847j;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((Runnable) obj).run();
            }
            if (this.f9843e != null) {
                this.f9842c.b();
            }
        }
    }
}
