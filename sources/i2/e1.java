package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class e1 {
    public final j2.k f10164a;
    public final n0 e;
    public final j2.e h;
    public final e2.z f10169i;
    public boolean f10171k;
    public g2.c0 f10172l;
    public u2.i1 f10170j = new u2.g1();
    public final IdentityHashMap f10166c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f10165b = new ArrayList();
    public final HashMap f10167f = new HashMap();
    public final HashSet f10168g = new HashSet();

    public e1(n0 n0Var, j2.e eVar, e2.z zVar, j2.k kVar) {
        this.f10164a = kVar;
        this.e = n0Var;
        this.h = eVar;
        this.f10169i = zVar;
    }

    public final b2.k1 a(int i10, ArrayList arrayList, u2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.f10170j = i1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                d1 d1Var = (d1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f10165b;
                if (i11 > 0) {
                    d1 d1Var2 = (d1) arrayList2.get(i11 - 1);
                    d1Var.d = d1Var2.f10122a.f42276o.e.o() + d1Var2.d;
                    d1Var.e = false;
                    d1Var.f10124c.clear();
                } else {
                    d1Var.d = 0;
                    d1Var.e = false;
                    d1Var.f10124c.clear();
                }
                int o9 = d1Var.f10122a.f42276o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((d1) arrayList2.get(i12)).d += o9;
                }
                arrayList2.add(i11, d1Var);
                this.d.put(d1Var.f10123b, d1Var);
                if (this.f10171k) {
                    e(d1Var);
                    if (this.f10166c.isEmpty()) {
                        this.f10168g.add(d1Var);
                    } else {
                        c1 c1Var = (c1) this.f10167f.get(d1Var);
                        if (c1Var != null) {
                            c1Var.f10114a.d(c1Var.f10115b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.k1 b() {
        ArrayList arrayList = this.f10165b;
        if (arrayList.isEmpty()) {
            return b2.k1.f1774a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d1 d1Var = (d1) arrayList.get(i11);
            d1Var.d = i10;
            i10 += d1Var.f10122a.f42276o.e.o();
        }
        return new k1(arrayList, this.f10170j);
    }

    public final void c() {
        Iterator it = this.f10168g.iterator();
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            if (d1Var.f10124c.isEmpty()) {
                c1 c1Var = (c1) this.f10167f.get(d1Var);
                if (c1Var != null) {
                    c1Var.f10114a.d(c1Var.f10115b);
                }
                it.remove();
            }
        }
    }

    public final void d(d1 d1Var) {
        if (d1Var.e && d1Var.f10124c.isEmpty()) {
            c1 c1Var = (c1) this.f10167f.remove(d1Var);
            c1Var.getClass();
            b1 b1Var = c1Var.f10116c;
            u2.a aVar = c1Var.f10114a;
            aVar.p(c1Var.f10115b);
            aVar.s(b1Var);
            aVar.r(b1Var);
            this.f10168g.remove(d1Var);
        }
    }

    public final void e(d1 d1Var) {
        u2.b0 b0Var = d1Var.f10122a;
        ?? r12 = new u2.h0() {
            @Override
            public final void a(u2.a aVar, b2.k1 k1Var) {
                e2.z zVar = e1.this.e.f10298n;
                zVar.d(2);
                zVar.e(22);
            }
        };
        b1 b1Var = new b1(this, d1Var);
        this.f10167f.put(d1Var, new c1(b0Var, r12, b1Var));
        String str = e2.d0.f7188a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        a5.a aVar = b0Var.f42268c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f42373a = handler;
        obj.f42374b = b1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f13736c;
        ?? obj2 = new Object();
        obj2.f13732a = handler2;
        obj2.f13733b = b1Var;
        copyOnWriteArrayList.add(obj2);
        b0Var.l(r12, this.f10172l, this.f10164a);
    }

    public final void f(u2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.f10166c;
        d1 d1Var = (d1) identityHashMap.remove(e0Var);
        d1Var.getClass();
        d1Var.f10122a.o(e0Var);
        d1Var.f10124c.remove(((u2.y) e0Var).f42489a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(d1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f10165b;
            d1 d1Var = (d1) arrayList.remove(i12);
            this.d.remove(d1Var.f10123b);
            int i13 = -d1Var.f10122a.f42276o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((d1) arrayList.get(i14)).d += i13;
            }
            d1Var.e = true;
            if (this.f10171k) {
                d(d1Var);
            }
        }
    }
}
