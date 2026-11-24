package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class ey6 {
    public final uc8 a;
    public final s93 b;
    public final i64 f;
    public final l93 i;
    public final cdb j;
    public boolean l;
    public wga k = new wga();
    public final IdentityHashMap d = new IdentityHashMap();
    public final HashMap e = new HashMap();
    public final ArrayList c = new ArrayList();
    public final HashMap g = new HashMap();
    public final HashSet h = new HashSet();

    public ey6(i64 i64Var, l93 l93Var, cdb cdbVar, uc8 uc8Var, s93 s93Var) {
        this.a = uc8Var;
        this.b = s93Var;
        this.f = i64Var;
        this.i = l93Var;
        this.j = cdbVar;
    }

    public final aob a(int i, ArrayList arrayList, wga wgaVar) {
        if (!arrayList.isEmpty()) {
            this.k = wgaVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                dy6 dy6Var = (dy6) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.c;
                if (i2 > 0) {
                    dy6 dy6Var2 = (dy6) arrayList2.get(i2 - 1);
                    dy6Var.d = dy6Var2.a.o.e.o() + dy6Var2.d;
                    dy6Var.e = false;
                    dy6Var.c.clear();
                } else {
                    dy6Var.d = 0;
                    dy6Var.e = false;
                    dy6Var.c.clear();
                }
                int o = dy6Var.a.o.e.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((dy6) arrayList2.get(i3)).d += o;
                }
                arrayList2.add(i2, dy6Var);
                this.e.put(dy6Var.b, dy6Var);
                if (this.l) {
                    e(dy6Var);
                    if (this.d.isEmpty()) {
                        this.h.add(dy6Var);
                    } else {
                        cy6 cy6Var = (cy6) this.g.get(dy6Var);
                        if (cy6Var != null) {
                            cy6Var.a.d(cy6Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final aob b() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return aob.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            dy6 dy6Var = (dy6) arrayList.get(i2);
            dy6Var.d = i;
            i += dy6Var.a.o.e.o();
        }
        return new dd8(arrayList, this.k);
    }

    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            dy6 dy6Var = (dy6) it.next();
            if (dy6Var.c.isEmpty()) {
                cy6 cy6Var = (cy6) this.g.get(dy6Var);
                if (cy6Var != null) {
                    cy6Var.a.d(cy6Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(dy6 dy6Var) {
        if (dy6Var.e && dy6Var.c.isEmpty()) {
            cy6 cy6Var = (cy6) this.g.remove(dy6Var);
            cy6Var.getClass();
            by6 by6Var = cy6Var.c;
            qg0 qg0Var = cy6Var.a;
            qg0Var.p(cy6Var.b);
            qg0Var.s(by6Var);
            qg0Var.r(by6Var);
            this.h.remove(dy6Var);
        }
    }

    public final void e(dy6 dy6Var) {
        hj6 hj6Var = dy6Var.a;
        ?? r1 = new sx6() {
            @Override
            public final void a(qg0 qg0Var, aob aobVar) {
                cdb cdbVar = ey6.this.f.h;
                cdbVar.g(2);
                cdbVar.h(22);
            }
        };
        by6 by6Var = new by6(this, dy6Var);
        this.g.put(dy6Var, new cy6(hj6Var, r1, by6Var));
        Handler handler = new Handler(g8c.z(), null);
        ?? obj = new Object();
        obj.a = handler;
        obj.b = by6Var;
        ((CopyOnWriteArrayList) hj6Var.c.d).add(obj);
        Handler handler2 = new Handler(g8c.z(), null);
        CopyOnWriteArrayList copyOnWriteArrayList = hj6Var.d.c;
        ?? obj2 = new Object();
        obj2.a = handler2;
        obj2.b = by6Var;
        copyOnWriteArrayList.add(obj2);
        hj6Var.l(r1, this.a, this.b);
    }

    public final void f(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.c;
            dy6 dy6Var = (dy6) arrayList.remove(i3);
            this.e.remove(dy6Var.b);
            int i4 = -dy6Var.a.o.e.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((dy6) arrayList.get(i5)).d += i4;
            }
            dy6Var.e = true;
            if (this.l) {
                d(dy6Var);
            }
        }
    }
}
