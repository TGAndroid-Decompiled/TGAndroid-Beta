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
    public final m2.i f19350a;
    public final o0 f19353e;
    public final m2.d h;
    public final h2.i0 f19356i;
    public boolean f19358k;
    public j2.c0 f19359l;
    public x2.i1 f19357j = new x2.g1();
    public final IdentityHashMap f19352c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f19351b = new ArrayList();
    public final HashMap f19354f = new HashMap();
    public final HashSet f19355g = new HashSet();

    public f1(o0 o0Var, m2.d dVar, h2.i0 i0Var, m2.i iVar) {
        this.f19350a = iVar;
        this.f19353e = o0Var;
        this.h = dVar;
        this.f19356i = i0Var;
    }

    public final e2.l1 a(int i7, ArrayList arrayList, x2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.f19357j = i1Var;
            for (int i10 = i7; i10 < arrayList.size() + i7; i10++) {
                e1 e1Var = (e1) arrayList.get(i10 - i7);
                ArrayList arrayList2 = this.f19351b;
                if (i10 > 0) {
                    e1 e1Var2 = (e1) arrayList2.get(i10 - 1);
                    e1Var.d = e1Var2.f19293a.f60046o.f60226e.o() + e1Var2.d;
                    e1Var.f19296e = false;
                    e1Var.f19295c.clear();
                } else {
                    e1Var.d = 0;
                    e1Var.f19296e = false;
                    e1Var.f19295c.clear();
                }
                int o4 = e1Var.f19293a.f60046o.f60226e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((e1) arrayList2.get(i11)).d += o4;
                }
                arrayList2.add(i10, e1Var);
                this.d.put(e1Var.f19294b, e1Var);
                if (this.f19358k) {
                    e(e1Var);
                    if (this.f19352c.isEmpty()) {
                        this.f19355g.add(e1Var);
                    } else {
                        d1 d1Var = (d1) this.f19354f.get(e1Var);
                        if (d1Var != null) {
                            d1Var.f19283a.d(d1Var.f19284b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final e2.l1 b() {
        ArrayList arrayList = this.f19351b;
        if (arrayList.isEmpty()) {
            return e2.l1.f10500a;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e1 e1Var = (e1) arrayList.get(i10);
            e1Var.d = i7;
            i7 += e1Var.f19293a.f60046o.f60226e.o();
        }
        return new l1(arrayList, this.f19357j);
    }

    public final void c() {
        Iterator it = this.f19355g.iterator();
        while (it.hasNext()) {
            e1 e1Var = (e1) it.next();
            if (e1Var.f19295c.isEmpty()) {
                d1 d1Var = (d1) this.f19354f.get(e1Var);
                if (d1Var != null) {
                    d1Var.f19283a.d(d1Var.f19284b);
                }
                it.remove();
            }
        }
    }

    public final void d(e1 e1Var) {
        if (e1Var.f19296e && e1Var.f19295c.isEmpty()) {
            d1 d1Var = (d1) this.f19354f.remove(e1Var);
            d1Var.getClass();
            c1 c1Var = d1Var.f19285c;
            x2.a aVar = d1Var.f19283a;
            aVar.p(d1Var.f19284b);
            aVar.s(c1Var);
            aVar.r(c1Var);
            this.f19355g.remove(e1Var);
        }
    }

    public final void e(e1 e1Var) {
        x2.b0 b0Var = e1Var.f19293a;
        ?? r12 = new x2.h0() {
            @Override
            public final void a(x2.a aVar, e2.l1 l1Var) {
                h2.i0 i0Var = f1.this.f19353e.f19499n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        c1 c1Var = new c1(this, e1Var);
        this.f19354f.put(e1Var, new d1(b0Var, r12, c1Var));
        String str = h2.l0.f13778a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        xa xaVar = b0Var.f60036c;
        xaVar.getClass();
        ?? obj = new Object();
        obj.f60125a = handler;
        obj.f60126b = c1Var;
        ((CopyOnWriteArrayList) xaVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        q2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f55771c;
        ?? obj2 = new Object();
        obj2.f55767a = handler2;
        obj2.f55768b = c1Var;
        copyOnWriteArrayList.add(obj2);
        b0Var.l(r12, this.f19359l, this.f19350a);
    }

    public final void f(x2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.f19352c;
        e1 e1Var = (e1) identityHashMap.remove(e0Var);
        e1Var.getClass();
        e1Var.f19293a.o(e0Var);
        e1Var.f19295c.remove(((x2.y) e0Var).f60290a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(e1Var);
    }

    public final void g(int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            ArrayList arrayList = this.f19351b;
            e1 e1Var = (e1) arrayList.remove(i11);
            this.d.remove(e1Var.f19294b);
            int i12 = -e1Var.f19293a.f60046o.f60226e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((e1) arrayList.get(i13)).d += i12;
            }
            e1Var.f19296e = true;
            if (this.f19358k) {
                d(e1Var);
            }
        }
    }
}
