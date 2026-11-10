package l2;

import a8.wa;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class j1 {
    public final m2.j f17903a;
    public final r0 f17906e;
    public final m2.e h;
    public final h2.i0 f17909i;
    public boolean f17911k;
    public j2.d0 f17912l;
    public x2.g1 f17910j = new x2.e1();
    public final IdentityHashMap f17905c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f17904b = new ArrayList();
    public final HashMap f17907f = new HashMap();
    public final HashSet f17908g = new HashSet();

    public j1(r0 r0Var, m2.e eVar, h2.i0 i0Var, m2.j jVar) {
        this.f17903a = jVar;
        this.f17906e = r0Var;
        this.h = eVar;
        this.f17909i = i0Var;
    }

    public final e2.l1 a(int i7, ArrayList arrayList, x2.g1 g1Var) {
        if (!arrayList.isEmpty()) {
            this.f17910j = g1Var;
            for (int i10 = i7; i10 < arrayList.size() + i7; i10++) {
                i1 i1Var = (i1) arrayList.get(i10 - i7);
                ArrayList arrayList2 = this.f17904b;
                if (i10 > 0) {
                    i1 i1Var2 = (i1) arrayList2.get(i10 - 1);
                    i1Var.d = i1Var2.f17894a.f58287o.f58462e.o() + i1Var2.d;
                    i1Var.f17897e = false;
                    i1Var.f17896c.clear();
                } else {
                    i1Var.d = 0;
                    i1Var.f17897e = false;
                    i1Var.f17896c.clear();
                }
                int o4 = i1Var.f17894a.f58287o.f58462e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((i1) arrayList2.get(i11)).d += o4;
                }
                arrayList2.add(i10, i1Var);
                this.d.put(i1Var.f17895b, i1Var);
                if (this.f17911k) {
                    e(i1Var);
                    if (this.f17905c.isEmpty()) {
                        this.f17908g.add(i1Var);
                    } else {
                        h1 h1Var = (h1) this.f17907f.get(i1Var);
                        if (h1Var != null) {
                            h1Var.f17845a.d(h1Var.f17846b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final e2.l1 b() {
        ArrayList arrayList = this.f17904b;
        if (arrayList.isEmpty()) {
            return e2.l1.f10359a;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i1 i1Var = (i1) arrayList.get(i10);
            i1Var.d = i7;
            i7 += i1Var.f17894a.f58287o.f58462e.o();
        }
        return new p1(arrayList, this.f17910j);
    }

    public final void c() {
        Iterator it = this.f17908g.iterator();
        while (it.hasNext()) {
            i1 i1Var = (i1) it.next();
            if (i1Var.f17896c.isEmpty()) {
                h1 h1Var = (h1) this.f17907f.get(i1Var);
                if (h1Var != null) {
                    h1Var.f17845a.d(h1Var.f17846b);
                }
                it.remove();
            }
        }
    }

    public final void d(i1 i1Var) {
        if (i1Var.f17897e && i1Var.f17896c.isEmpty()) {
            h1 h1Var = (h1) this.f17907f.remove(i1Var);
            h1Var.getClass();
            g1 g1Var = h1Var.f17847c;
            x2.a aVar = h1Var.f17845a;
            aVar.p(h1Var.f17846b);
            aVar.s(g1Var);
            aVar.r(g1Var);
            this.f17908g.remove(i1Var);
        }
    }

    public final void e(i1 i1Var) {
        x2.a0 a0Var = i1Var.f17894a;
        ?? r12 = new x2.g0() {
            @Override
            public final void a(x2.a aVar, e2.l1 l1Var) {
                h2.i0 i0Var = j1.this.f17906e.f18022n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        g1 g1Var = new g1(this, i1Var);
        this.f17907f.put(i1Var, new h1(a0Var, r12, g1Var));
        String str = h2.m0.f14114a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        a0Var.getClass();
        wa waVar = a0Var.f58280c;
        waVar.getClass();
        ?? obj = new Object();
        obj.f58375a = handler;
        obj.f58376b = g1Var;
        ((CopyOnWriteArrayList) waVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        q2.j jVar = a0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f53750c;
        ?? obj2 = new Object();
        obj2.f53746a = handler2;
        obj2.f53747b = g1Var;
        copyOnWriteArrayList.add(obj2);
        a0Var.l(r12, this.f17912l, this.f17903a);
    }

    public final void f(x2.d0 d0Var) {
        IdentityHashMap identityHashMap = this.f17905c;
        i1 i1Var = (i1) identityHashMap.remove(d0Var);
        i1Var.getClass();
        i1Var.f17894a.o(d0Var);
        i1Var.f17896c.remove(((x2.x) d0Var).f58524a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(i1Var);
    }

    public final void g(int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            ArrayList arrayList = this.f17904b;
            i1 i1Var = (i1) arrayList.remove(i11);
            this.d.remove(i1Var.f17895b);
            int i12 = -i1Var.f17894a.f58287o.f58462e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((i1) arrayList.get(i13)).d += i12;
            }
            i1Var.f17897e = true;
            if (this.f17911k) {
                d(i1Var);
            }
        }
    }
}
