package l4;

import ag.j2;
import android.os.Looper;
import j3.r2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class a {
    public final ArrayList f14256a = new ArrayList(1);
    public final HashSet f14257b = new HashSet(1);
    public final g0 f14258c = new g0(new CopyOnWriteArrayList(), 0, null, 0);
    public final j2 d = new j2(new CopyOnWriteArrayList(), 0, (c0) null);
    public Looper f14259e;
    public r2 f14260f;
    public k3.k f14261g;

    public final g0 a(c0 c0Var) {
        return new g0(this.f14258c.f14321c, 0, c0Var, 0L);
    }

    public abstract z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10);

    public final void c(d0 d0Var) {
        HashSet hashSet = this.f14257b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(d0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            d();
        }
    }

    public final void e(d0 d0Var) {
        this.f14259e.getClass();
        HashSet hashSet = this.f14257b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(d0Var);
        if (isEmpty) {
            f();
        }
    }

    public r2 g() {
        return null;
    }

    public abstract j3.f1 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(d0 d0Var, com.google.android.exoplayer2.upstream.y0 y0Var, k3.k kVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f14259e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        f5.a.f(z10);
        this.f14261g = kVar;
        r2 r2Var = this.f14260f;
        this.f14256a.add(d0Var);
        if (this.f14259e == null) {
            this.f14259e = myLooper;
            this.f14257b.add(d0Var);
            l(y0Var);
        } else if (r2Var != null) {
            e(d0Var);
            d0Var.a(this, r2Var);
        }
    }

    public abstract void l(com.google.android.exoplayer2.upstream.y0 y0Var);

    public final void m(r2 r2Var) {
        this.f14260f = r2Var;
        ArrayList arrayList = this.f14256a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d0) obj).a(this, r2Var);
        }
    }

    public abstract void n(z zVar);

    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f14256a;
        arrayList.remove(d0Var);
        if (arrayList.isEmpty()) {
            this.f14259e = null;
            this.f14260f = null;
            this.f14261g = null;
            this.f14257b.clear();
            p();
            return;
        }
        c(d0Var);
    }

    public abstract void p();

    public final void q(n3.g gVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n3.f fVar = (n3.f) it.next();
            if (fVar.f17104a == gVar) {
                copyOnWriteArrayList.remove(fVar);
            }
        }
    }

    public final void r(h0 h0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14258c.f14321c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            if (f0Var.f14305b == h0Var) {
                copyOnWriteArrayList.remove(f0Var);
            }
        }
    }

    public void d() {
    }

    public void f() {
    }
}
