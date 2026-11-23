package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
public final class t8 {
    public final org.telegram.ui.ActionBar.g2 f9801a;
    public final long f9802b;
    public final org.telegram.ui.Components.fc f9803c;
    public final org.telegram.ui.Components.zb d;
    public final org.telegram.ui.Components.dc f9804e;
    public final x8 f9805f;
    public int f9806g;
    public long h;
    public ai.o2 f9807i;
    public final ArrayList f9808j = new ArrayList();
    public final HashSet f9809k = new HashSet();
    public final long f9810l = System.currentTimeMillis();
    public boolean f9811m = true;
    public boolean f9812n;
    public boolean f9813o;
    public final s8 f9814p;

    public t8(org.telegram.ui.ActionBar.g2 g2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final t8 f9717b;

            {
                this.f9717b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9717b.a();
                        return;
                    default:
                        t8 t8Var = this.f9717b;
                        if (!t8Var.f9812n && !t8Var.f9813o && t8Var.f9811m) {
                            t8Var.f9812n = true;
                            ai.o2 o2Var = t8Var.f9807i;
                            if (o2Var != null) {
                                o2Var.a(t8Var.f9809k);
                            }
                            if (t8Var.f9804e != null) {
                                t8Var.f9803c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f9814p = r22;
        this.f9801a = g2Var;
        this.f9802b = j3;
        Context t6 = y8.t(g2Var);
        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(t6, g2Var.getResourceProvider());
        this.d = zbVar;
        zbVar.f42810a.f(2131624227, 32, 32, null);
        ?? ybVar = new org.telegram.ui.Components.yb(t6, g2Var.getResourceProvider());
        this.f9805f = ybVar;
        ybVar.f42399b = 3000L;
        int i7 = org.telegram.ui.ActionBar.n6.xj;
        org.telegram.ui.ActionBar.i6 resourceProvider = g2Var.getResourceProvider();
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.u6.P(i7, -1, 0, 0.0f, resourceProvider);
        vVar2.g(P, ybVar);
        org.telegram.ui.ActionBar.o6 w10 = org.telegram.ui.ActionBar.u6.w(101, ybVar);
        w10.c(i7, -1, 0, 0.0f, resourceProvider);
        w10.f29912n = vVar;
        w10.f29913o = vVar2;
        w10.f29911m = false;
        w10.f29906g = P;
        org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(t6, g2Var.getResourceProvider(), true, false);
        this.f9804e = dcVar;
        dcVar.e(gd.N0(2131744782, null));
        dcVar.f34267b = new Runnable(this) {
            public final t8 f9717b;

            {
                this.f9717b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9717b.a();
                        return;
                    default:
                        t8 t8Var = this.f9717b;
                        if (!t8Var.f9812n && !t8Var.f9813o && t8Var.f9811m) {
                            t8Var.f9812n = true;
                            ai.o2 o2Var = t8Var.f9807i;
                            if (o2Var != null) {
                                o2Var.a(t8Var.f9809k);
                            }
                            if (t8Var.f9804e != null) {
                                t8Var.f9803c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        dcVar.addView((View) ybVar, c8.na.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        dcVar.f34269e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        zbVar.setButton(dcVar);
        org.telegram.ui.Components.fc b10 = org.telegram.ui.Components.kc.b0(g2Var).b(zbVar, -1);
        this.f9803c = b10;
        b10.f35099r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final t8 f9717b;

            {
                this.f9717b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9717b.a();
                        return;
                    default:
                        t8 t8Var = this.f9717b;
                        if (!t8Var.f9812n && !t8Var.f9813o && t8Var.f9811m) {
                            t8Var.f9812n = true;
                            ai.o2 o2Var = t8Var.f9807i;
                            if (o2Var != null) {
                                o2Var.a(t8Var.f9809k);
                            }
                            if (t8Var.f9804e != null) {
                                t8Var.f9803c.b();
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
        if (!this.f9812n && !this.f9813o) {
            this.f9813o = true;
            ArrayList arrayList = this.f9808j;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((Runnable) obj).run();
            }
            if (this.f9804e != null) {
                this.f9803c.b();
            }
        }
    }
}
