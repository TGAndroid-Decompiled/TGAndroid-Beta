package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class g1 {
    public final j2.k f10700a;
    public final p0 e;
    public final j2.f h;
    public final e2.z f10705i;
    public boolean f10707k;
    public g2.c0 f10708l;
    public u2.g1 f10706j = new u2.e1();
    public final IdentityHashMap f10702c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f10701b = new ArrayList();
    public final HashMap f10703f = new HashMap();
    public final HashSet f10704g = new HashSet();

    public g1(p0 p0Var, j2.f fVar, e2.z zVar, j2.k kVar) {
        this.f10700a = kVar;
        this.e = p0Var;
        this.h = fVar;
        this.f10705i = zVar;
    }

    public final b2.k1 a(int i10, ArrayList arrayList, u2.g1 g1Var) {
        if (!arrayList.isEmpty()) {
            this.f10706j = g1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                f1 f1Var = (f1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f10701b;
                if (i11 > 0) {
                    f1 f1Var2 = (f1) arrayList2.get(i11 - 1);
                    f1Var.d = f1Var2.f10685a.f43637o.e.o() + f1Var2.d;
                    f1Var.e = false;
                    f1Var.f10687c.clear();
                } else {
                    f1Var.d = 0;
                    f1Var.e = false;
                    f1Var.f10687c.clear();
                }
                int o9 = f1Var.f10685a.f43637o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((f1) arrayList2.get(i12)).d += o9;
                }
                arrayList2.add(i11, f1Var);
                this.d.put(f1Var.f10686b, f1Var);
                if (this.f10707k) {
                    e(f1Var);
                    if (this.f10702c.isEmpty()) {
                        this.f10704g.add(f1Var);
                    } else {
                        e1 e1Var = (e1) this.f10703f.get(f1Var);
                        if (e1Var != null) {
                            e1Var.f10638a.d(e1Var.f10639b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.k1 b() {
        ArrayList arrayList = this.f10701b;
        if (arrayList.isEmpty()) {
            return b2.k1.f3075a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            f1 f1Var = (f1) arrayList.get(i11);
            f1Var.d = i10;
            i10 += f1Var.f10685a.f43637o.e.o();
        }
        return new m1(arrayList, this.f10706j);
    }

    public final void c() {
        Iterator it = this.f10704g.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if (f1Var.f10687c.isEmpty()) {
                e1 e1Var = (e1) this.f10703f.get(f1Var);
                if (e1Var != null) {
                    e1Var.f10638a.d(e1Var.f10639b);
                }
                it.remove();
            }
        }
    }

    public final void d(f1 f1Var) {
        if (f1Var.e && f1Var.f10687c.isEmpty()) {
            e1 e1Var = (e1) this.f10703f.remove(f1Var);
            e1Var.getClass();
            d1 d1Var = e1Var.f10640c;
            u2.a aVar = e1Var.f10638a;
            aVar.p(e1Var.f10639b);
            aVar.s(d1Var);
            aVar.r(d1Var);
            this.f10704g.remove(f1Var);
        }
    }

    public final void e(f1 f1Var) {
        u2.a0 a0Var = f1Var.f10685a;
        ?? r12 = new u2.g0() {
            @Override
            public final void a(u2.a aVar, b2.k1 k1Var) {
                e2.z zVar = g1.this.e.f10835n;
                zVar.d(2);
                zVar.e(22);
            }
        };
        d1 d1Var = new d1(this, f1Var);
        this.f10703f.put(f1Var, new e1(a0Var, r12, d1Var));
        String str = e2.d0.f7872a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        a0Var.getClass();
        a5.a aVar = a0Var.f43631c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f43718a = handler;
        obj.f43719b = d1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.j jVar = a0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f15170c;
        ?? obj2 = new Object();
        obj2.f15166a = handler2;
        obj2.f15167b = d1Var;
        copyOnWriteArrayList.add(obj2);
        a0Var.l(r12, this.f10708l, this.f10700a);
    }

    public final void f(u2.d0 d0Var) {
        IdentityHashMap identityHashMap = this.f10702c;
        f1 f1Var = (f1) identityHashMap.remove(d0Var);
        f1Var.getClass();
        f1Var.f10685a.o(d0Var);
        f1Var.f10687c.remove(((u2.x) d0Var).f43857a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(f1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f10701b;
            f1 f1Var = (f1) arrayList.remove(i12);
            this.d.remove(f1Var.f10686b);
            int i13 = -f1Var.f10685a.f43637o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((f1) arrayList.get(i14)).d += i13;
            }
            f1Var.e = true;
            if (this.f10707k) {
                d(f1Var);
            }
        }
    }
}
