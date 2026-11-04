package ci;

import android.content.Context;
import android.view.View;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
public final class z8 {
    public final org.telegram.ui.ActionBar.d2 f6468a;
    public final long f6469b;
    public final org.telegram.ui.Components.ac f6470c;
    public final org.telegram.ui.Components.ub d;
    public final org.telegram.ui.Components.yb f6471e;
    public final d9 f6472f;
    public int f6473g;
    public long h;
    public b8 f6474i;
    public final ArrayList f6475j = new ArrayList();
    public final HashSet f6476k = new HashSet();
    public final long f6477l = System.currentTimeMillis();
    public boolean f6478m = true;
    public boolean f6479n;
    public boolean f6480o;
    public final y8 f6481p;

    public z8(org.telegram.ui.ActionBar.d2 d2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final z8 f6412b;

            {
                this.f6412b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f6412b.a();
                        return;
                    default:
                        z8 z8Var = this.f6412b;
                        if (!z8Var.f6479n && !z8Var.f6480o && z8Var.f6478m) {
                            z8Var.f6479n = true;
                            b8 b8Var = z8Var.f6474i;
                            if (b8Var != null) {
                                b8Var.a(z8Var.f6476k);
                            }
                            if (z8Var.f6471e != null) {
                                z8Var.f6470c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f6481p = r22;
        this.f6468a = d2Var;
        this.f6469b = j10;
        Context t10 = e9.t(d2Var);
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(t10, d2Var.getResourceProvider());
        this.d = ubVar;
        ubVar.c(2131624226, new String[0]);
        ?? tbVar = new org.telegram.ui.Components.tb(t10, d2Var.getResourceProvider());
        this.f6472f = tbVar;
        tbVar.f38376b = 3000L;
        int i3 = org.telegram.ui.ActionBar.k6.uj;
        org.telegram.ui.ActionBar.e6 resourceProvider = d2Var.getResourceProvider();
        a3.j jVar = new a3.j(20);
        a3.j jVar2 = new a3.j(21);
        int Q = org.telegram.ui.ActionBar.r6.Q(i3, -1, 0, 0.0f, resourceProvider);
        jVar2.f(Q, tbVar);
        org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(101, tbVar);
        x10.c(i3, -1, 0, 0.0f, resourceProvider);
        x10.f28325n = jVar;
        x10.f28326o = jVar2;
        x10.f28324m = false;
        x10.f28319g = Q;
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(t10, d2Var.getResourceProvider(), true, false);
        this.f6471e = ybVar;
        ybVar.e(bd.M0(2131745033, null));
        ybVar.f40672b = new Runnable(this) {
            public final z8 f6412b;

            {
                this.f6412b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f6412b.a();
                        return;
                    default:
                        z8 z8Var = this.f6412b;
                        if (!z8Var.f6479n && !z8Var.f6480o && z8Var.f6478m) {
                            z8Var.f6479n = true;
                            b8 b8Var = z8Var.f6474i;
                            if (b8Var != null) {
                                b8Var.a(z8Var.f6476k);
                            }
                            if (z8Var.f6471e != null) {
                                z8Var.f6470c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ybVar.addView((View) tbVar, mf.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ybVar.f40674e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        ubVar.setButton(ybVar);
        org.telegram.ui.Components.ac b10 = org.telegram.ui.Components.fc.a0(d2Var).b(ubVar, -1);
        this.f6470c = b10;
        b10.f31800r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final z8 f6412b;

            {
                this.f6412b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f6412b.a();
                        return;
                    default:
                        z8 z8Var = this.f6412b;
                        if (!z8Var.f6479n && !z8Var.f6480o && z8Var.f6478m) {
                            z8Var.f6479n = true;
                            b8 b8Var = z8Var.f6474i;
                            if (b8Var != null) {
                                b8Var.a(z8Var.f6476k);
                            }
                            if (z8Var.f6471e != null) {
                                z8Var.f6470c.b();
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
        if (!this.f6479n && !this.f6480o) {
            this.f6480o = true;
            ArrayList arrayList = this.f6475j;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((Runnable) obj).run();
            }
            if (this.f6471e != null) {
                this.f6470c.b();
            }
        }
    }
}
