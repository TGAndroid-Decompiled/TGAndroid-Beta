package i2;

import a8.ng;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class j1 {
    public final j2.j f13623a;
    public final s0 e;
    public final j2.e h;
    public final e2.i0 f13628i;
    public boolean f13630k;
    public g2.c0 f13631l;
    public u2.i1 f13629j = new u2.g1();
    public final IdentityHashMap f13625c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f13624b = new ArrayList();
    public final HashMap f13626f = new HashMap();
    public final HashSet f13627g = new HashSet();

    public j1(s0 s0Var, j2.e eVar, e2.i0 i0Var, j2.j jVar) {
        this.f13623a = jVar;
        this.e = s0Var;
        this.h = eVar;
        this.f13628i = i0Var;
    }

    public final b2.p1 a(int i10, ArrayList arrayList, u2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.f13629j = i1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                i1 i1Var2 = (i1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f13624b;
                if (i11 > 0) {
                    i1 i1Var3 = (i1) arrayList2.get(i11 - 1);
                    i1Var2.d = i1Var3.f13576a.f49249o.e.o() + i1Var3.d;
                    i1Var2.e = false;
                    i1Var2.f13578c.clear();
                } else {
                    i1Var2.d = 0;
                    i1Var2.e = false;
                    i1Var2.f13578c.clear();
                }
                int o10 = i1Var2.f13576a.f49249o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((i1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, i1Var2);
                this.d.put(i1Var2.f13577b, i1Var2);
                if (this.f13630k) {
                    e(i1Var2);
                    if (this.f13625c.isEmpty()) {
                        this.f13627g.add(i1Var2);
                    } else {
                        h1 h1Var = (h1) this.f13626f.get(i1Var2);
                        if (h1Var != null) {
                            h1Var.f13555a.d(h1Var.f13556b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.p1 b() {
        ArrayList arrayList = this.f13624b;
        if (arrayList.isEmpty()) {
            return b2.p1.f3348a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i1 i1Var = (i1) arrayList.get(i11);
            i1Var.d = i10;
            i10 += i1Var.f13576a.f49249o.e.o();
        }
        return new p1(arrayList, this.f13629j);
    }

    public final void c() {
        Iterator it = this.f13627g.iterator();
        while (it.hasNext()) {
            i1 i1Var = (i1) it.next();
            if (i1Var.f13578c.isEmpty()) {
                h1 h1Var = (h1) this.f13626f.get(i1Var);
                if (h1Var != null) {
                    h1Var.f13555a.d(h1Var.f13556b);
                }
                it.remove();
            }
        }
    }

    public final void d(i1 i1Var) {
        if (i1Var.e && i1Var.f13578c.isEmpty()) {
            h1 h1Var = (h1) this.f13626f.remove(i1Var);
            h1Var.getClass();
            g1 g1Var = h1Var.f13557c;
            u2.a aVar = h1Var.f13555a;
            aVar.p(h1Var.f13556b);
            aVar.s(g1Var);
            aVar.r(g1Var);
            this.f13627g.remove(i1Var);
        }
    }

    public final void e(i1 i1Var) {
        u2.b0 b0Var = i1Var.f13576a;
        ?? r12 = new u2.h0() {
            @Override
            public final void a(u2.a aVar, b2.p1 p1Var) {
                e2.i0 i0Var = j1.this.e.f13744n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        g1 g1Var = new g1(this, i1Var);
        this.f13626f.put(i1Var, new h1(b0Var, r12, g1Var));
        String str = e2.n0.f9692a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        ng ngVar = b0Var.f49241c;
        ngVar.getClass();
        ?? obj = new Object();
        obj.f49323a = handler;
        obj.f49324b = g1Var;
        ((CopyOnWriteArrayList) ngVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f18627c;
        ?? obj2 = new Object();
        obj2.f18623a = handler2;
        obj2.f18624b = g1Var;
        copyOnWriteArrayList.add(obj2);
        b0Var.l(r12, this.f13631l, this.f13623a);
    }

    public final void f(u2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.f13625c;
        i1 i1Var = (i1) identityHashMap.remove(e0Var);
        i1Var.getClass();
        i1Var.f13576a.o(e0Var);
        i1Var.f13578c.remove(((u2.y) e0Var).f49474a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(i1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f13624b;
            i1 i1Var = (i1) arrayList.remove(i12);
            this.d.remove(i1Var.f13577b);
            int i13 = -i1Var.f13576a.f49249o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((i1) arrayList.get(i14)).d += i13;
            }
            i1Var.e = true;
            if (this.f13630k) {
                d(i1Var);
            }
        }
    }
}
