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
    public final m2.j f17900a;
    public final r0 f17903e;
    public final m2.e h;
    public final h2.i0 f17906i;
    public boolean f17908k;
    public j2.d0 f17909l;
    public x2.h1 f17907j = new x2.f1();
    public final IdentityHashMap f17902c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f17901b = new ArrayList();
    public final HashMap f17904f = new HashMap();
    public final HashSet f17905g = new HashSet();

    public j1(r0 r0Var, m2.e eVar, h2.i0 i0Var, m2.j jVar) {
        this.f17900a = jVar;
        this.f17903e = r0Var;
        this.h = eVar;
        this.f17906i = i0Var;
    }

    public final e2.l1 a(int i7, ArrayList arrayList, x2.h1 h1Var) {
        if (!arrayList.isEmpty()) {
            this.f17907j = h1Var;
            for (int i10 = i7; i10 < arrayList.size() + i7; i10++) {
                i1 i1Var = (i1) arrayList.get(i10 - i7);
                ArrayList arrayList2 = this.f17901b;
                if (i10 > 0) {
                    i1 i1Var2 = (i1) arrayList2.get(i10 - 1);
                    i1Var.d = i1Var2.f17891a.f58284o.f58465e.o() + i1Var2.d;
                    i1Var.f17894e = false;
                    i1Var.f17893c.clear();
                } else {
                    i1Var.d = 0;
                    i1Var.f17894e = false;
                    i1Var.f17893c.clear();
                }
                int o4 = i1Var.f17891a.f58284o.f58465e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((i1) arrayList2.get(i11)).d += o4;
                }
                arrayList2.add(i10, i1Var);
                this.d.put(i1Var.f17892b, i1Var);
                if (this.f17908k) {
                    e(i1Var);
                    if (this.f17902c.isEmpty()) {
                        this.f17905g.add(i1Var);
                    } else {
                        h1 h1Var2 = (h1) this.f17904f.get(i1Var);
                        if (h1Var2 != null) {
                            h1Var2.f17842a.d(h1Var2.f17843b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final e2.l1 b() {
        ArrayList arrayList = this.f17901b;
        if (arrayList.isEmpty()) {
            return e2.l1.f10354a;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i1 i1Var = (i1) arrayList.get(i10);
            i1Var.d = i7;
            i7 += i1Var.f17891a.f58284o.f58465e.o();
        }
        return new p1(arrayList, this.f17907j);
    }

    public final void c() {
        Iterator it = this.f17905g.iterator();
        while (it.hasNext()) {
            i1 i1Var = (i1) it.next();
            if (i1Var.f17893c.isEmpty()) {
                h1 h1Var = (h1) this.f17904f.get(i1Var);
                if (h1Var != null) {
                    h1Var.f17842a.d(h1Var.f17843b);
                }
                it.remove();
            }
        }
    }

    public final void d(i1 i1Var) {
        if (i1Var.f17894e && i1Var.f17893c.isEmpty()) {
            h1 h1Var = (h1) this.f17904f.remove(i1Var);
            h1Var.getClass();
            g1 g1Var = h1Var.f17844c;
            x2.a aVar = h1Var.f17842a;
            aVar.p(h1Var.f17843b);
            aVar.s(g1Var);
            aVar.r(g1Var);
            this.f17905g.remove(i1Var);
        }
    }

    public final void e(i1 i1Var) {
        x2.b0 b0Var = i1Var.f17891a;
        ?? r12 = new x2.h0() {
            @Override
            public final void a(x2.a aVar, e2.l1 l1Var) {
                h2.i0 i0Var = j1.this.f17903e.f18019n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        g1 g1Var = new g1(this, i1Var);
        this.f17904f.put(i1Var, new h1(b0Var, r12, g1Var));
        String str = h2.m0.f14112a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        wa waVar = b0Var.f58276c;
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
        q2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f53751c;
        ?? obj2 = new Object();
        obj2.f53747a = handler2;
        obj2.f53748b = g1Var;
        copyOnWriteArrayList.add(obj2);
        b0Var.l(r12, this.f17909l, this.f17900a);
    }

    public final void f(x2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.f17902c;
        i1 i1Var = (i1) identityHashMap.remove(e0Var);
        i1Var.getClass();
        i1Var.f17891a.o(e0Var);
        i1Var.f17893c.remove(((x2.y) e0Var).f58527a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(i1Var);
    }

    public final void g(int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            ArrayList arrayList = this.f17901b;
            i1 i1Var = (i1) arrayList.remove(i11);
            this.d.remove(i1Var.f17892b);
            int i12 = -i1Var.f17891a.f58284o.f58465e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((i1) arrayList.get(i13)).d += i12;
            }
            i1Var.f17894e = true;
            if (this.f17908k) {
                d(i1Var);
            }
        }
    }
}
