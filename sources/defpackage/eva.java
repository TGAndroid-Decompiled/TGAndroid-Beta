package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.d;
public final class eva {
    public final d a;
    public final long b;
    public final u31 c;
    public final o31 d;
    public final s31 e;
    public final iva f;
    public int g;
    public long h;
    public ra i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final dva p;

    public eva(d dVar, long j) {
        ?? r2 = new Runnable(this) {
            public final eva b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                eva evaVar = this.b;
                switch (b) {
                    case 0:
                        evaVar.a();
                        return;
                    default:
                        if (!evaVar.n && !evaVar.o && evaVar.m) {
                            evaVar.n = true;
                            ra raVar = evaVar.i;
                            if (raVar != null) {
                                raVar.a(evaVar.k);
                            }
                            if (evaVar.e != null) {
                                evaVar.c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.p = r2;
        this.a = dVar;
        this.b = j;
        Context q = jva.q(dVar);
        o31 o31Var = new o31(q, dVar.getResourceProvider());
        this.d = o31Var;
        o31Var.a.f(2131624221, 32, 32, null);
        ?? n31Var = new n31(q, dVar.getResourceProvider());
        this.f = n31Var;
        n31Var.b = 3000L;
        int i = cmb.wj;
        ylb resourceProvider = dVar.getResourceProvider();
        dq9 dq9Var = new dq9((byte) 27);
        dq9 dq9Var2 = new dq9((byte) 28);
        int P = anb.P(i, -1, 0, 0.0f, resourceProvider);
        dq9Var2.e(P, n31Var);
        umb w = anb.w(101, n31Var);
        w.c(i, -1, 0, 0.0f, resourceProvider);
        w.n = dq9Var;
        w.o = dq9Var2;
        w.m = false;
        w.g = P;
        s31 s31Var = new s31(dVar.getResourceProvider(), q, true, false);
        this.e = s31Var;
        s31Var.e(jb6.M0(2131744712, null));
        s31Var.b = new Runnable(this) {
            public final eva b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                eva evaVar = this.b;
                switch (b) {
                    case 0:
                        evaVar.a();
                        return;
                    default:
                        if (!evaVar.n && !evaVar.o && evaVar.m) {
                            evaVar.n = true;
                            ra raVar = evaVar.i;
                            if (raVar != null) {
                                raVar.a(evaVar.k);
                            }
                            if (evaVar.e != null) {
                                evaVar.c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        s31Var.addView((View) n31Var, qoe.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        s31Var.e.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(30.0f), gm.L(8.0f));
        o31Var.setButton(s31Var);
        u31 b = c41.b0(dVar).b(o31Var, -1);
        this.c = b;
        b.s = false;
        b.k(true);
        b.w = new Runnable(this) {
            public final eva b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r2;
                eva evaVar = this.b;
                switch (b2) {
                    case 0:
                        evaVar.a();
                        return;
                    default:
                        if (!evaVar.n && !evaVar.o && evaVar.m) {
                            evaVar.n = true;
                            ra raVar = evaVar.i;
                            if (raVar != null) {
                                raVar.a(evaVar.k);
                            }
                            if (evaVar.e != null) {
                                evaVar.c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        gm.r(r2);
        gm.d3(r2, 3000L);
    }

    public final void a() {
        if (!this.n && !this.o) {
            this.o = true;
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.c.b();
            }
        }
    }
}
