package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class g1 {
    public final j2.k f11656a;
    public final p0 f11659e;
    public final j2.f h;
    public final e2.z f11662i;
    public boolean f11664k;
    public g2.c0 f11665l;
    public u2.h1 f11663j = new u2.f1();
    public final IdentityHashMap f11658c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f11657b = new ArrayList();
    public final HashMap f11660f = new HashMap();
    public final HashSet f11661g = new HashSet();

    public g1(p0 p0Var, j2.f fVar, e2.z zVar, j2.k kVar) {
        this.f11656a = kVar;
        this.f11659e = p0Var;
        this.h = fVar;
        this.f11662i = zVar;
    }

    public final b2.k1 a(int i10, ArrayList arrayList, u2.h1 h1Var) {
        if (!arrayList.isEmpty()) {
            this.f11663j = h1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                f1 f1Var = (f1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f11657b;
                if (i11 > 0) {
                    f1 f1Var2 = (f1) arrayList2.get(i11 - 1);
                    f1Var.d = f1Var2.f11639a.f47204o.f47377e.o() + f1Var2.d;
                    f1Var.f11642e = false;
                    f1Var.f11641c.clear();
                } else {
                    f1Var.d = 0;
                    f1Var.f11642e = false;
                    f1Var.f11641c.clear();
                }
                int o9 = f1Var.f11639a.f47204o.f47377e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((f1) arrayList2.get(i12)).d += o9;
                }
                arrayList2.add(i11, f1Var);
                this.d.put(f1Var.f11640b, f1Var);
                if (this.f11664k) {
                    e(f1Var);
                    if (this.f11658c.isEmpty()) {
                        this.f11661g.add(f1Var);
                    } else {
                        e1 e1Var = (e1) this.f11660f.get(f1Var);
                        if (e1Var != null) {
                            e1Var.f11590a.d(e1Var.f11591b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.k1 b() {
        ArrayList arrayList = this.f11657b;
        if (arrayList.isEmpty()) {
            return b2.k1.f3325a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            f1 f1Var = (f1) arrayList.get(i11);
            f1Var.d = i10;
            i10 += f1Var.f11639a.f47204o.f47377e.o();
        }
        return new m1(arrayList, this.f11663j);
    }

    public final void c() {
        Iterator it = this.f11661g.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if (f1Var.f11641c.isEmpty()) {
                e1 e1Var = (e1) this.f11660f.get(f1Var);
                if (e1Var != null) {
                    e1Var.f11590a.d(e1Var.f11591b);
                }
                it.remove();
            }
        }
    }

    public final void d(f1 f1Var) {
        if (f1Var.f11642e && f1Var.f11641c.isEmpty()) {
            e1 e1Var = (e1) this.f11660f.remove(f1Var);
            e1Var.getClass();
            d1 d1Var = e1Var.f11592c;
            u2.a aVar = e1Var.f11590a;
            aVar.p(e1Var.f11591b);
            aVar.s(d1Var);
            aVar.r(d1Var);
            this.f11661g.remove(f1Var);
        }
    }

    public final void e(f1 f1Var) {
        u2.a0 a0Var = f1Var.f11639a;
        ?? r12 = new u2.g0() {
            @Override
            public final void a(u2.a aVar, b2.k1 k1Var) {
                e2.z zVar = g1.this.f11659e.f11802n;
                zVar.d(2);
                zVar.e(22);
            }
        };
        d1 d1Var = new d1(this, f1Var);
        this.f11660f.put(f1Var, new e1(a0Var, r12, d1Var));
        String str = e2.d0.f8537a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        a0Var.getClass();
        a5.a aVar = a0Var.f47197c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f47297a = handler;
        obj.f47298b = d1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.k kVar = a0Var.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = kVar.f16546c;
        ?? obj2 = new Object();
        obj2.f16542a = handler2;
        obj2.f16543b = d1Var;
        copyOnWriteArrayList.add(obj2);
        a0Var.l(r12, this.f11665l, this.f11656a);
    }

    public final void f(u2.d0 d0Var) {
        IdentityHashMap identityHashMap = this.f11658c;
        f1 f1Var = (f1) identityHashMap.remove(d0Var);
        f1Var.getClass();
        f1Var.f11639a.o(d0Var);
        f1Var.f11641c.remove(((u2.x) d0Var).f47429a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(f1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f11657b;
            f1 f1Var = (f1) arrayList.remove(i12);
            this.d.remove(f1Var.f11640b);
            int i13 = -f1Var.f11639a.f47204o.f47377e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((f1) arrayList.get(i14)).d += i13;
            }
            f1Var.f11642e = true;
            if (this.f11664k) {
                d(f1Var);
            }
        }
    }
}
