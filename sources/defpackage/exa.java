package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e;
public final class exa {
    public final e a;
    public final long b;
    public final v21 c;
    public final p21 d;
    public final t21 e;
    public final ixa f;
    public int g;
    public long h;
    public sa i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final dxa p;

    public exa(e eVar, long j) {
        ?? r2 = new Runnable(this) {
            public final exa b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                exa exaVar = this.b;
                switch (b) {
                    case 0:
                        exaVar.a();
                        return;
                    default:
                        if (!exaVar.n && !exaVar.o && exaVar.m) {
                            exaVar.n = true;
                            sa saVar = exaVar.i;
                            if (saVar != null) {
                                saVar.a(exaVar.k);
                            }
                            if (exaVar.e != null) {
                                exaVar.c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.p = r2;
        this.a = eVar;
        this.b = j;
        Context q = jxa.q(eVar);
        p21 p21Var = new p21(q, eVar.getResourceProvider());
        this.d = p21Var;
        p21Var.a.f(2131624221, 32, 32, null);
        ?? o21Var = new o21(q, eVar.getResourceProvider());
        this.f = o21Var;
        o21Var.b = 3000L;
        int i = aob.xj;
        vnb resourceProvider = eVar.getResourceProvider();
        vr9 vr9Var = new vr9((byte) 28);
        vr9 vr9Var2 = new vr9((byte) 29);
        int P = yob.P(i, -1, 0, 0.0f, resourceProvider);
        vr9Var2.e(P, o21Var);
        sob w = yob.w(101, o21Var);
        w.c(i, -1, 0, 0.0f, resourceProvider);
        w.n = vr9Var;
        w.o = vr9Var2;
        w.m = false;
        w.g = P;
        t21 t21Var = new t21(eVar.getResourceProvider(), q, true, false);
        this.e = t21Var;
        t21Var.e(ob6.M0(2131744680, null));
        t21Var.b = new Runnable(this) {
            public final exa b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                exa exaVar = this.b;
                switch (b) {
                    case 0:
                        exaVar.a();
                        return;
                    default:
                        if (!exaVar.n && !exaVar.o && exaVar.m) {
                            exaVar.n = true;
                            sa saVar = exaVar.i;
                            if (saVar != null) {
                                saVar.a(exaVar.k);
                            }
                            if (exaVar.e != null) {
                                exaVar.c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        t21Var.addView((View) o21Var, tre.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        t21Var.e.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(30.0f), hl.L(8.0f));
        p21Var.setButton(t21Var);
        v21 b = d31.b0(eVar).b(p21Var, -1);
        this.c = b;
        b.s = false;
        b.k(true);
        b.w = new Runnable(this) {
            public final exa b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r2;
                exa exaVar = this.b;
                switch (b2) {
                    case 0:
                        exaVar.a();
                        return;
                    default:
                        if (!exaVar.n && !exaVar.o && exaVar.m) {
                            exaVar.n = true;
                            sa saVar = exaVar.i;
                            if (saVar != null) {
                                saVar.a(exaVar.k);
                            }
                            if (exaVar.e != null) {
                                exaVar.c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        hl.r(r2);
        hl.d3(r2, 3000L);
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
