package j3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class s1 {
    public final k3.k f10753a;
    public final q0 f10756e;
    public final k3.f h;
    public final f5.a0 f10759i;
    public boolean f10761k;
    public com.google.android.exoplayer2.upstream.y0 f10762l;
    public l4.h1 f10760j = new l4.f1();
    public final IdentityHashMap f10755c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f10754b = new ArrayList();
    public final HashMap f10757f = new HashMap();
    public final HashSet f10758g = new HashSet();

    public s1(q0 q0Var, k3.f fVar, f5.a0 a0Var, k3.k kVar) {
        this.f10753a = kVar;
        this.f10756e = q0Var;
        this.h = fVar;
        this.f10759i = a0Var;
    }

    public final r2 a(int i10, ArrayList arrayList, l4.h1 h1Var) {
        if (!arrayList.isEmpty()) {
            this.f10760j = h1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                r1 r1Var = (r1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f10754b;
                if (i11 > 0) {
                    r1 r1Var2 = (r1) arrayList2.get(i11 - 1);
                    r1Var.d = r1Var2.f10725a.f14453o.f14382b.o() + r1Var2.d;
                    r1Var.f10728e = false;
                    r1Var.f10727c.clear();
                } else {
                    r1Var.d = 0;
                    r1Var.f10728e = false;
                    r1Var.f10727c.clear();
                }
                int o10 = r1Var.f10725a.f14453o.f14382b.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((r1) arrayList2.get(i12)).d += o10;
                }
                arrayList2.add(i11, r1Var);
                this.d.put(r1Var.f10726b, r1Var);
                if (this.f10761k) {
                    e(r1Var);
                    if (this.f10755c.isEmpty()) {
                        this.f10758g.add(r1Var);
                    } else {
                        q1 q1Var = (q1) this.f10757f.get(r1Var);
                        if (q1Var != null) {
                            q1Var.f10692a.c(q1Var.f10693b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final r2 b() {
        ArrayList arrayList = this.f10754b;
        if (arrayList.isEmpty()) {
            return r2.f10729a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r1 r1Var = (r1) arrayList.get(i11);
            r1Var.d = i10;
            i10 += r1Var.f10725a.f14453o.f14382b.o();
        }
        return new f2(arrayList, this.f10760j);
    }

    public final void c() {
        Iterator it = this.f10758g.iterator();
        while (it.hasNext()) {
            r1 r1Var = (r1) it.next();
            if (r1Var.f10727c.isEmpty()) {
                q1 q1Var = (q1) this.f10757f.get(r1Var);
                if (q1Var != null) {
                    q1Var.f10692a.c(q1Var.f10693b);
                }
                it.remove();
            }
        }
    }

    public final void d(r1 r1Var) {
        if (r1Var.f10728e && r1Var.f10727c.isEmpty()) {
            q1 q1Var = (q1) this.f10757f.remove(r1Var);
            q1Var.getClass();
            g9.l lVar = q1Var.f10694c;
            l4.a aVar = q1Var.f10692a;
            aVar.o(q1Var.f10693b);
            aVar.r(lVar);
            aVar.q(lVar);
            this.f10758g.remove(r1Var);
        }
    }

    public final void e(r1 r1Var) {
        l4.w wVar = r1Var.f10725a;
        ?? r12 = new l4.d0() {
            @Override
            public final void a(l4.a aVar, r2 r2Var) {
                s1.this.f10756e.f10686n.d(22);
            }
        };
        g9.l lVar = new g9.l(10, this, r1Var);
        this.f10757f.put(r1Var, new q1(wVar, r12, lVar));
        int i10 = f5.d0.f6579a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        wVar.getClass();
        l4.g0 g0Var = wVar.f14258c;
        g0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = g0Var.f14321c;
        ?? obj = new Object();
        obj.f14304a = handler;
        obj.f14305b = lVar;
        copyOnWriteArrayList.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        ag.j2 j2Var = wVar.d;
        j2Var.getClass();
        ?? obj2 = new Object();
        obj2.f17104a = lVar;
        ((CopyOnWriteArrayList) j2Var.d).add(obj2);
        wVar.k(r12, this.f10762l, this.f10753a);
    }

    public final void f(l4.z zVar) {
        IdentityHashMap identityHashMap = this.f10755c;
        r1 r1Var = (r1) identityHashMap.remove(zVar);
        r1Var.getClass();
        r1Var.f10725a.n(zVar);
        r1Var.f10727c.remove(((l4.t) zVar).f14424a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(r1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f10754b;
            r1 r1Var = (r1) arrayList.remove(i12);
            this.d.remove(r1Var.f10726b);
            int i13 = -r1Var.f10725a.f14453o.f14382b.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((r1) arrayList.get(i14)).d += i13;
            }
            r1Var.f10728e = true;
            if (this.f10761k) {
                d(r1Var);
            }
        }
    }
}
