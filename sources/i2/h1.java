package i2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class h1 {
    public final j2.k f12421a;
    public final q0 e;
    public final j2.f h;
    public final e2.i0 f12426i;
    public boolean f12428k;
    public g2.c0 f12429l;
    public u2.h1 f12427j = new u2.f1();
    public final IdentityHashMap f12423c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f12422b = new ArrayList();
    public final HashMap f12424f = new HashMap();
    public final HashSet f12425g = new HashSet();

    public h1(q0 q0Var, j2.f fVar, e2.i0 i0Var, j2.k kVar) {
        this.f12421a = kVar;
        this.e = q0Var;
        this.h = fVar;
        this.f12426i = i0Var;
    }

    public final b2.o1 a(int i10, ArrayList arrayList, u2.h1 h1Var) {
        if (!arrayList.isEmpty()) {
            this.f12427j = h1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                g1 g1Var = (g1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f12422b;
                if (i11 > 0) {
                    g1 g1Var2 = (g1) arrayList2.get(i11 - 1);
                    g1Var.d = g1Var2.f12375a.f47299o.e.o() + g1Var2.d;
                    g1Var.e = false;
                    g1Var.f12377c.clear();
                } else {
                    g1Var.d = 0;
                    g1Var.e = false;
                    g1Var.f12377c.clear();
                }
                int o10 = g1Var.f12375a.f47299o.e.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((g1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, g1Var);
                this.d.put(g1Var.f12376b, g1Var);
                if (this.f12428k) {
                    e(g1Var);
                    if (this.f12423c.isEmpty()) {
                        this.f12425g.add(g1Var);
                    } else {
                        f1 f1Var = (f1) this.f12424f.get(g1Var);
                        if (f1Var != null) {
                            f1Var.f12358a.d(f1Var.f12359b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b2.o1 b() {
        ArrayList arrayList = this.f12422b;
        if (arrayList.isEmpty()) {
            return b2.o1.f3894a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            g1 g1Var = (g1) arrayList.get(i11);
            g1Var.d = i10;
            i10 += g1Var.f12375a.f47299o.e.o();
        }
        return new n1(arrayList, this.f12427j);
    }

    public final void c() {
        Iterator it = this.f12425g.iterator();
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            if (g1Var.f12377c.isEmpty()) {
                f1 f1Var = (f1) this.f12424f.get(g1Var);
                if (f1Var != null) {
                    f1Var.f12358a.d(f1Var.f12359b);
                }
                it.remove();
            }
        }
    }

    public final void d(g1 g1Var) {
        if (g1Var.e && g1Var.f12377c.isEmpty()) {
            f1 f1Var = (f1) this.f12424f.remove(g1Var);
            f1Var.getClass();
            e1 e1Var = f1Var.f12360c;
            u2.a aVar = f1Var.f12358a;
            aVar.p(f1Var.f12359b);
            aVar.s(e1Var);
            aVar.r(e1Var);
            this.f12425g.remove(g1Var);
        }
    }

    public final void e(g1 g1Var) {
        u2.a0 a0Var = g1Var.f12375a;
        ?? r12 = new u2.g0() {
            @Override
            public final void a(u2.a aVar, b2.o1 o1Var) {
                e2.i0 i0Var = h1.this.e.f12557n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        e1 e1Var = new e1(this, g1Var);
        this.f12424f.put(g1Var, new f1(a0Var, r12, e1Var));
        String str = e2.m0.f8255a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        a0Var.getClass();
        a5.a aVar = a0Var.f47293c;
        aVar.getClass();
        ?? obj = new Object();
        obj.f47370a = handler;
        obj.f47371b = e1Var;
        ((CopyOnWriteArrayList) aVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n2.k kVar = a0Var.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = kVar.f17062c;
        ?? obj2 = new Object();
        obj2.f17058a = handler2;
        obj2.f17059b = e1Var;
        copyOnWriteArrayList.add(obj2);
        a0Var.l(r12, this.f12429l, this.f12421a);
    }

    public final void f(u2.d0 d0Var) {
        IdentityHashMap identityHashMap = this.f12423c;
        g1 g1Var = (g1) identityHashMap.remove(d0Var);
        g1Var.getClass();
        g1Var.f12375a.o(d0Var);
        g1Var.f12377c.remove(((u2.x) d0Var).f47519a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(g1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f12422b;
            g1 g1Var = (g1) arrayList.remove(i12);
            this.d.remove(g1Var.f12376b);
            int i13 = -g1Var.f12375a.f47299o.e.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((g1) arrayList.get(i14)).d += i13;
            }
            g1Var.e = true;
            if (this.f12428k) {
                d(g1Var);
            }
        }
    }
}
