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
    public final j2.k f12437a;
    public final p0 e;
    public final j2.f h;
    public final e2.i0 f12442i;
    public boolean f12444k;
    public g2.c0 f12445l;
    public u2.i1 f12443j = new u2.g1();
    public final IdentityHashMap f12439c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f12438b = new ArrayList();
    public final HashMap f12440f = new HashMap();
    public final HashSet f12441g = new HashSet();

    public h1(p0 p0Var, j2.f fVar, e2.i0 i0Var, j2.k kVar) {
        this.f12437a = kVar;
        this.e = p0Var;
        this.h = fVar;
        this.f12442i = i0Var;
    }

    public final b2.o1 a(int i10, ArrayList arrayList, u2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.f12443j = i1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                g1 g1Var = (g1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f12438b;
                if (i11 > 0) {
                    g1 g1Var2 = (g1) arrayList2.get(i11 - 1);
                    g1Var.d = g1Var2.f12417a.f47276o.e.o() + g1Var2.d;
                    g1Var.e = false;
                    g1Var.f12419c.clear();
                } else {
                    g1Var.d = 0;
                    g1Var.e = false;
                    g1Var.f12419c.clear();
                }
                int o10 = g1Var.f12417a.f47276o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((g1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, g1Var);
                this.d.put(g1Var.f12418b, g1Var);
                if (this.f12444k) {
                    e(g1Var);
                    if (this.f12439c.isEmpty()) {
                        this.f12441g.add(g1Var);
                    } else {
                        f1 f1Var = (f1) this.f12440f.get(g1Var);
                        if (f1Var != null) {
                            f1Var.f12371a.d(f1Var.f12372b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.o1 b() {
        ArrayList arrayList = this.f12438b;
        if (arrayList.isEmpty()) {
            return b2.o1.f3893a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            g1 g1Var = (g1) arrayList.get(i11);
            g1Var.d = i10;
            i10 += g1Var.f12417a.f47276o.e.o();
        }
        return new n1(arrayList, this.f12443j);
    }

    public final void c() {
        Iterator it = this.f12441g.iterator();
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            if (g1Var.f12419c.isEmpty()) {
                f1 f1Var = (f1) this.f12440f.get(g1Var);
                if (f1Var != null) {
                    f1Var.f12371a.d(f1Var.f12372b);
                }
                it.remove();
            }
        }
    }

    public final void d(g1 g1Var) {
        if (g1Var.e && g1Var.f12419c.isEmpty()) {
            f1 f1Var = (f1) this.f12440f.remove(g1Var);
            f1Var.getClass();
            e1 e1Var = f1Var.f12373c;
            u2.a aVar = f1Var.f12371a;
            aVar.p(f1Var.f12372b);
            aVar.s(e1Var);
            aVar.r(e1Var);
            this.f12441g.remove(g1Var);
        }
    }

    public final void e(g1 g1Var) {
        u2.b0 b0Var = g1Var.f12417a;
        ?? r12 = new u2.h0() {
            @Override
            public final void a(u2.a aVar, b2.o1 o1Var) {
                e2.i0 i0Var = h1.this.e.f12552n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        e1 e1Var = new e1(this, g1Var);
        this.f12440f.put(g1Var, new f1(b0Var, r12, e1Var));
        String str = e2.m0.f8254a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        a5.a aVar = b0Var.f47268c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f47350a = handler;
        obj.f47351b = e1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.k kVar = b0Var.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = kVar.f17055c;
        ?? obj2 = new Object();
        obj2.f17051a = handler2;
        obj2.f17052b = e1Var;
        copyOnWriteArrayList.add(obj2);
        b0Var.l(r12, this.f12445l, this.f12437a);
    }

    public final void f(u2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.f12439c;
        g1 g1Var = (g1) identityHashMap.remove(e0Var);
        g1Var.getClass();
        g1Var.f12417a.o(e0Var);
        g1Var.f12419c.remove(((u2.y) e0Var).f47499a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(g1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f12438b;
            g1 g1Var = (g1) arrayList.remove(i12);
            this.d.remove(g1Var.f12418b);
            int i13 = -g1Var.f12417a.f47276o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((g1) arrayList.get(i14)).d += i13;
            }
            g1Var.e = true;
            if (this.f12444k) {
                d(g1Var);
            }
        }
    }
}
