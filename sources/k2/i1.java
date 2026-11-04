package k2;

import android.os.Handler;
import android.os.Looper;
import b8.kg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class i1 {
    public final l2.k f16581a;
    public final r0 f16584e;
    public final l2.f h;
    public final g2.j0 f16587i;
    public boolean f16589k;
    public i2.d0 f16590l;
    public w2.i1 f16588j = new w2.g1();
    public final IdentityHashMap f16583c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f16582b = new ArrayList();
    public final HashMap f16585f = new HashMap();
    public final HashSet f16586g = new HashSet();

    public i1(r0 r0Var, l2.f fVar, g2.j0 j0Var, l2.k kVar) {
        this.f16581a = kVar;
        this.f16584e = r0Var;
        this.h = fVar;
        this.f16587i = j0Var;
    }

    public final d2.n1 a(int i3, ArrayList arrayList, w2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.f16588j = i1Var;
            for (int i10 = i3; i10 < arrayList.size() + i3; i10++) {
                h1 h1Var = (h1) arrayList.get(i10 - i3);
                ArrayList arrayList2 = this.f16582b;
                if (i10 > 0) {
                    h1 h1Var2 = (h1) arrayList2.get(i10 - 1);
                    h1Var.d = h1Var2.f16531a.f57029o.f57209e.o() + h1Var2.d;
                    h1Var.f16534e = false;
                    h1Var.f16533c.clear();
                } else {
                    h1Var.d = 0;
                    h1Var.f16534e = false;
                    h1Var.f16533c.clear();
                }
                int o10 = h1Var.f16531a.f57029o.f57209e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((h1) arrayList2.get(i11)).d += o10;
                }
                arrayList2.add(i10, h1Var);
                this.d.put(h1Var.f16532b, h1Var);
                if (this.f16589k) {
                    e(h1Var);
                    if (this.f16583c.isEmpty()) {
                        this.f16586g.add(h1Var);
                    } else {
                        g1 g1Var = (g1) this.f16585f.get(h1Var);
                        if (g1Var != null) {
                            g1Var.f16509a.d(g1Var.f16510b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final d2.n1 b() {
        ArrayList arrayList = this.f16582b;
        if (arrayList.isEmpty()) {
            return d2.n1.f8245a;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h1 h1Var = (h1) arrayList.get(i10);
            h1Var.d = i3;
            i3 += h1Var.f16531a.f57029o.f57209e.o();
        }
        return new o1(arrayList, this.f16588j);
    }

    public final void c() {
        Iterator it = this.f16586g.iterator();
        while (it.hasNext()) {
            h1 h1Var = (h1) it.next();
            if (h1Var.f16533c.isEmpty()) {
                g1 g1Var = (g1) this.f16585f.get(h1Var);
                if (g1Var != null) {
                    g1Var.f16509a.d(g1Var.f16510b);
                }
                it.remove();
            }
        }
    }

    public final void d(h1 h1Var) {
        if (h1Var.f16534e && h1Var.f16533c.isEmpty()) {
            g1 g1Var = (g1) this.f16585f.remove(h1Var);
            g1Var.getClass();
            f1 f1Var = g1Var.f16511c;
            w2.a aVar = g1Var.f16509a;
            aVar.p(g1Var.f16510b);
            aVar.s(f1Var);
            aVar.r(f1Var);
            this.f16586g.remove(h1Var);
        }
    }

    public final void e(h1 h1Var) {
        w2.b0 b0Var = h1Var.f16531a;
        ?? r12 = new w2.h0() {
            @Override
            public final void a(w2.a aVar, d2.n1 n1Var) {
                g2.j0 j0Var = i1.this.f16584e.f16705n;
                j0Var.e(2);
                j0Var.f(22);
            }
        };
        f1 f1Var = new f1(this, h1Var);
        this.f16585f.put(h1Var, new g1(b0Var, r12, f1Var));
        String str = g2.n0.f11873a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        kg kgVar = b0Var.f57019c;
        kgVar.getClass();
        ?? obj = new Object();
        obj.f57108a = handler;
        obj.f57109b = f1Var;
        ((CopyOnWriteArrayList) kgVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        p2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f53117c;
        ?? obj2 = new Object();
        obj2.f53113a = handler2;
        obj2.f53114b = f1Var;
        copyOnWriteArrayList.add(obj2);
        b0Var.l(r12, this.f16590l, this.f16581a);
    }

    public final void f(w2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.f16583c;
        h1 h1Var = (h1) identityHashMap.remove(e0Var);
        h1Var.getClass();
        h1Var.f16531a.o(e0Var);
        h1Var.f16533c.remove(((w2.y) e0Var).f57273a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(h1Var);
    }

    public final void g(int i3, int i10) {
        for (int i11 = i10 - 1; i11 >= i3; i11--) {
            ArrayList arrayList = this.f16582b;
            h1 h1Var = (h1) arrayList.remove(i11);
            this.d.remove(h1Var.f16532b);
            int i12 = -h1Var.f16531a.f57029o.f57209e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((h1) arrayList.get(i13)).d += i12;
            }
            h1Var.f16534e = true;
            if (this.f16589k) {
                d(h1Var);
            }
        }
    }
}
