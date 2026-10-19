package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class i1 {
    public final j2.k f12424a;
    public final r0 e;
    public final j2.f h;
    public final e2.i0 f12429i;
    public boolean f12431k;
    public g2.c0 f12432l;
    public u2.i1 f12430j = new u2.g1();
    public final IdentityHashMap f12426c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f12425b = new ArrayList();
    public final HashMap f12427f = new HashMap();
    public final HashSet f12428g = new HashSet();

    public i1(r0 r0Var, j2.f fVar, e2.i0 i0Var, j2.k kVar) {
        this.f12424a = kVar;
        this.e = r0Var;
        this.h = fVar;
        this.f12429i = i0Var;
    }

    public final b2.o1 a(int i10, ArrayList arrayList, u2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.f12430j = i1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                h1 h1Var = (h1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f12425b;
                if (i11 > 0) {
                    h1 h1Var2 = (h1) arrayList2.get(i11 - 1);
                    h1Var.d = h1Var2.f12378a.f47253o.e.o() + h1Var2.d;
                    h1Var.e = false;
                    h1Var.f12380c.clear();
                } else {
                    h1Var.d = 0;
                    h1Var.e = false;
                    h1Var.f12380c.clear();
                }
                int o10 = h1Var.f12378a.f47253o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((h1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, h1Var);
                this.d.put(h1Var.f12379b, h1Var);
                if (this.f12431k) {
                    e(h1Var);
                    if (this.f12426c.isEmpty()) {
                        this.f12428g.add(h1Var);
                    } else {
                        g1 g1Var = (g1) this.f12427f.get(h1Var);
                        if (g1Var != null) {
                            g1Var.f12361a.d(g1Var.f12362b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.o1 b() {
        ArrayList arrayList = this.f12425b;
        if (arrayList.isEmpty()) {
            return b2.o1.f3892a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            h1 h1Var = (h1) arrayList.get(i11);
            h1Var.d = i10;
            i10 += h1Var.f12378a.f47253o.e.o();
        }
        return new o1(arrayList, this.f12430j);
    }

    public final void c() {
        Iterator it = this.f12428g.iterator();
        while (it.hasNext()) {
            h1 h1Var = (h1) it.next();
            if (h1Var.f12380c.isEmpty()) {
                g1 g1Var = (g1) this.f12427f.get(h1Var);
                if (g1Var != null) {
                    g1Var.f12361a.d(g1Var.f12362b);
                }
                it.remove();
            }
        }
    }

    public final void d(h1 h1Var) {
        if (h1Var.e && h1Var.f12380c.isEmpty()) {
            g1 g1Var = (g1) this.f12427f.remove(h1Var);
            g1Var.getClass();
            f1 f1Var = g1Var.f12363c;
            u2.a aVar = g1Var.f12361a;
            aVar.p(g1Var.f12362b);
            aVar.s(f1Var);
            aVar.r(f1Var);
            this.f12428g.remove(h1Var);
        }
    }

    public final void e(h1 h1Var) {
        u2.b0 b0Var = h1Var.f12378a;
        ?? r12 = new u2.h0() {
            @Override
            public final void a(u2.a aVar, b2.o1 o1Var) {
                e2.i0 i0Var = i1.this.e.f12560n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        f1 f1Var = new f1(this, h1Var);
        this.f12427f.put(h1Var, new g1(b0Var, r12, f1Var));
        String str = e2.m0.f8254a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        a5.a aVar = b0Var.f47245c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f47327a = handler;
        obj.f47328b = f1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.k kVar = b0Var.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = kVar.f17061c;
        ?? obj2 = new Object();
        obj2.f17057a = handler2;
        obj2.f17058b = f1Var;
        copyOnWriteArrayList.add(obj2);
        b0Var.l(r12, this.f12432l, this.f12424a);
    }

    public final void f(u2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.f12426c;
        h1 h1Var = (h1) identityHashMap.remove(e0Var);
        h1Var.getClass();
        h1Var.f12378a.o(e0Var);
        h1Var.f12380c.remove(((u2.y) e0Var).f47476a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(h1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f12425b;
            h1 h1Var = (h1) arrayList.remove(i12);
            this.d.remove(h1Var.f12379b);
            int i13 = -h1Var.f12378a.f47253o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((h1) arrayList.get(i14)).d += i13;
            }
            h1Var.e = true;
            if (this.f12431k) {
                d(h1Var);
            }
        }
    }
}
