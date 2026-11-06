package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class z9 {
    public final org.telegram.ui.ActionBar.f2 f5171a;
    public final long f5172b;
    public final org.telegram.ui.Components.cc f5173c;
    public final org.telegram.ui.Components.wb d;
    public final org.telegram.ui.Components.ac f5174e;
    public final da f5175f;
    public int f5176g;
    public long h;
    public b9 f5177i;
    public final ArrayList f5178j = new ArrayList();
    public final HashSet f5179k = new HashSet();
    public final long f5180l = System.currentTimeMillis();
    public boolean f5181m = true;
    public boolean f5182n;
    public boolean f5183o;
    public final y9 f5184p;

    public z9(org.telegram.ui.ActionBar.f2 f2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final z9 f5088b;

            {
                this.f5088b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5088b.a();
                        return;
                    default:
                        z9 z9Var = this.f5088b;
                        if (!z9Var.f5182n && !z9Var.f5183o && z9Var.f5181m) {
                            z9Var.f5182n = true;
                            b9 b9Var = z9Var.f5177i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.f5179k);
                            }
                            if (z9Var.f5174e != null) {
                                z9Var.f5173c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f5184p = r22;
        this.f5171a = f2Var;
        this.f5172b = j3;
        Context t6 = ea.t(f2Var);
        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(t6, f2Var.getResourceProvider());
        this.d = wbVar;
        wbVar.c(2131624226, new String[0]);
        ?? vbVar = new org.telegram.ui.Components.vb(t6, f2Var.getResourceProvider());
        this.f5175f = vbVar;
        vbVar.f38910b = 3000L;
        int i7 = org.telegram.ui.ActionBar.k6.uj;
        org.telegram.ui.ActionBar.f6 resourceProvider = f2Var.getResourceProvider();
        a3.l lVar = new a3.l(24);
        a3.l lVar2 = new a3.l(25);
        int Q = org.telegram.ui.ActionBar.r6.Q(i7, -1, 0, 0.0f, resourceProvider);
        lVar2.c(Q, vbVar);
        org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(101, vbVar);
        x10.c(i7, -1, 0, 0.0f, resourceProvider);
        x10.f28291n = lVar;
        x10.f28292o = lVar2;
        x10.f28290m = false;
        x10.f28285g = Q;
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, f2Var.getResourceProvider(), true, false);
        this.f5174e = acVar;
        acVar.e(org.telegram.messenger.hd.M0(2131745024, null));
        acVar.f31760b = new Runnable(this) {
            public final z9 f5088b;

            {
                this.f5088b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5088b.a();
                        return;
                    default:
                        z9 z9Var = this.f5088b;
                        if (!z9Var.f5182n && !z9Var.f5183o && z9Var.f5181m) {
                            z9Var.f5182n = true;
                            b9 b9Var = z9Var.f5177i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.f5179k);
                            }
                            if (z9Var.f5174e != null) {
                                z9Var.f5173c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        acVar.addView((View) vbVar, c8.ha.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        acVar.f31762e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        wbVar.setButton(acVar);
        org.telegram.ui.Components.cc b10 = org.telegram.ui.Components.hc.a0(f2Var).b(wbVar, -1);
        this.f5173c = b10;
        b10.f32535r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final z9 f5088b;

            {
                this.f5088b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5088b.a();
                        return;
                    default:
                        z9 z9Var = this.f5088b;
                        if (!z9Var.f5182n && !z9Var.f5183o && z9Var.f5181m) {
                            z9Var.f5182n = true;
                            b9 b9Var = z9Var.f5177i;
                            if (b9Var != null) {
                                b9Var.a(z9Var.f5179k);
                            }
                            if (z9Var.f5174e != null) {
                                z9Var.f5173c.b();
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
        if (!this.f5182n && !this.f5183o) {
            this.f5183o = true;
            ArrayList arrayList = this.f5178j;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((Runnable) obj).run();
            }
            if (this.f5174e != null) {
                this.f5173c.b();
            }
        }
    }
}
