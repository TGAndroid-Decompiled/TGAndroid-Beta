package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.d;
public final class bta {
    public final d a;
    public final long b;
    public final m21 c;
    public final g21 d;
    public final k21 e;
    public final fta f;
    public int g;
    public long h;
    public ra i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final ata p;

    public bta(d dVar, long j) {
        ?? r2 = new Runnable(this) {
            public final bta b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                bta btaVar = this.b;
                switch (b) {
                    case 0:
                        btaVar.a();
                        return;
                    default:
                        if (!btaVar.n && !btaVar.o && btaVar.m) {
                            btaVar.n = true;
                            ra raVar = btaVar.i;
                            if (raVar != null) {
                                raVar.a(btaVar.k);
                            }
                            if (btaVar.e != null) {
                                btaVar.c.b();
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
        Context q = gta.q(dVar);
        g21 g21Var = new g21(q, dVar.getResourceProvider());
        this.d = g21Var;
        g21Var.a.f(2131624222, 32, 32, null);
        ?? f21Var = new f21(q, dVar.getResourceProvider());
        this.f = f21Var;
        f21Var.b = 3000L;
        int i = bkb.wj;
        wjb resourceProvider = dVar.getResourceProvider();
        ho9 ho9Var = new ho9((byte) 26);
        ho9 ho9Var2 = new ho9((byte) 27);
        int P = zkb.P(i, -1, 0, 0.0f, resourceProvider);
        ho9Var2.d(P, f21Var);
        tkb w = zkb.w(101, f21Var);
        w.c(i, -1, 0, 0.0f, resourceProvider);
        w.n = ho9Var;
        w.o = ho9Var2;
        w.m = false;
        w.g = P;
        k21 k21Var = new k21(dVar.getResourceProvider(), q, true, false);
        this.e = k21Var;
        k21Var.e(k96.M0(2131744786, null));
        k21Var.b = new Runnable(this) {
            public final bta b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                bta btaVar = this.b;
                switch (b) {
                    case 0:
                        btaVar.a();
                        return;
                    default:
                        if (!btaVar.n && !btaVar.o && btaVar.m) {
                            btaVar.n = true;
                            ra raVar = btaVar.i;
                            if (raVar != null) {
                                raVar.a(btaVar.k);
                            }
                            if (btaVar.e != null) {
                                btaVar.c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        k21Var.addView((View) f21Var, nme.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        k21Var.e.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(30.0f), gl.L(8.0f));
        g21Var.setButton(k21Var);
        m21 b = u21.b0(dVar).b(g21Var, -1);
        this.c = b;
        b.r = false;
        b.k(true);
        b.v = new Runnable(this) {
            public final bta b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r2;
                bta btaVar = this.b;
                switch (b2) {
                    case 0:
                        btaVar.a();
                        return;
                    default:
                        if (!btaVar.n && !btaVar.o && btaVar.m) {
                            btaVar.n = true;
                            ra raVar = btaVar.i;
                            if (raVar != null) {
                                raVar.a(btaVar.k);
                            }
                            if (btaVar.e != null) {
                                btaVar.c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        gl.r(r2);
        gl.e3(r2, 3000L);
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
