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
    public final j2.k f10696a;
    public final o0 e;
    public final j2.f h;
    public final e2.z f10701i;
    public boolean f10703k;
    public g2.c0 f10704l;
    public u2.g1 f10702j = new u2.e1();
    public final IdentityHashMap f10698c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f10697b = new ArrayList();
    public final HashMap f10699f = new HashMap();
    public final HashSet f10700g = new HashSet();

    public f1(o0 o0Var, j2.f fVar, e2.z zVar, j2.k kVar) {
        this.f10696a = kVar;
        this.e = o0Var;
        this.h = fVar;
        this.f10701i = zVar;
    }

    public final b2.k1 a(int i10, ArrayList arrayList, u2.g1 g1Var) {
        if (!arrayList.isEmpty()) {
            this.f10702j = g1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                e1 e1Var = (e1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f10697b;
                if (i11 > 0) {
                    e1 e1Var2 = (e1) arrayList2.get(i11 - 1);
                    e1Var.d = e1Var2.f10680a.f43303o.e.o() + e1Var2.d;
                    e1Var.e = false;
                    e1Var.f10682c.clear();
                } else {
                    e1Var.d = 0;
                    e1Var.e = false;
                    e1Var.f10682c.clear();
                }
                int o9 = e1Var.f10680a.f43303o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((e1) arrayList2.get(i12)).d += o9;
                }
                arrayList2.add(i11, e1Var);
                this.d.put(e1Var.f10681b, e1Var);
                if (this.f10703k) {
                    e(e1Var);
                    if (this.f10698c.isEmpty()) {
                        this.f10700g.add(e1Var);
                    } else {
                        d1 d1Var = (d1) this.f10699f.get(e1Var);
                        if (d1Var != null) {
                            d1Var.f10638a.d(d1Var.f10639b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.k1 b() {
        ArrayList arrayList = this.f10697b;
        if (arrayList.isEmpty()) {
            return b2.k1.f3078a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            e1 e1Var = (e1) arrayList.get(i11);
            e1Var.d = i10;
            i10 += e1Var.f10680a.f43303o.e.o();
        }
        return new l1(arrayList, this.f10702j);
    }

    public final void c() {
        Iterator it = this.f10700g.iterator();
        while (it.hasNext()) {
            e1 e1Var = (e1) it.next();
            if (e1Var.f10682c.isEmpty()) {
                d1 d1Var = (d1) this.f10699f.get(e1Var);
                if (d1Var != null) {
                    d1Var.f10638a.d(d1Var.f10639b);
                }
                it.remove();
            }
        }
    }

    public final void d(e1 e1Var) {
        if (e1Var.e && e1Var.f10682c.isEmpty()) {
            d1 d1Var = (d1) this.f10699f.remove(e1Var);
            d1Var.getClass();
            c1 c1Var = d1Var.f10640c;
            u2.a aVar = d1Var.f10638a;
            aVar.p(d1Var.f10639b);
            aVar.s(c1Var);
            aVar.r(c1Var);
            this.f10700g.remove(e1Var);
        }
    }

    public final void e(e1 e1Var) {
        u2.a0 a0Var = e1Var.f10680a;
        ?? r12 = new u2.g0() {
            @Override
            public final void a(u2.a aVar, b2.k1 k1Var) {
                e2.z zVar = f1.this.e.f10821n;
                zVar.d(2);
                zVar.e(22);
            }
        };
        c1 c1Var = new c1(this, e1Var);
        this.f10699f.put(e1Var, new d1(a0Var, r12, c1Var));
        String str = e2.d0.f7885a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        a0Var.getClass();
        a5.a aVar = a0Var.f43297c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f43393a = handler;
        obj.f43394b = c1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.j jVar = a0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f14905c;
        ?? obj2 = new Object();
        obj2.f14901a = handler2;
        obj2.f14902b = c1Var;
        copyOnWriteArrayList.add(obj2);
        a0Var.l(r12, this.f10704l, this.f10696a);
    }

    public final void f(u2.d0 d0Var) {
        IdentityHashMap identityHashMap = this.f10698c;
        e1 e1Var = (e1) identityHashMap.remove(d0Var);
        e1Var.getClass();
        e1Var.f10680a.o(d0Var);
        e1Var.f10682c.remove(((u2.x) d0Var).f43523a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(e1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f10697b;
            e1 e1Var = (e1) arrayList.remove(i12);
            this.d.remove(e1Var.f10681b);
            int i13 = -e1Var.f10680a.f43303o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((e1) arrayList.get(i14)).d += i13;
            }
            e1Var.e = true;
            if (this.f10703k) {
                d(e1Var);
            }
        }
    }
}
