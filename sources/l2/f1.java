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
    public final m2.i f19356a;
    public final o0 f19359e;
    public final m2.d h;
    public final h2.i0 f19362i;
    public boolean f19364k;
    public j2.c0 f19365l;
    public x2.i1 f19363j = new x2.g1();
    public final IdentityHashMap f19358c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f19357b = new ArrayList();
    public final HashMap f19360f = new HashMap();
    public final HashSet f19361g = new HashSet();

    public f1(o0 o0Var, m2.d dVar, h2.i0 i0Var, m2.i iVar) {
        this.f19356a = iVar;
        this.f19359e = o0Var;
        this.h = dVar;
        this.f19362i = i0Var;
    }

    public final e2.l1 a(int i7, ArrayList arrayList, x2.i1 i1Var) {
        if (!arrayList.isEmpty()) {
            this.f19363j = i1Var;
            for (int i10 = i7; i10 < arrayList.size() + i7; i10++) {
                e1 e1Var = (e1) arrayList.get(i10 - i7);
                ArrayList arrayList2 = this.f19357b;
                if (i10 > 0) {
                    e1 e1Var2 = (e1) arrayList2.get(i10 - 1);
                    e1Var.d = e1Var2.f19299a.f60035o.f60215e.o() + e1Var2.d;
                    e1Var.f19302e = false;
                    e1Var.f19301c.clear();
                } else {
                    e1Var.d = 0;
                    e1Var.f19302e = false;
                    e1Var.f19301c.clear();
                }
                int o4 = e1Var.f19299a.f60035o.f60215e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((e1) arrayList2.get(i11)).d += o4;
                }
                arrayList2.add(i10, e1Var);
                this.d.put(e1Var.f19300b, e1Var);
                if (this.f19364k) {
                    e(e1Var);
                    if (this.f19358c.isEmpty()) {
                        this.f19361g.add(e1Var);
                    } else {
                        d1 d1Var = (d1) this.f19360f.get(e1Var);
                        if (d1Var != null) {
                            d1Var.f19289a.d(d1Var.f19290b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final e2.l1 b() {
        ArrayList arrayList = this.f19357b;
        if (arrayList.isEmpty()) {
            return e2.l1.f10508a;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e1 e1Var = (e1) arrayList.get(i10);
            e1Var.d = i7;
            i7 += e1Var.f19299a.f60035o.f60215e.o();
        }
        return new l1(arrayList, this.f19363j);
    }

    public final void c() {
        Iterator it = this.f19361g.iterator();
        while (it.hasNext()) {
            e1 e1Var = (e1) it.next();
            if (e1Var.f19301c.isEmpty()) {
                d1 d1Var = (d1) this.f19360f.get(e1Var);
                if (d1Var != null) {
                    d1Var.f19289a.d(d1Var.f19290b);
                }
                it.remove();
            }
        }
    }

    public final void d(e1 e1Var) {
        if (e1Var.f19302e && e1Var.f19301c.isEmpty()) {
            d1 d1Var = (d1) this.f19360f.remove(e1Var);
            d1Var.getClass();
            c1 c1Var = d1Var.f19291c;
            x2.a aVar = d1Var.f19289a;
            aVar.p(d1Var.f19290b);
            aVar.s(c1Var);
            aVar.r(c1Var);
            this.f19361g.remove(e1Var);
        }
    }

    public final void e(e1 e1Var) {
        x2.b0 b0Var = e1Var.f19299a;
        ?? r12 = new x2.h0() {
            @Override
            public final void a(x2.a aVar, e2.l1 l1Var) {
                h2.i0 i0Var = f1.this.f19359e.f19505n;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        c1 c1Var = new c1(this, e1Var);
        this.f19360f.put(e1Var, new d1(b0Var, r12, c1Var));
        String str = h2.l0.f13786a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        b0Var.getClass();
        xa xaVar = b0Var.f60025c;
        xaVar.getClass();
        ?? obj = new Object();
        obj.f60114a = handler;
        obj.f60115b = c1Var;
        ((CopyOnWriteArrayList) xaVar.d).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        q2.j jVar = b0Var.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f55761c;
        ?? obj2 = new Object();
        obj2.f55757a = handler2;
        obj2.f55758b = c1Var;
        copyOnWriteArrayList.add(obj2);
        b0Var.l(r12, this.f19365l, this.f19356a);
    }

    public final void f(x2.e0 e0Var) {
        IdentityHashMap identityHashMap = this.f19358c;
        e1 e1Var = (e1) identityHashMap.remove(e0Var);
        e1Var.getClass();
        e1Var.f19299a.o(e0Var);
        e1Var.f19301c.remove(((x2.y) e0Var).f60279a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(e1Var);
    }

    public final void g(int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            ArrayList arrayList = this.f19357b;
            e1 e1Var = (e1) arrayList.remove(i11);
            this.d.remove(e1Var.f19300b);
            int i12 = -e1Var.f19299a.f60035o.f60215e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((e1) arrayList.get(i13)).d += i12;
            }
            e1Var.f19302e = true;
            if (this.f19364k) {
                d(e1Var);
            }
        }
    }
}
