package h3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class s1 {

    public final i3.k f8146a;

    public final q0 f8149e;
    public final i3.f h;

    public final d5.d0 f8152i;

    public boolean f8154k;

    public com.google.android.exoplayer2.upstream.y0 f8155l;

    public j4.g1 f8153j = new j4.e1();

    public final IdentityHashMap f8148c = new IdentityHashMap();
    public final HashMap d = new HashMap();

    public final ArrayList f8147b = new ArrayList();

    public final HashMap f8150f = new HashMap();

    public final HashSet f8151g = new HashSet();

    public s1(q0 q0Var, i3.f fVar, d5.d0 d0Var, i3.k kVar) {
        this.f8146a = kVar;
        this.f8149e = q0Var;
        this.h = fVar;
        this.f8152i = d0Var;
    }

    public final s2 a(int i10, ArrayList arrayList, j4.g1 g1Var) {
        if (!arrayList.isEmpty()) {
            this.f8153j = g1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                r1 r1Var = (r1) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f8147b;
                if (i11 > 0) {
                    r1 r1Var2 = (r1) arrayList2.get(i11 - 1);
                    r1Var.d = r1Var2.f8108a.f12698o.f12623b.o() + r1Var2.d;
                    r1Var.f8111e = false;
                    r1Var.f8110c.clear();
                } else {
                    r1Var.d = 0;
                    r1Var.f8111e = false;
                    r1Var.f8110c.clear();
                }
                int iO = r1Var.f8108a.f12698o.f12623b.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((r1) arrayList2.get(i12)).d += iO;
                }
                arrayList2.add(i11, r1Var);
                this.d.put(r1Var.f8109b, r1Var);
                if (this.f8154k) {
                    e(r1Var);
                    if (this.f8148c.isEmpty()) {
                        this.f8151g.add(r1Var);
                    } else {
                        q1 q1Var = (q1) this.f8150f.get(r1Var);
                        if (q1Var != null) {
                            q1Var.f8085a.c(q1Var.f8086b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final s2 b() {
        ArrayList arrayList = this.f8147b;
        if (arrayList.isEmpty()) {
            return s2.f8156a;
        }
        int iO = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r1 r1Var = (r1) arrayList.get(i10);
            r1Var.d = iO;
            iO += r1Var.f8108a.f12698o.f12623b.o();
        }
        return new f2(arrayList, this.f8153j);
    }

    public final void c() {
        Iterator it = this.f8151g.iterator();
        while (it.hasNext()) {
            r1 r1Var = (r1) it.next();
            if (r1Var.f8110c.isEmpty()) {
                q1 q1Var = (q1) this.f8150f.get(r1Var);
                if (q1Var != null) {
                    q1Var.f8085a.c(q1Var.f8086b);
                }
                it.remove();
            }
        }
    }

    public final void d(r1 r1Var) {
        if (r1Var.f8111e && r1Var.f8110c.isEmpty()) {
            q1 q1Var = (q1) this.f8150f.remove(r1Var);
            q1Var.getClass();
            g5.b bVar = q1Var.f8087c;
            j4.a aVar = q1Var.f8085a;
            aVar.o(q1Var.f8086b);
            aVar.r(bVar);
            aVar.q(bVar);
            this.f8151g.remove(r1Var);
        }
    }

    public final void e(r1 r1Var) {
        j4.w wVar = r1Var.f8108a;
        ?? r10 = new j4.d0() {
            @Override
            public final void a(j4.a aVar, s2 s2Var) {
                this.f8021a.f8149e.f8079n.d(22);
            }
        };
        g5.b bVar = new g5.b(this, r1Var, false, 3);
        this.f8150f.put(r1Var, new q1(wVar, r10, bVar));
        int i10 = d5.g0.f4795a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        wVar.getClass();
        j4.g0 g0Var = wVar.f12499c;
        g0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = g0Var.f12563c;
        j4.f0 f0Var = new j4.f0();
        f0Var.f12548a = handler;
        f0Var.f12549b = bVar;
        copyOnWriteArrayList.add(f0Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        b6.a aVar = wVar.d;
        aVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) aVar.d;
        l3.g gVar = new l3.g();
        gVar.f15394a = bVar;
        copyOnWriteArrayList2.add(gVar);
        wVar.k(r10, this.f8155l, this.f8146a);
    }

    public final void f(j4.z zVar) {
        IdentityHashMap identityHashMap = this.f8148c;
        r1 r1Var = (r1) identityHashMap.remove(zVar);
        r1Var.getClass();
        r1Var.f8108a.n(zVar);
        r1Var.f8110c.remove(((j4.t) zVar).f12667a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(r1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f8147b;
            r1 r1Var = (r1) arrayList.remove(i12);
            this.d.remove(r1Var.f8109b);
            int i13 = -r1Var.f8108a.f12698o.f12623b.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((r1) arrayList.get(i14)).d += i13;
            }
            r1Var.f8111e = true;
            if (this.f8154k) {
                d(r1Var);
            }
        }
    }
}
