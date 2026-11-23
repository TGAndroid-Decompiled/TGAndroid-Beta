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
public final class g1 {
    public final m2.i f19454a;
    public final p0 f19457e;
    public final m2.d h;
    public final h2.i0 f19460i;
    public boolean f19462k;
    public j2.c0 f19463l;
    public x2.i1 f19461j = new x2.g1();
    public final IdentityHashMap f19456c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f19455b = new ArrayList();
    public final HashMap f19458f = new HashMap();
    public final HashSet f19459g = new HashSet();

    public g1(p0 p0Var, m2.d dVar, h2.i0 i0Var, m2.i iVar) {
        this.f19454a = iVar;
        this.f19457e = p0Var;
        this.h = dVar;
        this.f19460i = i0Var;
    }

    public final e2.l1 a(int i7, ArrayList arrayList, x2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.f19461j = i1Var;
            for (int i10 = i7; i10 < arrayList.size() + i7; i10++) {
                f1 f1Var = (f1) arrayList.get(i10 - i7);
                ArrayList arrayList2 = this.f19455b;
                if (i10 > 0) {
                    f1 f1Var2 = (f1) arrayList2.get(i10 - 1);
                    f1Var.d = f1Var2.f19397a.f60164o.f60344e.o() + f1Var2.d;
                    f1Var.f19400e = false;
                    f1Var.f19399c.clear();
                } else {
                    f1Var.d = 0;
                    f1Var.f19400e = false;
                    f1Var.f19399c.clear();
                }
                int o4 = f1Var.f19397a.f60164o.f60344e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((f1) arrayList2.get(i11)).d += o4;
                }
                arrayList2.add(i10, f1Var);
                this.d.put(f1Var.f19398b, f1Var);
                if (this.f19462k) {
                    e(f1Var);
                    if (this.f19456c.isEmpty()) {
                        this.f19459g.add(f1Var);
                    } else {
                        e1 e1Var = (e1) this.f19458f.get(f1Var);
                        if (e1Var != null) {
                            e1Var.f19387a.d(e1Var.f19388b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final e2.l1 b() {
        ArrayList arrayList = this.f19455b;
        if (arrayList.isEmpty()) {
            return e2.l1.f10498a;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f1 f1Var = (f1) arrayList.get(i10);
            f1Var.d = i7;
            i7 += f1Var.f19397a.f60164o.f60344e.o();
        }
        return new m1(arrayList, this.f19461j);
    }

    public final void c() {
        Iterator it = this.f19459g.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if (f1Var.f19399c.isEmpty()) {
                e1 e1Var = (e1) this.f19458f.get(f1Var);
                if (e1Var != null) {
                    e1Var.f19387a.d(e1Var.f19388b);
                }
                it.remove();
            }
        }
    }

    public final void d(f1 f1Var) {
        if (f1Var.f19400e && f1Var.f19399c.isEmpty()) {
            e1 e1Var = (e1) this.f19458f.remove(f1Var);
            e1Var.getClass();
            d1 d1Var = e1Var.f19389c;
            x2.a aVar = e1Var.f19387a;
            aVar.p(e1Var.f19388b);
            aVar.s(d1Var);
            aVar.r(d1Var);
            this.f19459g.remove(f1Var);
        }
    }

    public final void e(f1 f1Var) {
        x2.b0 b0Var = f1Var.f19397a;
        ?? r12 = new x2.h0() {
            @Override
            public final void a(x2.a aVar, e2.l1 l1Var) {
                h2.i0 i0Var = g1.this.f19457e.f19603n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        d1 d1Var = new d1(this, f1Var);
        this.f19458f.put(f1Var, new e1(b0Var, r12, d1Var));
        String str = h2.l0.f13778a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        xa xaVar = b0Var.f60154c;
        xaVar.getClass();
        ?? obj = new Object();
        obj.f60243a = handler;
        obj.f60244b = d1Var;
        ((CopyOnWriteArrayList) xaVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        q2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f55884c;
        ?? obj2 = new Object();
        obj2.f55880a = handler2;
        obj2.f55881b = d1Var;
        copyOnWriteArrayList.add(obj2);
        b0Var.l(r12, this.f19463l, this.f19454a);
    }

    public final void f(x2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.f19456c;
        f1 f1Var = (f1) identityHashMap.remove(e0Var);
        f1Var.getClass();
        f1Var.f19397a.o(e0Var);
        f1Var.f19399c.remove(((x2.y) e0Var).f60408a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(f1Var);
    }

    public final void g(int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            ArrayList arrayList = this.f19455b;
            f1 f1Var = (f1) arrayList.remove(i11);
            this.d.remove(f1Var.f19398b);
            int i12 = -f1Var.f19397a.f60164o.f60344e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((f1) arrayList.get(i13)).d += i12;
            }
            f1Var.f19400e = true;
            if (this.f19462k) {
                d(f1Var);
            }
        }
    }
}
