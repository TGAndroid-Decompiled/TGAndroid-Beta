package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class z9 {
    public final org.telegram.ui.ActionBar.f2 f5169a;
    public final long f5170b;
    public final org.telegram.ui.Components.cc f5171c;
    public final org.telegram.ui.Components.wb d;
    public final org.telegram.ui.Components.ac f5172e;
    public final da f5173f;
    public int f5174g;
    public long h;
    public b9 f5175i;
    public final ArrayList f5176j = new ArrayList();
    public final HashSet f5177k = new HashSet();
    public final long f5178l = System.currentTimeMillis();
    public boolean f5179m = true;
    public boolean f5180n;
    public boolean f5181o;
    public final y9 f5182p;

    public z9(org.telegram.ui.ActionBar.f2 f2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final z9 f5086b;

            {
                this.f5086b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5086b.a();
                        return;
                    default:
                        z9 z9Var = this.f5086b;
                        if (!z9Var.f5180n && !z9Var.f5181o && z9Var.f5179m) {
                            z9Var.f5180n = true;
                            b9 b9Var = z9Var.f5175i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.f5177k);
                            }
                            if (z9Var.f5172e != null) {
                                z9Var.f5171c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f5182p = r22;
        this.f5169a = f2Var;
        this.f5170b = j3;
        Context t6 = ea.t(f2Var);
        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(t6, f2Var.getResourceProvider());
        this.d = wbVar;
        wbVar.c(2131624226, new String[0]);
        ?? vbVar = new org.telegram.ui.Components.vb(t6, f2Var.getResourceProvider());
        this.f5173f = vbVar;
        vbVar.f39024b = 3000L;
        int i7 = org.telegram.ui.ActionBar.l6.uj;
        org.telegram.ui.ActionBar.g6 resourceProvider = f2Var.getResourceProvider();
        a3.l lVar = new a3.l(24);
        a3.l lVar2 = new a3.l(25);
        int P = org.telegram.ui.ActionBar.s6.P(i7, -1, 0, 0.0f, resourceProvider);
        lVar2.c(P, vbVar);
        org.telegram.ui.ActionBar.m6 w10 = org.telegram.ui.ActionBar.s6.w(101, vbVar);
        w10.c(i7, -1, 0, 0.0f, resourceProvider);
        w10.f28312n = lVar;
        w10.f28313o = lVar2;
        w10.f28311m = false;
        w10.f28306g = P;
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, f2Var.getResourceProvider(), true, false);
        this.f5172e = acVar;
        acVar.e(org.telegram.messenger.id.M0(2131745023, null));
        acVar.f31766b = new Runnable(this) {
            public final z9 f5086b;

            {
                this.f5086b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5086b.a();
                        return;
                    default:
                        z9 z9Var = this.f5086b;
                        if (!z9Var.f5180n && !z9Var.f5181o && z9Var.f5179m) {
                            z9Var.f5180n = true;
                            b9 b9Var = z9Var.f5175i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.f5177k);
                            }
                            if (z9Var.f5172e != null) {
                                z9Var.f5171c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        acVar.addView((View) vbVar, c8.ha.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        acVar.f31768e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        wbVar.setButton(acVar);
        org.telegram.ui.Components.cc b10 = org.telegram.ui.Components.hc.a0(f2Var).b(wbVar, -1);
        this.f5171c = b10;
        b10.f32635r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final z9 f5086b;

            {
                this.f5086b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5086b.a();
                        return;
                    default:
                        z9 z9Var = this.f5086b;
                        if (!z9Var.f5180n && !z9Var.f5181o && z9Var.f5179m) {
                            z9Var.f5180n = true;
                            b9 b9Var = z9Var.f5175i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.f5177k);
                            }
                            if (z9Var.f5172e != null) {
                                z9Var.f5171c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        org.telegram.messenger.g0.r(r22);
        org.telegram.messenger.g0.i3(r22, 3000L);
    }

    public final void a() {
        if (!this.f5180n && !this.f5181o) {
            this.f5181o = true;
            ArrayList arrayList = this.f5176j;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((Runnable) obj).run();
            }
            if (this.f5172e != null) {
                this.f5171c.b();
            }
        }
    }
}
