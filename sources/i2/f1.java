package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class f1 {
    public final j2.k f11540a;
    public final o0 f11543e;
    public final j2.f h;
    public final e2.z f11546i;
    public boolean f11548k;
    public g2.c0 f11549l;
    public u2.g1 f11547j = new u2.e1();
    public final IdentityHashMap f11542c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f11541b = new ArrayList();
    public final HashMap f11544f = new HashMap();
    public final HashSet f11545g = new HashSet();

    public f1(o0 o0Var, j2.f fVar, e2.z zVar, j2.k kVar) {
        this.f11540a = kVar;
        this.f11543e = o0Var;
        this.h = fVar;
        this.f11546i = zVar;
    }

    public final b2.k1 a(int i10, ArrayList arrayList, u2.g1 g1Var) {
        if (!arrayList.isEmpty()) {
            this.f11547j = g1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                e1 e1Var = (e1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f11541b;
                if (i11 > 0) {
                    e1 e1Var2 = (e1) arrayList2.get(i11 - 1);
                    e1Var.d = e1Var2.f11490a.f46613o.f46787e.o() + e1Var2.d;
                    e1Var.f11493e = false;
                    e1Var.f11492c.clear();
                } else {
                    e1Var.d = 0;
                    e1Var.f11493e = false;
                    e1Var.f11492c.clear();
                }
                int o9 = e1Var.f11490a.f46613o.f46787e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((e1) arrayList2.get(i12)).d += o9;
                }
                arrayList2.add(i11, e1Var);
                this.d.put(e1Var.f11491b, e1Var);
                if (this.f11548k) {
                    e(e1Var);
                    if (this.f11542c.isEmpty()) {
                        this.f11545g.add(e1Var);
                    } else {
                        d1 d1Var = (d1) this.f11544f.get(e1Var);
                        if (d1Var != null) {
                            d1Var.f11478a.d(d1Var.f11479b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.k1 b() {
        ArrayList arrayList = this.f11541b;
        if (arrayList.isEmpty()) {
            return b2.k1.f2131a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            e1 e1Var = (e1) arrayList.get(i11);
            e1Var.d = i10;
            i10 += e1Var.f11490a.f46613o.f46787e.o();
        }
        return new l1(arrayList, this.f11547j);
    }

    public final void c() {
        Iterator it = this.f11545g.iterator();
        while (it.hasNext()) {
            e1 e1Var = (e1) it.next();
            if (e1Var.f11492c.isEmpty()) {
                d1 d1Var = (d1) this.f11544f.get(e1Var);
                if (d1Var != null) {
                    d1Var.f11478a.d(d1Var.f11479b);
                }
                it.remove();
            }
        }
    }

    public final void d(e1 e1Var) {
        if (e1Var.f11493e && e1Var.f11492c.isEmpty()) {
            d1 d1Var = (d1) this.f11544f.remove(e1Var);
            d1Var.getClass();
            c1 c1Var = d1Var.f11480c;
            u2.a aVar = d1Var.f11478a;
            aVar.p(d1Var.f11479b);
            aVar.s(c1Var);
            aVar.r(c1Var);
            this.f11545g.remove(e1Var);
        }
    }

    public final void e(e1 e1Var) {
        u2.a0 a0Var = e1Var.f11490a;
        ?? r12 = new u2.g0() {
            @Override
            public final void a(u2.a aVar, b2.k1 k1Var) {
                e2.z zVar = f1.this.f11543e.f11675n;
                zVar.d(2);
                zVar.e(22);
            }
        };
        c1 c1Var = new c1(this, e1Var);
        this.f11544f.put(e1Var, new d1(a0Var, r12, c1Var));
        String str = e2.d0.f8737a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        a0Var.getClass();
        a5.a aVar = a0Var.f46606c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f46710a = handler;
        obj.f46711b = c1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.j jVar = a0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f16402c;
        ?? obj2 = new Object();
        obj2.f16398a = handler2;
        obj2.f16399b = c1Var;
        copyOnWriteArrayList.add(obj2);
        a0Var.l(r12, this.f11549l, this.f11540a);
    }

    public final void f(u2.d0 d0Var) {
        IdentityHashMap identityHashMap = this.f11542c;
        e1 e1Var = (e1) identityHashMap.remove(d0Var);
        e1Var.getClass();
        e1Var.f11490a.o(d0Var);
        e1Var.f11492c.remove(((u2.x) d0Var).f46849a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(e1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f11541b;
            e1 e1Var = (e1) arrayList.remove(i12);
            this.d.remove(e1Var.f11491b);
            int i13 = -e1Var.f11490a.f46613o.f46787e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((e1) arrayList.get(i14)).d += i13;
            }
            e1Var.f11493e = true;
            if (this.f11548k) {
                d(e1Var);
            }
        }
    }
}
