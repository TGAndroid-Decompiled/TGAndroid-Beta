package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class e07 {
    public final we8 a;
    public final eb3 b;
    public final r74 f;
    public final xa3 i;
    public final dfb j;
    public boolean l;
    public yia k = new yia();
    public final IdentityHashMap d = new IdentityHashMap();
    public final HashMap e = new HashMap();
    public final ArrayList c = new ArrayList();
    public final HashMap g = new HashMap();
    public final HashSet h = new HashSet();

    public e07(r74 r74Var, xa3 xa3Var, dfb dfbVar, we8 we8Var, eb3 eb3Var) {
        this.a = we8Var;
        this.b = eb3Var;
        this.f = r74Var;
        this.i = xa3Var;
        this.j = dfbVar;
    }

    public final bqb a(int i, ArrayList arrayList, yia yiaVar) {
        if (!arrayList.isEmpty()) {
            this.k = yiaVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                d07 d07Var = (d07) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.c;
                if (i2 > 0) {
                    d07 d07Var2 = (d07) arrayList2.get(i2 - 1);
                    d07Var.d = d07Var2.a.o.e.o() + d07Var2.d;
                    d07Var.e = false;
                    d07Var.c.clear();
                } else {
                    d07Var.d = 0;
                    d07Var.e = false;
                    d07Var.c.clear();
                }
                int o = d07Var.a.o.e.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((d07) arrayList2.get(i3)).d += o;
                }
                arrayList2.add(i2, d07Var);
                this.e.put(d07Var.b, d07Var);
                if (this.l) {
                    e(d07Var);
                    if (this.d.isEmpty()) {
                        this.h.add(d07Var);
                    } else {
                        c07 c07Var = (c07) this.g.get(d07Var);
                        if (c07Var != null) {
                            c07Var.a.d(c07Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final bqb b() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return bqb.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            d07 d07Var = (d07) arrayList.get(i2);
            d07Var.d = i;
            i += d07Var.a.o.e.o();
        }
        return new ff8(arrayList, this.k);
    }

    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            d07 d07Var = (d07) it.next();
            if (d07Var.c.isEmpty()) {
                c07 c07Var = (c07) this.g.get(d07Var);
                if (c07Var != null) {
                    c07Var.a.d(c07Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(d07 d07Var) {
        if (d07Var.e && d07Var.c.isEmpty()) {
            c07 c07Var = (c07) this.g.remove(d07Var);
            c07Var.getClass();
            b07 b07Var = c07Var.c;
            rh0 rh0Var = c07Var.a;
            rh0Var.p(c07Var.b);
            rh0Var.s(b07Var);
            rh0Var.r(b07Var);
            this.h.remove(d07Var);
        }
    }

    public final void e(d07 d07Var) {
        kl6 kl6Var = d07Var.a;
        ?? r1 = new sz6() {
            @Override
            public final void a(rh0 rh0Var, bqb bqbVar) {
                dfb dfbVar = e07.this.f.h;
                dfbVar.g(2);
                dfbVar.h(22);
            }
        };
        b07 b07Var = new b07(this, d07Var);
        this.g.put(d07Var, new c07(kl6Var, r1, b07Var));
        Handler handler = new Handler(hac.z(), null);
        ?? obj = new Object();
        obj.a = handler;
        obj.b = b07Var;
        ((CopyOnWriteArrayList) kl6Var.c.d).add(obj);
        Handler handler2 = new Handler(hac.z(), null);
        CopyOnWriteArrayList copyOnWriteArrayList = kl6Var.d.c;
        ?? obj2 = new Object();
        obj2.a = handler2;
        obj2.b = b07Var;
        copyOnWriteArrayList.add(obj2);
        kl6Var.l(r1, this.a, this.b);
    }

    public final void f(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.c;
            d07 d07Var = (d07) arrayList.remove(i3);
            this.e.remove(d07Var.b);
            int i4 = -d07Var.a.o.e.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((d07) arrayList.get(i5)).d += i4;
            }
            d07Var.e = true;
            if (this.l) {
                d(d07Var);
            }
        }
    }
}
