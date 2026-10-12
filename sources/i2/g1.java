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
    public final j2.k f11705a;
    public final p0 f11708e;
    public final j2.f h;
    public final e2.z f11711i;
    public boolean f11713k;
    public g2.c0 f11714l;
    public u2.f1 f11712j = new u2.d1();
    public final IdentityHashMap f11707c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f11706b = new ArrayList();
    public final HashMap f11709f = new HashMap();
    public final HashSet f11710g = new HashSet();

    public g1(p0 p0Var, j2.f fVar, e2.z zVar, j2.k kVar) {
        this.f11705a = kVar;
        this.f11708e = p0Var;
        this.h = fVar;
        this.f11711i = zVar;
    }

    public final b2.k1 a(int i10, ArrayList arrayList, u2.f1 f1Var) {
        if (!arrayList.isEmpty()) {
            this.f11712j = f1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                f1 f1Var2 = (f1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f11706b;
                if (i11 > 0) {
                    f1 f1Var3 = (f1) arrayList2.get(i11 - 1);
                    f1Var2.d = f1Var3.f11688a.f48749o.f48906e.o() + f1Var3.d;
                    f1Var2.f11691e = false;
                    f1Var2.f11690c.clear();
                } else {
                    f1Var2.d = 0;
                    f1Var2.f11691e = false;
                    f1Var2.f11690c.clear();
                }
                int o9 = f1Var2.f11688a.f48749o.f48906e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((f1) arrayList2.get(i12)).d += o9;
                }
                arrayList2.add(i11, f1Var2);
                this.d.put(f1Var2.f11689b, f1Var2);
                if (this.f11713k) {
                    e(f1Var2);
                    if (this.f11707c.isEmpty()) {
                        this.f11710g.add(f1Var2);
                    } else {
                        e1 e1Var = (e1) this.f11709f.get(f1Var2);
                        if (e1Var != null) {
                            e1Var.f11639a.d(e1Var.f11640b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.k1 b() {
        ArrayList arrayList = this.f11706b;
        if (arrayList.isEmpty()) {
            return b2.k1.f3402a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            f1 f1Var = (f1) arrayList.get(i11);
            f1Var.d = i10;
            i10 += f1Var.f11688a.f48749o.f48906e.o();
        }
        return new m1(arrayList, this.f11712j);
    }

    public final void c() {
        Iterator it = this.f11710g.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if (f1Var.f11690c.isEmpty()) {
                e1 e1Var = (e1) this.f11709f.get(f1Var);
                if (e1Var != null) {
                    e1Var.f11639a.d(e1Var.f11640b);
                }
                it.remove();
            }
        }
    }

    public final void d(f1 f1Var) {
        if (f1Var.f11691e && f1Var.f11690c.isEmpty()) {
            e1 e1Var = (e1) this.f11709f.remove(f1Var);
            e1Var.getClass();
            d1 d1Var = e1Var.f11641c;
            u2.a aVar = e1Var.f11639a;
            aVar.p(e1Var.f11640b);
            aVar.s(d1Var);
            aVar.r(d1Var);
            this.f11710g.remove(f1Var);
        }
    }

    public final void e(f1 f1Var) {
        u2.a0 a0Var = f1Var.f11688a;
        ?? r12 = new u2.g0() {
            @Override
            public final void a(u2.a aVar, b2.k1 k1Var) {
                e2.z zVar = g1.this.f11708e.f11851n;
                zVar.d(2);
                zVar.e(22);
            }
        };
        d1 d1Var = new d1(this, f1Var);
        this.f11709f.put(f1Var, new e1(a0Var, r12, d1Var));
        String str = e2.d0.f8529a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        a0Var.getClass();
        a5.a aVar = a0Var.f48742c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f48816a = handler;
        obj.f48817b = d1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.j jVar = a0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f16268c;
        ?? obj2 = new Object();
        obj2.f16264a = handler2;
        obj2.f16265b = d1Var;
        copyOnWriteArrayList.add(obj2);
        a0Var.l(r12, this.f11714l, this.f11705a);
    }

    public final void f(u2.d0 d0Var) {
        IdentityHashMap identityHashMap = this.f11707c;
        f1 f1Var = (f1) identityHashMap.remove(d0Var);
        f1Var.getClass();
        f1Var.f11688a.o(d0Var);
        f1Var.f11690c.remove(((u2.x) d0Var).f48961a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(f1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f11706b;
            f1 f1Var = (f1) arrayList.remove(i12);
            this.d.remove(f1Var.f11689b);
            int i13 = -f1Var.f11688a.f48749o.f48906e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((f1) arrayList.get(i14)).d += i13;
            }
            f1Var.f11691e = true;
            if (this.f11713k) {
                d(f1Var);
            }
        }
    }
}
