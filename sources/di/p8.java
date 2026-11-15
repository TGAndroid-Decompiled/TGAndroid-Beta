package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
public final class p8 {
    public final org.telegram.ui.ActionBar.e2 f9228a;
    public final long f9229b;
    public final org.telegram.ui.Components.xb f9230c;
    public final org.telegram.ui.Components.rb d;
    public final org.telegram.ui.Components.vb f9231e;
    public final t8 f9232f;
    public int f9233g;
    public long h;
    public ai.u2 f9234i;
    public final ArrayList f9235j = new ArrayList();
    public final HashSet f9236k = new HashSet();
    public final long f9237l = System.currentTimeMillis();
    public boolean f9238m = true;
    public boolean f9239n;
    public boolean f9240o;
    public final o8 f9241p;

    public p8(org.telegram.ui.ActionBar.e2 e2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final p8 f9174b;

            {
                this.f9174b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9174b.a();
                        return;
                    default:
                        p8 p8Var = this.f9174b;
                        if (!p8Var.f9239n && !p8Var.f9240o && p8Var.f9238m) {
                            p8Var.f9239n = true;
                            ai.u2 u2Var = p8Var.f9234i;
                            if (u2Var != null) {
                                u2Var.a(p8Var.f9236k);
                            }
                            if (p8Var.f9231e != null) {
                                p8Var.f9230c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f9241p = r22;
        this.f9228a = e2Var;
        this.f9229b = j3;
        Context t6 = u8.t(e2Var);
        org.telegram.ui.Components.rb rbVar = new org.telegram.ui.Components.rb(t6, e2Var.getResourceProvider());
        this.d = rbVar;
        rbVar.c(2131624227, new String[0]);
        ?? qbVar = new org.telegram.ui.Components.qb(t6, e2Var.getResourceProvider());
        this.f9232f = qbVar;
        qbVar.f38604b = 3000L;
        int i7 = org.telegram.ui.ActionBar.j6.xj;
        org.telegram.ui.ActionBar.e6 resourceProvider = e2Var.getResourceProvider();
        o oVar = new o(3);
        o oVar2 = new o(4);
        int P = org.telegram.ui.ActionBar.q6.P(i7, -1, 0, 0.0f, resourceProvider);
        oVar2.f(P, qbVar);
        org.telegram.ui.ActionBar.k6 w10 = org.telegram.ui.ActionBar.q6.w(101, qbVar);
        w10.c(i7, -1, 0, 0.0f, resourceProvider);
        w10.f29354n = oVar;
        w10.f29355o = oVar2;
        w10.f29353m = false;
        w10.f29348g = P;
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(t6, e2Var.getResourceProvider(), true, false);
        this.f9231e = vbVar;
        vbVar.e(hd.M0(2131745023, null));
        vbVar.f40372b = new Runnable(this) {
            public final p8 f9174b;

            {
                this.f9174b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9174b.a();
                        return;
                    default:
                        p8 p8Var = this.f9174b;
                        if (!p8Var.f9239n && !p8Var.f9240o && p8Var.f9238m) {
                            p8Var.f9239n = true;
                            ai.u2 u2Var = p8Var.f9234i;
                            if (u2Var != null) {
                                u2Var.a(p8Var.f9236k);
                            }
                            if (p8Var.f9231e != null) {
                                p8Var.f9230c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        vbVar.addView((View) qbVar, c8.ja.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        vbVar.f40374e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        rbVar.setButton(vbVar);
        org.telegram.ui.Components.xb b10 = org.telegram.ui.Components.cc.a0(e2Var).b(rbVar, -1);
        this.f9230c = b10;
        b10.f41643r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final p8 f9174b;

            {
                this.f9174b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9174b.a();
                        return;
                    default:
                        p8 p8Var = this.f9174b;
                        if (!p8Var.f9239n && !p8Var.f9240o && p8Var.f9238m) {
                            p8Var.f9239n = true;
                            ai.u2 u2Var = p8Var.f9234i;
                            if (u2Var != null) {
                                u2Var.a(p8Var.f9236k);
                            }
                            if (p8Var.f9231e != null) {
                                p8Var.f9230c.b();
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
        if (!this.f9239n && !this.f9240o) {
            this.f9240o = true;
            ArrayList arrayList = this.f9235j;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((Runnable) obj).run();
            }
            if (this.f9231e != null) {
                this.f9230c.b();
            }
        }
    }
}
