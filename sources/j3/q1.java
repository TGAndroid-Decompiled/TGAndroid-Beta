package j3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class q1 {
    public final k3.k f8793a;
    public final k0 e;
    public final k3.f h;
    public final h5.a0 f8798i;
    public boolean f8800k;
    public g5.v0 f8801l;
    public o4.q0 f8799j = new o4.o0();
    public final IdentityHashMap f8795c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f8794b = new ArrayList();
    public final HashMap f8796f = new HashMap();
    public final HashSet f8797g = new HashSet();

    public q1(k0 k0Var, k3.f fVar, h5.a0 a0Var, k3.k kVar) {
        this.f8793a = kVar;
        this.e = k0Var;
        this.h = fVar;
        this.f8798i = a0Var;
    }

    public final o2 a(int i10, ArrayList arrayList, o4.q0 q0Var) {
        if (!arrayList.isEmpty()) {
            this.f8799j = q0Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                p1 p1Var = (p1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f8794b;
                if (i11 > 0) {
                    p1 p1Var2 = (p1) arrayList2.get(i11 - 1);
                    p1Var.d = p1Var2.f8783a.f16397o.f16346b.o() + p1Var2.d;
                    p1Var.e = false;
                    p1Var.f8785c.clear();
                } else {
                    p1Var.d = 0;
                    p1Var.e = false;
                    p1Var.f8785c.clear();
                }
                int o10 = p1Var.f8783a.f16397o.f16346b.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((p1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, p1Var);
                this.d.put(p1Var.f8784b, p1Var);
                if (this.f8800k) {
                    e(p1Var);
                    if (this.f8795c.isEmpty()) {
                        this.f8797g.add(p1Var);
                    } else {
                        o1 o1Var = (o1) this.f8796f.get(p1Var);
                        if (o1Var != null) {
                            o1Var.f8763a.c(o1Var.f8764b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final o2 b() {
        ArrayList arrayList = this.f8794b;
        if (arrayList.isEmpty()) {
            return o2.f8766a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            p1 p1Var = (p1) arrayList.get(i11);
            p1Var.d = i10;
            i10 += p1Var.f8783a.f16397o.f16346b.o();
        }
        return new e2(arrayList, this.f8799j);
    }

    public final void c() {
        Iterator it = this.f8797g.iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) it.next();
            if (p1Var.f8785c.isEmpty()) {
                o1 o1Var = (o1) this.f8796f.get(p1Var);
                if (o1Var != null) {
                    o1Var.f8763a.c(o1Var.f8764b);
                }
                it.remove();
            }
        }
    }

    public final void d(p1 p1Var) {
        if (p1Var.e && p1Var.f8785c.isEmpty()) {
            o1 o1Var = (o1) this.f8796f.remove(p1Var);
            o1Var.getClass();
            f7.b bVar = o1Var.f8765c;
            o4.a aVar = o1Var.f8763a;
            aVar.o(o1Var.f8764b);
            aVar.r(bVar);
            aVar.q(bVar);
            this.f8797g.remove(p1Var);
        }
    }

    public final void e(p1 p1Var) {
        o4.q qVar = p1Var.f8783a;
        ?? r12 = new o4.w() {
            @Override
            public final void a(o4.a aVar, o2 o2Var) {
                q1.this.e.f8651n.d(22);
            }
        };
        f7.b bVar = new f7.b(this, p1Var, false, 18);
        this.f8796f.put(p1Var, new o1(qVar, r12, bVar));
        int i10 = h5.d0.f6937a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        qVar.getClass();
        b4.e0 e0Var = qVar.f16289c;
        e0Var.getClass();
        ?? obj = new Object();
        obj.f16433a = handler;
        obj.f16434b = bVar;
        ((CopyOnWriteArrayList) e0Var.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        o3.l lVar = qVar.d;
        lVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = lVar.f16271c;
        ?? obj2 = new Object();
        obj2.f16267a = handler2;
        obj2.f16268b = bVar;
        copyOnWriteArrayList.add(obj2);
        qVar.k(r12, this.f8801l, this.f8793a);
    }

    public final void f(o4.t tVar) {
        IdentityHashMap identityHashMap = this.f8795c;
        p1 p1Var = (p1) identityHashMap.remove(tVar);
        p1Var.getClass();
        p1Var.f8783a.n(tVar);
        p1Var.f8785c.remove(((o4.n) tVar).f16384a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(p1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f8794b;
            p1 p1Var = (p1) arrayList.remove(i12);
            this.d.remove(p1Var.f8784b);
            int i13 = -p1Var.f8783a.f16397o.f16346b.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((p1) arrayList.get(i14)).d += i13;
            }
            p1Var.e = true;
            if (this.f8800k) {
                d(p1Var);
            }
        }
    }
}
