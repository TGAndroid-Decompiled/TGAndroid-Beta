package j4;

import android.os.Looper;
import h3.r2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class a {
    public final ArrayList f13397a = new ArrayList(1);
    public final HashSet f13398b = new HashSet(1);
    public final h0 f13399c = new h0(new CopyOnWriteArrayList(), 0, null, 0);
    public final a6.a d = new a6.a(new CopyOnWriteArrayList(), 0, null, 14);
    public Looper f13400e;
    public r2 f13401f;
    public i3.l f13402g;

    public final h0 a(d0 d0Var) {
        return new h0(this.f13399c.f13466c, 0, d0Var, 0L);
    }

    public abstract a0 b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10);

    public final void c(e0 e0Var) {
        HashSet hashSet = this.f13398b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(e0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            d();
        }
    }

    public final void e(e0 e0Var) {
        this.f13400e.getClass();
        HashSet hashSet = this.f13398b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(e0Var);
        if (isEmpty) {
            f();
        }
    }

    public r2 g() {
        return null;
    }

    public abstract h3.f1 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(e0 e0Var, com.google.android.exoplayer2.upstream.y0 y0Var, i3.l lVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f13400e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        d5.a.f(z10);
        this.f13402g = lVar;
        r2 r2Var = this.f13401f;
        this.f13397a.add(e0Var);
        if (this.f13400e == null) {
            this.f13400e = myLooper;
            this.f13398b.add(e0Var);
            l(y0Var);
        } else if (r2Var != null) {
            e(e0Var);
            e0Var.a(this, r2Var);
        }
    }

    public abstract void l(com.google.android.exoplayer2.upstream.y0 y0Var);

    public final void m(r2 r2Var) {
        this.f13401f = r2Var;
        ArrayList arrayList = this.f13397a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((e0) obj).a(this, r2Var);
        }
    }

    public abstract void n(a0 a0Var);

    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f13397a;
        arrayList.remove(e0Var);
        if (arrayList.isEmpty()) {
            this.f13400e = null;
            this.f13401f = null;
            this.f13402g = null;
            this.f13398b.clear();
            p();
            return;
        }
        c(e0Var);
    }

    public abstract void p();

    public final void q(l3.g gVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            l3.f fVar = (l3.f) it.next();
            if (fVar.f16637a == gVar) {
                copyOnWriteArrayList.remove(fVar);
            }
        }
    }

    public final void r(i0 i0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13399c.f13466c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            if (g0Var.f13453b == i0Var) {
                copyOnWriteArrayList.remove(g0Var);
            }
        }
    }

    public void d() {
    }

    public void f() {
    }
}
