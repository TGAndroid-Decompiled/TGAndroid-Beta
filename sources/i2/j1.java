package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class j1 {
    public final j2.k f11055a;
    public final r0 e;
    public final j2.f h;
    public final e2.i0 f11060i;
    public boolean f11062k;
    public g2.c0 f11063l;
    public u2.i1 f11061j = new u2.g1();
    public final IdentityHashMap f11057c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f11056b = new ArrayList();
    public final HashMap f11058f = new HashMap();
    public final HashSet f11059g = new HashSet();

    public j1(r0 r0Var, j2.f fVar, e2.i0 i0Var, j2.k kVar) {
        this.f11055a = kVar;
        this.e = r0Var;
        this.h = fVar;
        this.f11060i = i0Var;
    }

    public final b2.p1 a(int i10, ArrayList arrayList, u2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.f11061j = i1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                i1 i1Var2 = (i1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f11056b;
                if (i11 > 0) {
                    i1 i1Var3 = (i1) arrayList2.get(i11 - 1);
                    i1Var2.d = i1Var3.f11046a.f45869o.e.o() + i1Var3.d;
                    i1Var2.e = false;
                    i1Var2.f11048c.clear();
                } else {
                    i1Var2.d = 0;
                    i1Var2.e = false;
                    i1Var2.f11048c.clear();
                }
                int o10 = i1Var2.f11046a.f45869o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((i1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, i1Var2);
                this.d.put(i1Var2.f11047b, i1Var2);
                if (this.f11062k) {
                    e(i1Var2);
                    if (this.f11057c.isEmpty()) {
                        this.f11059g.add(i1Var2);
                    } else {
                        h1 h1Var = (h1) this.f11058f.get(i1Var2);
                        if (h1Var != null) {
                            h1Var.f11025a.d(h1Var.f11026b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.p1 b() {
        ArrayList arrayList = this.f11056b;
        if (arrayList.isEmpty()) {
            return b2.p1.f2285a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i1 i1Var = (i1) arrayList.get(i11);
            i1Var.d = i10;
            i10 += i1Var.f11046a.f45869o.e.o();
        }
        return new p1(arrayList, this.f11061j);
    }

    public final void c() {
        Iterator it = this.f11059g.iterator();
        while (it.hasNext()) {
            i1 i1Var = (i1) it.next();
            if (i1Var.f11048c.isEmpty()) {
                h1 h1Var = (h1) this.f11058f.get(i1Var);
                if (h1Var != null) {
                    h1Var.f11025a.d(h1Var.f11026b);
                }
                it.remove();
            }
        }
    }

    public final void d(i1 i1Var) {
        if (i1Var.e && i1Var.f11048c.isEmpty()) {
            h1 h1Var = (h1) this.f11058f.remove(i1Var);
            h1Var.getClass();
            g1 g1Var = h1Var.f11027c;
            u2.a aVar = h1Var.f11025a;
            aVar.p(h1Var.f11026b);
            aVar.s(g1Var);
            aVar.r(g1Var);
            this.f11059g.remove(i1Var);
        }
    }

    public final void e(i1 i1Var) {
        u2.b0 b0Var = i1Var.f11046a;
        ?? r12 = new u2.h0() {
            @Override
            public final void a(u2.a aVar, b2.p1 p1Var) {
                e2.i0 i0Var = j1.this.e.f11169n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        g1 g1Var = new g1(this, i1Var);
        this.f11058f.put(i1Var, new h1(b0Var, r12, g1Var));
        String str = e2.m0.f8375a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        a5.a aVar = b0Var.f45861c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f45943a = handler;
        obj.f45944b = g1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f15676c;
        ?? obj2 = new Object();
        obj2.f15672a = handler2;
        obj2.f15673b = g1Var;
        copyOnWriteArrayList.add(obj2);
        b0Var.l(r12, this.f11063l, this.f11055a);
    }

    public final void f(u2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.f11057c;
        i1 i1Var = (i1) identityHashMap.remove(e0Var);
        i1Var.getClass();
        i1Var.f11046a.o(e0Var);
        i1Var.f11048c.remove(((u2.y) e0Var).f46092a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(i1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f11056b;
            i1 i1Var = (i1) arrayList.remove(i12);
            this.d.remove(i1Var.f11047b);
            int i13 = -i1Var.f11046a.f45869o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((i1) arrayList.get(i14)).d += i13;
            }
            i1Var.e = true;
            if (this.f11062k) {
                d(i1Var);
            }
        }
    }
}
