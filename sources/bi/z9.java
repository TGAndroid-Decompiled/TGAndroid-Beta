package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class z9 {
    public final org.telegram.ui.ActionBar.f2 f5174a;
    public final long f5175b;
    public final org.telegram.ui.Components.bc f5176c;
    public final org.telegram.ui.Components.vb d;
    public final org.telegram.ui.Components.zb f5177e;
    public final da f5178f;
    public int f5179g;
    public long h;
    public b9 f5180i;
    public final ArrayList f5181j = new ArrayList();
    public final HashSet f5182k = new HashSet();
    public final long f5183l = System.currentTimeMillis();
    public boolean f5184m = true;
    public boolean f5185n;
    public boolean f5186o;
    public final y9 f5187p;

    public z9(org.telegram.ui.ActionBar.f2 f2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final z9 f5091b;

            {
                this.f5091b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5091b.a();
                        return;
                    default:
                        z9 z9Var = this.f5091b;
                        if (!z9Var.f5185n && !z9Var.f5186o && z9Var.f5184m) {
                            z9Var.f5185n = true;
                            b9 b9Var = z9Var.f5180i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.f5182k);
                            }
                            if (z9Var.f5177e != null) {
                                z9Var.f5176c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f5187p = r22;
        this.f5174a = f2Var;
        this.f5175b = j3;
        Context t6 = ea.t(f2Var);
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(t6, f2Var.getResourceProvider());
        this.d = vbVar;
        vbVar.c(2131624226, new String[0]);
        ?? ubVar = new org.telegram.ui.Components.ub(t6, f2Var.getResourceProvider());
        this.f5178f = ubVar;
        ubVar.f38609b = 3000L;
        int i7 = org.telegram.ui.ActionBar.m6.uj;
        org.telegram.ui.ActionBar.h6 resourceProvider = f2Var.getResourceProvider();
        a3.l lVar = new a3.l(24);
        a3.l lVar2 = new a3.l(25);
        int P = org.telegram.ui.ActionBar.t6.P(i7, -1, 0, 0.0f, resourceProvider);
        lVar2.c(P, ubVar);
        org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, ubVar);
        w10.c(i7, -1, 0, 0.0f, resourceProvider);
        w10.f28335n = lVar;
        w10.f28336o = lVar2;
        w10.f28334m = false;
        w10.f28329g = P;
        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(t6, f2Var.getResourceProvider(), true, false);
        this.f5177e = zbVar;
        zbVar.e(org.telegram.messenger.id.M0(2131745023, null));
        zbVar.f40908b = new Runnable(this) {
            public final z9 f5091b;

            {
                this.f5091b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5091b.a();
                        return;
                    default:
                        z9 z9Var = this.f5091b;
                        if (!z9Var.f5185n && !z9Var.f5186o && z9Var.f5184m) {
                            z9Var.f5185n = true;
                            b9 b9Var = z9Var.f5180i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.f5182k);
                            }
                            if (z9Var.f5177e != null) {
                                z9Var.f5176c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        zbVar.addView((View) ubVar, c8.ha.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        zbVar.f40910e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        vbVar.setButton(zbVar);
        org.telegram.ui.Components.bc b10 = org.telegram.ui.Components.gc.a0(f2Var).b(vbVar, -1);
        this.f5176c = b10;
        b10.f32211r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final z9 f5091b;

            {
                this.f5091b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5091b.a();
                        return;
                    default:
                        z9 z9Var = this.f5091b;
                        if (!z9Var.f5185n && !z9Var.f5186o && z9Var.f5184m) {
                            z9Var.f5185n = true;
                            b9 b9Var = z9Var.f5180i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.f5182k);
                            }
                            if (z9Var.f5177e != null) {
                                z9Var.f5176c.b();
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
        if (!this.f5185n && !this.f5186o) {
            this.f5186o = true;
            ArrayList arrayList = this.f5181j;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((Runnable) obj).run();
            }
            if (this.f5177e != null) {
                this.f5176c.b();
            }
        }
    }
}
