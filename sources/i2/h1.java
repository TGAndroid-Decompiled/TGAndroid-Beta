package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class h1 {
    public final j2.j f12451a;
    public final q0 e;
    public final j2.e h;
    public final e2.i0 f12456i;
    public boolean f12458k;
    public g2.c0 f12459l;
    public u2.k1 f12457j = new u2.i1();
    public final IdentityHashMap f12453c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f12452b = new ArrayList();
    public final HashMap f12454f = new HashMap();
    public final HashSet f12455g = new HashSet();

    public h1(q0 q0Var, j2.e eVar, e2.i0 i0Var, j2.j jVar) {
        this.f12451a = jVar;
        this.e = q0Var;
        this.h = eVar;
        this.f12456i = i0Var;
    }

    public final b2.o1 a(int i10, ArrayList arrayList, u2.k1 k1Var) {
        if (!arrayList.isEmpty()) {
            this.f12457j = k1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                g1 g1Var = (g1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f12452b;
                if (i11 > 0) {
                    g1 g1Var2 = (g1) arrayList2.get(i11 - 1);
                    g1Var.d = g1Var2.f12405a.f47717o.e.o() + g1Var2.d;
                    g1Var.e = false;
                    g1Var.f12407c.clear();
                } else {
                    g1Var.d = 0;
                    g1Var.e = false;
                    g1Var.f12407c.clear();
                }
                int o10 = g1Var.f12405a.f47717o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((g1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, g1Var);
                this.d.put(g1Var.f12406b, g1Var);
                if (this.f12458k) {
                    e(g1Var);
                    if (this.f12453c.isEmpty()) {
                        this.f12455g.add(g1Var);
                    } else {
                        f1 f1Var = (f1) this.f12454f.get(g1Var);
                        if (f1Var != null) {
                            f1Var.f12388a.d(f1Var.f12389b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.o1 b() {
        ArrayList arrayList = this.f12452b;
        if (arrayList.isEmpty()) {
            return b2.o1.f3897a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            g1 g1Var = (g1) arrayList.get(i11);
            g1Var.d = i10;
            i10 += g1Var.f12405a.f47717o.e.o();
        }
        return new n1(arrayList, this.f12457j);
    }

    public final void c() {
        Iterator it = this.f12455g.iterator();
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            if (g1Var.f12407c.isEmpty()) {
                f1 f1Var = (f1) this.f12454f.get(g1Var);
                if (f1Var != null) {
                    f1Var.f12388a.d(f1Var.f12389b);
                }
                it.remove();
            }
        }
    }

    public final void d(g1 g1Var) {
        if (g1Var.e && g1Var.f12407c.isEmpty()) {
            f1 f1Var = (f1) this.f12454f.remove(g1Var);
            f1Var.getClass();
            e1 e1Var = f1Var.f12390c;
            u2.a aVar = f1Var.f12388a;
            aVar.p(f1Var.f12389b);
            aVar.s(e1Var);
            aVar.r(e1Var);
            this.f12455g.remove(g1Var);
        }
    }

    public final void e(g1 g1Var) {
        u2.c0 c0Var = g1Var.f12405a;
        ?? r12 = new u2.i0() {
            @Override
            public final void a(u2.a aVar, b2.o1 o1Var) {
                e2.i0 i0Var = h1.this.e.f12583n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        e1 e1Var = new e1(this, g1Var);
        this.f12454f.put(g1Var, new f1(c0Var, r12, e1Var));
        String str = e2.m0.f8259a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        c0Var.getClass();
        a5.a aVar = c0Var.f47691c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f47799a = handler;
        obj.f47800b = e1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.k kVar = c0Var.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = kVar.f17122c;
        ?? obj2 = new Object();
        obj2.f17118a = handler2;
        obj2.f17119b = e1Var;
        copyOnWriteArrayList.add(obj2);
        c0Var.l(r12, this.f12459l, this.f12451a);
    }

    public final void f(u2.f0 f0Var) {
        IdentityHashMap identityHashMap = this.f12453c;
        g1 g1Var = (g1) identityHashMap.remove(f0Var);
        g1Var.getClass();
        g1Var.f12405a.o(f0Var);
        g1Var.f12407c.remove(((u2.z) f0Var).f47944a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(g1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f12452b;
            g1 g1Var = (g1) arrayList.remove(i12);
            this.d.remove(g1Var.f12406b);
            int i13 = -g1Var.f12405a.f47717o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((g1) arrayList.get(i14)).d += i13;
            }
            g1Var.e = true;
            if (this.f12458k) {
                d(g1Var);
            }
        }
    }
}
