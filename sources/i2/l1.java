package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class l1 {
    public final j2.l f7958a;
    public final s0 e;
    public final j2.g h;
    public final e2.i0 f7963i;
    public boolean f7965k;
    public g2.d0 f7966l;
    public u2.i1 f7964j = new u2.g1();
    public final IdentityHashMap f7960c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f7959b = new ArrayList();
    public final HashMap f7961f = new HashMap();
    public final HashSet f7962g = new HashSet();

    public l1(s0 s0Var, j2.g gVar, e2.i0 i0Var, j2.l lVar) {
        this.f7958a = lVar;
        this.e = s0Var;
        this.h = gVar;
        this.f7963i = i0Var;
    }

    public final b2.o1 a(int i10, ArrayList arrayList, u2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.f7964j = i1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                k1 k1Var = (k1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f7959b;
                if (i11 > 0) {
                    k1 k1Var2 = (k1) arrayList2.get(i11 - 1);
                    k1Var.d = k1Var2.f7950a.f49841o.e.o() + k1Var2.d;
                    k1Var.e = false;
                    k1Var.f7952c.clear();
                } else {
                    k1Var.d = 0;
                    k1Var.e = false;
                    k1Var.f7952c.clear();
                }
                int o10 = k1Var.f7950a.f49841o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((k1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, k1Var);
                this.d.put(k1Var.f7951b, k1Var);
                if (this.f7965k) {
                    e(k1Var);
                    if (this.f7960c.isEmpty()) {
                        this.f7962g.add(k1Var);
                    } else {
                        j1 j1Var = (j1) this.f7961f.get(k1Var);
                        if (j1Var != null) {
                            j1Var.f7945a.d(j1Var.f7946b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.o1 b() {
        ArrayList arrayList = this.f7959b;
        if (arrayList.isEmpty()) {
            return b2.o1.f2172a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            k1 k1Var = (k1) arrayList.get(i11);
            k1Var.d = i10;
            i10 += k1Var.f7950a.f49841o.e.o();
        }
        return new r1(arrayList, this.f7964j);
    }

    public final void c() {
        Iterator it = this.f7962g.iterator();
        while (it.hasNext()) {
            k1 k1Var = (k1) it.next();
            if (k1Var.f7952c.isEmpty()) {
                j1 j1Var = (j1) this.f7961f.get(k1Var);
                if (j1Var != null) {
                    j1Var.f7945a.d(j1Var.f7946b);
                }
                it.remove();
            }
        }
    }

    public final void d(k1 k1Var) {
        if (k1Var.e && k1Var.f7952c.isEmpty()) {
            j1 j1Var = (j1) this.f7961f.remove(k1Var);
            j1Var.getClass();
            i1 i1Var = j1Var.f7947c;
            u2.a aVar = j1Var.f7945a;
            aVar.p(j1Var.f7946b);
            aVar.s(i1Var);
            aVar.r(i1Var);
            this.f7962g.remove(k1Var);
        }
    }

    public final void e(k1 k1Var) {
        u2.b0 b0Var = k1Var.f7950a;
        ?? r12 = new u2.h0() {
            @Override
            public final void a(u2.a aVar, b2.o1 o1Var) {
                e2.i0 i0Var = l1.this.e.f8064n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        i1 i1Var = new i1(this, k1Var);
        this.f7961f.put(k1Var, new j1(b0Var, r12, i1Var));
        String str = e2.l0.f6165a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        a5.a aVar = b0Var.f49833c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f49915a = handler;
        obj.f49916b = i1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f13464c;
        ?? obj2 = new Object();
        obj2.f13460a = handler2;
        obj2.f13461b = i1Var;
        copyOnWriteArrayList.add(obj2);
        b0Var.l(r12, this.f7966l, this.f7958a);
    }

    public final void f(u2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.f7960c;
        k1 k1Var = (k1) identityHashMap.remove(e0Var);
        k1Var.getClass();
        k1Var.f7950a.o(e0Var);
        k1Var.f7952c.remove(((u2.y) e0Var).f50067a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(k1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f7959b;
            k1 k1Var = (k1) arrayList.remove(i12);
            this.d.remove(k1Var.f7951b);
            int i13 = -k1Var.f7950a.f49841o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((k1) arrayList.get(i14)).d += i13;
            }
            k1Var.e = true;
            if (this.f7965k) {
                d(k1Var);
            }
        }
    }
}
