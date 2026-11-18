package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
public final class s8 {
    public final org.telegram.ui.ActionBar.h2 f9720a;
    public final long f9721b;
    public final org.telegram.ui.Components.gc f9722c;
    public final org.telegram.ui.Components.ac d;
    public final org.telegram.ui.Components.ec f9723e;
    public final w8 f9724f;
    public int f9725g;
    public long h;
    public ai.u2 f9726i;
    public final ArrayList f9727j = new ArrayList();
    public final HashSet f9728k = new HashSet();
    public final long f9729l = System.currentTimeMillis();
    public boolean f9730m = true;
    public boolean f9731n;
    public boolean f9732o;
    public final r8 f9733p;

    public s8(org.telegram.ui.ActionBar.h2 h2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final s8 f9665b;

            {
                this.f9665b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9665b.a();
                        return;
                    default:
                        s8 s8Var = this.f9665b;
                        if (!s8Var.f9731n && !s8Var.f9732o && s8Var.f9730m) {
                            s8Var.f9731n = true;
                            ai.u2 u2Var = s8Var.f9726i;
                            if (u2Var != null) {
                                u2Var.a(s8Var.f9728k);
                            }
                            if (s8Var.f9723e != null) {
                                s8Var.f9722c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f9733p = r22;
        this.f9720a = h2Var;
        this.f9721b = j3;
        Context t6 = x8.t(h2Var);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, h2Var.getResourceProvider());
        this.d = acVar;
        acVar.c(2131624227, new String[0]);
        ?? zbVar = new org.telegram.ui.Components.zb(t6, h2Var.getResourceProvider());
        this.f9724f = zbVar;
        zbVar.f42849b = 3000L;
        int i7 = org.telegram.ui.ActionBar.n6.xj;
        org.telegram.ui.ActionBar.i6 resourceProvider = h2Var.getResourceProvider();
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.u6.P(i7, -1, 0, 0.0f, resourceProvider);
        vVar2.d(P, zbVar);
        org.telegram.ui.ActionBar.o6 w10 = org.telegram.ui.ActionBar.u6.w(101, zbVar);
        w10.c(i7, -1, 0, 0.0f, resourceProvider);
        w10.f29841n = vVar;
        w10.f29842o = vVar2;
        w10.f29840m = false;
        w10.f29835g = P;
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, h2Var.getResourceProvider(), true, false);
        this.f9723e = ecVar;
        ecVar.e(gd.M0(2131744788, null));
        ecVar.f34666b = new Runnable(this) {
            public final s8 f9665b;

            {
                this.f9665b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9665b.a();
                        return;
                    default:
                        s8 s8Var = this.f9665b;
                        if (!s8Var.f9731n && !s8Var.f9732o && s8Var.f9730m) {
                            s8Var.f9731n = true;
                            ai.u2 u2Var = s8Var.f9726i;
                            if (u2Var != null) {
                                u2Var.a(s8Var.f9728k);
                            }
                            if (s8Var.f9723e != null) {
                                s8Var.f9722c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ecVar.addView((View) zbVar, c8.ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.f34668e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(h2Var).b(acVar, -1);
        this.f9722c = b10;
        b10.f35469r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final s8 f9665b;

            {
                this.f9665b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9665b.a();
                        return;
                    default:
                        s8 s8Var = this.f9665b;
                        if (!s8Var.f9731n && !s8Var.f9732o && s8Var.f9730m) {
                            s8Var.f9731n = true;
                            ai.u2 u2Var = s8Var.f9726i;
                            if (u2Var != null) {
                                u2Var.a(s8Var.f9728k);
                            }
                            if (s8Var.f9723e != null) {
                                s8Var.f9722c.b();
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
        if (!this.f9731n && !this.f9732o) {
            this.f9732o = true;
            ArrayList arrayList = this.f9727j;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((Runnable) obj).run();
            }
            if (this.f9723e != null) {
                this.f9722c.b();
            }
        }
    }
}
