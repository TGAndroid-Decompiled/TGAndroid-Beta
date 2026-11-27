package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class i07 {
    public final ig8 a;
    public final la3 b;
    public final c74 f;
    public final ea3 i;
    public final xgb j;
    public boolean l;
    public pka k = new pka();
    public final IdentityHashMap d = new IdentityHashMap();
    public final HashMap e = new HashMap();
    public final ArrayList c = new ArrayList();
    public final HashMap g = new HashMap();
    public final HashSet h = new HashSet();

    public i07(c74 c74Var, ea3 ea3Var, xgb xgbVar, ig8 ig8Var, la3 la3Var) {
        this.a = ig8Var;
        this.b = la3Var;
        this.f = c74Var;
        this.i = ea3Var;
        this.j = xgbVar;
    }

    public final asb a(int i, ArrayList arrayList, pka pkaVar) {
        if (!arrayList.isEmpty()) {
            this.k = pkaVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                h07 h07Var = (h07) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.c;
                if (i2 > 0) {
                    h07 h07Var2 = (h07) arrayList2.get(i2 - 1);
                    h07Var.d = h07Var2.a.o.e.o() + h07Var2.d;
                    h07Var.e = false;
                    h07Var.c.clear();
                } else {
                    h07Var.d = 0;
                    h07Var.e = false;
                    h07Var.c.clear();
                }
                int o = h07Var.a.o.e.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((h07) arrayList2.get(i3)).d += o;
                }
                arrayList2.add(i2, h07Var);
                this.e.put(h07Var.b, h07Var);
                if (this.l) {
                    e(h07Var);
                    if (this.d.isEmpty()) {
                        this.h.add(h07Var);
                    } else {
                        g07 g07Var = (g07) this.g.get(h07Var);
                        if (g07Var != null) {
                            g07Var.a.d(g07Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final asb b() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return asb.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            h07 h07Var = (h07) arrayList.get(i2);
            h07Var.d = i;
            i += h07Var.a.o.e.o();
        }
        return new rg8(arrayList, this.k);
    }

    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            h07 h07Var = (h07) it.next();
            if (h07Var.c.isEmpty()) {
                g07 g07Var = (g07) this.g.get(h07Var);
                if (g07Var != null) {
                    g07Var.a.d(g07Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(h07 h07Var) {
        if (h07Var.e && h07Var.c.isEmpty()) {
            g07 g07Var = (g07) this.g.remove(h07Var);
            g07Var.getClass();
            f07 f07Var = g07Var.c;
            rg0 rg0Var = g07Var.a;
            rg0Var.p(g07Var.b);
            rg0Var.s(f07Var);
            rg0Var.r(f07Var);
            this.h.remove(h07Var);
        }
    }

    public final void e(h07 h07Var) {
        ml6 ml6Var = h07Var.a;
        ?? r1 = new wz6() {
            @Override
            public final void a(rg0 rg0Var, asb asbVar) {
                xgb xgbVar = i07.this.f.h;
                xgbVar.g(2);
                xgbVar.h(22);
            }
        };
        f07 f07Var = new f07(this, h07Var);
        this.g.put(h07Var, new g07(ml6Var, r1, f07Var));
        Handler handler = new Handler(gcc.z(), null);
        ?? obj = new Object();
        obj.a = handler;
        obj.b = f07Var;
        ((CopyOnWriteArrayList) ml6Var.c.d).add(obj);
        Handler handler2 = new Handler(gcc.z(), null);
        CopyOnWriteArrayList copyOnWriteArrayList = ml6Var.d.c;
        ?? obj2 = new Object();
        obj2.a = handler2;
        obj2.b = f07Var;
        copyOnWriteArrayList.add(obj2);
        ml6Var.l(r1, this.a, this.b);
    }

    public final void f(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.c;
            h07 h07Var = (h07) arrayList.remove(i3);
            this.e.remove(h07Var.b);
            int i4 = -h07Var.a.o.e.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((h07) arrayList.get(i5)).d += i4;
            }
            h07Var.e = true;
            if (this.l) {
                d(h07Var);
            }
        }
    }
}
