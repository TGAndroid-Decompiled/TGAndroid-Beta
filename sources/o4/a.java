package o4;

import android.os.Looper;
import j3.c1;
import j3.o2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class a {
    public final ArrayList f16269a = new ArrayList(1);
    public final HashSet f16270b = new HashSet(1);
    public final b4.e0 f16271c = new b4.e0(new CopyOnWriteArrayList(), 0, (v) null);
    public final o3.m d = new o3.m(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public o2 f16272f;
    public k3.k f16273g;

    public final b4.e0 a(v vVar) {
        return new b4.e0((CopyOnWriteArrayList) this.f16271c.d, 0, vVar);
    }

    public abstract t b(v vVar, g5.q qVar, long j10);

    public final void c(w wVar) {
        HashSet hashSet = this.f16270b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(wVar);
        if (!isEmpty && hashSet.isEmpty()) {
            d();
        }
    }

    public final void e(w wVar) {
        this.e.getClass();
        HashSet hashSet = this.f16270b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(wVar);
        if (isEmpty) {
            f();
        }
    }

    public o2 g() {
        return null;
    }

    public abstract c1 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(w wVar, g5.v0 v0Var, k3.k kVar) {
        boolean z4;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.f(z4);
        this.f16273g = kVar;
        o2 o2Var = this.f16272f;
        this.f16269a.add(wVar);
        if (this.e == null) {
            this.e = myLooper;
            this.f16270b.add(wVar);
            l(v0Var);
        } else if (o2Var != null) {
            e(wVar);
            wVar.a(this, o2Var);
        }
    }

    public abstract void l(g5.v0 v0Var);

    public final void m(o2 o2Var) {
        this.f16272f = o2Var;
        ArrayList arrayList = this.f16269a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((w) obj).a(this, o2Var);
        }
    }

    public abstract void n(t tVar);

    public final void o(w wVar) {
        ArrayList arrayList = this.f16269a;
        arrayList.remove(wVar);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f16272f = null;
            this.f16273g = null;
            this.f16270b.clear();
            p();
            return;
        }
        c(wVar);
    }

    public abstract void p();

    public final void q(o3.n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f16256c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            o3.l lVar = (o3.l) it.next();
            if (lVar.f16253b == nVar) {
                copyOnWriteArrayList.remove(lVar);
            }
        }
    }

    public final void r(z zVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f16271c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar.f16416b == zVar) {
                copyOnWriteArrayList.remove(yVar);
            }
        }
    }

    public void d() {
    }

    public void f() {
    }
}
