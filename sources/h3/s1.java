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
    public final i3.l f9716a;
    public final q0 f9719e;
    public final i3.f h;
    public final d5.c0 f9722i;
    public boolean f9724k;
    public com.google.android.exoplayer2.upstream.y0 f9725l;
    public j4.g1 f9723j = new j4.e1();
    public final IdentityHashMap f9718c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList f9717b = new ArrayList();
    public final HashMap f9720f = new HashMap();
    public final HashSet f9721g = new HashSet();

    public s1(q0 q0Var, i3.f fVar, d5.c0 c0Var, i3.l lVar) {
        this.f9716a = lVar;
        this.f9719e = q0Var;
        this.h = fVar;
        this.f9722i = c0Var;
    }

    public final r2 a(int i9, ArrayList arrayList, j4.g1 g1Var) {
        if (!arrayList.isEmpty()) {
            this.f9723j = g1Var;
            for (int i10 = i9; i10 < arrayList.size() + i9; i10++) {
                r1 r1Var = (r1) arrayList.get(i10 - i9);
                ArrayList arrayList2 = this.f9717b;
                if (i10 > 0) {
                    r1 r1Var2 = (r1) arrayList2.get(i10 - 1);
                    r1Var.d = r1Var2.f9688a.f13601o.f13526b.o() + r1Var2.d;
                    r1Var.f9691e = false;
                    r1Var.f9690c.clear();
                } else {
                    r1Var.d = 0;
                    r1Var.f9691e = false;
                    r1Var.f9690c.clear();
                }
                int o6 = r1Var.f9688a.f13601o.f13526b.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((r1) arrayList2.get(i11)).d += o6;
                }
                arrayList2.add(i10, r1Var);
                this.d.put(r1Var.f9689b, r1Var);
                if (this.f9724k) {
                    e(r1Var);
                    if (this.f9718c.isEmpty()) {
                        this.f9721g.add(r1Var);
                    } else {
                        q1 q1Var = (q1) this.f9720f.get(r1Var);
                        if (q1Var != null) {
                            q1Var.f9655a.c(q1Var.f9656b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final r2 b() {
        ArrayList arrayList = this.f9717b;
        if (arrayList.isEmpty()) {
            return r2.f9692a;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r1 r1Var = (r1) arrayList.get(i10);
            r1Var.d = i9;
            i9 += r1Var.f9688a.f13601o.f13526b.o();
        }
        return new f2(arrayList, this.f9723j);
    }

    public final void c() {
        Iterator it = this.f9721g.iterator();
        while (it.hasNext()) {
            r1 r1Var = (r1) it.next();
            if (r1Var.f9690c.isEmpty()) {
                q1 q1Var = (q1) this.f9720f.get(r1Var);
                if (q1Var != null) {
                    q1Var.f9655a.c(q1Var.f9656b);
                }
                it.remove();
            }
        }
    }

    public final void d(r1 r1Var) {
        if (r1Var.f9691e && r1Var.f9690c.isEmpty()) {
            q1 q1Var = (q1) this.f9720f.remove(r1Var);
            q1Var.getClass();
            g5.b bVar = q1Var.f9657c;
            j4.a aVar = q1Var.f9655a;
            aVar.o(q1Var.f9656b);
            aVar.r(bVar);
            aVar.q(bVar);
            this.f9721g.remove(r1Var);
        }
    }

    public final void e(r1 r1Var) {
        j4.x xVar = r1Var.f9688a;
        ?? r12 = new j4.e0() {
            @Override
            public final void a(j4.a aVar, r2 r2Var) {
                s1.this.f9719e.f9649n.d(22);
            }
        };
        g5.b bVar = new g5.b(this, r1Var, false, 4);
        this.f9720f.put(r1Var, new q1(xVar, r12, bVar));
        int i9 = d5.f0.f4349a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        xVar.getClass();
        j4.h0 h0Var = xVar.f13399c;
        h0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = h0Var.f13466c;
        ?? obj = new Object();
        obj.f13452a = handler;
        obj.f13453b = bVar;
        copyOnWriteArrayList.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        a6.a aVar = xVar.d;
        aVar.getClass();
        ?? obj2 = new Object();
        obj2.f16637a = bVar;
        ((CopyOnWriteArrayList) aVar.d).add(obj2);
        xVar.k(r12, this.f9725l, this.f9716a);
    }

    public final void f(j4.a0 a0Var) {
        IdentityHashMap identityHashMap = this.f9718c;
        r1 r1Var = (r1) identityHashMap.remove(a0Var);
        r1Var.getClass();
        r1Var.f9688a.n(a0Var);
        r1Var.f9690c.remove(((j4.u) a0Var).f13570a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(r1Var);
    }

    public final void g(int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            ArrayList arrayList = this.f9717b;
            r1 r1Var = (r1) arrayList.remove(i11);
            this.d.remove(r1Var.f9689b);
            int i12 = -r1Var.f9688a.f13601o.f13526b.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((r1) arrayList.get(i13)).d += i12;
            }
            r1Var.f9691e = true;
            if (this.f9724k) {
                d(r1Var);
            }
        }
    }
}
