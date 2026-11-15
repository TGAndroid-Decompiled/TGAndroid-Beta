package l2;

import a8.xa;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class f1 {
    public final m2.j f18989a;
    public final o0 f18992e;
    public final m2.e h;
    public final h2.i0 f18995i;
    public boolean f18997k;
    public j2.c0 f18998l;
    public x2.g1 f18996j = new x2.e1();
    public final IdentityHashMap f18991c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f18990b = new ArrayList();
    public final HashMap f18993f = new HashMap();
    public final HashSet f18994g = new HashSet();

    public f1(o0 o0Var, m2.e eVar, h2.i0 i0Var, m2.j jVar) {
        this.f18989a = jVar;
        this.f18992e = o0Var;
        this.h = eVar;
        this.f18995i = i0Var;
    }

    public final e2.l1 a(int i7, ArrayList arrayList, x2.g1 g1Var) {
        if (!arrayList.isEmpty()) {
            this.f18996j = g1Var;
            for (int i10 = i7; i10 < arrayList.size() + i7; i10++) {
                e1 e1Var = (e1) arrayList.get(i10 - i7);
                ArrayList arrayList2 = this.f18990b;
                if (i10 > 0) {
                    e1 e1Var2 = (e1) arrayList2.get(i10 - 1);
                    e1Var.d = e1Var2.f18932a.f59468o.f59643e.o() + e1Var2.d;
                    e1Var.f18935e = false;
                    e1Var.f18934c.clear();
                } else {
                    e1Var.d = 0;
                    e1Var.f18935e = false;
                    e1Var.f18934c.clear();
                }
                int o4 = e1Var.f18932a.f59468o.f59643e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((e1) arrayList2.get(i11)).d += o4;
                }
                arrayList2.add(i10, e1Var);
                this.d.put(e1Var.f18933b, e1Var);
                if (this.f18997k) {
                    e(e1Var);
                    if (this.f18991c.isEmpty()) {
                        this.f18994g.add(e1Var);
                    } else {
                        d1 d1Var = (d1) this.f18993f.get(e1Var);
                        if (d1Var != null) {
                            d1Var.f18922a.d(d1Var.f18923b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final e2.l1 b() {
        ArrayList arrayList = this.f18990b;
        if (arrayList.isEmpty()) {
            return e2.l1.f10190a;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e1 e1Var = (e1) arrayList.get(i10);
            e1Var.d = i7;
            i7 += e1Var.f18932a.f59468o.f59643e.o();
        }
        return new l1(arrayList, this.f18996j);
    }

    public final void c() {
        Iterator it = this.f18994g.iterator();
        while (it.hasNext()) {
            e1 e1Var = (e1) it.next();
            if (e1Var.f18934c.isEmpty()) {
                d1 d1Var = (d1) this.f18993f.get(e1Var);
                if (d1Var != null) {
                    d1Var.f18922a.d(d1Var.f18923b);
                }
                it.remove();
            }
        }
    }

    public final void d(e1 e1Var) {
        if (e1Var.f18935e && e1Var.f18934c.isEmpty()) {
            d1 d1Var = (d1) this.f18993f.remove(e1Var);
            d1Var.getClass();
            c1 c1Var = d1Var.f18924c;
            x2.a aVar = d1Var.f18922a;
            aVar.p(d1Var.f18923b);
            aVar.s(c1Var);
            aVar.r(c1Var);
            this.f18994g.remove(e1Var);
        }
    }

    public final void e(e1 e1Var) {
        x2.a0 a0Var = e1Var.f18932a;
        ?? r12 = new x2.g0() {
            @Override
            public final void a(x2.a aVar, e2.l1 l1Var) {
                h2.i0 i0Var = f1.this.f18992e.f19138n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        c1 c1Var = new c1(this, e1Var);
        this.f18993f.put(e1Var, new d1(a0Var, r12, c1Var));
        String str = h2.l0.f13471a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        a0Var.getClass();
        xa xaVar = a0Var.f59461c;
        xaVar.getClass();
        ?? obj = new Object();
        obj.f59556a = handler;
        obj.f59557b = c1Var;
        ((CopyOnWriteArrayList) xaVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        q2.k kVar = a0Var.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = kVar.f55187c;
        ?? obj2 = new Object();
        obj2.f55183a = handler2;
        obj2.f55184b = c1Var;
        copyOnWriteArrayList.add(obj2);
        a0Var.l(r12, this.f18998l, this.f18989a);
    }

    public final void f(x2.d0 d0Var) {
        IdentityHashMap identityHashMap = this.f18991c;
        e1 e1Var = (e1) identityHashMap.remove(d0Var);
        e1Var.getClass();
        e1Var.f18932a.o(d0Var);
        e1Var.f18934c.remove(((x2.x) d0Var).f59707a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(e1Var);
    }

    public final void g(int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            ArrayList arrayList = this.f18990b;
            e1 e1Var = (e1) arrayList.remove(i11);
            this.d.remove(e1Var.f18933b);
            int i12 = -e1Var.f18932a.f59468o.f59643e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((e1) arrayList.get(i13)).d += i12;
            }
            e1Var.f18935e = true;
            if (this.f18997k) {
                d(e1Var);
            }
        }
    }
}
