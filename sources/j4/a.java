package j4;

import android.os.Looper;
import h3.s2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class a {

    public final ArrayList f12497a = new ArrayList(1);

    public final HashSet f12498b = new HashSet(1);

    public final g0 f12499c = new g0(new CopyOnWriteArrayList(), 0, null, 0);
    public final b6.a d = new b6.a(new CopyOnWriteArrayList(), 0, null, 14);

    public Looper f12500e;

    public s2 f12501f;

    public i3.k f12502g;

    public final g0 a(c0 c0Var) {
        return new g0(this.f12499c.f12563c, 0, c0Var, 0L);
    }

    public abstract z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10);

    public final void c(d0 d0Var) {
        HashSet hashSet = this.f12498b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(d0Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(d0 d0Var) {
        this.f12500e.getClass();
        HashSet hashSet = this.f12498b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(d0Var);
        if (zIsEmpty) {
            f();
        }
    }

    public s2 g() {
        return null;
    }

    public abstract h3.f1 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(d0 d0Var, com.google.android.exoplayer2.upstream.y0 y0Var, i3.k kVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f12500e;
        d5.a.f(looper == null || looper == looperMyLooper);
        this.f12502g = kVar;
        s2 s2Var = this.f12501f;
        this.f12497a.add(d0Var);
        if (this.f12500e == null) {
            this.f12500e = looperMyLooper;
            this.f12498b.add(d0Var);
            l(y0Var);
        } else if (s2Var != null) {
            e(d0Var);
            d0Var.a(this, s2Var);
        }
    }

    public abstract void l(com.google.android.exoplayer2.upstream.y0 y0Var);

    public final void m(s2 s2Var) {
        this.f12501f = s2Var;
        ArrayList arrayList = this.f12497a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d0) obj).a(this, s2Var);
        }
    }

    public abstract void n(z zVar);

    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f12497a;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            c(d0Var);
            return;
        }
        this.f12500e = null;
        this.f12501f = null;
        this.f12502g = null;
        this.f12498b.clear();
        p();
    }

    public abstract void p();

    public final void q(l3.h hVar) {
        CopyOnWriteArrayList<l3.g> copyOnWriteArrayList = (CopyOnWriteArrayList) this.d.d;
        for (l3.g gVar : copyOnWriteArrayList) {
            if (gVar.f15394a == hVar) {
                copyOnWriteArrayList.remove(gVar);
            }
        }
    }

    public final void r(h0 h0Var) {
        CopyOnWriteArrayList<f0> copyOnWriteArrayList = this.f12499c.f12563c;
        for (f0 f0Var : copyOnWriteArrayList) {
            if (f0Var.f12549b == h0Var) {
                copyOnWriteArrayList.remove(f0Var);
            }
        }
    }

    public void d() {
    }

    public void f() {
    }
}
